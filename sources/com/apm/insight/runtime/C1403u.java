package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.apm.insight.runtime.u */
public class C1403u {

    /* renamed from: a */
    static final C1407b<C1409d, Runnable> f1511a = new C1407b<C1409d, Runnable>() {
    };

    /* renamed from: b */
    static final C1407b<Message, Runnable> f1512b = new C1407b<Message, Runnable>() {
    };

    /* renamed from: c */
    private final HandlerThread f1513c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Queue<C1409d> f1514d = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Queue<Message> f1515e = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Handler f1516f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f1517g = new Object();

    /* renamed from: com.apm.insight.runtime.u$a */
    class C1406a implements Runnable {
        C1406a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12754a() {
            while (!C1403u.this.f1514d.isEmpty()) {
                C1409d dVar = (C1409d) C1403u.this.f1514d.poll();
                if (C1403u.this.f1516f != null) {
                    try {
                        C1403u.this.f1516f.sendMessageAtTime(dVar.f1522a, dVar.f1523b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12755b() {
            while (!C1403u.this.f1515e.isEmpty()) {
                if (C1403u.this.f1516f != null) {
                    try {
                        C1403u.this.f1516f.sendMessageAtFrontOfQueue((Message) C1403u.this.f1515e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void run() {
            mo12755b();
            mo12754a();
        }
    }

    /* renamed from: com.apm.insight.runtime.u$b */
    public interface C1407b<A, B> {
    }

    /* renamed from: com.apm.insight.runtime.u$c */
    class C1408c extends HandlerThread {

        /* renamed from: a */
        volatile int f1519a = 0;

        /* renamed from: b */
        volatile boolean f1520b = false;

        C1408c(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.apm.insight.p014b.C1197g.m1356a(com.apm.insight.C1250h.m1615g()).mo12419a().mo12406c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            if (r4.f1519a < 5) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            com.apm.insight.C1186b.m1306a().mo12441a("NPTH_CATCH", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r4.f1520b == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r4.f1520b = true;
            com.apm.insight.C1186b.m1306a().mo12441a("NPTH_ERR_MAX", (java.lang.Throwable) new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4.f1519a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r4 = this;
                super.onLooperPrepared()
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1403u.this
                java.lang.Object r0 = r0.f1517g
                monitor-enter(r0)
                com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C1403u.this     // Catch:{ all -> 0x0063 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0063 }
                r2.<init>()     // Catch:{ all -> 0x0063 }
                android.os.Handler unused = r1.f1516f = r2     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1403u.this
                android.os.Handler r0 = r0.f1516f
                com.apm.insight.runtime.u$a r1 = new com.apm.insight.runtime.u$a
                com.apm.insight.runtime.u r2 = com.apm.insight.runtime.C1403u.this
                r1.<init>()
                r0.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                android.content.Context r1 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.g r1 = com.apm.insight.p014b.C1197g.m1356a(r1)     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.b r1 = r1.mo12419a()     // Catch:{ all -> 0x0025 }
                r1.mo12406c()     // Catch:{ all -> 0x0025 }
                int r1 = r4.f1519a     // Catch:{ all -> 0x0025 }
                r2 = 5
                r3 = 1
                if (r1 >= r2) goto L_0x0049
                com.apm.insight.c r1 = com.apm.insight.C1186b.m1306a()     // Catch:{ all -> 0x0025 }
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo12441a((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0025 }
                goto L_0x005d
            L_0x0049:
                boolean r0 = r4.f1520b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x005d
                r4.f1520b = r3     // Catch:{ all -> 0x0025 }
                com.apm.insight.c r0 = com.apm.insight.C1186b.m1306a()     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                r0.mo12441a((java.lang.String) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0025 }
            L_0x005d:
                int r0 = r4.f1519a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r3
                r4.f1519a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C1403u.C1408c.onLooperPrepared():void");
        }
    }

    /* renamed from: com.apm.insight.runtime.u$d */
    static class C1409d {

        /* renamed from: a */
        Message f1522a;

        /* renamed from: b */
        long f1523b;

        C1409d(Message message, long j) {
            this.f1522a = message;
            this.f1523b = j;
        }
    }

    public C1403u(String str) {
        this.f1513c = new C1408c(str);
    }

    /* renamed from: b */
    private Message m2367b(Runnable runnable) {
        return Message.obtain(this.f1516f, runnable);
    }

    /* renamed from: a */
    public Handler mo12747a() {
        return this.f1516f;
    }

    /* renamed from: a */
    public final boolean mo12748a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return mo12752b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final boolean mo12749a(Runnable runnable) {
        return mo12748a(m2367b(runnable), 0);
    }

    /* renamed from: a */
    public final boolean mo12750a(Runnable runnable, long j) {
        return mo12748a(m2367b(runnable), j);
    }

    /* renamed from: b */
    public void mo12751b() {
        this.f1513c.start();
    }

    /* renamed from: b */
    public final boolean mo12752b(Message message, long j) {
        if (this.f1516f == null) {
            synchronized (this.f1517g) {
                if (this.f1516f == null) {
                    this.f1514d.add(new C1409d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f1516f.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public HandlerThread mo12753c() {
        return this.f1513c;
    }
}
