package com.gottmusig.account.domain.api;

import java.util.List;

import com.gottmusig.character.domain.api.Character;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.utils.Entity;

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

    Character addCharacter(String name, String realm, String specification, String wowClass, int dps);

    List<CharacterEntity> getCharacters();
}
