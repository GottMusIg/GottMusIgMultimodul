package com.gottmusig.database.service.jpa.character.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CharacterPOJO {

    @SerializedName("achievementPoints")
    private Long mAchievementPoints;
    @SerializedName("battlegroup")
    private String mBattlegroup;
    @SerializedName("calcClass")
    private String mCalcClass;
    @SerializedName("class")
    private Long _class;
    @SerializedName("faction")
    private Long mFaction;
    @SerializedName("gender")
    private Long mGender;
    @SerializedName("lastModified")
    private Long mLastModified;
    @SerializedName("level")
    private Long mLevel;
    @SerializedName("name")
    private String mName;
    @SerializedName("race")
    private Long mRace;
    @SerializedName("realm")
    private String mRealm;
    @SerializedName("talents")
    private List<Talent> mTalents;
    @SerializedName("thumbnail")
    private String mThumbnail;
    @SerializedName("totalHonorableKills")
    private Long mTotalHonorableKills;

    public Long getAchievementPoints() {
        return mAchievementPoints;
    }

    public void setAchievementPoints(Long achievementPoints) {
        mAchievementPoints = achievementPoints;
    }

    public String getBattlegroup() {
        return mBattlegroup;
    }

    public void setBattlegroup(String battlegroup) {
        mBattlegroup = battlegroup;
    }

    public String getCalcClass() {
        return mCalcClass;
    }

    public void setCalcClass(String calcClass) {
        mCalcClass = calcClass;
    }

    public Long get_Class() {
        return _class;
    }

    public void setClass(Long _class) {
        this._class = _class;
    }

    public Long getFaction() {
        return mFaction;
    }

    public void setFaction(Long faction) {
        mFaction = faction;
    }

    public Long getGender() {
        return mGender;
    }

    public void setGender(Long gender) {
        mGender = gender;
    }

    public Long getLastModified() {
        return mLastModified;
    }

    public void setLastModified(Long lastModified) {
        mLastModified = lastModified;
    }

    public Long getLevel() {
        return mLevel;
    }

    public void setLevel(Long level) {
        mLevel = level;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getRace() {
        return mRace;
    }

    public void setRace(Long race) {
        mRace = race;
    }

    public String getRealm() {
        return mRealm;
    }

    public void setRealm(String realm) {
        mRealm = realm;
    }

    public List<Talent> getTalents() {
        return mTalents;
    }

    public void setTalents(List<Talent> talents) {
        mTalents = talents;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    public Long getTotalHonorableKills() {
        return mTotalHonorableKills;
    }

    public void setTotalHonorableKills(Long totalHonorableKills) {
        mTotalHonorableKills = totalHonorableKills;
    }

}
