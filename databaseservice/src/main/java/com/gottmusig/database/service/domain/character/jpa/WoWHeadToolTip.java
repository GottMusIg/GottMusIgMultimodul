package com.gottmusig.database.service.domain.character.jpa;

import java.util.Objects;

/**
 * @author leong
 * @since 12.05.2017
 */
public class WoWHeadToolTip {

    private final String tooltip;

    public WoWHeadToolTip(String tooltip) {
        this.tooltip = Objects.requireNonNull(tooltip);
    }

    public String getTooltip() {
        return tooltip;
    }
}
