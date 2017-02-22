package com.gottmusig.database.service.domain.character;

import com.gottmusig.database.service.domain.Entity;
import com.gottmusig.database.service.domain.realm.Realm;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface Character extends Entity {

    String getName();

    void setName(String name);

    int getDPS();

    void setDPS(int dps);

    ClassSpecification getClassSpecification();

    void setClassSpecification(ClassSpecification classSpecification);

    WOWClass getWOWClass();

    Realm getRealm();

    void setRealm(Realm realm);

    String getThumbnailId();

    void setThumbnailId(String thumbnail);
}
