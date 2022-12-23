package com.unity3d.scar.adapter.v2000.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

public class ScarInterstitialAd extends ScarAdBase<InterstitialAd> {
    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        this.f28622e = new ScarInterstitialAdListener(iScarInterstitialAdListenerWrapper, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70686a(AdRequest adRequest, IScarLoadListener iScarLoadListener) {
        InterstitialAd.load(this.f28619b, this.f28620c.getAdUnitId(), adRequest, ((ScarInterstitialAdListener) this.f28622e).getAdLoadListener());
    }

    public void show(Activity activity) {
        T t = this.f28618a;
        if (t != null) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f28623f.handleError(GMAAdsError.AdNotLoadedError(this.f28620c));
        }
    }
}
