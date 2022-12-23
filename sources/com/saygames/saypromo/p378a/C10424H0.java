package com.saygames.saypromo.p378a;

import kotlin.Unit;

/* renamed from: com.saygames.saypromo.a.H0 */
public final class C10424H0 implements C10410F0 {

    /* renamed from: a */
    private final C10717u4 f25835a = new C10717u4();

    /* renamed from: b */
    private C10417G0 f25836b;

    C10424H0() {
    }

    /* renamed from: a */
    public final void mo65323a() {
        synchronized (this.f25835a.f26352a) {
            this.f25836b = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final boolean mo65324a(C10564b0 b0Var, C10697r5 r5Var) {
        boolean z;
        synchronized (this.f25835a.f26352a) {
            if (this.f25836b == null) {
                this.f25836b = new C10417G0(b0Var, r5Var);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final C10417G0 mo65325b() {
        C10417G0 g0;
        synchronized (this.f25835a.f26352a) {
            g0 = this.f25836b;
        }
        return g0;
    }
}
