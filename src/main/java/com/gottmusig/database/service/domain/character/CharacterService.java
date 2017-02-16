package com.gottmusig.database.service.domain.character;

import com.gottmusig.database.service.domain.realm.Realm;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface CharacterService {

    Optional<Character> searchCharacter(String name, Realm realm);

}
