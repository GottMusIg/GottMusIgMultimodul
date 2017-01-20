package com.gottmusig.account.domain.api;

import com.gottmusig.character.domain.api.Character;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface Account {

    String getUserName();

    Iterable<Character> getCharacters();
}
