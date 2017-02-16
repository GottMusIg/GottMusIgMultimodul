package com.gottmusig.database.service.domain.realm;

import com.gottmusig.database.service.domain.Entity;
import com.gottmusig.database.service.jpa.realm.Location;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface Realm extends Entity {

    /**
     * @return the name of the realm
     */
    String getName();

    /**
     * @return the location of the server
     */
    Location getLocation();

}
