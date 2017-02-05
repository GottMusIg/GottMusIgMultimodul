package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.character.domain.api.Character;
import com.gottmusig.searchcharacter.jpa.Location;

import java.util.List;
import java.util.Optional;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface SearchCharacter {

    /**
     *
     * @return all Locations of WoW Servers
     */
    List<Location> getAllLocations();

    /**
     *
     * @param location the location the player is playing in
     * @param realm the realm of the players character
     * @param characterName the name of the character to be searched via blizzard API
     * @return the JSON string of the response of the blizzard api
     */
    Optional<Character> searchCharacter(Location location, String realm, String characterName);

    /**
     *
     * @param name the name of the realm to be saved in the database
     * @param location the location of the server
     */
    void saveRealm(String name, Location location);

    /**
     *
     * @return all realms available in the database
     */
    List<Realm> getAllRealms();


    /**
     *
     * @param location the location of the realms you want to search for
     * @return List of all realms available in the database for given location
     */
    List<String> getRealms(Location location);
}
