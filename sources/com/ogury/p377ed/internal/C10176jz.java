package com.ogury.p377ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.jz */
public final class C10176jz<A, B> implements Serializable {

    /* renamed from: a */
    private final A f25536a;

    /* renamed from: b */
    private final B f25537b;

    /* renamed from: c */
    public final A mo65020c() {
        return this.f25536a;
    }

    /* renamed from: d */
    public final B mo65021d() {
        return this.f25537b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10176jz)) {
            return false;
        }
        C10176jz jzVar = (C10176jz) obj;
        return C10263mq.m29881a((Object) this.f25536a, (Object) jzVar.f25536a) && C10263mq.m29881a((Object) this.f25537b, (Object) jzVar.f25537b);
    }

    public final int hashCode() {
        A a = this.f25536a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f25537b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public C10176jz(A a, B b) {
        this.f25536a = a;
        this.f25537b = b;
    }

    /* renamed from: a */
    public final A mo65018a() {
        return this.f25536a;
    }

    /* renamed from: b */
    public final B mo65019b() {
        return this.f25537b;
    }

    public final String toString() {
        return "(" + this.f25536a + ", " + this.f25537b + ')';
    }
}
