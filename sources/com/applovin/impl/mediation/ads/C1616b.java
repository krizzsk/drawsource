package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1586d;
import com.applovin.impl.mediation.p031a.C1587e;
import com.applovin.impl.sdk.C1827aa;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.C2111z;

/* renamed from: com.applovin.impl.mediation.ads.b */
public class C1616b implements C1827aa.C1830a {

    /* renamed from: a */
    private final C1969m f2204a;

    /* renamed from: b */
    private final C1586d f2205b;

    /* renamed from: c */
    private final C1827aa f2206c;

    /* renamed from: d */
    private final C2111z f2207d;

    /* renamed from: e */
    private final C1614a.C1615a f2208e;

    public C1616b(C1586d dVar, C1614a.C1615a aVar, C1969m mVar) {
        this.f2204a = mVar;
        this.f2205b = dVar;
        this.f2208e = aVar;
        this.f2207d = new C2111z(this.f2205b.mo13397u(), mVar);
        C1827aa aaVar = new C1827aa(this.f2205b.mo13397u(), mVar, this);
        this.f2206c = aaVar;
        aaVar.mo14116a((C1587e) this.f2205b);
        if (C2102v.m5104a()) {
            C2102v A = mVar.mo14509A();
            A.mo15012b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m3205a(long j) {
        if (this.f2205b.mo13421y().compareAndSet(false, true)) {
            if (C2102v.m5104a()) {
                this.f2204a.mo14509A().mo15012b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f2204a.mo14513E().processViewabilityAdImpressionPostback(this.f2205b, j, this.f2208e);
        }
    }

    /* renamed from: a */
    public void mo13529a() {
        this.f2206c.mo14115a();
    }

    /* renamed from: b */
    public void mo13530b() {
        if (C2102v.m5104a()) {
            this.f2204a.mo14509A().mo15012b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f2205b.mo13420x().compareAndSet(false, true)) {
            if (C2102v.m5104a()) {
                this.f2204a.mo14509A().mo15012b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            this.f2204a.mo14513E().processRawAdImpressionPostback(this.f2205b, this.f2208e);
        }
    }

    /* renamed from: c */
    public C1586d mo13531c() {
        return this.f2205b;
    }

    public void onLogVisibilityImpression() {
        m3205a(this.f2207d.mo15033a(this.f2205b));
    }
}
