package com.ironsource.mediationsdk.adunit.p209c;

import com.ironsource.mediationsdk.C6432F;
import com.ironsource.mediationsdk.C6577ae;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b */
final class C6554b {

    /* renamed from: a */
    IronSource.AD_UNIT f16951a;

    public C6554b(IronSource.AD_UNIT ad_unit) {
        this.f16951a = ad_unit;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36504a(IronSourceError ironSourceError) {
        if (this.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo35996a(ironSourceError);
        } else if (this.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36560a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f16951a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36505a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f16951a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6432F.m19211a().mo35997a(ironSourceError, adInfo);
        } else if (this.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36561a(ironSourceError, adInfo);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f16951a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36506a(boolean z, AdInfo adInfo) {
        if (this.f16951a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6577ae.m20001a().mo36563a(z, adInfo);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.f16951a);
    }
}
