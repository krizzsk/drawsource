package com.ogury.p377ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.en */
public final class C9994en implements Serializable {

    /* renamed from: a */
    private final boolean f25144a;

    /* renamed from: b */
    private final C9995eo f25145b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9994en)) {
            return false;
        }
        C9994en enVar = (C9994en) obj;
        return this.f25144a == enVar.f25144a && this.f25145b == enVar.f25145b;
    }

    public final int hashCode() {
        boolean z = this.f25144a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f25145b.hashCode();
    }

    public final String toString() {
        return "ImpressionSettings(isPaidImpression=" + this.f25144a + ", impressionSource=" + this.f25145b + ')';
    }

    public C9994en(boolean z, C9995eo eoVar) {
        C10263mq.m29882b(eoVar, "impressionSource");
        this.f25144a = z;
        this.f25145b = eoVar;
    }

    /* renamed from: a */
    public final boolean mo64587a() {
        return this.f25144a;
    }

    public /* synthetic */ C9994en() {
        this(false, C9995eo.IMPRESSION_SOURCE_FORMAT);
    }

    /* renamed from: b */
    public final C9995eo mo64588b() {
        return this.f25145b;
    }
}
