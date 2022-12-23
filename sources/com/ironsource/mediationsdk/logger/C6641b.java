package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
public final class C6641b extends IronSourceLogger {

    /* renamed from: c */
    public LogListener f17274c;

    private C6641b() {
        super("publisher");
    }

    public C6641b(LogListener logListener, int i) {
        super("publisher", 1);
        this.f17274c = null;
    }

    public final synchronized void log(final IronSourceLogger.IronSourceTag ironSourceTag, final String str, final int i) {
        C6387c.f16171a.mo35896a(new Runnable() {
            public final void run() {
                if (C6641b.this.f17274c != null && str != null) {
                    C6641b.this.f17274c.onLog(ironSourceTag, str, i);
                }
            }
        });
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
