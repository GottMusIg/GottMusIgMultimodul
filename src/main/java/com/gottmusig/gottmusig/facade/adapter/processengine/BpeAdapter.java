package com.gottmusig.gottmusig.facade.adapter.processengine;

import javax.annotation.Nonnull;


public interface BpeAdapter {

    @Nonnull
    String startItemRankingCalculation(@Nonnull String simcVersion);

    @Nonnull
    String startMainPageDpsSimulation(@Nonnull String simcVersion);

}
