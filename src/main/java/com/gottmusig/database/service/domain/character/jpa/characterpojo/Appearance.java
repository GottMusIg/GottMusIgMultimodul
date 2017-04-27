
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Appearance {

    @SerializedName("enchantDisplayInfoId")
    private Long mEnchantDisplayInfoId;
    @SerializedName("itemAppearanceModId")
    private Long mItemAppearanceModId;
    @SerializedName("itemId")
    private Long mItemId;

    public Long getEnchantDisplayInfoId() {
        return mEnchantDisplayInfoId;
    }

    public void setEnchantDisplayInfoId(Long enchantDisplayInfoId) {
        mEnchantDisplayInfoId = enchantDisplayInfoId;
    }

    public Long getItemAppearanceModId() {
        return mItemAppearanceModId;
    }

    public void setItemAppearanceModId(Long itemAppearanceModId) {
        mItemAppearanceModId = itemAppearanceModId;
    }

    public Long getItemId() {
        return mItemId;
    }

    public void setItemId(Long itemId) {
        mItemId = itemId;
    }

}
