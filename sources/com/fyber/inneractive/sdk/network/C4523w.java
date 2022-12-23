package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.w */
public class C4523w {

    /* renamed from: f */
    public static final ThreadFactory f11185f = new C4524a();

    /* renamed from: a */
    public BlockingQueue<C4474b0<?>> f11186a = new PriorityBlockingQueue(100, new C4526c((C4524a) null));

    /* renamed from: b */
    public volatile boolean f11187b = false;

    /* renamed from: c */
    public final Handler f11188c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final ThreadPoolExecutor f11189d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f11185f);

    /* renamed from: e */
    public final Runnable f11190e = new C4525b();

    /* renamed from: com.fyber.inneractive.sdk.network.w$a */
    public class C4524a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f11191a = new AtomicInteger(100);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", new Object[]{Integer.valueOf(this.f11191a.getAndIncrement())}));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$b */
    public class C4525b implements Runnable {
        public C4525b() {
        }

        public void run() {
            C4474b0 b0Var;
            C4471a aVar;
            C4472a0 a0Var;
            C4523w wVar = C4523w.this;
            wVar.getClass();
            Process.setThreadPriority(10);
            while (wVar.f11187b) {
                try {
                    b0Var = wVar.f11186a.take();
                } catch (InterruptedException unused) {
                    if (!wVar.f11187b) {
                        Thread.currentThread().interrupt();
                    }
                    b0Var = null;
                }
                if (b0Var != null && !b0Var.mo24646e()) {
                    b0Var.mo24642a(C4501m0.RUNNING);
                    try {
                        if (!b0Var.mo24646e() && b0Var.mo24645c() != null) {
                            aVar = b0Var.mo24648g();
                            if (!(aVar == null || aVar.f10995b == null || b0Var.mo24646e())) {
                                b0Var.mo24643a(aVar.f10995b, (Exception) null, true);
                            }
                            C4493j a = wVar.mo24701a((C4474b0<?>) b0Var, (C4471a<?>) aVar);
                            a0Var = wVar.mo24700a(b0Var, a);
                            wVar.mo24704a(b0Var, a, a0Var);
                            wVar.mo24703a(b0Var, a0Var);
                            wVar.mo24705b(b0Var);
                        }
                    } catch (Exception e) {
                        IAlog.m16445a("failed fetching cache data", e, new Object[0]);
                        b0Var.mo24643a(null, e, true);
                    }
                    aVar = null;
                    b0Var.mo24643a(aVar.f10995b, (Exception) null, true);
                    try {
                        C4493j a2 = wVar.mo24701a((C4474b0<?>) b0Var, (C4471a<?>) aVar);
                        a0Var = wVar.mo24700a(b0Var, a2);
                        try {
                            wVar.mo24704a(b0Var, a2, a0Var);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        a0Var = null;
                        try {
                            b0Var.mo24643a(null, e, false);
                            wVar.mo24703a(b0Var, a0Var);
                            wVar.mo24705b(b0Var);
                        } catch (Throwable th) {
                            th = th;
                            wVar.mo24703a(b0Var, a0Var);
                            wVar.mo24705b(b0Var);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        a0Var = null;
                        th = th2;
                        wVar.mo24703a(b0Var, a0Var);
                        wVar.mo24705b(b0Var);
                        throw th;
                    }
                    wVar.mo24703a(b0Var, a0Var);
                    wVar.mo24705b(b0Var);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$c */
    public static class C4526c implements Comparator<C4474b0> {
        public C4526c() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C4474b0) obj).mo24647f().ordinal() - ((C4474b0) obj2).mo24647f().ordinal();
        }

        public /* synthetic */ C4526c(C4524a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public final <T> void mo24703a(C4474b0<T> b0Var, C4472a0 a0Var) {
        try {
            if (!b0Var.mo24646e() && a0Var != null) {
                b0Var.mo24643a(a0Var.f10996a, (Exception) null, false);
            }
        } catch (Exception e) {
            IAlog.m16445a("failed notifying the listener request complete", e, new Object[0]);
            b0Var.mo24643a(null, e, false);
        }
    }

    /* renamed from: b */
    public final void mo24705b(C4474b0<?> b0Var) {
        try {
            b0Var.mo24644b();
        } catch (Exception unused) {
        }
        b0Var.mo24642a(C4501m0.DONE);
    }

    /* renamed from: c */
    public void mo24706c(C4474b0<?> b0Var) {
        this.f11186a.offer(b0Var);
        b0Var.mo24642a(C4501m0.QUEUED);
    }

    /* renamed from: a */
    public final <T> void mo24704a(C4474b0<T> b0Var, C4493j jVar, C4472a0 a0Var) {
        try {
            if (!b0Var.mo24646e() && b0Var.mo24645c() != null && a0Var != null && jVar != null && jVar.f11042a == 200) {
                b0Var.mo24641a(a0Var, b0Var.mo24645c(), jVar.f11046e);
            }
        } catch (Exception e) {
            IAlog.m16445a("Failed cache network response data", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final <T> C4472a0 mo24700a(C4474b0<T> b0Var, C4493j jVar) throws Exception {
        if (jVar == null) {
            return null;
        }
        try {
            if (b0Var.mo24646e()) {
                return null;
            }
            int i = jVar.f11042a;
            if (i == 200) {
                return b0Var.mo24638a(jVar.f11044c, jVar.f11045d, i);
            }
            if (i == 304) {
                b0Var.mo24643a(null, (Exception) new C4484f(), false);
                return null;
            }
            b0Var.mo24643a(null, (Exception) new C4506n0(jVar.f11042a, jVar.f11043b), false);
            return null;
        } catch (Exception e) {
            IAlog.m16445a("failed parsing network request", e, new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public final C4493j mo24701a(C4474b0<?> b0Var, C4471a<?> aVar) throws Exception {
        try {
            if (b0Var.mo24646e()) {
                return null;
            }
            String str = aVar != null ? aVar.f10994a : "";
            mo24702a(b0Var);
            return b0Var.mo24639a(str);
        } catch (C4473b | UnknownHostException e) {
            IAlog.m16445a("failed sending network request", e, new Object[0]);
            if (b0Var.mo24651j()) {
                this.f11188c.postDelayed(new C4527x(this, b0Var), (long) b0Var.mo24656p());
            }
            throw e;
        } catch (Exception e2) {
            IAlog.m16445a("failed sending network request", e2, new Object[0]);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0.isConnectedOrConnecting() != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24702a(com.fyber.inneractive.sdk.network.C4474b0<?> r4) throws com.fyber.inneractive.sdk.network.C4473b {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.global.s r4 = r4.mo24649h()
            if (r4 == 0) goto L_0x0050
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.g> r0 = com.fyber.inneractive.sdk.config.global.features.C4231g.class
            com.fyber.inneractive.sdk.config.global.features.e r4 = r4.mo24264a(r0)
            com.fyber.inneractive.sdk.config.global.features.g r4 = (com.fyber.inneractive.sdk.config.global.features.C4231g) r4
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = "should_use_is_network_connected"
            r1 = 0
            boolean r4 = r4.mo24239a((java.lang.String) r0, (boolean) r1)
            if (r4 == 0) goto L_0x0050
            r4 = 1
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C5292l.f14015a     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x003d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x003d }
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0045
            goto L_0x0044
        L_0x003d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file."
            com.fyber.inneractive.sdk.util.IAlog.m16447b(r1, r0)
        L_0x0044:
            r1 = r4
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            com.fyber.inneractive.sdk.network.b r4 = new com.fyber.inneractive.sdk.network.b
            java.lang.String r0 = "No network connection"
            r4.<init>((java.lang.String) r0)
            throw r4
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4523w.mo24702a(com.fyber.inneractive.sdk.network.b0):void");
    }
}
