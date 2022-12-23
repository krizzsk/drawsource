package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.C0826e0;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedHashMap;

/* renamed from: com.adcolony.sdk.t0 */
class C0969t0 {

    /* renamed from: a */
    private long f784a = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;

    /* renamed from: b */
    private int f785b;

    /* renamed from: c */
    private long f786c;

    /* renamed from: d */
    private boolean f787d = true;

    /* renamed from: e */
    private boolean f788e = true;

    /* renamed from: f */
    private boolean f789f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f790g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f791h = false;

    /* renamed from: i */
    private boolean f792i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f793j;

    /* renamed from: k */
    private boolean f794k;

    /* renamed from: l */
    private C0985u0 f795l;

    /* renamed from: com.adcolony.sdk.t0$a */
    class C0970a implements C0865j0 {
        C0970a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0969t0.this.f793j = true;
        }
    }

    /* renamed from: com.adcolony.sdk.t0$b */
    class C0971b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0899l f797a;

        /* renamed from: b */
        final /* synthetic */ C0866k f798b;

        C0971b(C0969t0 t0Var, C0899l lVar, C0866k kVar) {
            this.f797a = lVar;
            this.f798b = kVar;
        }

        public void run() {
            this.f797a.mo10668b();
            this.f798b.mo10908q().mo10832d();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$c */
    class C0972c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f799a;

        C0972c(boolean z) {
            this.f799a = z;
        }

        public void run() {
            LinkedHashMap<Integer, C0898k0> d = C0723a.m193b().mo10909r().mo10851d();
            synchronized (d) {
                for (C0898k0 next : d.values()) {
                    C0832f1 b = C0773c0.m379b();
                    C0773c0.m385b(b, "from_window_focus", this.f799a);
                    if (C0969t0.this.f791h && !C0969t0.this.f790g) {
                        C0773c0.m385b(b, "app_in_foreground", false);
                        boolean unused = C0969t0.this.f791h = false;
                    }
                    new C0850h0("SessionInfo.on_pause", next.getModuleId(), b).mo10838c();
                }
            }
            C0723a.m198f();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$d */
    class C0973d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f801a;

        C0973d(boolean z) {
            this.f801a = z;
        }

        public void run() {
            C0866k b = C0723a.m193b();
            LinkedHashMap<Integer, C0898k0> d = b.mo10909r().mo10851d();
            synchronized (d) {
                for (C0898k0 next : d.values()) {
                    C0832f1 b2 = C0773c0.m379b();
                    C0773c0.m385b(b2, "from_window_focus", this.f801a);
                    if (C0969t0.this.f791h && C0969t0.this.f790g) {
                        C0773c0.m385b(b2, "app_in_foreground", true);
                        boolean unused = C0969t0.this.f791h = false;
                    }
                    new C0850h0("SessionInfo.on_resume", next.getModuleId(), b2).mo10838c();
                }
            }
            b.mo10908q().mo10832d();
        }
    }

    C0969t0() {
    }

    /* renamed from: h */
    private void m1038h() {
        mo11109a(false);
    }

    /* renamed from: i */
    private void m1039i() {
        mo11111b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11113c(boolean z) {
        C0866k b = C0723a.m193b();
        if (!this.f789f) {
            if (this.f792i) {
                b.mo10890c(false);
                this.f792i = false;
            }
            this.f785b = 0;
            this.f786c = SystemClock.uptimeMillis();
            this.f787d = true;
            this.f789f = true;
            this.f790g = true;
            this.f791h = false;
            AdColony.m96c();
            if (z) {
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m376a(b2, "id", C1047z0.m1235a());
                new C0850h0("SessionInfo.on_start", 1, b2).mo10838c();
                C0899l c = C0723a.m193b().mo10909r().mo10849c();
                if (c != null && !AdColony.m92a((Runnable) new C0971b(this, c, b))) {
                    new C0826e0.C0827a().mo10746a("RejectedExecutionException on controller update.").mo10747a(C0826e0.f462i);
                }
            }
            b.mo10909r().mo10854h();
            C0988v.m1089a().mo11149b();
        }
    }

    /* renamed from: d */
    public void mo11114d() {
        C0723a.m192a("SessionInfo.stopped", (C0865j0) new C0970a());
        this.f795l = new C0985u0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11117e() {
        return this.f787d;
    }

    /* renamed from: f */
    public void mo11118f(boolean z) {
        this.f792i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11120g(boolean z) {
        this.f794k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11122j() {
        C0962s0 a = C0723a.m193b().mo10908q().mo10822a();
        this.f789f = false;
        this.f787d = false;
        if (a != null) {
            a.mo11092b();
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m373a(b, "session_length", ((double) (SystemClock.uptimeMillis() - this.f786c)) / 1000.0d);
        new C0850h0("SessionInfo.on_stop", 1, b).mo10838c();
        C0723a.m198f();
        AdColony.m100g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11116e(boolean z) {
        if (this.f790g != z) {
            this.f790g = z;
            this.f791h = true;
            if (!z) {
                m1038h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo11119f() {
        return this.f789f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo11121g() {
        return this.f794k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11109a(boolean z) {
        this.f788e = true;
        this.f795l.mo11140b();
        if (!AdColony.m92a((Runnable) new C0972c(z))) {
            new C0826e0.C0827a().mo10746a("RejectedExecutionException on session pause.").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11111b(boolean z) {
        this.f788e = false;
        this.f795l.mo11141c();
        if (!AdColony.m92a((Runnable) new C0973d(z))) {
            new C0826e0.C0827a().mo10746a("RejectedExecutionException on session resume.").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11115d(boolean z) {
        if (z && this.f788e) {
            m1039i();
        } else if (!z && !this.f788e) {
            m1038h();
        }
        this.f787d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo11107a() {
        return this.f784a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11108a(int i) {
        this.f784a = i <= 0 ? this.f784a : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo11110b() {
        return this.f785b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11112c() {
        this.f785b++;
    }
}
