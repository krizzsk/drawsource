package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.bz */
public final class C9885bz {

    /* renamed from: a */
    private final int f24917a;

    /* renamed from: b */
    private final int f24918b;

    /* renamed from: c */
    private final int f24919c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9885bz)) {
            return false;
        }
        C9885bz bzVar = (C9885bz) obj;
        return this.f24917a == bzVar.f24917a && this.f24918b == bzVar.f24918b && this.f24919c == bzVar.f24919c;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.f24917a) * 31) + Integer.hashCode(this.f24918b)) * 31) + Integer.hashCode(this.f24919c);
    }

    public final String toString() {
        return "OverlayPosition(gravity=" + this.f24917a + ", xMargin=" + this.f24918b + ", yMargin=" + this.f24919c + ')';
    }

    public C9885bz(int i, int i2, int i3) {
        this.f24917a = i;
        this.f24918b = i2;
        this.f24919c = i3;
    }

    /* renamed from: a */
    public final int mo64419a() {
        return this.f24917a;
    }

    /* renamed from: b */
    public final int mo64420b() {
        return this.f24918b;
    }

    /* renamed from: c */
    public final int mo64421c() {
        return this.f24919c;
    }
}
