package com.bytedance.sdk.openadsdk.p176j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.j.b */
/* compiled from: CrashMonitor */
public class C3794b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScheduledExecutorService f9770a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3828g f9771b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f9772c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3796a f9773d;

    /* renamed from: com.bytedance.sdk.openadsdk.j.b$a */
    /* compiled from: CrashMonitor */
    public interface C3796a {
        /* renamed from: a */
        void mo20626a();
    }

    public C3794b(C3828g gVar) {
        this.f9771b = gVar;
    }

    /* renamed from: a */
    public void mo20624a(long j) {
        this.f9772c = j;
    }

    /* renamed from: a */
    public void mo20623a(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f9770a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                if (System.currentTimeMillis() - C3794b.this.f9772c > 2000) {
                    C3794b.this.f9770a.shutdown();
                    if (C3794b.this.f9771b != null) {
                        C3794b.this.f9771b.mo20680t();
                    }
                    if (C3794b.this.f9773d != null) {
                        C3794b.this.f9773d.mo20626a();
                    }
                }
            }
        }, 0, (long) i, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo20622a() {
        ScheduledExecutorService scheduledExecutorService = this.f9770a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
