
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Stat {

    @SerializedName("amount")
    private Long mAmount;
    @SerializedName("stat")
    private Long mStat;

    public Long getAmount() {
        return mAmount;
    }

    public void setAmount(Long amount) {
        mAmount = amount;
    }

    public Long getStat() {
        return mStat;
    }

    public void setStat(Long stat) {
        mStat = stat;
    }

}
