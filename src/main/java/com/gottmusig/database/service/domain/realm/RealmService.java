package com.gottmusig.database.service.domain.realm;

import com.gottmusig.database.service.jpa.realm.Location;

import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0
 */
public interface RealmService {

    List<Realm> getAllRealms();

    List<Realm> getAllRealms(Location location);

}
