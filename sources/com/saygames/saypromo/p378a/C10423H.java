package com.saygames.saypromo.p378a;

/* renamed from: com.saygames.saypromo.a.H */
public final class C10423H {

    /* renamed from: a */
    private final int f25833a;

    /* renamed from: b */
    private final int f25834b;

    public C10423H(int i, int i2) {
        this.f25833a = i;
        this.f25834b = i2;
    }

    /* renamed from: a */
    public final int mo65318a() {
        return this.f25833a;
    }

    /* renamed from: b */
    public final int mo65319b() {
        return this.f25834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10423H)) {
            return false;
        }
        C10423H h = (C10423H) obj;
        return this.f25833a == h.f25833a && this.f25834b == h.f25834b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25834b) + (Integer.hashCode(this.f25833a) * 31);
    }

    public final String toString() {
        return "Size(height=" + this.f25833a + ", width=" + this.f25834b + ')';
    }
}
