package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C1581a;
import com.applovin.impl.mediation.C1626c;
import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
public class C1617b implements C1581a.C1582a, C1626c.C1628a {

    /* renamed from: a */
    private final C1581a f2209a;

    /* renamed from: b */
    private final C1626c f2210b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdListener f2211c;

    public C1617b(C1969m mVar, MaxAdListener maxAdListener) {
        this.f2211c = maxAdListener;
        this.f2209a = new C1581a(mVar);
        this.f2210b = new C1626c(mVar, this);
    }

    /* renamed from: a */
    public void mo13354a(final C1585c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                C1617b.this.f2211c.onAdHidden(cVar);
            }
        }, cVar.mo13414x());
    }

    /* renamed from: a */
    public void mo13532a(MaxAd maxAd) {
        this.f2210b.mo13573a();
        this.f2209a.mo13352a();
    }

    /* renamed from: b */
    public void mo13533b(C1585c cVar) {
        long v = cVar.mo13412v();
        if (v >= 0) {
            this.f2210b.mo13574a(cVar, v);
        }
        if (cVar.mo13413w()) {
            this.f2209a.mo13353a(cVar, this);
        }
    }

    /* renamed from: c */
    public void mo13534c(C1585c cVar) {
        this.f2211c.onAdHidden(cVar);
    }
}
