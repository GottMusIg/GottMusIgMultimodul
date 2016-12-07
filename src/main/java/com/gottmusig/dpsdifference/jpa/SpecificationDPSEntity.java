package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "specificationdps")
@EntityListeners(SpringEntityListener.class)
public class SpecificationDPSEntity implements SpecificationDPS {

    @EmbeddedId
    private NumericSequenceId id;

    private int dps;

    @OneToOne
    @JoinColumn(name = "classSpecification_id", referencedColumnName = "id")
    private ClassSpecificationEntity specification;

    public SpecificationDPSEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public int getSpecificationDPS() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    @Override
    public ClassSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(ClassSpecificationEntity specification) {
        this.specification = specification;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }

    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SpecificationDPSEntity{" +
                "id=" + id +
                ", dps=" + dps +
                ", specification=" + specification +
                '}';
    }

    public static interface SpecificationDPSRepository extends CrudRepository<SpecificationDPSEntity, NumericSequenceId> {

        SpecificationDPSEntity findBySpecification(ClassSpecificationEntity classSpecification);

    }
}
