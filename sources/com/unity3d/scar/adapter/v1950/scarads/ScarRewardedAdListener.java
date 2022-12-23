package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

public class ScarRewardedAdListener {

    /* renamed from: a */
    private RewardedAd f28593a;

    /* renamed from: b */
    private IScarRewardedAdListenerWrapper f28594b;

    /* renamed from: c */
    private IScarLoadListener f28595c;

    /* renamed from: d */
    private RewardedAdLoadCallback f28596d = new C11794a();

    /* renamed from: e */
    private RewardedAdCallback f28597e = new C11795b();

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAdListener$a */
    class C11794a extends RewardedAdLoadCallback {
        C11794a() {
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAdListener$b */
    class C11795b extends RewardedAdCallback {
        C11795b() {
        }
    }

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this.f28593a = rewardedAd;
        this.f28594b = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.f28597e;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this.f28596d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f28595c = iScarLoadListener;
    }
}
