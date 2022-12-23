package com.ironsource.mediationsdk.adunit.p212d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6553c;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6569b;
import com.ironsource.mediationsdk.model.C6650a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.c */
public final class C6573c extends C6569b<C6553c> implements RewardedVideoAdListener {
    public C6573c(C6567a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C6553c cVar) {
        super(aVar, baseAdInteractionAdapter, new C6650a(aVar.f17001c, aVar.f17001c.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), cVar);
    }
}
