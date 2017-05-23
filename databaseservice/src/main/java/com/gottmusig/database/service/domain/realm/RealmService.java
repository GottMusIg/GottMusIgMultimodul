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

    /**
     *
     * @return a list of all currently saved realms in the database
     */
    List<Realm> getAllRealms();

    /**
     *
     * @param location the location in which realms are ought to be searched
     * @return all realms currently saved in the database listed in the given location
     */
    List<Realm> getAllRealms(Location location);

    /**
     *
     * @param realm the name of the realm to be searched
     * @return the Realm as an Entity
     */
    Optional<Realm> searchRealm(String realm);

}
