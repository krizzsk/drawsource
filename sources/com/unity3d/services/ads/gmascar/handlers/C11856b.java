package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.core.misc.C12070a;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.b */
/* compiled from: ScarInterstitialAdHandler */
public class C11856b extends C11854a implements IScarInterstitialAdListenerWrapper {
    public C11856b(ScarAdMetadata scarAdMetadata, C12070a<GMAEvent> aVar) {
        super(scarAdMetadata, aVar);
    }

    public void onAdClicked() {
        this.f28781c.mo70807a(GMAEvent.AD_CLICKED, new Object[0]);
    }

    public void onAdClosed() {
        if (!this.f28780b.mo71212a()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this.f28781c.mo70807a(GMAEvent.INTERSTITIAL_SHOW_ERROR, this.f28779a.getPlacementId(), this.f28779a.getQueryId(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this.f28781c.mo70807a(GMAEvent.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this.f28781c.mo70807a(GMAEvent.AD_LEFT_APPLICATION, new Object[0]);
    }
}
