package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.jpa.Location;
import com.gottmusig.searchcharacter.jpa.RealmEntity;

import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface SearchCharacter {

    List<Location> getAllLocations();

    String searchCharacter(Location location, Realm realm, String characterName);

    void saveRealm(String name, Location location);

    List<RealmEntity> getAllRealms();

    List<String> getRealms(Location location);
}
