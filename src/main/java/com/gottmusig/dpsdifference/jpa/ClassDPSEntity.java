package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "classdps")
public class ClassDPSEntity implements SpecificationDPS {

    @EmbeddedId
    private NumericSequenceId id;

    private int dps;
    private ClassSpecification specification;

    public ClassDPSEntity(NumericSequenceId id) {
        this.id = new NumericSequenceId();
    }

    @Override
    public int getSpecificationDPS() {
        return dps;
    }

    @Override
    public ClassSpecification getSpecification() {
        return specification;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
}
