package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import java.util.List;

/**
 * @author leong
 * @since 07.05.2017
 */
public interface GeneralItem {

    Long getItemId();

    String getName();

    Long getItemLevel();

    Long getArmor();

    Long getQuality();

    TooltipParams getTooltipParams();

    String getContext();

    List<Long> getBonusLists();

}
