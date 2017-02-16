package com.gottmusig.database.service.domain.account;

import com.gottmusig.database.service.domain.Entity;
import com.gottmusig.database.service.jpa.account.AccountEntity;
import com.gottmusig.database.service.jpa.character.CharacterEntity;

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
