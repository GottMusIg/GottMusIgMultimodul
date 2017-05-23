
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Damage {

    @SerializedName("exactMax")
    private Long mExactMax;
    @SerializedName("exactMin")
    private Long mExactMin;
    @SerializedName("max")
    private Long mMax;
    @SerializedName("min")
    private Long mMin;

    public Long getExactMax() {
        return mExactMax;
    }

    public void setExactMax(Long exactMax) {
        mExactMax = exactMax;
    }

    public Long getExactMin() {
        return mExactMin;
    }

    public void setExactMin(Long exactMin) {
        mExactMin = exactMin;
    }

    public Long getMax() {
        return mMax;
    }

    public void setMax(Long max) {
        mMax = max;
    }

    public Long getMin() {
        return mMin;
    }

    public void setMin(Long min) {
        mMin = min;
    }

}
