package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m */
public final class C5133m implements C5184u1 {

    /* renamed from: a */
    public final C5125l f13640a;

    public C5133m(C5125l lVar) {
        C5125l lVar2 = (C5125l) C5194z.m16182a(lVar, "output");
        this.f13640a = lVar2;
        lVar2.f13631a = this;
    }

    /* renamed from: a */
    public void mo26083a(int i, float f) throws IOException {
        C5125l lVar = this.f13640a;
        lVar.getClass();
        lVar.mo26056g(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public void mo26088b(int i, Object obj, C5083f1 f1Var) throws IOException {
        this.f13640a.mo26046b(i, (C5149q0) obj, f1Var);
    }

    /* renamed from: a */
    public void mo26082a(int i, double d) throws IOException {
        C5125l lVar = this.f13640a;
        lVar.getClass();
        lVar.mo26054f(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo26084a(int i, int i2) throws IOException {
        this.f13640a.mo26060j(i, C5125l.m15788d(i2));
    }

    /* renamed from: a */
    public void mo26085a(int i, long j) throws IOException {
        this.f13640a.mo26057g(i, C5125l.m15784b(j));
    }

    /* renamed from: a */
    public void mo26087a(int i, Object obj, C5083f1 f1Var) throws IOException {
        C5125l lVar = this.f13640a;
        lVar.mo26059i(i, 3);
        f1Var.mo25870a((C5149q0) obj, (C5184u1) lVar.f13631a);
        lVar.mo26059i(i, 4);
    }

    /* renamed from: a */
    public final void mo26086a(int i, Object obj) throws IOException {
        if (obj instanceof C5093i) {
            this.f13640a.mo26049c(i, (C5093i) obj);
        } else {
            this.f13640a.mo26043a(i, (C5149q0) obj);
        }
    }
}
