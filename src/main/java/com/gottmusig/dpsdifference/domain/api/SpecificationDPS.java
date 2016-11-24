package com.gottmusig.dpsdifference.domain.api;

import com.gottmusig.dpsdifference.domain.Entity;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface SpecificationDPS extends Entity {

    /**
     *
     * @return the DPS value of this Specification
     */
    int getSpecificationDPS();

    /**
     *
     * @return the corresponding Specification to this SpecificationDPS
     */
    ClassSpecification getSpecification();

}
