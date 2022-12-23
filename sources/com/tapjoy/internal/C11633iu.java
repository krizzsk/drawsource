package com.tapjoy.internal;

import com.tapjoy.internal.C11438ey;
import java.util.Map;

/* renamed from: com.tapjoy.internal.iu */
public final class C11633iu extends C11630is<Void> {

    /* renamed from: c */
    private final C11438ey.C11439a f28029c = new C11438ey.C11439a();

    /* renamed from: d */
    private C11445fa f28030d = null;

    /* renamed from: c */
    public final String mo69757c() {
        return this.f28030d == C11445fa.USAGES ? "api/v1/usages" : "api/v1/cevs";
    }

    /* renamed from: a */
    public final boolean mo70223a(C11435ex exVar) {
        if (this.f28030d == null) {
            this.f28030d = exVar.f27311n;
        } else if (exVar.f27311n != this.f28030d) {
            return false;
        }
        this.f28029c.f27351c.add(exVar);
        return true;
    }

    /* renamed from: g */
    public final int mo70224g() {
        return this.f28029c.f27351c.size();
    }

    /* renamed from: e */
    public final Map<String, Object> mo69759e() {
        Map<String, Object> e = super.mo69759e();
        e.put("events", new C11295bg(C11592hz.m31778a(this.f28029c.mo69953b())));
        return e;
    }
}
