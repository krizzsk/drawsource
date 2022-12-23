package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C0830f0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.s0 */
class C0962s0 {

    /* renamed from: a */
    C0822d0 f768a;

    /* renamed from: b */
    ScheduledExecutorService f769b;

    /* renamed from: c */
    List<C0830f0> f770c = new ArrayList();

    /* renamed from: d */
    HashMap<String, Object> f771d;

    /* renamed from: e */
    private C0741b0 f772e = new C0741b0("adcolony_android", "4.8.0", "Production");

    /* renamed from: com.adcolony.sdk.s0$a */
    class C0963a implements Runnable {
        C0963a() {
        }

        public void run() {
            C0962s0.this.mo11089a();
        }
    }

    /* renamed from: com.adcolony.sdk.s0$b */
    class C0964b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0830f0 f774a;

        C0964b(C0830f0 f0Var) {
            this.f774a = f0Var;
        }

        public void run() {
            C0962s0.this.f770c.add(this.f774a);
        }
    }

    C0962s0(C0822d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f768a = d0Var;
        this.f769b = scheduledExecutorService;
        this.f771d = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo11090a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f769b.isShutdown() && !this.f769b.isTerminated()) {
                this.f769b.scheduleAtFixedRate(new C0963a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f769b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo11092b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f769b     // Catch:{ all -> 0x004a }
            r0.shutdown()     // Catch:{ all -> 0x004a }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f769b     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003c }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.ScheduledExecutorService r0 = r4.f769b     // Catch:{ InterruptedException -> 0x003c }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f769b     // Catch:{ InterruptedException -> 0x003c }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003c }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003c }
            java.lang.Class<com.adcolony.sdk.s0> r2 = com.adcolony.sdk.C0962s0.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003c }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003c }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0048
        L_0x003c:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f769b     // Catch:{ all -> 0x004a }
            r0.shutdownNow()     // Catch:{ all -> 0x004a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r0.interrupt()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0962s0.mo11092b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo11095c(String str) {
        mo11093b(new C0830f0.C0831a().mo10770a(2).mo10771a(this.f772e).mo10772a(str).mo10773a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo11096d(String str) {
        mo11093b(new C0830f0.C0831a().mo10770a(1).mo10771a(this.f772e).mo10772a(str).mo10773a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo11097e(String str) {
        this.f771d.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo11098f(String str) {
        this.f771d.put("sessionId", str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11089a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f770c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            if (r0 <= 0) goto L_0x0029
            com.adcolony.sdk.b0 r0 = r2.f772e     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r1 = r2.f770c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.lang.String r0 = r2.mo11088a((com.adcolony.sdk.C0741b0) r0, (java.util.List<com.adcolony.sdk.C0830f0>) r1)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            com.adcolony.sdk.d0 r1 = r2.f768a     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r1.mo10742a(r0)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f770c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r0.clear()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f770c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
            goto L_0x0029
        L_0x0024:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f770c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0962s0.mo11089a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo11094b(String str) {
        mo11093b(new C0830f0.C0831a().mo10770a(0).mo10771a(this.f772e).mo10772a(str).mo10773a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo11093b(C0830f0 f0Var) {
        try {
            if (!this.f769b.isShutdown() && !this.f769b.isTerminated()) {
                this.f769b.submit(new C0964b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo11091a(String str) {
        mo11093b(new C0830f0.C0831a().mo10770a(3).mo10771a(this.f772e).mo10772a(str).mo10773a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11088a(C0741b0 b0Var, List<C0830f0> list) throws JSONException {
        C0832f1 f1Var = new C0832f1();
        f1Var.mo10779a(FirebaseAnalytics.Param.INDEX, b0Var.mo10561b());
        f1Var.mo10779a("environment", b0Var.mo10560a());
        f1Var.mo10779a("version", b0Var.mo10562c());
        C0828e1 e1Var = new C0828e1();
        for (C0830f0 a : list) {
            e1Var.mo10748a(m1011a(a));
        }
        f1Var.mo10777a("logs", e1Var);
        return f1Var.toString();
    }

    /* renamed from: a */
    private synchronized C0832f1 m1011a(C0830f0 f0Var) throws JSONException {
        C0832f1 f1Var;
        f1Var = new C0832f1((Map<?, ?>) this.f771d);
        f1Var.mo10779a("environment", f0Var.mo10765a().mo10560a());
        f1Var.mo10779a("level", f0Var.mo10766b());
        f1Var.mo10779a("message", f0Var.mo10767c());
        f1Var.mo10779a("clientTimestamp", f0Var.mo10768d());
        C0832f1 f1Var2 = new C0832f1(C0723a.m193b().mo10912u().getMediationInfo());
        C0832f1 f1Var3 = new C0832f1(C0723a.m193b().mo10912u().getPluginInfo());
        f1Var.mo10779a("mediation_network", C0773c0.m393h(f1Var2, "name"));
        f1Var.mo10779a("mediation_network_version", C0773c0.m393h(f1Var2, "version"));
        f1Var.mo10779a(TapjoyConstants.TJC_PLUGIN, C0773c0.m393h(f1Var3, "name"));
        f1Var.mo10779a("plugin_version", C0773c0.m393h(f1Var3, "version"));
        C0828e1 b = C0723a.m193b().mo10908q().mo10827b();
        if (b == null || b.mo10751a("batteryInfo")) {
            f1Var.mo10787b("batteryInfo", C0723a.m193b().mo10905n().mo11051l());
        }
        if (b != null) {
            f1Var.mo10781a(b);
        }
        return f1Var;
    }
}
