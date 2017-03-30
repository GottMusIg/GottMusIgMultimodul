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

    /**
     *
     * @return the name of the World of Warcraft Character
     */
    String getName();

    /**
     * Names can be duplicate, but may exist only once per realm!
     *
     * @param name, the new name of the World of Warcraft Character (useful after using a name change service from blizzard).
     */
    void setName(String name);

    /**
     *
     * @return the newest calculated DPS for the World of Warcraft Character
     */
    int getDPS();

    /**
     *
     * @param dps the new calculated DPS for this World of Warcraft Character
     */
    void setDPS(int dps);

    /**
     *
     * @return the current chosen specification of this World of Warcraft character
     */
    ClassSpecification getClassSpecification();

    /**
     *
     * @param classSpecification the new selected specification of this World of Warcraft character
     */
    void setClassSpecification(ClassSpecification classSpecification);

    /**
     *
     * @return the class of this World of Warcraft character
     */
    WOWClass getWOWClass();

    /**
     *
     * @return the realm this World of Warcraft character is listed in.
     */
    Realm getRealm();

    /**
     *
     * @param realm the new realm after an account transfer to another Realm (Blizzard Service)
     */
    void setRealm(Realm realm);

    /**
     *
     * @return a string representing an url to a picture of the current look of this World of Warcraft character
     */
    String getThumbnailId();

    /**
     *
     * @param thumbnail the new thubnail, has to be set after a name/realm change of the character
     */
    void setThumbnailId(String thumbnail);
}
