package com.gottmusig.database.service.domain.character.jpa;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;

import com.gottmusig.database.service.domain.character.ClassSpecification;
import com.gottmusig.database.service.domain.character.WOWClass;
import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.jpa.SpringEntityListener;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "classspecification")
@EntityListeners(SpringEntityListener.class)
public class ClassSpecificationEntity implements ClassSpecification {

    @EmbeddedId
    @Column(name = "id")
    private NumericSequenceId id;

    private String name;

    @ManyToOne
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
