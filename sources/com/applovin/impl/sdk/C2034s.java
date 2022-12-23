package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.s */
public class C2034s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f3959a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f3960b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f3961c;

    /* renamed from: d */
    private final Object f3962d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f3963e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f3964f;

    /* renamed from: g */
    private Object f3965g;

    C2034s(C1969m mVar) {
        this.f3959a = mVar;
    }

    /* renamed from: a */
    public void mo14866a(final Object obj) {
        if (!C1655c.m3373a(obj) && this.f3960b.compareAndSet(false, true)) {
            this.f3965g = obj;
            this.f3961c = System.currentTimeMillis();
            if (C2102v.m5104a()) {
                C2102v A = this.f3959a.mo14509A();
                A.mo15012b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f3961c);
            }
            this.f3959a.mo14560aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f3959a.mo14534a(C1867b.f3237cg)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (C2034s.this.f3960b.get() && System.currentTimeMillis() - C2034s.this.f3961c >= longValue) {
                            if (C2102v.m5104a()) {
                                C2034s.this.f3959a.mo14509A().mo15012b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            C2034s.this.mo14869b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    /* renamed from: a */
    public void mo14867a(boolean z) {
        synchronized (this.f3962d) {
            this.f3963e.set(z);
            if (z) {
                this.f3964f = System.currentTimeMillis();
                if (C2102v.m5104a()) {
                    C2102v A = this.f3959a.mo14509A();
                    A.mo15012b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f3964f);
                }
                final long longValue = ((Long) this.f3959a.mo14534a(C1867b.f3236cf)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                        public void run() {
                            if (C2034s.this.mo14868a() && System.currentTimeMillis() - C2034s.this.f3964f >= longValue) {
                                if (C2102v.m5104a()) {
                                    C2034s.this.f3959a.mo14509A().mo15012b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                C2034s.this.f3963e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f3964f = 0;
                if (C2102v.m5104a()) {
                    C2102v A2 = this.f3959a.mo14509A();
                    A2.mo15012b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo14868a() {
        return this.f3963e.get();
    }

    /* renamed from: b */
    public void mo14869b(Object obj) {
        if (!C1655c.m3373a(obj) && this.f3960b.compareAndSet(true, false)) {
            this.f3965g = null;
            if (C2102v.m5104a()) {
                C2102v A = this.f3959a.mo14509A();
                A.mo15012b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f3959a.mo14560aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: b */
    public boolean mo14870b() {
        return this.f3960b.get();
    }

    /* renamed from: c */
    public Object mo14871c() {
        return this.f3965g;
    }
}
