package com.gottmusig.searchcharacter.jpa;

import java.util.Arrays;
import java.util.List;

/**
 * @author lgottschick
 * @since 27.09.2016
 */

//TODO figure out @Autowire in Entities
public enum Location {
    de_DE,
    en_GB,
    ru_RU,
    fr_FR,
    es_ES,
    it_IT,
    pt_BR;


    /**
     * Creates a list with all {@link Location} and returns it.
     *
     * @return A list with all {@link Location}
     */
    public static List<Location> getLocations() {
        return Arrays.asList(Location.values());
    }
}