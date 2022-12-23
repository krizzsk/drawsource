package com.bytedance.sdk.component.p102b.p103a.p106b;

/* renamed from: com.bytedance.sdk.component.b.a.b.e */
/* compiled from: Segment */
final class C2729e {

    /* renamed from: a */
    final byte[] f6071a;

    /* renamed from: b */
    int f6072b;

    /* renamed from: c */
    int f6073c;

    /* renamed from: d */
    boolean f6074d;

    /* renamed from: e */
    boolean f6075e;

    /* renamed from: f */
    C2729e f6076f;

    /* renamed from: g */
    C2729e f6077g;

    C2729e() {
        this.f6071a = new byte[8192];
        this.f6075e = true;
        this.f6074d = false;
    }

    C2729e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f6071a = bArr;
        this.f6072b = i;
        this.f6073c = i2;
        this.f6074d = z;
        this.f6075e = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2729e mo17472a() {
        this.f6074d = true;
        return new C2729e(this.f6071a, this.f6072b, this.f6073c, true, false);
    }

    /* renamed from: b */
    public final C2729e mo17474b() {
        C2729e eVar = this.f6076f;
        if (eVar == this) {
            eVar = null;
        }
        C2729e eVar2 = this.f6077g;
        if (eVar2 != null) {
            eVar2.f6076f = this.f6076f;
        }
        C2729e eVar3 = this.f6076f;
        if (eVar3 != null) {
            eVar3.f6077g = this.f6077g;
        }
        this.f6076f = null;
        this.f6077g = null;
        return eVar;
    }

    /* renamed from: a */
    public final C2729e mo17473a(C2729e eVar) {
        eVar.f6077g = this;
        eVar.f6076f = this.f6076f;
        this.f6076f.f6077g = eVar;
        this.f6076f = eVar;
        return eVar;
    }
}
