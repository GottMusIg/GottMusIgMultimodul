package com.gottmusig.database.service.domain.realm.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.realm.jpa.RealmEntity.RealmRepository;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class RealmServiceImpl implements RealmService {

    @Autowired RealmRepository realmRepository;

    @Override
    public List<Realm> getAllRealms() {
        return realmRepository.findAll(new Sort(Sort.DEFAULT_DIRECTION, "name"));
    }

    @Override
    public List<Realm> getAllRealms(Location location) {
        return realmRepository.findByLocation(location.name());
    }

    @Override
    public Optional<Realm> searchRealm(String realm) {
        return realmRepository.findByName(realm);
    }
}
