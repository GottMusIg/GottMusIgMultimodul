package com.gottmusig.dpsdifference.domain.api;

import com.gottmusig.dpsdifference.domain.Entity;

import java.util.List;

/**
 *
 *
 *
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface DPSDifference extends Entity {
    SpecificationDPS getSpecificationDPS(ClassSpecification classSpecification);
    List<SpecificationDPS> getAllDPSValues();
}
