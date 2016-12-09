package com.gottmusig.searchcharacter.jpa;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.gottmusig.searchcharacter.domain.api.RealmLocation;

/**
 * @author lgottschick
 * @since 27.09.2016
 */
public class RealmLocationEntity implements RealmLocation {

    @Autowired private RealmEntity.RealmRepository realmRepository;

    private Location location;
   
    @Override
    public Location getLocation() {
		return location;
	}

    @Override
    public List<String> getAllRealms() {
        return realmRepository.findByLocation(location).stream().map(RealmEntity::getName).collect(Collectors.toList());
    }

}