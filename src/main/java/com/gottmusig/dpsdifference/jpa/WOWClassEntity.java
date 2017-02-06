package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.WOWClass;
import org.springframework.data.repository.CrudRepository;

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

    public WOWClassEntity() {
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
    public NumericSequenceId getId() {
        return id;
    }

    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    public interface WOWClassRepository extends CrudRepository<WOWClassEntity, NumericSequenceId> {

        WOWClassEntity findByName(String name);

    }
}
