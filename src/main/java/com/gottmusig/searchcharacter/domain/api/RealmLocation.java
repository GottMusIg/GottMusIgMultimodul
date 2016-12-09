package com.gottmusig.searchcharacter.domain.api;

import java.util.Arrays;
import java.util.List;

import com.gottmusig.searchcharacter.jpa.RealmLocationEntity;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface RealmLocation {

    List<String> getAllRealms();

    Location getLocation();
    
    public enum Location {
    	de_DE,
    	en_GB,
    	ru_RU,
    	fr_FR,
    	es_ES,
    	it_IT,
    	pt_BR;
    	
    	
    	/**
    	 * Creates a list with all {@link RealmLocationEntity} and returns it.
    	 * 
    	 * @return A list with all {@link RealmLocationEntity}
    	 */
    	public static List<Location> getLocations() {
    		return Arrays.asList(Location.values());
    	}
}
    
}
