package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.iw */
public abstract class C11635iw implements Runnable {

    /* renamed from: a */
    private final long f28035a = 300;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo70100a();

    public void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f28035a;
        while (!mo70100a() && elapsedRealtime - SystemClock.elapsedRealtime() > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
