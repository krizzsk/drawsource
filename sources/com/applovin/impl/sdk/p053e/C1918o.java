package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2046e;
import com.applovin.impl.sdk.utils.Utils;
import com.facebook.internal.security.CertificateUtil;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.o */
public class C1918o {

    /* renamed from: a */
    private final String f3542a = "TaskManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1969m f3543b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2102v f3544c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f3545d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ScheduledThreadPoolExecutor f3546e;

    /* renamed from: f */
    private final List<C1923c> f3547f = new ArrayList(5);

    /* renamed from: g */
    private final Object f3548g = new Object();

    /* renamed from: h */
    private boolean f3549h;

    /* renamed from: com.applovin.impl.sdk.e.o$a */
    public enum C1920a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* renamed from: com.applovin.impl.sdk.e.o$b */
    private class C1921b implements ThreadFactory {

        /* renamed from: b */
        private final String f3572b;

        C1921b(String str) {
            this.f3572b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f3572b + CertificateUtil.DELIMITER + Utils.shortenKey(C1918o.this.f3543b.mo14597z()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (C2102v.m5104a()) {
                        C1918o.this.f3544c.mo15013b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.o$c */
    private static class C1923c implements Runnable {

        /* renamed from: a */
        private final C1969m f3574a;

        /* renamed from: b */
        private final String f3575b;

        /* renamed from: c */
        private final C2102v f3576c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1887a f3577d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C1920a f3578e;

        C1923c(C1969m mVar, C1887a aVar, C1920a aVar2) {
            this.f3574a = mVar;
            this.f3576c = mVar.mo14509A();
            this.f3575b = aVar.mo14371e();
            this.f3577d = aVar;
            this.f3578e = aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.C2049g.m4938a()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.m r1 = r6.f3574a     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo14573c()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0035
                com.applovin.impl.sdk.e.a r1 = r6.f3577d     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo14373g()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0016
                goto L_0x0035
            L_0x0016:
                boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0025
                com.applovin.impl.sdk.v r1 = r6.f3576c     // Catch:{ all -> 0x004a }
                java.lang.String r2 = r6.f3575b     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "Task re-scheduled..."
                r1.mo15014c(r2, r3)     // Catch:{ all -> 0x004a }
            L_0x0025:
                com.applovin.impl.sdk.m r1 = r6.f3574a     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o r1 = r1.mo14526S()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.a r2 = r6.f3577d     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o$a r3 = r6.f3578e     // Catch:{ all -> 0x004a }
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.mo14430a((com.applovin.impl.sdk.p053e.C1887a) r2, (com.applovin.impl.sdk.p053e.C1918o.C1920a) r3, (long) r4)     // Catch:{ all -> 0x004a }
                goto L_0x003a
            L_0x0035:
                com.applovin.impl.sdk.e.a r1 = r6.f3577d     // Catch:{ all -> 0x004a }
                r1.run()     // Catch:{ all -> 0x004a }
            L_0x003a:
                boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f3576c
                java.lang.String r2 = r6.f3575b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x0069
            L_0x004a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0082 }
                if (r2 == 0) goto L_0x005a
                com.applovin.impl.sdk.v r2 = r6.f3576c     // Catch:{ all -> 0x0082 }
                java.lang.String r3 = r6.f3575b     // Catch:{ all -> 0x0082 }
                java.lang.String r4 = "Task failed execution"
                r2.mo15013b(r3, r4, r1)     // Catch:{ all -> 0x0082 }
            L_0x005a:
                boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f3576c
                java.lang.String r2 = r6.f3575b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x0069:
                com.applovin.impl.sdk.e.o$a r4 = r6.f3578e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f3577d
                java.lang.String r0 = r0.mo14371e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.mo15014c(r2, r0)
            L_0x0081:
                return
            L_0x0082:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C2102v.m5104a()
                if (r2 == 0) goto L_0x00aa
                com.applovin.impl.sdk.v r2 = r6.f3576c
                java.lang.String r3 = r6.f3575b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f3578e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f3577d
                java.lang.String r0 = r0.mo14371e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.mo15014c(r3, r0)
            L_0x00aa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p053e.C1918o.C1923c.run():void");
        }
    }

    public C1918o(C1969m mVar) {
        this.f3543b = mVar;
        this.f3544c = mVar.mo14509A();
        this.f3545d = m4305a("auxiliary_operations", ((Integer) mVar.mo14534a(C1867b.f3234cd)).intValue());
        this.f3546e = m4305a("shared_thread_pool", ((Integer) mVar.mo14534a(C1867b.f3138am)).intValue());
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m4305a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new C1921b(str));
    }

    /* renamed from: a */
    private void m4306a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.f3546e.submit(runnable);
        } else if (z) {
            C2046e.m4933a(j, this.f3543b, new Runnable() {
                public void run() {
                    C1918o.this.f3546e.execute(runnable);
                }
            });
        } else {
            this.f3546e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private boolean m4307a(C1923c cVar) {
        if (cVar.f3577d.mo14373g()) {
            return false;
        }
        synchronized (this.f3548g) {
            if (this.f3549h) {
                return false;
            }
            this.f3547f.add(cVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo14428a(C1887a aVar) {
        if (aVar != null) {
            try {
                aVar.run();
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    this.f3544c.mo15013b(aVar.mo14371e(), "Task failed execution", th);
                }
            }
        } else if (C2102v.m5104a()) {
            this.f3544c.mo15016e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    /* renamed from: a */
    public void mo14429a(C1887a aVar, C1920a aVar2) {
        mo14430a(aVar, aVar2, 0);
    }

    /* renamed from: a */
    public void mo14430a(C1887a aVar, C1920a aVar2, long j) {
        mo14431a(aVar, aVar2, j, false);
    }

    /* renamed from: a */
    public void mo14431a(C1887a aVar, C1920a aVar2, long j, boolean z) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        } else if (!m4307a(new C1923c(this.f3543b, aVar, aVar2))) {
            m4306a((Runnable) aVar, j, z);
        } else if (C2102v.m5104a()) {
            this.f3544c.mo15014c(aVar.mo14371e(), "Task execution delayed until after init");
        }
    }

    /* renamed from: a */
    public void mo14432a(Runnable runnable) {
        this.f3545d.submit(runnable);
    }

    /* renamed from: a */
    public boolean mo14433a() {
        return this.f3549h;
    }

    /* renamed from: b */
    public Executor mo14434b() {
        return this.f3546e;
    }

    /* renamed from: c */
    public void mo14435c() {
        synchronized (this.f3548g) {
            this.f3549h = false;
        }
    }

    /* renamed from: d */
    public void mo14436d() {
        synchronized (this.f3548g) {
            this.f3549h = true;
            for (C1923c next : this.f3547f) {
                mo14429a(next.f3577d, next.f3578e);
            }
            this.f3547f.clear();
        }
    }
}
