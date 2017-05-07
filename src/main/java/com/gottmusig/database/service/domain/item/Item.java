package com.gottmusig.database.service.domain.item;

import com.gottmusig.database.service.domain.item.jpa.TooltipParamsEntity;

/**
 * Created by leong on 03.04.2017.
 */
public interface Item {

    Long getItemId();

    String getName();

    Long getItemLevel();

    Long getArmor();

    Long getQuality();

    TooltipParamsEntity getTooltipParams();

    String getContext();

}
