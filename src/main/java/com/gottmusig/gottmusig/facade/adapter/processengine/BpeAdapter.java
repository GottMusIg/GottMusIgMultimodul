package com.gottmusig.gottmusig.facade.adapter.processengine;

import javax.annotation.Nonnull;


public interface BpeAdapter {

    @Nonnull
    String startPlayerDpsCalculation(@Nonnull String name,@Nonnull String realm, @Nonnull String region);

}
