package com.gottmusig.database.service.jpa.character;

import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.realm.Realm;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public class CharacterServiceImpl implements CharacterService {
    @Override
    public Optional<Character> searchCharacter(String name, Realm realm) {
        return null;
    }
}
