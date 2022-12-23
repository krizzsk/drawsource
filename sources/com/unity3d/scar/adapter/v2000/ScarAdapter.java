package com.unity3d.scar.adapter.v2000;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v2000.signals.SignalsReader;
import com.unity3d.scar.adapter.v2000.signals.SignalsStorage;

public class ScarAdapter extends ScarAdapterBase implements IScarAdapter {

    /* renamed from: e */
    private SignalsStorage f28609e;

    /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$a */
    class C11797a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarInterstitialAd f28610a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28611b;

        /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$a$a */
        class C11798a implements IScarLoadListener {
            C11798a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11797a.this.f28611b.getPlacementId(), C11797a.this.f28610a);
            }
        }

        C11797a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f28610a = scarInterstitialAd;
            this.f28611b = scarAdMetadata;
        }

        public void run() {
            this.f28610a.loadAd(new C11798a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$b */
    class C11799b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarRewardedAd f28614a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28615b;

        /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$b$a */
        class C11800a implements IScarLoadListener {
            C11800a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11799b.this.f28615b.getPlacementId(), C11799b.this.f28614a);
            }
        }

        C11799b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f28614a = scarRewardedAd;
            this.f28615b = scarAdMetadata;
        }

        public void run() {
            this.f28614a.loadAd(new C11800a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f28609e = signalsStorage;
        this.f28519a = new SignalsReader(signalsStorage);
    }

    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new C11797a(new ScarInterstitialAd(context, this.f28609e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new C11799b(new ScarRewardedAd(context, this.f28609e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
