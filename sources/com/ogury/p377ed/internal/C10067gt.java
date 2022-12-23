package com.ogury.p377ed.internal;

import com.ogury.p377ed.OguryAdClickCallback;
import p401io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gt */
public class C10067gt implements C10076h {

    /* renamed from: a */
    private final PresageInterstitialCallback f25288a;

    /* renamed from: b */
    private OguryAdClickCallback f25289b;

    public C10067gt(PresageInterstitialCallback presageInterstitialCallback) {
        C10263mq.m29882b(presageInterstitialCallback, "presageInterstitialCallback");
        this.f25288a = presageInterstitialCallback;
    }

    /* renamed from: a */
    public final void mo64790a(OguryAdClickCallback oguryAdClickCallback) {
        this.f25289b = oguryAdClickCallback;
    }

    /* renamed from: b */
    public final void mo64630b() {
        this.f25288a.onAdAvailable();
    }

    /* renamed from: c */
    public final void mo64631c() {
        this.f25288a.onAdNotAvailable();
    }

    /* renamed from: d */
    public final void mo64632d() {
        this.f25288a.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo64633e() {
        this.f25288a.onAdNotLoaded();
    }

    /* renamed from: f */
    public final void mo64634f() {
        this.f25288a.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo64635g() {
        this.f25288a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo64629a(int i) {
        C10046ga gaVar = C10046ga.f25280a;
        C10043fz fzVar = C10043fz.f25263a;
        C10046ga.m29182b(C10043fz.m29165a(i));
        this.f25288a.onAdError(i);
    }

    /* renamed from: a */
    public void mo64368a() {
        OguryAdClickCallback oguryAdClickCallback = this.f25289b;
        if (oguryAdClickCallback != null) {
            oguryAdClickCallback.onAdClicked();
        }
    }
}
