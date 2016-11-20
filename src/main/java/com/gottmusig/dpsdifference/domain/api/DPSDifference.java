package com.gottmusig.dpsdifference.domain.api;

import com.gottmusig.dpsdifference.domain.Entity;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface DPSDifference extends Entity {
    ClassDPS getClassDPS(WOWClass woWClass);
}
