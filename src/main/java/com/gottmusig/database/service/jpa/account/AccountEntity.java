package com.gottmusig.database.service.jpa.account;

import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.jpa.NumericSequenceId;
import com.gottmusig.database.service.jpa.SpringEntityListener;
import com.gottmusig.database.service.jpa.character.CharacterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
        boolean isAdded = false;
        for (Character characterToAdd : getCharacters()) {
            if (characterToAdd.getName().equals(character.getName()) &&
                characterToAdd.getRealm().getName().equals(character.getRealm().getName())) {
                isAdded = true;
            }
        }
        if (!isAdded) {
            CharacterAccountRelationEntity characterAccountRelation = new CharacterAccountRelationEntity();
            characterAccountRelation.setCharacter((CharacterEntity) character);
            characterAccountRelation.setAccount(this);
            accountRelationRepository.save(characterAccountRelation);
        }
        return character;
    }

    @Override
    public List<Character> getCharacters() {
        List<CharacterAccountRelationEntity> accounts = accountRelationRepository.findByAccount(this);
        List<Character> characters = new ArrayList<>();
        for (CharacterAccountRelationEntity entity : accounts) {
            characters.add(entity.getCharacter());
        }
        return characters;
    }

    @Override
    public Id getId() {
        return id;
    }

    public interface AccountRepository extends CrudRepository<AccountEntity, NumericSequenceId> {

        AccountEntity findByUserName(String userName);

    }
}
