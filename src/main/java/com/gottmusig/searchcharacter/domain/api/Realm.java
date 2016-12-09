package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.utils.Entity;
import com.gottmusig.utils.RealmLocation;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface Realm extends Entity {

    String getName();

    RealmLocation getLocation();

}
