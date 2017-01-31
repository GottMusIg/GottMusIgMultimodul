package com.gottmusig.account.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.gottmusig.account.domain.api.Account;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.jpa.NumericSequenceId;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
import com.gottmusig.utils.SpringEntityListener;

import jersey.repackaged.com.google.common.collect.Lists;

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
    private transient CharacterEntity.CharacterRepository characterRepository;

    @Autowired
    private transient RealmEntity.RealmRepository realmRepository;

    @Autowired
    private transient DPSDifference dpsDifference;

    @EmbeddedId
    private NumericSequenceId id;

    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String userName;

    public AccountEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getUserName() {
        return null;
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

    /**
     * TODO do not delete the entity in the else statement.
     * maybe an m to n relationship between account and character
     * could be a better solution.
     * - kamil
     */
    @Override
    public Character addCharacter(String name, String realm, String specification, String wowClass, int dps) {

        CharacterEntity entity = characterRepository.findByName(name);
        if (entity == null) {
            entity = new CharacterEntity();
            entity.setName(name);
            entity.setClassSpecification(dpsDifference.findClassSpecification(specification, wowClass)
                    .orElse(dpsDifference.addClassSpecification(specification, wowClass)));
            entity.setRealm(realmRepository.findByName(realm));
            entity.setDPS(dps);
            entity.setAccount(this);
            return characterRepository.save(entity);
        } else {
            characterRepository.delete(entity);
            entity.setAccount(this);
            characterRepository.save(entity);
        }
        return entity;
    }

    @Override
    public List<Character> getCharacters() {
        return Lists.newArrayList(characterRepository.findByAccount(this))
													 .stream()
													 .map(characterEntity -> (Character) characterEntity)
													 .collect(Collectors.toList());
    }

    @Override
    public Id getId() {
        return id;
    }

    public interface AccountRepository extends CrudRepository<AccountEntity, NumericSequenceId> {

        AccountEntity findByUserName(String userName);

    }
}
