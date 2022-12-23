package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.core.misc.C12070a;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.c */
/* compiled from: ScarRewardedAdHandler */
public class C11857c extends C11854a implements IScarRewardedAdListenerWrapper {

    /* renamed from: d */
    private boolean f28783d = false;

    public C11857c(ScarAdMetadata scarAdMetadata, C12070a<GMAEvent> aVar) {
        super(scarAdMetadata, aVar);
    }

    public void onAdClosed() {
        if (!this.f28783d) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this.f28781c.mo70807a(GMAEvent.REWARDED_SHOW_ERROR, this.f28779a.getPlacementId(), this.f28779a.getQueryId(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this.f28781c.mo70807a(GMAEvent.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this.f28783d = true;
        this.f28781c.mo70807a(GMAEvent.AD_EARNED_REWARD, new Object[0]);
    }
}
