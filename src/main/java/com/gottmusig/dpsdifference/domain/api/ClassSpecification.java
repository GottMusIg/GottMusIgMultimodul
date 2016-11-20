package com.gottmusig.dpsdifference.domain.api;


import java.util.List;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface ClassSpecification {

    String getName();
    List<ClassSpecification> getAllSpecifications();
}
