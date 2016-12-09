package com.gottmusig.searchcharacter.jpa;

import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;

import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Override
    public List<RealmLocationEntity> getAllLocations() {
        return null;
    }

    @Override
    public String searchCharacter(RealmLocationEntity location, Realm realm, String characterName) {
        return null;
    }
}
