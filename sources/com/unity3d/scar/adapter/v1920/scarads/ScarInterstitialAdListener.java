package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

public class ScarInterstitialAdListener {

    /* renamed from: a */
    private InterstitialAd f28548a;

    /* renamed from: b */
    private IScarInterstitialAdListenerWrapper f28549b;

    /* renamed from: c */
    private IScarLoadListener f28550c;

    /* renamed from: d */
    private AdListener f28551d = new C11785a();

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarInterstitialAdListener$a */
    class C11785a extends AdListener {
        C11785a() {
        }
    }

    public ScarInterstitialAdListener(InterstitialAd interstitialAd, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        this.f28548a = interstitialAd;
        this.f28549b = iScarInterstitialAdListenerWrapper;
    }

    public AdListener getAdListener() {
        return this.f28551d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f28550c = iScarLoadListener;
    }
}
