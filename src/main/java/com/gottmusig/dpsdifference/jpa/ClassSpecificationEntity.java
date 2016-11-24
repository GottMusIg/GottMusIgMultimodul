package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "classSpecification")
public class ClassSpecificationEntity implements ClassSpecification {

    @EmbeddedId
    private NumericSequenceId id;

    private String name;

    @OneToOne
    @JoinColumn(name="wowClassId", referencedColumnName= "id")
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

    public static interface ClassSpecificationRepoitory extends CrudRepository<ClassSpecificationEntity, NumericSequenceId> {

    }
}
