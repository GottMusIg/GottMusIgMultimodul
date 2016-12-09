package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.jpa.RealmEntity;
import com.gottmusig.utils.RealmLocation;

import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface SearchCharacter {

    List<RealmEntity> getRealms(RealmLocation location);

    List<RealmLocation> getAllLocations();

    String searchCharacter(RealmLocation location, Realm realm, String characterName);

}
