package com.gottmusig.database.service.deprecated.searchcharacter.domain.api;

import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.jpa.realm.Location;

import java.util.List;
import java.util.Optional;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface SearchCharacter {

    /**
     * @return all Locations of WoW Servers
     */
    List<Location> getAllLocations();

    /**
     * @param location      the location the player is playing in
     * @param realm         the realm of the players characterpojo
     * @param name the name of the characterpojo to be searched via blizzard API
     * @return the JSON string of the response of the blizzard api
     */
    Optional<Character> searchCharacter(Location location, Realm realm, String name);

    /**
     * @param name     the name of the realm to be saved in the database
     * @param location the location of the server
     */
    Realm saveRealm(String name, Location location);

    /**
     * @return all realms available in the database
     */
    List<Realm> getAllRealms();


    /**
     * @param location the location of the realms you want to search for
     * @return List of all realms available in the database for given location
     */
    List<Realm> getRealms(Location location);

}
