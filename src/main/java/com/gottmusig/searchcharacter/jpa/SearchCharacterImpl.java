package com.gottmusig.searchcharacter.jpa;

import com.gottmusig.rest.blizzard.RestClient;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Autowired private RealmEntity.RealmRepository realmRepository;

    @Override
    public List<Location> getAllLocations() {
        return (Location.getLocations());
    }

    @Override
    public String searchCharacter(Location location, Realm realm, String characterName) {
        return RestClient.searchCharacter(location.name(),realm.getName(),characterName);
    }

    @Override
    public void saveRealm(String name, Location location) {
        RealmEntity realm = new RealmEntity();
        realm.setLocation(location);
        realm.setName(name);
        realmRepository.save(realm);
    }

    @Override
    public List<RealmEntity> getAllRealms() {

        return ((List<RealmEntity>)realmRepository.findAll());

    }

    @Override
    public List<String> getRealms(Location location) {

        return realmRepository.findByLocation(location.name()).stream().map(RealmEntity::getName).collect(Collectors.toList());

    }

}
