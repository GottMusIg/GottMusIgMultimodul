
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TooltipParams {

    @SerializedName("enchant")
    private Long mEnchant;
    @SerializedName("gem0")
    private Long mGem0;
    @SerializedName("gem1")
    private Long mGem1;
    @SerializedName("gem2")
    private Long mGem2;
    @SerializedName("timewalkerLevel")
    private Long mTimewalkerLevel;
    @SerializedName("transmogItem")
    private Long mTransmogItem;

    public Long getEnchant() {
        return mEnchant;
    }

    public void setEnchant(Long enchant) {
        mEnchant = enchant;
    }

    public Long getGem0() {
        return mGem0;
    }

    public void setGem0(Long gem0) {
        mGem0 = gem0;
    }

    public Long getGem1() {
        return mGem1;
    }

    public void setGem1(Long gem1) {
        mGem1 = gem1;
    }

    public Long getGem2() {
        return mGem2;
    }

    public void setGem2(Long gem2) {
        mGem2 = gem2;
    }

    public Long getTimewalkerLevel() {
        return mTimewalkerLevel;
    }

    public void setTimewalkerLevel(Long timewalkerLevel) {
        mTimewalkerLevel = timewalkerLevel;
    }

    public Long getTransmogItem() {
        return mTransmogItem;
    }

    public void setTransmogItem(Long transmogItem) {
        mTransmogItem = transmogItem;
    }

}
