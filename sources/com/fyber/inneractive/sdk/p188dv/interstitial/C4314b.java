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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b */
public class C4314b extends C4112a<InterstitialAd> {

    /* renamed from: k */
    public final InterstitialAdLoadCallback f10577k = new C4315a();

    /* renamed from: l */
    public final FullScreenContentCallback f10578l = new C4316b();

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$a */
    public class C4315a extends InterstitialAdLoadCallback {
        public C4315a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C4302d dVar = C4314b.this.f10553g;
            if (dVar != null) {
                ((C4293b) dVar).mo24298f();
                InneractiveAdRequest inneractiveAdRequest = C4314b.this.f10712a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4304a aVar = C4304a.Load;
                C4314b bVar = C4314b.this;
                C4310c.m13358a(spotId, aVar, bVar.f10712a, (C4305f) bVar.f10713b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (InterstitialAd) obj;
            C4314b bVar = C4314b.this;
            if (bVar.f10553g != null) {
                bVar.f10555i = t;
                bVar.mo23758f();
                ((C4293b) C4314b.this.f10553g).mo24496d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$b */
    public class C4316b extends FullScreenContentCallback {
        public C4316b() {
        }

        public void onAdDismissedFullScreenContent() {
            C4313a aVar = C4314b.this.f10116j;
            if (aVar != null) {
                aVar.mo24329i();
            }
        }

        public void onAdShowedFullScreenContent() {
            C4313a aVar = C4314b.this.f10116j;
            if (aVar != null) {
                aVar.mo24331v();
            }
        }
    }

    public C4314b(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        this.f10553g = dVar;
        InterstitialAd.load(C5292l.f14015a, "FyberInterstitial", adRequest, this.f10577k);
    }

    /* renamed from: d */
    public boolean mo24299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24294e() {
        return this.f10555i != null;
    }

    /* renamed from: a */
    public void mo23757a(C4313a aVar, Activity activity) {
        this.f10116j = aVar;
        T t = this.f10555i;
        if (t != null) {
            ((InterstitialAd) t).setFullScreenContentCallback(this.f10578l);
            ((InterstitialAd) this.f10555i).show(activity);
        }
    }
}
