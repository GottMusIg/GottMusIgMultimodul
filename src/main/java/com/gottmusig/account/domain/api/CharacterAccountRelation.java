package com.gottmusig.account.domain.api;

import com.gottmusig.account.jpa.AccountEntity;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.utils.Entity;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface CharacterAccountRelation extends Entity {
    Entity.Id getId();

    AccountEntity getAccount();

    void setAccount(AccountEntity account);

    CharacterEntity getCharacter();

    void setCharacter(CharacterEntity character);
}
