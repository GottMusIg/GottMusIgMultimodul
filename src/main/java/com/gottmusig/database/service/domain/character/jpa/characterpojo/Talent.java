package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Talent {

    @SerializedName("calcSpec")
    private String mCalcSpec;
    @SerializedName("calcTalent")
    private String mCalcTalent;
    @SerializedName("column")
    private Long mColumn;
    @SerializedName("selected")
    private Boolean mSelected;
    @SerializedName("spec")
    private Spec mSpec;
    @SerializedName("spell")
    private Spell mSpell;
    @SerializedName("talents")
    private List<Talent> mTalents;
    @SerializedName("tier")
    private Long mTier;

    public String getCalcSpec() {
        return mCalcSpec;
    }

    public void setCalcSpec(String calcSpec) {
        mCalcSpec = calcSpec;
    }

    public String getCalcTalent() {
        return mCalcTalent;
    }

    public void setCalcTalent(String calcTalent) {
        mCalcTalent = calcTalent;
    }

    public Long getColumn() {
        return mColumn;
    }

    public void setColumn(Long column) {
        mColumn = column;
    }

    public Boolean getSelected() {
        return mSelected;
    }

    public void setSelected(Boolean selected) {
        mSelected = selected;
    }

    public Spec getSpec() {
        return mSpec;
    }

    public void setSpec(Spec spec) {
        mSpec = spec;
    }

    public Spell getSpell() {
        return mSpell;
    }

    public void setSpell(Spell spell) {
        mSpell = spell;
    }

    public List<Talent> getTalents() {
        return mTalents;
    }

    public void setTalents(List<Talent> talents) {
        mTalents = talents;
    }

    public Long getTier() {
        return mTier;
    }

    public void setTier(Long tier) {
        mTier = tier;
    }

}
