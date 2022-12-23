package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;

public class ScarRewardedAdListener extends ScarAdListener {

    /* renamed from: b */
    private final ScarRewardedAd f28631b;

    /* renamed from: c */
    private final IScarRewardedAdListenerWrapper f28632c;

    /* renamed from: d */
    private final RewardedAdLoadCallback f28633d = new C11803a();

    /* renamed from: e */
    private final OnUserEarnedRewardListener f28634e = new C11804b();

    /* renamed from: f */
    private final FullScreenContentCallback f28635f = new C11805c();

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$a */
    class C11803a extends RewardedAdLoadCallback {
        C11803a() {
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$b */
    class C11804b implements OnUserEarnedRewardListener {
        C11804b() {
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$c */
    class C11805c extends FullScreenContentCallback {
        C11805c() {
        }
    }

    public ScarRewardedAdListener(IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper, ScarRewardedAd scarRewardedAd) {
        this.f28632c = iScarRewardedAdListenerWrapper;
        this.f28631b = scarRewardedAd;
    }

    public RewardedAdLoadCallback getAdLoadListener() {
        return this.f28633d;
    }

    public OnUserEarnedRewardListener getOnUserEarnedRewardListener() {
        return this.f28634e;
    }
}
