package com.gottmusig.gottmusig.facade.adapter.processengine;

import javax.annotation.Nonnull;


public interface BpeAdapter {

    @Nonnull
    String startItemRankingCalculation(@Nonnull String wowClass, @Nonnull String slot);

}
