package com.gottmusig.utils;

import java.util.Arrays;
import java.util.List;
/**
 * @author lgottschick
 * @since 27.09.2016
 */
public enum RealmLocation {
    de_DE,
    en_GB,
    ru_RU,
    fr_FR,
    es_ES,
    it_IT,
    pt_BR;


	/**
	 * Creates a list with all {@link RealmLocation} and returns it.
	 * 
	 * @return A list with all {@link RealmLocation}
	 */
    public static List<RealmLocation> getLocations() {
		return Arrays.asList(RealmLocation.values());
	}
}