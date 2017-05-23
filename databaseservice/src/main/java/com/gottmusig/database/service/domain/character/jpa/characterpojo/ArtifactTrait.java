
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ArtifactTrait {

    @SerializedName("id")
    private Long mId;
    @SerializedName("rank")
    private Long mRank;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getRank() {
        return mRank;
    }

    public void setRank(Long rank) {
        mRank = rank;
    }

}
