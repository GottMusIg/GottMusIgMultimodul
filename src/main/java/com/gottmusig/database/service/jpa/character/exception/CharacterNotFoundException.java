package com.gottmusig.database.service.jpa.character.exception;

/**
 * @author leong
 * @since 06.02.2017
 */
public class CharacterNotFoundException extends Exception {

    public CharacterNotFoundException(String message) {
        super(message);
    }
}
