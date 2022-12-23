package com.mbridge.msdk.dycreator.p221b;

/* renamed from: com.mbridge.msdk.dycreator.b.a */
/* compiled from: DyError */
public final class C6813a {

    /* renamed from: a */
    private int f18061a;

    /* renamed from: b */
    private String f18062b;

    public C6813a(C6814b bVar) {
        if (bVar != null) {
            this.f18061a = bVar.mo37139a();
            this.f18062b = bVar.mo37140b();
        }
    }

    public C6813a(int i, String str) {
        this.f18061a = i;
        this.f18062b = str;
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f18061a + '}';
    }
}
