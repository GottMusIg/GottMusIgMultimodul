
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TooltipParams {

    @SerializedName("enchant")
    private Long enchant;
    @SerializedName("gem0")
    private Long gem0;
    @SerializedName("gem1")
    private Long gem1;
    @SerializedName("gem2")
    private Long gem2;
    @SerializedName("transmogItem")
    private Long transmogItem;

    public Long getEnchant() {
        return enchant;
    }

    public void setEnchant(Long enchant) {
        this.enchant = enchant;
    }

    public Long getGem0() {
        return gem0;
    }

    public void setGem0(Long gem0) {
        this.gem0 = gem0;
    }

    public Long getGem1() {
        return gem1;
    }

    public void setGem1(Long gem1) {
        this.gem1 = gem1;
    }

    public Long getGem2() {
        return gem2;
    }

    public void setGem2(Long gem2) {
        this.gem2 = gem2;
    }

    public Long getTransmogItem() {
        return transmogItem;
    }

    public void setTransmogItem(Long transmogItem) {
        this.transmogItem = transmogItem;
    }
}
