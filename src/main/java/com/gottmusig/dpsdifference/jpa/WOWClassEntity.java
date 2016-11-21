package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.WOWClass;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "wowclass")
public class WOWClassEntity implements WOWClass {

    @EmbeddedId
    private NumericSequenceId id;

    private String name;

    public WOWClassEntity(NumericSequenceId id) {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
}
