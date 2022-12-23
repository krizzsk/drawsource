package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.ad */
public final class C6530ad {

    /* renamed from: b */
    private static final C6530ad f16853b = new C6530ad();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyRewardedVideoListener f16854a = null;

    private C6530ad() {
    }

    /* renamed from: a */
    public static C6530ad m19809a() {
        return f16853b;
    }

    /* renamed from: a */
    public final void mo36394a(final String str, final IronSourceError ironSourceError) {
        if (this.f16854a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6530ad.this.f16854a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    C6530ad adVar = C6530ad.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36395b(final String str, final IronSourceError ironSourceError) {
        if (this.f16854a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6530ad.this.f16854a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    C6530ad adVar = C6530ad.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
