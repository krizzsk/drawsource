package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;

public class ScarInterstitialAdListener extends ScarAdListener {

    /* renamed from: b */
    private final ScarInterstitialAd f28625b;

    /* renamed from: c */
    private final IScarInterstitialAdListenerWrapper f28626c;

    /* renamed from: d */
    private final InterstitialAdLoadCallback f28627d = new C11801a();

    /* renamed from: e */
    private final FullScreenContentCallback f28628e = new C11802b();

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAdListener$a */
    class C11801a extends InterstitialAdLoadCallback {
        C11801a() {
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAdListener$b */
    class C11802b extends FullScreenContentCallback {
        C11802b() {
        }
    }

    public ScarInterstitialAdListener(IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper, ScarInterstitialAd scarInterstitialAd) {
        this.f28626c = iScarInterstitialAdListenerWrapper;
        this.f28625b = scarInterstitialAd;
    }

    public InterstitialAdLoadCallback getAdLoadListener() {
        return this.f28627d;
    }
}
