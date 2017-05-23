
package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Relic {

    @SerializedName("bonusLists")
    private List<Long> mBonusLists;
    @SerializedName("context")
    private Long mContext;
    @SerializedName("itemId")
    private Long mItemId;
    @SerializedName("socket")
    private Long mSocket;

    public List<Long> getBonusLists() {
        return mBonusLists;
    }

    public void setBonusLists(List<Long> bonusLists) {
        mBonusLists = bonusLists;
    }

    public Long getContext() {
        return mContext;
    }

    public void setContext(Long context) {
        mContext = context;
    }

    public Long getItemId() {
        return mItemId;
    }

    public void setItemId(Long itemId) {
        mItemId = itemId;
    }

    public Long getSocket() {
        return mSocket;
    }

    public void setSocket(Long socket) {
        mSocket = socket;
    }

}
