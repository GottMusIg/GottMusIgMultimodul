package com.gottmusig.searchcharacter.domain.api;

import com.gottmusig.searchcharacter.jpa.RealmLocationEntity;

import java.util.Arrays;
import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */
public interface RealmLocation {

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
