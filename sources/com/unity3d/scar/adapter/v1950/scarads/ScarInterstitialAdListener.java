package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

public class ScarInterstitialAdListener {

    /* renamed from: a */
    private InterstitialAd f28586a;

    /* renamed from: b */
    private IScarInterstitialAdListenerWrapper f28587b;

    /* renamed from: c */
    private IScarLoadListener f28588c;

    /* renamed from: d */
    private AdListener f28589d = new C11793a();

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarInterstitialAdListener$a */
    class C11793a extends AdListener {
        C11793a() {
        }
    }

    public ScarInterstitialAdListener(InterstitialAd interstitialAd, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        this.f28586a = interstitialAd;
        this.f28587b = iScarInterstitialAdListenerWrapper;
    }

    public AdListener getAdListener() {
        return this.f28589d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f28588c = iScarLoadListener;
    }
}
