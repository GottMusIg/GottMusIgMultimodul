package com.gottmusig.database.service.domain.realm;

import com.gottmusig.database.service.domain.realm.jpa.Location;

import java.util.List;
import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0
 */
public interface RealmService {

    List<Realm> getAllRealms();

    List<Realm> getAllRealms(Location location);

    Optional<Realm> searchRealm(String realm);

}
