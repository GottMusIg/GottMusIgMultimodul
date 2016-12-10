package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.domain.api.RealmLocation.Location;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
import com.gottmusig.searchcharacter.jpa.RealmLocationEntity;

import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface SearchCharacter {

    List<RealmLocationEntity> getAllLocations();

    String searchCharacter(RealmLocationEntity location, Realm realm, String characterName);

    void saveRealm(String name, Location location);

    List<RealmEntity> getAllRealms();

    List<String> getRealms(RealmLocation.Location location);
}
