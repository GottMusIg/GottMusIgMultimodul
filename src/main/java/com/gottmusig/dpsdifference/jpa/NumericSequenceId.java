package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Objects;

/**
 * Simple implementation of an numeric Id of type long.
 *
 * @author Leon Gottschick
 * @since 0.0.1
 */
@Embeddable
public class NumericSequenceId implements Entity.Id {

    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long value;
    
    public Long getValue() {
        return value;
    }
    public void setValue(Long value) {
        this.value = value;
    }
    
    @Override
    public String displayValue() {
        return value == null ? "-" : Long.toString(value);
    }
    
    @Override
    public String toString() {
        return displayValue();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof NumericSequenceId)) {
            return false;
        }
        NumericSequenceId other = (NumericSequenceId) obj;
        return Objects.equals(value, other.value);
    }
    
}