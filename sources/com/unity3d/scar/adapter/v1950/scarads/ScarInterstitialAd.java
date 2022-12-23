package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

public class ScarInterstitialAd extends ScarAdBase {

    /* renamed from: e */
    private InterstitialAd f28584e;

    /* renamed from: f */
    private ScarInterstitialAdListener f28585f;

    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        InterstitialAd interstitialAd = new InterstitialAd(this.f28580a);
        this.f28584e = interstitialAd;
        interstitialAd.setAdUnitId(this.f28581b.getAdUnitId());
        this.f28585f = new ScarInterstitialAdListener(this.f28584e, iScarInterstitialAdListenerWrapper);
    }

    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.f28584e.setAdListener(this.f28585f.getAdListener());
        this.f28585f.setLoadListener(iScarLoadListener);
        this.f28584e.loadAd(adRequest);
    }

    public void show(Activity activity) {
        if (this.f28584e.isLoaded()) {
            this.f28584e.show();
        } else {
            this.f28583d.handleError(GMAAdsError.AdNotLoadedError(this.f28581b));
        }
    }
}
