package com.unity3d.scar.adapter.v2000.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

public class ScarRewardedAd extends ScarAdBase<RewardedAd> {
    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        this.f28622e = new ScarRewardedAdListener(iScarRewardedAdListenerWrapper, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70686a(AdRequest adRequest, IScarLoadListener iScarLoadListener) {
        RewardedAd.load(this.f28619b, this.f28620c.getAdUnitId(), adRequest, ((ScarRewardedAdListener) this.f28622e).getAdLoadListener());
    }

    public void show(Activity activity) {
        T t = this.f28618a;
        if (t != null) {
            ((RewardedAd) t).show(activity, ((ScarRewardedAdListener) this.f28622e).getOnUserEarnedRewardListener());
        } else {
            this.f28623f.handleError(GMAAdsError.AdNotLoadedError(this.f28620c));
        }
    }
}
