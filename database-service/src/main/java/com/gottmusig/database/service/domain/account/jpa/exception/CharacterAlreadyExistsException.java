package com.gottmusig.database.service.domain.account.jpa.exception;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public class CharacterAlreadyExistsException extends RuntimeException {

    public CharacterAlreadyExistsException(String message) {
        super(message);
    }
}
