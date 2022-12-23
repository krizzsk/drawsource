package com.ogury.p377ed.internal;

import com.ogury.p377ed.OguryAdClickCallback;
import p401io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gs */
public final class C10066gs {

    /* renamed from: a */
    private C10067gt f25286a;

    /* renamed from: b */
    private OguryAdClickCallback f25287b;

    /* renamed from: a */
    public final C10067gt mo64788a(PresageInterstitialCallback presageInterstitialCallback) {
        if (presageInterstitialCallback == null) {
            return null;
        }
        C10067gt gtVar = new C10067gt(presageInterstitialCallback);
        gtVar.mo64790a(this.f25287b);
        this.f25286a = gtVar;
        return gtVar;
    }

    /* renamed from: a */
    public final void mo64789a(OguryAdClickCallback oguryAdClickCallback) {
        C10067gt gtVar = this.f25286a;
        if (gtVar != null) {
            gtVar.mo64790a(oguryAdClickCallback);
        }
        this.f25287b = oguryAdClickCallback;
    }
}
