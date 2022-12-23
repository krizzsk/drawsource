package com.fyber.inneractive.sdk.p188dv.rewarded;

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
import com.fyber.inneractive.sdk.p188dv.interstitial.C4313a;
import com.fyber.inneractive.sdk.util.C5292l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b */
public class C4325b extends C4112a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f10592k = new C4326a();

    /* renamed from: l */
    public final RewardedAdCallback f10593l = new C4327b();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$a */
    public class C4326a extends RewardedAdLoadCallback {
        public C4326a() {
        }

        public void onRewardedAdFailedToLoad(int i) {
            C4302d dVar = C4325b.this.f10553g;
            if (dVar != null) {
                ((C4293b) dVar).mo24298f();
                InneractiveAdRequest inneractiveAdRequest = C4325b.this.f10712a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4304a aVar = C4304a.Load;
                C4325b bVar = C4325b.this;
                C4310c.m13358a(spotId, aVar, bVar.f10712a, (C4305f) bVar.f10713b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onRewardedAdLoaded() {
            C4325b bVar = C4325b.this;
            if (bVar.f10553g != null) {
                bVar.mo23758f();
                ((C4293b) C4325b.this.f10553g).mo24496d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$b */
    public class C4327b extends RewardedAdCallback {
        public C4327b() {
        }

        public void onRewardedAdClosed() {
            C4313a aVar = C4325b.this.f10116j;
            if (aVar != null) {
                aVar.mo24329i();
            }
        }

        public void onRewardedAdFailedToShow(int i) {
        }

        public void onRewardedAdOpened() {
            C4313a aVar = C4325b.this.f10116j;
            if (aVar != null) {
                aVar.mo24331v();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C4313a aVar = C4325b.this.f10116j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C4325b(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        this.f10553g = dVar;
        T rewardedAd = new RewardedAd(C5292l.f14015a, "FyberRewarded");
        this.f10555i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f10592k);
    }

    /* renamed from: d */
    public boolean mo24299d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24294e() {
        T t = this.f10555i;
        if (t != null) {
            return ((RewardedAd) t).isLoaded();
        }
        return false;
    }

    /* renamed from: a */
    public void mo23757a(C4313a aVar, Activity activity) {
        this.f10116j = aVar;
        ((RewardedAd) this.f10555i).show(activity, this.f10593l);
    }
}
