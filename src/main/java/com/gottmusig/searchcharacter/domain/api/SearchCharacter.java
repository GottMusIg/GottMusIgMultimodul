package com.gottmusig.searchcharacter.domain.api;

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

    void saveRealm(String name, RealmLocation.Location location);


    List<RealmEntity> getAllRealms(RealmLocation.Location location);

    List<String> getRealms(RealmLocation.Location location);
}
