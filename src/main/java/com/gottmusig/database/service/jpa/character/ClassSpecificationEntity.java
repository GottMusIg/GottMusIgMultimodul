package com.gottmusig.database.service.jpa.character;

import com.gottmusig.database.service.domain.character.ClassSpecification;
import com.gottmusig.database.service.domain.character.WOWClass;
import com.gottmusig.database.service.jpa.NumericSequenceId;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "classspecification")
public class ClassSpecificationEntity implements ClassSpecification {

    @EmbeddedId
    @Column(name = "id")
    private NumericSequenceId id;

    private String name;

    @OneToOne
    @JoinColumn(name = "WOWClass_id", referencedColumnName = "id")
    private WOWClassEntity wowClass;

    public ClassSpecificationEntity() {
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
    public WOWClassEntity getWOWClass() {
        return wowClass;
    }
    public void setWowClass(WOWClassEntity wowClass) {
        this.wowClass = wowClass;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    public interface ClassSpecificationRepository extends CrudRepository<ClassSpecificationEntity, NumericSequenceId> {

        ClassSpecificationEntity findByNameAndWowClass(String name, WOWClass wowClass);

        ClassSpecificationEntity findByName(String name);

    }
}
