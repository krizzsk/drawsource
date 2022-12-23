package com.unity3d.scar.adapter.v1920;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v1920.signals.SignalsReader;
import com.unity3d.scar.adapter.v1920.signals.SignalsStorage;

public class ScarAdapter extends ScarAdapterBase implements IScarAdapter {

    /* renamed from: e */
    private SignalsStorage f28533e;

    /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$a */
    class C11781a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarInterstitialAd f28534a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28535b;

        /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$a$a */
        class C11782a implements IScarLoadListener {
            C11782a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11781a.this.f28535b.getPlacementId(), C11781a.this.f28534a);
            }
        }

        C11781a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f28534a = scarInterstitialAd;
            this.f28535b = scarAdMetadata;
        }

        public void run() {
            this.f28534a.loadAd(new C11782a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$b */
    class C11783b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarRewardedAd f28538a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28539b;

        /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$b$a */
        class C11784a implements IScarLoadListener {
            C11784a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11783b.this.f28539b.getPlacementId(), C11783b.this.f28538a);
            }
        }

        C11783b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f28538a = scarRewardedAd;
            this.f28539b = scarAdMetadata;
        }

        public void run() {
            this.f28538a.loadAd(new C11784a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f28533e = signalsStorage;
        this.f28519a = new SignalsReader(signalsStorage);
    }

    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new C11781a(new ScarInterstitialAd(context, this.f28533e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new C11783b(new ScarRewardedAd(context, this.f28533e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
