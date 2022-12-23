package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C3975Ad ad);

    void onAdLoaded(C3975Ad ad);

    void onError(C3975Ad ad, AdError adError);

    void onLoggingImpression(C3975Ad ad);
}
