package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

public class ScarInterstitialAd extends ScarAdBase {

    /* renamed from: e */
    private InterstitialAd f28546e;

    /* renamed from: f */
    private ScarInterstitialAdListener f28547f;

    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        InterstitialAd interstitialAd = new InterstitialAd(this.f28542a);
        this.f28546e = interstitialAd;
        interstitialAd.setAdUnitId(this.f28543b.getAdUnitId());
        this.f28547f = new ScarInterstitialAdListener(this.f28546e, iScarInterstitialAdListenerWrapper);
    }

    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.f28546e.setAdListener(this.f28547f.getAdListener());
        this.f28547f.setLoadListener(iScarLoadListener);
        this.f28546e.loadAd(adRequest);
    }

    public void show(Activity activity) {
        if (this.f28546e.isLoaded()) {
            this.f28546e.show();
        } else {
            this.f28545d.handleError(GMAAdsError.AdNotLoadedError(this.f28543b));
        }
    }
}
