package com.facebook.ads;

import com.facebook.ads.C3975Ad;

public interface FullScreenAd extends C3975Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C3975Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
