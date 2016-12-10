package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.jpa.Location;
import com.gottmusig.utils.Entity;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface Realm extends Entity {

    String getName();

    Location getLocation();

}
