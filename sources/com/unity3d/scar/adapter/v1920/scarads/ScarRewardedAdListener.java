package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

public class ScarRewardedAdListener {

    /* renamed from: a */
    private RewardedAd f28555a;

    /* renamed from: b */
    private IScarRewardedAdListenerWrapper f28556b;

    /* renamed from: c */
    private IScarLoadListener f28557c;

    /* renamed from: d */
    private RewardedAdLoadCallback f28558d = new C11786a();

    /* renamed from: e */
    private RewardedAdCallback f28559e = new C11787b();

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAdListener$a */
    class C11786a extends RewardedAdLoadCallback {
        C11786a() {
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAdListener$b */
    class C11787b extends RewardedAdCallback {
        C11787b() {
        }
    }

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this.f28555a = rewardedAd;
        this.f28556b = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.f28559e;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this.f28558d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f28557c = iScarLoadListener;
    }
}
