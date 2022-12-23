package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.sdk.utils.o */
public class C2092o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f4101a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Timer f4102b;

    /* renamed from: c */
    private long f4103c;

    /* renamed from: d */
    private long f4104d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f4105e;

    /* renamed from: f */
    private long f4106f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f4107g = new Object();

    private C2092o(C1969m mVar, Runnable runnable) {
        this.f4101a = mVar;
        this.f4105e = runnable;
    }

    /* renamed from: a */
    public static C2092o m5058a(long j, C1969m mVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            C2092o oVar = new C2092o(mVar, runnable);
            oVar.f4103c = System.currentTimeMillis();
            oVar.f4104d = j;
            try {
                Timer timer = new Timer();
                oVar.f4102b = timer;
                timer.schedule(oVar.m5063e(), j);
            } catch (OutOfMemoryError e) {
                if (C2102v.m5104a()) {
                    mVar.mo14509A().mo15013b("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return oVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    /* renamed from: e */
    private TimerTask m5063e() {
        return new TimerTask() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x001b }
                    java.lang.Runnable r1 = r1.f4105e     // Catch:{ all -> 0x001b }
                    r1.run()     // Catch:{ all -> 0x001b }
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2092o.this
                    java.lang.Object r1 = r1.f4107g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x0018 }
                    java.util.Timer unused = r2.f4102b = r0     // Catch:{ all -> 0x0018 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    goto L_0x0048
                L_0x0018:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    throw r0
                L_0x001b:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.m r2 = r2.f4101a     // Catch:{ all -> 0x004c }
                    if (r2 == 0) goto L_0x003b
                    boolean r2 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x004c }
                    if (r2 == 0) goto L_0x003b
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.m r2 = r2.f4101a     // Catch:{ all -> 0x004c }
                    com.applovin.impl.sdk.v r2 = r2.mo14509A()     // Catch:{ all -> 0x004c }
                    java.lang.String r3 = "Timer"
                    java.lang.String r4 = "Encountered error while executing timed task"
                    r2.mo15013b(r3, r4, r1)     // Catch:{ all -> 0x004c }
                L_0x003b:
                    com.applovin.impl.sdk.utils.o r1 = com.applovin.impl.sdk.utils.C2092o.this
                    java.lang.Object r1 = r1.f4107g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x0049 }
                    java.util.Timer unused = r2.f4102b = r0     // Catch:{ all -> 0x0049 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                L_0x0048:
                    return
                L_0x0049:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                    throw r0
                L_0x004c:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.o r2 = com.applovin.impl.sdk.utils.C2092o.this
                    java.lang.Object r2 = r2.f4107g
                    monitor-enter(r2)
                    com.applovin.impl.sdk.utils.o r3 = com.applovin.impl.sdk.utils.C2092o.this     // Catch:{ all -> 0x005b }
                    java.util.Timer unused = r3.f4102b = r0     // Catch:{ all -> 0x005b }
                    monitor-exit(r2)     // Catch:{ all -> 0x005b }
                    throw r1
                L_0x005b:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x005b }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2092o.C20931.run():void");
            }
        };
    }

    /* renamed from: a */
    public long mo14973a() {
        if (this.f4102b == null) {
            return this.f4104d - this.f4106f;
        }
        return this.f4104d - (System.currentTimeMillis() - this.f4103c);
    }

    /* renamed from: b */
    public void mo14974b() {
        synchronized (this.f4107g) {
            if (this.f4102b != null) {
                try {
                    this.f4102b.cancel();
                    this.f4106f = Math.max(1, System.currentTimeMillis() - this.f4103c);
                } catch (Throwable th) {
                    this.f4102b = null;
                    throw th;
                }
                this.f4102b = null;
            }
        }
    }

    /* renamed from: c */
    public void mo14975c() {
        synchronized (this.f4107g) {
            if (this.f4106f > 0) {
                try {
                    long j = this.f4104d - this.f4106f;
                    this.f4104d = j;
                    if (j < 0) {
                        this.f4104d = 0;
                    }
                    Timer timer = new Timer();
                    this.f4102b = timer;
                    timer.schedule(m5063e(), this.f4104d);
                    this.f4103c = System.currentTimeMillis();
                } catch (Throwable th) {
                    this.f4106f = 0;
                    throw th;
                }
                this.f4106f = 0;
            }
        }
    }

    /* renamed from: d */
    public void mo14976d() {
        synchronized (this.f4107g) {
            if (this.f4102b != null) {
                try {
                    this.f4102b.cancel();
                    this.f4102b = null;
                } catch (Throwable th) {
                    this.f4102b = null;
                    this.f4106f = 0;
                    throw th;
                }
                this.f4106f = 0;
            }
        }
    }
}
