package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.o */
public final class C6681o {

    /* renamed from: b */
    private static C6681o f17436b;

    /* renamed from: a */
    int f17437a;

    /* renamed from: c */
    private long f17438c = 0;

    /* renamed from: d */
    private boolean f17439d = false;

    private C6681o() {
    }

    /* renamed from: a */
    public static synchronized C6681o m20255a() {
        C6681o oVar;
        synchronized (C6681o.class) {
            if (f17436b == null) {
                f17436b = new C6681o();
            }
            oVar = f17436b;
        }
        return oVar;
    }

    /* renamed from: a */
    public final void mo36811a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        mo36812a(ironSourceBannerLayout, ironSourceError, false);
    }

    /* renamed from: a */
    public final void mo36812a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError, final boolean z) {
        synchronized (this) {
            if (!this.f17439d) {
                long currentTimeMillis = System.currentTimeMillis() - this.f17438c;
                if (currentTimeMillis > ((long) (this.f17437a * 1000))) {
                    mo36813b(ironSourceBannerLayout, ironSourceError, z);
                    return;
                }
                this.f17439d = true;
                long j = ((long) (this.f17437a * 1000)) - currentTimeMillis;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("delaying callback by " + j);
                C6387c cVar = C6387c.f16171a;
                C6387c.m19071b(new Runnable() {
                    public final void run() {
                        C6681o.this.mo36813b(ironSourceBannerLayout, ironSourceError, z);
                    }
                }, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36813b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z) {
        if (ironSourceBannerLayout != null) {
            this.f17438c = System.currentTimeMillis();
            this.f17439d = false;
            ironSourceBannerLayout.mo36067a(ironSourceError, z);
        }
    }

    /* renamed from: b */
    public final boolean mo36814b() {
        boolean z;
        synchronized (this) {
            z = this.f17439d;
        }
        return z;
    }
}
