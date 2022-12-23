package com.fyber.inneractive.sdk.p188dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.C4112a;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p188dv.C4293b;
import com.fyber.inneractive.sdk.p188dv.C4302d;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.p188dv.enums.C4304a;
import com.fyber.inneractive.sdk.p188dv.handler.C4310c;
import com.fyber.inneractive.sdk.util.C5292l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c */
public class C4317c extends C4112a<InterstitialAd> {

    /* renamed from: k */
    public final AdListener f10581k = new C4318a();

    /* renamed from: l */
    public final AdListener f10582l = new C4319b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$a */
    public class C4318a extends AdListener {
        public C4318a() {
        }

        public void onAdFailedToLoad(int i) {
            C4302d dVar = C4317c.this.f10553g;
            if (dVar != null) {
                ((C4293b) dVar).mo24298f();
                InneractiveAdRequest inneractiveAdRequest = C4317c.this.f10712a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4304a aVar = C4304a.Load;
                C4317c cVar = C4317c.this;
                C4310c.m13358a(spotId, aVar, cVar.f10712a, (C4305f) cVar.f10713b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onAdLoaded() {
            C4317c cVar = C4317c.this;
            if (cVar.f10553g != null) {
                cVar.mo23758f();
                ((C4293b) C4317c.this.f10553g).mo24496d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.c$b */
    public class C4319b extends AdListener {
        public C4319b() {
        }

        public void onAdClicked() {
            C4313a aVar = C4317c.this.f10116j;
            if (aVar != null) {
                aVar.mo24328d();
            }
        }

        public void onAdClosed() {
            C4313a aVar = C4317c.this.f10116j;
            if (aVar != null) {
                aVar.mo24329i();
            }
        }

        public void onAdImpression() {
            C4313a aVar = C4317c.this.f10116j;
            if (aVar != null) {
                aVar.mo24331v();
            }
        }

        public void onAdOpened() {
            C4313a aVar = C4317c.this.f10116j;
            if (aVar != null) {
                aVar.mo24331v();
            }
        }
    }

    public C4317c(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        this.f10553g = dVar;
        T interstitialAd = new InterstitialAd(C5292l.f14015a);
        this.f10555i = interstitialAd;
        interstitialAd.setAdListener(this.f10581k);
        ((InterstitialAd) this.f10555i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f10555i).loadAd(adRequest);
    }

    /* renamed from: d */
    public boolean mo24299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24294e() {
        T t = this.f10555i;
        return t != null && ((InterstitialAd) t).isLoaded();
    }

    /* renamed from: a */
    public void mo23757a(C4313a aVar, Activity activity) {
        this.f10116j = aVar;
        T t = this.f10555i;
        if (t != null) {
            ((InterstitialAd) t).setAdListener(this.f10582l);
            ((InterstitialAd) this.f10555i).show();
        }
    }
}
