package com.fyber.inneractive.sdk.p188dv.rewarded;

import android.app.Activity;
import android.content.Context;
import com.fyber.inneractive.sdk.C4112a;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p188dv.C4293b;
import com.fyber.inneractive.sdk.p188dv.C4302d;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.p188dv.enums.C4304a;
import com.fyber.inneractive.sdk.p188dv.handler.C4310c;
import com.fyber.inneractive.sdk.p188dv.interstitial.C4313a;
import com.fyber.inneractive.sdk.util.C5292l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a */
public class C4321a extends C4112a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f10586k = new C4322a();

    /* renamed from: l */
    public final FullScreenContentCallback f10587l = new C4323b();

    /* renamed from: m */
    public final OnUserEarnedRewardListener f10588m = new C4324c();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$a */
    public class C4322a extends RewardedAdLoadCallback {
        public C4322a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C4302d dVar = C4321a.this.f10553g;
            if (dVar != null) {
                ((C4293b) dVar).mo24298f();
                InneractiveAdRequest inneractiveAdRequest = C4321a.this.f10712a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4304a aVar = C4304a.Load;
                C4321a aVar2 = C4321a.this;
                C4310c.m13358a(spotId, aVar, aVar2.f10712a, (C4305f) aVar2.f10713b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (RewardedAd) obj;
            C4321a aVar = C4321a.this;
            if (aVar.f10553g != null) {
                aVar.f10555i = t;
                aVar.mo23758f();
                ((C4293b) C4321a.this.f10553g).mo24496d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$b */
    public class C4323b extends FullScreenContentCallback {
        public C4323b() {
        }

        public void onAdDismissedFullScreenContent() {
            C4313a aVar = C4321a.this.f10116j;
            if (aVar != null) {
                aVar.mo24329i();
            }
        }

        public void onAdImpression() {
            C4313a aVar = C4321a.this.f10116j;
            if (aVar != null) {
                aVar.mo24331v();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$c */
    public class C4324c implements OnUserEarnedRewardListener {
        public C4324c() {
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C4313a aVar = C4321a.this.f10116j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C4321a(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        this.f10553g = dVar;
        RewardedAd.load((Context) C5292l.f14015a, "FyberRewarded", adRequest, this.f10586k);
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
            ((RewardedAd) t).setFullScreenContentCallback(this.f10587l);
            ((RewardedAd) this.f10555i).show(activity, this.f10588m);
        }
    }
}
