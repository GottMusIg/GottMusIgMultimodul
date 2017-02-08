package com.gottmusig.account.domain.api;

import com.gottmusig.character.domain.api.Character;
import com.gottmusig.utils.Entity;

import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface Account extends Entity {

    String getUserName();

    void setUserName(String userName);

    String getPassword();

    void setPassword(String password);

    Character addCharacter(Character character);

    List<Character> getCharacters();
}
