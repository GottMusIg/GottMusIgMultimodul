package com.gottmusig.searchcharacter.jpa;

import com.gottmusig.searchcharacter.domain.api.RealmLocation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lgottschick
 * @since 27.09.2016
 */
public class RealmLocationEntity implements RealmLocation {

    @Autowired private RealmEntity.RealmRepository realmRepository;

    private Location location;

    @Override
    public List<String> getAllRealms() {
        return realmRepository.findByLocation(location).stream().map(RealmEntity::getName).collect(Collectors.toList());
    }


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