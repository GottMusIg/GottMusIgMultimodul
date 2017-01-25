package com.gottmusig.account.jpa;

import com.gottmusig.account.domain.api.Account;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.jpa.NumericSequenceId;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
import com.gottmusig.utils.SpringEntityListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

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

    @Override
    public Character addCharacter(String name, String realm, String specification, String wowClass, int dps) {

        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setName(name);
        characterEntity.setClassSpecification(dpsDifference.findClassSpecification(specification, wowClass)
                .orElse(dpsDifference.addClassSpecification(specification, wowClass)));
        characterEntity.setRealm(realmRepository.findByName(realm));
        characterEntity.setDPS(dps);
        return characterRepository.save(characterEntity);
    }

    @Override
    public Iterable<Character> getCharacters() {
        return null;
    }

    @Override
    public Id getId() {
        return id;
    }

    public interface AccountRepository extends CrudRepository<AccountEntity, NumericSequenceId> {

        AccountEntity findByUserName(String userName);

    }
}
