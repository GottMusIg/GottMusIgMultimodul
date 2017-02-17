package com.gottmusig.database.service.jpa.account;

import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.jpa.NumericSequenceId;
import com.gottmusig.database.service.jpa.SpringEntityListener;
import com.gottmusig.database.service.jpa.character.CharacterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Entity
@Table(name = "account")
@EntityListeners(SpringEntityListener.class)
public class AccountEntity implements Account {

    @Autowired
    private transient CharacterAccountRelationEntity.CharacterAccountRelationRepository accountRelationRepository;

    @Autowired
    private transient CharacterService characterService;

    @EmbeddedId
    private NumericSequenceId id;

    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String userName;

    @Autowired
    public AccountEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Character addCharacter(Character character) {
        Optional<CharacterAccountRelationEntity> relationEntityOptional = accountRelationRepository
                .findFirstByAccountAndCharacter(
                this, (CharacterEntity) character);
        if (!relationEntityOptional.isPresent()) {
            addAccountRelation(character);
        }
        return character;
    }

    private void addAccountRelation(Character character) {
        character = characterService.saveCharacter(character);
        CharacterAccountRelationEntity characterAccountRelationEntity = new CharacterAccountRelationEntity();
        characterAccountRelationEntity.setAccount(this);
        characterAccountRelationEntity.setCharacter((CharacterEntity) character);
        accountRelationRepository.save(characterAccountRelationEntity);
    }

    public void removeCharacter(Character character) {
        CharacterAccountRelationEntity characterAccountRelation = accountRelationRepository.findFirstByAccount(this);
        accountRelationRepository.delete(characterAccountRelation);
    }

    @Override
    public List<Character> getCharacters() {
        List<CharacterAccountRelationEntity> relationEntities = accountRelationRepository.findByAccount(this);
        List<Character> characters = new ArrayList<>();
        for (CharacterAccountRelationEntity entity : relationEntities) {
            characters.add(entity.getCharacter());
        }
        return characters;
    }

    @Override
    public Id getId() {
        return id;
    }

    public interface AccountRepository extends CrudRepository<AccountEntity, NumericSequenceId> {

        Optional<Account> findByUserName(String userName);

    }
}
