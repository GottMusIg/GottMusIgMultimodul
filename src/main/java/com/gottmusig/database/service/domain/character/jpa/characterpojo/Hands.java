
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Hands {

    @SerializedName("appearance")
    private Appearance mAppearance;
    @SerializedName("armor")
    private Long mArmor;
    @SerializedName("artifactAppearanceId")
    private Long mArtifactAppearanceId;
    @SerializedName("artifactId")
    private Long mArtifactId;
    @SerializedName("artifactTraits")
    private List<ArtifactTrait> mArtifactTraits;
    @SerializedName("bonusLists")
    private List<Long> mBonusLists;
    @SerializedName("context")
    private String mContext;
    @SerializedName("displayInfoId")
    private Long mDisplayInfoId;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private Long mId;
    @SerializedName("itemLevel")
    private Long mItemLevel;
    @SerializedName("name")
    private String mName;
    @SerializedName("quality")
    private Long mQuality;
    @SerializedName("relics")
    private List<Relic> mRelics;
    @SerializedName("stats")
    private List<Stat> mStats;
    @SerializedName("tooltipParams")
    private TooltipParams mTooltipParams;

    public Appearance getAppearance() {
        return mAppearance;
    }

    public void setAppearance(Appearance appearance) {
        mAppearance = appearance;
    }

    public Long getArmor() {
        return mArmor;
    }

    public void setArmor(Long armor) {
        mArmor = armor;
    }

    public Long getArtifactAppearanceId() {
        return mArtifactAppearanceId;
    }

    public void setArtifactAppearanceId(Long artifactAppearanceId) {
        mArtifactAppearanceId = artifactAppearanceId;
    }

    public Long getArtifactId() {
        return mArtifactId;
    }

    public void setArtifactId(Long artifactId) {
        mArtifactId = artifactId;
    }

    public List<ArtifactTrait> getArtifactTraits() {
        return mArtifactTraits;
    }

    public void setArtifactTraits(List<ArtifactTrait> artifactTraits) {
        mArtifactTraits = artifactTraits;
    }

    public List<Long> getBonusLists() {
        return mBonusLists;
    }

    public void setBonusLists(List<Long> bonusLists) {
        mBonusLists = bonusLists;
    }

    public String getContext() {
        return mContext;
    }

    public void setContext(String context) {
        mContext = context;
    }

    public Long getDisplayInfoId() {
        return mDisplayInfoId;
    }

    public void setDisplayInfoId(Long displayInfoId) {
        mDisplayInfoId = displayInfoId;
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

    public Long getItemLevel() {
        return mItemLevel;
    }

    public void setItemLevel(Long itemLevel) {
        mItemLevel = itemLevel;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getQuality() {
        return mQuality;
    }

    public void setQuality(Long quality) {
        mQuality = quality;
    }

    public List<Relic> getRelics() {
        return mRelics;
    }

    public void setRelics(List<Relic> relics) {
        mRelics = relics;
    }

    public List<Stat> getStats() {
        return mStats;
    }

    public void setStats(List<Stat> stats) {
        mStats = stats;
    }

    public TooltipParams getTooltipParams() {
        return mTooltipParams;
    }

    public void setTooltipParams(TooltipParams tooltipParams) {
        mTooltipParams = tooltipParams;
    }

}
