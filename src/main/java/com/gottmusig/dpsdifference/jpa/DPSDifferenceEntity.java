package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */
@Entity
@Table(name = "dpsdifference")
public class DPSDifferenceEntity implements DPSDifference {

    @EmbeddedId
    private NumericSequenceId id;

    private SpecificationDPS specificationDPS;
    private List<SpecificationDPS> DPSValues;

    public DPSDifferenceEntity(NumericSequenceId id) {
        this.id = new NumericSequenceId();
    }

    @Override
    public SpecificationDPS getSpecificationDPS(ClassSpecification classSpecification) {
        return specificationDPS;
    }

    public void setSpecificationDPS(SpecificationDPS specificationDPS) {
        this.specificationDPS = specificationDPS;
    }

    @Override
    public List<SpecificationDPS> getAllDPSValues() {
        return DPSValues;
    }

    public void setDPSValues(List<SpecificationDPS> DPSValues) {
        this.DPSValues = DPSValues;
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    public static interface DPSDifferenceRepository extends CrudRepository<DPSDifferenceEntity, NumericSequenceId> {

        DPSDifferenceEntity getDPSDifference();

    }

}
