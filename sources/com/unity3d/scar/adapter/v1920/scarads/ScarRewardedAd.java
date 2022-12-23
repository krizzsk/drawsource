package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

public class ScarRewardedAd extends ScarAdBase {

    /* renamed from: e */
    private RewardedAd f28553e;

    /* renamed from: f */
    private ScarRewardedAdListener f28554f;

    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        RewardedAd rewardedAd = new RewardedAd(this.f28542a, this.f28543b.getAdUnitId());
        this.f28553e = rewardedAd;
        this.f28554f = new ScarRewardedAdListener(rewardedAd, iScarRewardedAdListenerWrapper);
    }

    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.f28554f.setLoadListener(iScarLoadListener);
        this.f28553e.loadAd(adRequest, this.f28554f.getRewardedAdLoadCallback());
    }

    public void show(Activity activity) {
        if (this.f28553e.isLoaded()) {
            this.f28553e.show(activity, this.f28554f.getRewardedAdCallback());
        } else {
            this.f28545d.handleError(GMAAdsError.AdNotLoadedError(this.f28543b));
        }
    }
}
