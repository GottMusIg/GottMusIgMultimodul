package com.gottmusig.character.domain.api;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.WOWClass;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.utils.Entity;

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

}
