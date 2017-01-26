package com.gottmusig.character.jpa;

import com.gottmusig.account.domain.api.Account;
import com.gottmusig.account.jpa.AccountEntity;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.WOWClass;
import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
import com.gottmusig.dpsdifference.jpa.NumericSequenceId;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Entity
@Table(name = "wowcharacter")
public class CharacterEntity implements Character {

    @EmbeddedId
    private NumericSequenceId id;

    @Column(name = "dps")
    private int dps;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "realm_id", referencedColumnName = "id")
    private RealmEntity realm;

    @OneToOne
    @JoinColumn(name = "classSpecification_id", referencedColumnName = "id")
    private ClassSpecificationEntity classSpecification;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private AccountEntity account;


    public CharacterEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDPS() {
        return dps;
    }

    @Override
    public void setDPS(int dps) {
        this.dps = dps;
    }

    @Override
    public ClassSpecification getClassSpecification() {
        return classSpecification;
    }

    @Override
    public void setClassSpecification(ClassSpecification classSpecification) {
        this.classSpecification = (ClassSpecificationEntity) classSpecification;
    }

    @Override
    public WOWClass getWOWClass() {
        return classSpecification.getWOWClass();
    }

    @Override
    public Realm getRealm() {
        return realm;
    }

    @Override
    public void setRealm(Realm realm) {
        this.realm = (RealmEntity) realm;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = (AccountEntity) account;
    }

    @Override
    public Id getId() {
        return id;
    }

    public interface CharacterRepository extends CrudRepository<CharacterEntity, NumericSequenceId> {

        CharacterEntity findByName(String name);

    }

}
