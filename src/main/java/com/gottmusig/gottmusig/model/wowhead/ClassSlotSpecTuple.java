package com.gottmusig.gottmusig.model.wowhead;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Christoph on 23.04.2017.
 */
@Getter
@AllArgsConstructor
public class ClassSlotSpecTuple {

    private final Classes clazz;
    private final ClassSpec spec;
    private final Slot slot;

}
