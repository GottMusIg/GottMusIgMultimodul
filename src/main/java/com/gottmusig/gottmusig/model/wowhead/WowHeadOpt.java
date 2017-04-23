package com.gottmusig.gottmusig.model.wowhead;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by Christoph on 23.04.2017.
 */
@Getter
@Builder
public class WowHeadOpt {

    private final Classes clazz;
    private final ClassSpec spec;
    private final Slot slot;

    //Default
    private final int maxLvl = 110;
    private final int minLvl = 110;
    private final Quality quality = Quality.EPIC;

}
