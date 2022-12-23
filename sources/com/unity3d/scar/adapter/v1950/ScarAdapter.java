package com.unity3d.scar.adapter.v1950;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v1950.signals.SignalsReader;
import com.unity3d.scar.adapter.v1950.signals.SignalsStorage;

public class ScarAdapter extends ScarAdapterBase implements IScarAdapter {

    /* renamed from: e */
    private SignalsStorage f28571e;

    /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$a */
    class C11789a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarInterstitialAd f28572a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28573b;

        /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$a$a */
        class C11790a implements IScarLoadListener {
            C11790a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11789a.this.f28573b.getPlacementId(), C11789a.this.f28572a);
            }
        }

        C11789a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f28572a = scarInterstitialAd;
            this.f28573b = scarAdMetadata;
        }

        public void run() {
            this.f28572a.loadAd(new C11790a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$b */
    class C11791b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScarRewardedAd f28576a;

        /* renamed from: b */
        final /* synthetic */ ScarAdMetadata f28577b;

        /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$b$a */
        class C11792a implements IScarLoadListener {
            C11792a() {
            }

            public void onAdLoaded() {
                ScarAdapter.this.f28520b.put(C11791b.this.f28577b.getPlacementId(), C11791b.this.f28576a);
            }
        }

        C11791b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f28576a = scarRewardedAd;
            this.f28577b = scarAdMetadata;
        }

        public void run() {
            this.f28576a.loadAd(new C11792a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f28571e = signalsStorage;
        this.f28519a = new SignalsReader(signalsStorage);
    }

    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new C11789a(new ScarInterstitialAd(context, this.f28571e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new C11791b(new ScarRewardedAd(context, this.f28571e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f28522d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
