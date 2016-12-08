package com.gottmusig.dpsdifference.domain.api;

import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
import com.gottmusig.dpsdifference.jpa.SpecificationDPSEntity;
import com.gottmusig.dpsdifference.jpa.WOWClassEntity;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the simulated DPS Values for all WoW Classes and Specifications
 * DPSDifference contains a list of all DPS values of every specification or for a single specification
 *
 *
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface DPSDifference {

    Optional<ClassSpecificationEntity> findClassSpecification(String name);

    Optional<WOWClassEntity> findWOWClass(String name);

    WOWClassEntity addWOWClass(String name);

    ClassSpecificationEntity addClassSpecification(String specificationName, String className);


    /**
     *
     * @return A list of all DPS values
     */
    List<SpecificationDPSEntity> getAllDPSValues();

    Optional<SpecificationDPSEntity> findSpecificationDPS(String specificationName);


    void addSpecificationDPS(int dps, String specificationName, String className);


    SpecificationDPSEntity getMaxDPSValue();
}
