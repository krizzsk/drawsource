package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p306a.C8508a;

/* renamed from: com.mbridge.msdk.foundation.same.net.b */
/* compiled from: DefaultRetryPolicy */
public final class C8509b implements C8558l {

    /* renamed from: a */
    private int f20853a;

    /* renamed from: b */
    private int f20854b;

    /* renamed from: c */
    private final int f20855c;

    /* renamed from: d */
    private int f20856d;

    /* renamed from: e */
    private int f20857e;

    /* renamed from: f */
    private int f20858f;

    /* renamed from: g */
    private int f20859g;

    /* renamed from: h */
    private int f20860h;

    public C8509b() {
        this(30000, 0);
    }

    public C8509b(int i, int i2) {
        this.f20856d = 2;
        this.f20857e = 0;
        this.f20858f = 0;
        this.f20859g = 0;
        this.f20860h = 0;
        this.f20853a = i <= 0 ? 30000 : i;
        this.f20855c = i2;
    }

    public C8509b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f20856d = 2;
        this.f20857e = 0;
        this.f20858f = 0;
        this.f20859g = 0;
        this.f20860h = 0;
        this.f20857e = Math.max(i, 0);
        this.f20858f = Math.max(i2, 0);
        this.f20859g = Math.max(i3, 0);
        this.f20860h = Math.max(i4, 0);
        this.f20855c = Math.max(i5, 0);
        this.f20856d = i6;
    }

    /* renamed from: a */
    public final int mo57916a() {
        return this.f20855c;
    }

    /* renamed from: b */
    public final int mo57918b() {
        return this.f20853a;
    }

    /* renamed from: c */
    public final int mo57919c() {
        return this.f20854b;
    }

    /* renamed from: a */
    public final boolean mo57917a(C8508a aVar) {
        int i = this.f20854b + 1;
        this.f20854b = i;
        if (i > this.f20855c) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo57920d() {
        return this.f20857e;
    }

    /* renamed from: e */
    public final int mo57921e() {
        return this.f20858f;
    }

    /* renamed from: f */
    public final int mo57922f() {
        return this.f20859g;
    }

    /* renamed from: g */
    public final int mo57923g() {
        return this.f20860h;
    }
}
