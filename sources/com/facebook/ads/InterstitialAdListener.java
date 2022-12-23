package com.facebook.ads;

public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C3975Ad ad);

    void onInterstitialDisplayed(C3975Ad ad);
}
