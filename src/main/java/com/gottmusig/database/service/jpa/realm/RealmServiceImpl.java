package com.gottmusig.database.service.jpa.realm;

import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.realm.RealmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class RealmServiceImpl implements RealmService {

    @Autowired
    private RealmEntity.RealmRepository realmRepository;

    @Override
    public List<Realm> getAllRealms() {
        return realmRepository.findAll(new Sort(Sort.DEFAULT_DIRECTION, "name"));
    }

    @Override
    public List<Realm> getAllRealms(Location location) {
        return realmRepository.findByLocation(location.name());
    }
}
