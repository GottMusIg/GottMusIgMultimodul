package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.jpa.Location;
import com.gottmusig.utils.Entity;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface Realm extends Entity {

    /**
     *
     * @return the name of the realm
     */
    String getName();

    /**
     *
     * @return the location of the server
     */
    Location getLocation();

}
