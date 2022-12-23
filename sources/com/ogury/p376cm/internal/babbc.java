package com.ogury.p376cm.internal;

import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.babbc */
public final class babbc<A, B> implements Serializable {

    /* renamed from: a */
    private final A f24510a;

    /* renamed from: b */
    private final B f24511b;

    public babbc(A a, B b) {
        this.f24510a = a;
        this.f24511b = b;
    }

    /* renamed from: a */
    public final A mo63948a() {
        return this.f24510a;
    }

    /* renamed from: b */
    public final B mo63949b() {
        return this.f24511b;
    }

    /* renamed from: c */
    public final A mo63950c() {
        return this.f24510a;
    }

    /* renamed from: d */
    public final B mo63951d() {
        return this.f24511b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof babbc)) {
            return false;
        }
        babbc babbc = (babbc) obj;
        return bbabc.m28051a((Object) this.f24510a, (Object) babbc.f24510a) && bbabc.m28051a((Object) this.f24511b, (Object) babbc.f24511b);
    }

    public final int hashCode() {
        A a = this.f24510a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f24511b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.f24510a + ", " + this.f24511b + ')';
    }
}
