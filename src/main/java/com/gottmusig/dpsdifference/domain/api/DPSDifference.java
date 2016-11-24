package com.gottmusig.dpsdifference.domain.api;

import java.util.List;

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
     * @return A list of all DPS values
     */
    List<SpecificationDPS> getAllDPSValues();


    void addSpecificationDPS(SpecificationDPS specificationDPS);
}
