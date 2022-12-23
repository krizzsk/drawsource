package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.utils.C2092o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.d */
public class C1872d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C2092o f3401a;

    /* renamed from: b */
    private final Object f3402b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f3403c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f3404d;

    /* renamed from: e */
    private final C1969m f3405e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C1874a> f3406f;

    /* renamed from: g */
    private long f3407g;

    /* renamed from: com.applovin.impl.sdk.d$a */
    public interface C1874a {
        void onAdRefresh();
    }

    public C1872d(C1969m mVar, C1874a aVar) {
        this.f3406f = new WeakReference<>(aVar);
        this.f3405e = mVar;
    }

    /* renamed from: i */
    private void m4114i() {
        synchronized (this.f3402b) {
            if (this.f3401a != null) {
                this.f3401a.mo14974b();
            } else {
                if (C2102v.m5104a()) {
                    this.f3405e.mo14509A().mo15012b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f3403c.set(true);
            }
        }
    }

    /* renamed from: j */
    private void m4115j() {
        synchronized (this.f3402b) {
            if (this.f3401a != null) {
                this.f3401a.mo14975c();
            } else {
                this.f3403c.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m4116k() {
        synchronized (this.f3402b) {
            this.f3401a = null;
            if (!((Boolean) this.f3405e.mo14534a(C1866a.f3087s)).booleanValue()) {
                this.f3405e.mo14560aj().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: l */
    private void m4117l() {
        if (((Boolean) this.f3405e.mo14534a(C1866a.f3086r)).booleanValue()) {
            m4114i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4118m() {
        /*
            r4 = this;
            com.applovin.impl.sdk.m r0 = r4.f3405e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p051c.C1866a.f3086r
            java.lang.Object r0 = r0.mo14534a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r4.f3402b
            monitor-enter(r0)
            boolean r1 = r4.f3404d     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x002c
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x002a
            com.applovin.impl.sdk.m r1 = r4.f3405e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.v r1 = r1.mo14509A()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo15012b(r2, r3)     // Catch:{ all -> 0x0058 }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x002c:
            com.applovin.impl.sdk.m r1 = r4.f3405e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.y r1 = r1.mo14554ad()     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.mo15025a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x004d
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x004b
            com.applovin.impl.sdk.m r1 = r4.f3405e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.v r1 = r1.mo14509A()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.mo15012b(r2, r3)     // Catch:{ all -> 0x0058 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x004d:
            com.applovin.impl.sdk.utils.o r1 = r4.f3401a     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0056
            com.applovin.impl.sdk.utils.o r1 = r4.f3401a     // Catch:{ all -> 0x0058 }
            r1.mo14975c()     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r1
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1872d.m4118m():void");
    }

    /* renamed from: a */
    public void mo14305a(long j) {
        synchronized (this.f3402b) {
            mo14308c();
            this.f3407g = j;
            this.f3401a = C2092o.m5058a(j, this.f3405e, new Runnable() {
                public void run() {
                    C1872d.this.m4116k();
                    C1874a aVar = (C1874a) C1872d.this.f3406f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f3405e.mo14534a(C1866a.f3087s)).booleanValue()) {
                this.f3405e.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f3405e.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f3405e.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f3405e.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f3405e.mo14534a(C1866a.f3086r)).booleanValue() && (this.f3405e.mo14555ae().mo14870b() || this.f3405e.mo14554ad().mo15025a())) {
                this.f3401a.mo14974b();
            }
            if (this.f3403c.compareAndSet(true, false) && ((Boolean) this.f3405e.mo14534a(C1866a.f3088t)).booleanValue()) {
                if (C2102v.m5104a()) {
                    this.f3405e.mo14509A().mo15012b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f3401a.mo14974b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo14306a() {
        boolean z;
        synchronized (this.f3402b) {
            z = this.f3401a != null;
        }
        return z;
    }

    /* renamed from: b */
    public long mo14307b() {
        long a;
        synchronized (this.f3402b) {
            a = this.f3401a != null ? this.f3401a.mo14973a() : -1;
        }
        return a;
    }

    /* renamed from: c */
    public void mo14308c() {
        synchronized (this.f3402b) {
            if (this.f3401a != null) {
                this.f3401a.mo14976d();
                m4116k();
            }
        }
    }

    /* renamed from: d */
    public void mo14309d() {
        synchronized (this.f3402b) {
            m4114i();
            this.f3404d = true;
        }
    }

    /* renamed from: e */
    public void mo14310e() {
        synchronized (this.f3402b) {
            m4115j();
            this.f3404d = false;
        }
    }

    /* renamed from: f */
    public boolean mo14311f() {
        return this.f3404d;
    }

    /* renamed from: g */
    public void mo14312g() {
        if (((Boolean) this.f3405e.mo14534a(C1866a.f3085q)).booleanValue()) {
            m4114i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r0 = (com.applovin.impl.sdk.C1872d.C1874a) r9.f3406f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14313h() {
        /*
            r9 = this;
            com.applovin.impl.sdk.m r0 = r9.f3405e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p051c.C1866a.f3085q
            java.lang.Object r0 = r0.mo14534a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r9.f3402b
            monitor-enter(r0)
            boolean r1 = r9.f3404d     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x002c
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x002a
            com.applovin.impl.sdk.m r1 = r9.f3405e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.v r1 = r1.mo14509A()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo15012b(r2, r3)     // Catch:{ all -> 0x008d }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x002c:
            com.applovin.impl.sdk.m r1 = r9.f3405e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.s r1 = r1.mo14555ae()     // Catch:{ all -> 0x008d }
            boolean r1 = r1.mo14870b()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x004d
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x004b
            com.applovin.impl.sdk.m r1 = r9.f3405e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.v r1 = r1.mo14509A()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.mo15012b(r2, r3)     // Catch:{ all -> 0x008d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x004d:
            com.applovin.impl.sdk.utils.o r1 = r9.f3401a     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r1 == 0) goto L_0x007c
            long r3 = r9.f3407g     // Catch:{ all -> 0x008d }
            long r5 = r9.mo14307b()     // Catch:{ all -> 0x008d }
            long r3 = r3 - r5
            com.applovin.impl.sdk.m r1 = r9.f3405e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.c.b<java.lang.Long> r5 = com.applovin.impl.sdk.p051c.C1866a.f3084p     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = r1.mo14534a(r5)     // Catch:{ all -> 0x008d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x008d }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008d }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0077
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0077
            r9.mo14308c()     // Catch:{ all -> 0x008d }
            r1 = 1
            r2 = r1
            goto L_0x007c
        L_0x0077:
            com.applovin.impl.sdk.utils.o r1 = r9.f3401a     // Catch:{ all -> 0x008d }
            r1.mo14975c()     // Catch:{ all -> 0x008d }
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0090
            java.lang.ref.WeakReference<com.applovin.impl.sdk.d$a> r0 = r9.f3406f
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.C1872d.C1874a) r0
            if (r0 == 0) goto L_0x0090
            r0.onAdRefresh()
            goto L_0x0090
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r1
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1872d.mo14313h():void");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            mo14312g();
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14313h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m4117l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m4118m();
        }
    }
}
