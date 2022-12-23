package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

public class ScarRewardedAd extends ScarAdBase {

    /* renamed from: e */
    private RewardedAd f28591e;

    /* renamed from: f */
    private ScarRewardedAdListener f28592f;

    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        RewardedAd rewardedAd = new RewardedAd(this.f28580a, this.f28581b.getAdUnitId());
        this.f28591e = rewardedAd;
        this.f28592f = new ScarRewardedAdListener(rewardedAd, iScarRewardedAdListenerWrapper);
    }

    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.f28592f.setLoadListener(iScarLoadListener);
        this.f28591e.loadAd(adRequest, this.f28592f.getRewardedAdLoadCallback());
    }

    public void show(Activity activity) {
        if (this.f28591e.isLoaded()) {
            this.f28591e.show(activity, this.f28592f.getRewardedAdCallback());
        } else {
            this.f28583d.handleError(GMAAdsError.AdNotLoadedError(this.f28581b));
        }
    }
}
