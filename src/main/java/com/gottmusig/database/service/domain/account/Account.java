package com.gottmusig.database.service.domain.account;

import com.gottmusig.database.service.domain.Entity;
import com.gottmusig.database.service.domain.character.Character;

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

    void removeCharacter(Character character);
}
