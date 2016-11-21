package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.WOWClass;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "classspecification")
public class ClassSpecificationEntity implements ClassSpecification {

    @EmbeddedId
    private NumericSequenceId id;

    private String name;
    private WOWClass wowClass;

    public ClassSpecificationEntity(NumericSequenceId id) {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public WOWClass getWOWClass() {
        return wowClass;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
}
