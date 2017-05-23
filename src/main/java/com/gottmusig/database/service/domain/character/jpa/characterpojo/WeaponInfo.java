
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class WeaponInfo {

    @SerializedName("damage")
    private Damage mDamage;
    @SerializedName("dps")
    private Double mDps;
    @SerializedName("weaponSpeed")
    private Double mWeaponSpeed;

    public Damage getDamage() {
        return mDamage;
    }

    public void setDamage(Damage damage) {
        mDamage = damage;
    }

    public Double getDps() {
        return mDps;
    }

    public void setDps(Double dps) {
        mDps = dps;
    }

    public Double getWeaponSpeed() {
        return mWeaponSpeed;
    }

    public void setWeaponSpeed(Double weaponSpeed) {
        mWeaponSpeed = weaponSpeed;
    }

}
