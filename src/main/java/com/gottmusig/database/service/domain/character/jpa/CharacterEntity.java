package com.gottmusig.database.service.domain.character.jpa;

import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.ClassSpecification;
import com.gottmusig.database.service.domain.character.WOWClass;
import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.realm.jpa.RealmEntity;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.Optional;

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

    @Column(name = "thumbnail_id")
    private String thumbnailId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "realm_id", referencedColumnName = "id")
    private RealmEntity realm;

    @ManyToOne(optional = false)
    @JoinColumn(name = "classSpecification_id", referencedColumnName = "id")
    private ClassSpecificationEntity classSpecification;


    public CharacterEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDPS() {
        return dps;
    }
    public void setDPS(int dps) {
        this.dps = dps;
    }

    @Override
    public ClassSpecification getClassSpecification() {
        return classSpecification;
    }
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
    public void setRealm(Realm realm) {
        this.realm = (RealmEntity) realm;
    }

    @Override
    public String getThumbnailId() {
        return thumbnailId;
    }
    public void setThumbnailId(String thumbnail) {
        this.thumbnailId = thumbnail;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }

    public interface CharacterRepository extends CrudRepository<CharacterEntity, NumericSequenceId> {

        Optional<Character> findByNameAndRealm(String name, Realm realm);

    }

}
