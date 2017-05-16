package com.gottmusig.database.service.domain.item;

import com.gottmusig.database.service.domain.Entity;

/**
 * Created by leong on 03.04.2017.
 */
public interface Item extends Entity {

    String getName();

    Long getItemLevel();

    String getWowHeadTooltip();

    String getContext();

}
