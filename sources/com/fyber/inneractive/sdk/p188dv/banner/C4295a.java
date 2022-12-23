package com.fyber.inneractive.sdk.p188dv.banner;

import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p188dv.C4292a;
import com.fyber.inneractive.sdk.p188dv.C4293b;
import com.fyber.inneractive.sdk.p188dv.C4302d;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.p188dv.enums.C4304a;
import com.fyber.inneractive.sdk.p188dv.handler.C4310c;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.a */
public class C4295a extends C4292a<AdView> {

    /* renamed from: j */
    public boolean f10558j = false;

    /* renamed from: k */
    public boolean f10559k = false;

    /* renamed from: l */
    public final AdListener f10560l = new C4296a();

    /* renamed from: com.fyber.inneractive.sdk.dv.banner.a$a */
    public class C4296a extends AdListener {
        public C4296a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            InneractiveAdRequest inneractiveAdRequest = C4295a.this.f10712a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            C4304a aVar = C4304a.Load;
            C4295a aVar2 = C4295a.this;
            C4310c.m13358a(spotId, aVar, aVar2.f10712a, (C4305f) aVar2.f10713b, loadAdError.getMessage());
        }

        public void onAdImpression() {
            C4295a aVar = C4295a.this;
            C4297b bVar = aVar.f10554h;
            if (bVar != null) {
                bVar.mo24311v();
            } else {
                boolean unused = aVar.f10558j = true;
            }
        }

        public void onAdLoaded() {
            C4295a aVar = C4295a.this;
            if (aVar.f10553g != null) {
                boolean unused = aVar.f10559k = true;
                ((C4293b) C4295a.this.f10553g).mo24496d();
            }
        }

        public void onAdOpened() {
            C4305f fVar;
            C4193b bVar;
            C4297b bVar2 = C4295a.this.f10554h;
            if (bVar2 != null) {
                bVar2.mo24534z();
                AdContent adcontent = bVar2.f10720b;
                if (adcontent != null && (fVar = (C4305f) ((C4295a) adcontent).f10713b) != null) {
                    bVar2.mo24527a((C5233e) fVar);
                    C4288z zVar = ((C4295a) bVar2.f10720b).f10715d;
                    if (zVar != null) {
                        C4287y yVar = (C4287y) zVar;
                        if (yVar.f10546c != null) {
                            C4192a aVar = C4192a.CLICK;
                            if (yVar.f10546c.f10490b == UnitDisplayType.MRECT) {
                                bVar = C4193b.RECTANGLE_DISPLAY;
                            } else {
                                bVar = C4193b.BANNER_DISPLAY;
                            }
                            bVar2.mo24525a(aVar, bVar);
                        }
                    }
                }
            }
        }
    }

    public C4295a(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: d */
    public boolean mo24299d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo24294e() {
        return this.f10559k;
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        C4269r rVar;
        this.f10553g = dVar;
        T adView = new AdView(C5292l.f14015a);
        this.f10555i = adView;
        AdSize adSize = AdSize.BANNER;
        C4288z zVar = this.f10715d;
        if (!(zVar == null || (rVar = ((C4287y) zVar).f10546c) == null || rVar.f10490b != UnitDisplayType.MRECT)) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f10555i).setAdUnitId("FyberBanner");
        ((AdView) this.f10555i).setAdListener(this.f10560l);
        ((AdView) this.f10555i).loadAd(adRequest);
    }
}
