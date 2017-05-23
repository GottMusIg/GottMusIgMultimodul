package com.gottmusig.database.service.domain.character;

import com.gottmusig.database.service.domain.Entity;


/**
 * @author leong
 * @since 13.11.2016
 */
public interface WOWClass extends Entity {

    /**
     * @return the name of the WoW class
     */
    String getName();

}
