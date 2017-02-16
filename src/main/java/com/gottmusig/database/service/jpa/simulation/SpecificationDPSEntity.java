package com.gottmusig.database.service.jpa.simulation;

import com.gottmusig.database.service.domain.character.ClassSpecification;
import com.gottmusig.database.service.domain.simulation.SpecificationDPS;
import com.gottmusig.database.service.jpa.NumericSequenceId;
import com.gottmusig.database.service.jpa.character.ClassSpecificationEntity;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

/**
 * @author leong
 * @since 20.11.2016
 */
@Entity
@Table(name = "specificationdps")
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

    public interface SpecificationDPSRepository extends CrudRepository<SpecificationDPSEntity, NumericSequenceId> {

        SpecificationDPSEntity findBySpecification(ClassSpecificationEntity classSpecification);

    }
}
