package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.E */
public final class C6425E {

    /* renamed from: b */
    private static final C6425E f16259b = new C6425E();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyInterstitialListener f16260a = null;

    private C6425E() {
    }

    /* renamed from: a */
    public static C6425E m19206a() {
        return f16259b;
    }

    /* renamed from: a */
    public final void mo35987a(final String str, final IronSourceError ironSourceError) {
        if (this.f16260a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6425E.this.f16260a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C6425E e = C6425E.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo35988b(final String str, final IronSourceError ironSourceError) {
        if (this.f16260a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6425E.this.f16260a.onInterstitialAdShowFailed(str, ironSourceError);
                    C6425E e = C6425E.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
