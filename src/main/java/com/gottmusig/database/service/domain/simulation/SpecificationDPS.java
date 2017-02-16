package com.gottmusig.database.service.domain.simulation;

import com.gottmusig.database.service.domain.Entity;
import com.gottmusig.database.service.domain.character.ClassSpecification;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface SpecificationDPS extends Entity {

    /**
     * @return the DPS value of this Specification
     */
    int getSpecificationDPS();

    /**
     * @return the corresponding Specification to this SpecificationDPS
     */
    ClassSpecification getSpecification();

}
