package com.ironsource.mediationsdk.adunit.p212d.p213a;

import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C6459L;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6553c;
import com.ironsource.mediationsdk.adunit.p212d.C6567a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.utils.C6740f;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.b */
public class C6569b<Listener extends C6553c> extends C6568a<Listener> implements AdapterAdRewardListener {

    /* renamed from: h */
    private C6740f f17009h;

    public C6569b(C6567a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C6650a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f17009h = new C6740f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f17009h = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f17014e != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(mo36539c("placement name = " + mo36551q()));
            if (this.f17012c != null) {
                HashMap hashMap = new HashMap();
                if (C6459L.m19304a().f16424n != null) {
                    for (String next : C6459L.m19304a().f16424n.keySet()) {
                        hashMap.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6459L.m19304a().f16424n.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f17012c.f16926d.mo36440a(mo36551q(), this.f17014e.getRewardName(), this.f17014e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, mo36388k()), C6740f.m20412a(this.f17009h), hashMap, C6459L.m19304a().f16423m);
            }
            ((C6553c) this.f17011b).mo36503a(this, this.f17014e);
            return;
        }
        IronLog.INTERNAL.verbose(mo36539c("placement is null "));
        if (this.f17012c != null) {
            this.f17012c.f16927e.mo36487m("mCurrentPlacement is null");
        }
    }
}
