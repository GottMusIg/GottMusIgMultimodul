
package com.gottmusig.utils;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Spell {

    @SerializedName("castTime")
    private String mCastTime;
    @SerializedName("cooldown")
    private String mCooldown;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("powerCost")
    private String mPowerCost;
    @SerializedName("range")
    private String mRange;

    public String getCastTime() {
        return mCastTime;
    }

    public void setCastTime(String castTime) {
        mCastTime = castTime;
    }

    public String getCooldown() {
        return mCooldown;
    }

    public void setCooldown(String cooldown) {
        mCooldown = cooldown;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPowerCost() {
        return mPowerCost;
    }

    public void setPowerCost(String powerCost) {
        mPowerCost = powerCost;
    }

    public String getRange() {
        return mRange;
    }

    public void setRange(String range) {
        mRange = range;
    }

}
