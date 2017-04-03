package com.gottmusig.database.service.domain.character;

import com.gottmusig.database.service.domain.realm.Realm;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0
 */
public interface CharacterService {

    /**
     *
     * @param name the name of the World of Warcraft character to search
     * @param realm the realm which the Character is playing on
     * @return the accoount as an optional, if the character is present in either the database or is found via the blizzard
     * api, or an empty optional
     */
    Optional<Character> searchCharacter(String realm, String name);

    /**
     *
     * @param character the character to save in the database
     * @return the saved character
     */
    Character saveCharacter(Character character);

}
