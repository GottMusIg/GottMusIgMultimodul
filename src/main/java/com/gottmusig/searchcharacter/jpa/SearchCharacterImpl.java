package com.gottmusig.searchcharacter.jpa;

import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.utils.RealmLocation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Autowired RealmEntity.RealmRepository realmRepository;

    @Override
    public List<RealmEntity> getRealms(RealmLocation location) {
        return searchRealms(location);
    }

    private List<RealmEntity> searchRealms(RealmLocation location) {
        return realmRepository.findByLocation(location);
    }

    @Override
    public List<RealmLocation> getAllLocations() {
        return RealmLocation.getLocations();
    }

    @Override
    public String searchCharacter(RealmLocation location, Realm realm, String characterName) {
        return null;
    }
}
