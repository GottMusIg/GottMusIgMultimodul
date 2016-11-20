package com.gottmusig.dpsdifference.domain.api;

import java.util.List;

/**
 * @author leong
 * @since 13.11.2016
 */
public interface WOWClass {

    ClassSpecification getSpecification();
    List<WOWClass> getAllClasses();
}
