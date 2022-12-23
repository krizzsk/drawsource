package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2046e;

/* renamed from: com.applovin.impl.mediation.c */
public class C1626c {

    /* renamed from: a */
    private final C1969m f2234a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2102v f2235b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1628a f2236c;

    /* renamed from: d */
    private C2046e f2237d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    public interface C1628a {
        /* renamed from: c */
        void mo13534c(C1585c cVar);
    }

    C1626c(C1969m mVar, C1628a aVar) {
        this.f2234a = mVar;
        this.f2235b = mVar.mo14509A();
        this.f2236c = aVar;
    }

    /* renamed from: a */
    public void mo13573a() {
        if (C2102v.m5104a()) {
            this.f2235b.mo15012b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C2046e eVar = this.f2237d;
        if (eVar != null) {
            eVar.mo14894a();
            this.f2237d = null;
        }
    }

    /* renamed from: a */
    public void mo13574a(final C1585c cVar, long j) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2235b;
            vVar.mo15012b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f2237d = C2046e.m4933a(j, this.f2234a, new Runnable() {
            public void run() {
                if (C2102v.m5104a()) {
                    C1626c.this.f2235b.mo15012b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                C1626c.this.f2236c.mo13534c(cVar);
            }
        });
    }
}
