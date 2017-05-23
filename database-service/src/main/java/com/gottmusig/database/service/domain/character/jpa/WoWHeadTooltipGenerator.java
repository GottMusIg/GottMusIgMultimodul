package com.gottmusig.database.service.domain.character.jpa;

import com.google.common.base.Joiner;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.GeneralItem;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.TooltipParams;
import org.springframework.core.convert.converter.Converter;

/**
 * @author leong
 * @since 12.05.2017
 */
public class WoWHeadTooltipGenerator implements Converter<GeneralItem, WoWHeadToolTip> {

    private static final Joiner joiner = Joiner.on(":");

    @Override
    public WoWHeadToolTip convert(GeneralItem source) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("item=").append(source.getItemId());
        if (!source.getBonusLists().isEmpty()) {
            stringBuilder.append("&").append("bonus=");
            stringBuilder.append(joiner.join(source.getBonusLists()));
        }
        TooltipParams tooltipParams = source.getTooltipParams();
        if(tooltipParams.getEnchant() != null) {
            stringBuilder.append("&").append("ench=").append(tooltipParams.getEnchant());
        }
        if (!tooltipParams.getGems().isEmpty()) {
            stringBuilder.append("&").append("gems=");
            stringBuilder.append(joiner.join(tooltipParams.getGems()));
        }
        return new WoWHeadToolTip(stringBuilder.toString());
    }
}
