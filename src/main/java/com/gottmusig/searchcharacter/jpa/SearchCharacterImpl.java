package com.gottmusig.searchcharacter.jpa;

import com.gottmusig.rest.blizzard.RestClient;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.RealmEntity.RealmRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Autowired transient RealmRepository realmRepository;
    @Autowired transient RestClient restClient;

    @Override
    public List<Location> getAllLocations() {
        return (Location.getLocations());
    }

    @Override
    public String searchCharacter(Location location, String realm, String characterName) {
        return restClient.searchCharacter(location.name(),realm,characterName);
    }

    @Override
    public void saveRealm(String name, Location location) {
        RealmEntity realm = new RealmEntity();
        realm.setLocation(location);
        realm.setName(name);
        realmRepository.save(realm);
    }

    @Override
    public List<Realm> getAllRealms() {

        return ((List<RealmEntity>) realmRepository.findAll()).stream().map(realmEntity -> (Realm) realmEntity).collect(Collectors.toList());

    }

    @Override
    public List<String> getRealms(Location location) {

        return realmRepository.findByLocation(location.name()).stream().map(Realm::getName).collect(Collectors.toList());

    }
}
