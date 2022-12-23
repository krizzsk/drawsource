package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ji */
final class C11654ji {

    /* renamed from: a */
    final byte[] f28092a;

    /* renamed from: b */
    int f28093b;

    /* renamed from: c */
    int f28094c;

    /* renamed from: d */
    boolean f28095d;

    /* renamed from: e */
    boolean f28096e;

    /* renamed from: f */
    C11654ji f28097f;

    /* renamed from: g */
    C11654ji f28098g;

    C11654ji() {
        this.f28092a = new byte[8192];
        this.f28096e = true;
        this.f28095d = false;
    }

    C11654ji(C11654ji jiVar) {
        this(jiVar.f28092a, jiVar.f28093b, jiVar.f28094c);
        jiVar.f28095d = true;
    }

    C11654ji(byte[] bArr, int i, int i2) {
        this.f28092a = bArr;
        this.f28093b = i;
        this.f28094c = i2;
        this.f28096e = false;
        this.f28095d = true;
    }

    /* renamed from: a */
    public final C11654ji mo70292a() {
        C11654ji jiVar = this.f28097f;
        if (jiVar == this) {
            jiVar = null;
        }
        C11654ji jiVar2 = this.f28098g;
        jiVar2.f28097f = this.f28097f;
        this.f28097f.f28098g = jiVar2;
        this.f28097f = null;
        this.f28098g = null;
        return jiVar;
    }

    /* renamed from: a */
    public final C11654ji mo70293a(C11654ji jiVar) {
        jiVar.f28098g = this;
        jiVar.f28097f = this.f28097f;
        this.f28097f.f28098g = jiVar;
        this.f28097f = jiVar;
        return jiVar;
    }

    /* renamed from: a */
    public final void mo70294a(C11654ji jiVar, int i) {
        if (jiVar.f28096e) {
            int i2 = jiVar.f28094c;
            if (i2 + i > 8192) {
                if (!jiVar.f28095d) {
                    int i3 = jiVar.f28093b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = jiVar.f28092a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        jiVar.f28094c -= jiVar.f28093b;
                        jiVar.f28093b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f28092a, this.f28093b, jiVar.f28092a, jiVar.f28094c, i);
            jiVar.f28094c += i;
            this.f28093b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
