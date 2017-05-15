package com.gottmusig.database.service.domain.character.jpa;

import java.util.Objects;

/**
 * @author leong
 * @since 12.05.2017
 */
public class WoWHeadToolTip {

    private String tooltip;

    public WoWHeadToolTip(String tooltip) {
        this.tooltip = Objects.requireNonNull(tooltip);
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}
