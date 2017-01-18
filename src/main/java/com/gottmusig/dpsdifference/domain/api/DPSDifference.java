package com.gottmusig.dpsdifference.domain.api;

import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
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

    /**
     *
     * @param name the name of the Specification to be searched in the database
     * @return the ClassSpecificationEntity if available in the database
     */
    Optional<ClassSpecification> findClassSpecification(String name, String className);

    /**
     *
     * @param name the name of the class to be searched in the database
     * @return the WOWClassEntity if it exists in the database
     */
    Optional<WOWClass> findWOWClass(String name);

    /**
     *
     * @param name the name of the new WoW class
     * @return the newly created WOWClassEntity
     */
    WOWClassEntity addWOWClass(String name);

    /**
     *
     * @param specificationName the name of the new specification
     * @param className the name of the corresponding class
     * @return the newly created ClassSpecificationEntity
     */
    ClassSpecificationEntity addClassSpecification(String specificationName, String className);


    /**
     *
     * @return A list of all SpecificationDPSEntities in the database
     */
    List<SpecificationDPS> getAllDPSValues();

    /**
     *
     * @param specificationName the name of the specification the Entity is returned
     * @return the Entity of the requested specificationDPS if available in the database
     */
    Optional<SpecificationDPS> findSpecificationDPS(String specificationName);


    /**
     *
     * adds a new Specification and DPS value in the database
     *
     * @param dps the dps value for this specification
     * @param specificationName the name of the specification
     * @param className the name of the corresponding WoW class
     */
    void addSpecificationDPS(int dps, String specificationName, String className);


    /**
     *
     * @return the maximum dps value in the database (for relational scaling in the frontend)
     */
    int getMaxDPSValue();
}
