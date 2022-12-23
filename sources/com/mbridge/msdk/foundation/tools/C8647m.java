package com.mbridge.msdk.foundation.tools;

import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.tools.m */
/* compiled from: LimitExecutor */
public final class C8647m implements Executor {

    /* renamed from: a */
    private Runnable f21169a;

    /* renamed from: b */
    private Runnable f21170b;

    public final synchronized void execute(Runnable runnable) {
        if (this.f21169a == null) {
            this.f21169a = m24776a(runnable);
            C8644k.m24773a().execute(this.f21169a);
        } else if (this.f21170b == null) {
            this.f21170b = m24776a(runnable);
        }
    }

    /* renamed from: a */
    private Runnable m24776a(final Runnable runnable) {
        return new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C8647m.this.m24777a();
                    throw th;
                }
                C8647m.this.m24777a();
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m24777a() {
        Runnable runnable = this.f21170b;
        this.f21169a = runnable;
        this.f21170b = null;
        if (runnable != null) {
            C8644k.m24773a().execute(this.f21169a);
        }
    }
}
