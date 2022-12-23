package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C1047z0;
import java.util.Date;

/* renamed from: com.adcolony.sdk.z */
class C1043z {

    /* renamed from: a */
    private boolean f928a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f929b = new C1044a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f930c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1046c f931d;

    /* renamed from: com.adcolony.sdk.z$a */
    class C1044a implements Runnable {
        C1044a() {
        }

        public void run() {
            new C0850h0("AdColony.heartbeat", 1).mo10838c();
            C1043z.this.m1222c();
        }
    }

    /* renamed from: com.adcolony.sdk.z$b */
    class C1045b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1047z0.C1050c f933a;

        C1045b(C1047z0.C1050c cVar) {
            this.f933a = cVar;
        }

        public void run() {
            Runnable unused = C1043z.this.f930c = null;
            if (C0723a.m196d()) {
                C0866k b = C0723a.m193b();
                if (this.f933a.mo11216a() && b.mo10871I()) {
                    b.mo10877a();
                    C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("Controller heartbeat timeout occurred. ");
                    C0826e0.C0827a a2 = a.mo10746a("Timeout set to: " + this.f933a.mo11217b() + " ms. ");
                    a2.mo10746a("Interval set to: " + b.mo10899h() + " ms. ").mo10746a("Heartbeat last reply: ").mo10745a((Object) C1043z.this.f931d).mo10747a(C0826e0.f462i);
                    C1043z.this.m1219a();
                } else if (b.mo10868F()) {
                    C1043z.this.m1219a();
                } else {
                    C1047z0.m1244a(C1043z.this.f929b, b.mo10899h());
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.z$c */
    private static class C1046c {

        /* renamed from: a */
        private final C0832f1 f935a;

        /* synthetic */ C1046c(C0832f1 f1Var, C1044a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f935a.toString();
        }

        private C1046c(C0832f1 f1Var) {
            C0832f1 m = f1Var != null ? f1Var.mo10806m("payload") : C0773c0.m379b();
            this.f935a = m;
            C0773c0.m376a(m, "heartbeatLastTimestamp", C0830f0.f468e.format(new Date()));
        }
    }

    C1043z() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1222c() {
        if (C0723a.m196d()) {
            C1047z0.C1050c cVar = new C1047z0.C1050c(C0723a.m193b().mo10900i());
            C1045b bVar = new C1045b(cVar);
            this.f930c = bVar;
            C1047z0.m1244a((Runnable) bVar, cVar.mo11219d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11210b() {
        m1219a();
        this.f928a = false;
        C1047z0.m1244a(this.f929b, C0723a.m193b().mo10899h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1219a() {
        this.f928a = true;
        C1047z0.m1263c(this.f929b);
        C1047z0.m1263c(this.f930c);
        this.f930c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11209a(C0850h0 h0Var) {
        if (C0723a.m196d() && !this.f928a) {
            this.f931d = new C1046c(h0Var.mo10834a(), (C1044a) null);
            Runnable runnable = this.f930c;
            if (runnable != null) {
                C1047z0.m1263c(runnable);
                C1047z0.m1259b(this.f930c);
                return;
            }
            C1047z0.m1263c(this.f929b);
            C1047z0.m1244a(this.f929b, C0723a.m193b().mo10899h());
        }
    }
}
