package com.ironsource.mediationsdk.p206a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C6643c;

/* renamed from: com.ironsource.mediationsdk.a.i */
public final class C6523i extends Thread {

    /* renamed from: b */
    private static C6523i f16811b;

    /* renamed from: a */
    private C6524a f16812a;

    /* renamed from: com.ironsource.mediationsdk.a.i$a */
    class C6524a extends HandlerThread {

        /* renamed from: a */
        Handler f16813a;

        C6524a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C6643c());
        }
    }

    private C6523i() {
        C6524a aVar = new C6524a(getClass().getSimpleName());
        this.f16812a = aVar;
        aVar.start();
        C6524a aVar2 = this.f16812a;
        aVar2.f16813a = new Handler(aVar2.getLooper());
    }

    /* renamed from: a */
    public static synchronized C6523i m19757a() {
        C6523i iVar;
        synchronized (C6523i.class) {
            if (f16811b == null) {
                f16811b = new C6523i();
            }
            iVar = f16811b;
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36374a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.i$a r0 = r1.f16812a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            com.ironsource.mediationsdk.a.i$a r0 = r1.f16812a     // Catch:{ all -> 0x0012 }
            android.os.Handler r0 = r0.f16813a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r0.post(r2)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p206a.C6523i.mo36374a(java.lang.Runnable):void");
    }
}
