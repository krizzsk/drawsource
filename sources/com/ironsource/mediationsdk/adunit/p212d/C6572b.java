package com.ironsource.mediationsdk.adunit.p212d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6551a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6568a;
import com.ironsource.mediationsdk.model.C6650a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.b */
public final class C6572b extends C6568a<C6551a> implements InterstitialAdListener {
    public C6572b(C6567a aVar, BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter, C6551a aVar2) {
        super(aVar, baseAdInteractionAdapter, new C6650a(aVar.f17001c, aVar.f17001c.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), aVar2);
    }
}
