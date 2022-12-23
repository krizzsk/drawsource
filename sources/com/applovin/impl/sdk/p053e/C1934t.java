package com.applovin.impl.sdk.p053e;

import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1417c;
import com.applovin.impl.p028a.C1418d;
import com.applovin.impl.p028a.C1419e;
import com.applovin.impl.p028a.C1420f;
import com.applovin.impl.p028a.C1424i;
import com.applovin.impl.p028a.C1425j;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.p028a.C1428m;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e.t */
class C1934t extends C1887a {

    /* renamed from: a */
    private final C1419e f3597a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f3598c;

    C1934t(C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskRenderVastAd", mVar);
        this.f3598c = appLovinAdLoadListener;
        this.f3597a = eVar;
    }

    public void run() {
        if (C2102v.m5104a()) {
            mo14365a("Rendering VAST ad...");
        }
        int size = this.f3597a.mo12898b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        C1424i iVar = null;
        C1428m mVar = null;
        C1418d dVar = null;
        C1417c cVar = null;
        String str2 = str;
        for (C2098r next : this.f3597a.mo12898b()) {
            C2098r c = next.mo14992c(C1427l.m2497a(next) ? "Wrapper" : "InLine");
            if (c != null) {
                C2098r c2 = c.mo14992c("AdSystem");
                if (c2 != null) {
                    iVar = C1424i.m2477a(c2, iVar, this.f3496b);
                }
                str = C1427l.m2488a(c, InLine.AD_TITLE, str);
                str2 = C1427l.m2488a(c, InLine.DESCRIPTION, str2);
                C1427l.m2493a(c.mo14989a("Impression"), (Set<C1425j>) hashSet, this.f3597a, this.f3496b);
                C2098r b = c.mo14990b("ViewableImpression");
                if (b != null) {
                    C1427l.m2493a(b.mo14989a(ViewableImpression.VIEWABLE), (Set<C1425j>) hashSet, this.f3597a, this.f3496b);
                }
                C2098r c3 = c.mo14992c("AdVerifications");
                if (c3 != null) {
                    cVar = C1417c.m2451a(c3, cVar, this.f3597a, this.f3496b);
                }
                C1427l.m2493a(c.mo14989a("Error"), (Set<C1425j>) hashSet2, this.f3597a, this.f3496b);
                C2098r b2 = c.mo14990b("Creatives");
                if (b2 != null) {
                    for (C2098r next2 : b2.mo14994d()) {
                        C2098r b3 = next2.mo14990b("Linear");
                        if (b3 != null) {
                            mVar = C1428m.m2503a(b3, mVar, this.f3597a, this.f3496b);
                        } else {
                            C2098r c4 = next2.mo14992c("CompanionAds");
                            if (c4 != null) {
                                C2098r c5 = c4.mo14992c("Companion");
                                if (c5 != null) {
                                    dVar = C1418d.m2453a(c5, dVar, this.f3597a, this.f3496b);
                                }
                            } else if (C2102v.m5104a()) {
                                mo14370d("Received and will skip rendering for an unidentified creative: " + next2);
                            }
                        }
                    }
                }
            } else if (C2102v.m5104a()) {
                mo14370d("Did not find wrapper or inline response for node: " + next);
            }
        }
        C1411a a = new C1411a.C1413a().mo12871a(this.f3496b).mo12874a(this.f3597a.mo12899c()).mo12878b(this.f3597a.mo12900d()).mo12870a(this.f3597a.mo12901e()).mo12865a(this.f3597a.mo12902f()).mo12872a(str).mo12876b(str2).mo12868a(iVar).mo12869a(mVar).mo12867a(dVar).mo12866a(cVar).mo12873a((Set<C1425j>) hashSet).mo12866a(cVar).mo12877b((Set<C1425j>) hashSet2).mo12875a();
        C1420f a2 = C1427l.m2484a(a);
        if (a2 == null) {
            if (C2102v.m5104a()) {
                mo14365a("Finished rendering VAST ad: " + a);
            }
            a.mo12863o().mo14066b();
            C1897e eVar = new C1897e(a, this.f3496b, this.f3598c);
            C1918o.C1920a aVar = C1918o.C1920a.CACHING_OTHER;
            if (((Boolean) this.f3496b.mo14534a(C1867b.f3187bi)).booleanValue()) {
                if (a.getType() == AppLovinAdType.REGULAR) {
                    aVar = C1918o.C1920a.CACHING_INTERSTITIAL;
                } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = C1918o.C1920a.CACHING_INCENTIVIZED;
                }
            }
            this.f3496b.mo14526S().mo14429a((C1887a) eVar, aVar);
            return;
        }
        C1427l.m2491a(this.f3597a, this.f3598c, a2, -6, this.f3496b);
    }
}
