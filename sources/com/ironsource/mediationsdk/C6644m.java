package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* renamed from: com.ironsource.mediationsdk.m */
public final class C6644m {

    /* renamed from: b */
    private static final C6644m f17279b = new C6644m();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyBannerListener f17280a = null;

    private C6644m() {
    }

    /* renamed from: a */
    public static C6644m m20216a() {
        return f17279b;
    }

    /* renamed from: a */
    static /* synthetic */ void m20218a(C6644m mVar, String str, String str2) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("Instance: " + str + " " + str2);
    }

    /* renamed from: a */
    public final void mo36714a(final String str, final IronSourceError ironSourceError) {
        if (this.f17280a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6644m.this.f17280a != null) {
                        C6644m.this.f17280a.onBannerAdLoadFailed(str, ironSourceError);
                    }
                    C6644m mVar = C6644m.this;
                    String str = str;
                    C6644m.m20218a(mVar, str, "onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
