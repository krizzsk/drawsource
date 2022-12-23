package com.ironsource.mediationsdk.adunit.p209c;

import com.ironsource.mediationsdk.C6577ae;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p209c.p210a.C6553c;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6569b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.f */
public abstract class C6564f<Smash extends C6569b<?>> extends C6559d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements C6553c {
    public C6564f(C6550a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    public final void mo36503a(C6569b<?> bVar, Placement placement) {
        IronLog.INTERNAL.verbose(mo36517a(bVar.mo36547m()));
        C6554b bVar2 = this.f16981r;
        AdInfo a = this.f16964a.mo36552a(bVar.mo36549o());
        if (bVar2.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36562a(placement, a);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f16951a);
    }
}
