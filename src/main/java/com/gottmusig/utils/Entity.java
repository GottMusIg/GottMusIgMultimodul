package com.gottmusig.utils;

import java.io.Serializable;

/**
 * Base interface for all entities with an id.
 *
 * @author Leon Gottschick
 * @since 0.0.1
 */
public interface Entity extends Serializable {

    /**
     * @return The primary id (key).
     */
    Id getId();

    /**
     * A serializable id for an entity.
     *
     * @author Christian Kaspari
     * @since 1.0.0
     */
    interface Id extends Serializable {

        /**
         * @return A display value for this id.
         */
        String displayValue();

    }
}