package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;
import com.gottmusig.dpsdifference.jpa.SpecificationDPSEntity.SpecificationDPSRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */

public class DPSDifferenceEntity implements DPSDifference {

    @Autowired SpecificationDPSRepository specificationDPSRepository;
    @Autowired WOWClassEntity.WOWClassRepository classRepository;

    private List<SpecificationDPS> DPSValues;

    public DPSDifferenceEntity() {
    }

    /*
    for testing //TODO FIX ME
     */
    public void addSpecificationDPS(SpecificationDPS specificationDPS) {
        specificationDPSRepository.save((SpecificationDPSEntity) specificationDPS);
    }


    @Override
    public List<SpecificationDPS> getAllDPSValues() {
        return DPSValues;
    }

    public void setDPSValues(List<SpecificationDPS> DPSValues) {
        this.DPSValues = DPSValues;
    }

}
