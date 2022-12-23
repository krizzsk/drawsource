package com.saygames.saypromo.p378a;

import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.A */
public final class C10374A implements C10395D {

    /* renamed from: a */
    private final long f25729a;

    private C10374A(long j) {
        this.f25729a = j;
    }

    public /* synthetic */ C10374A(long j, int i) {
        this(j);
    }

    /* renamed from: a */
    public final long mo65240a() {
        return this.f25729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10374A) && Duration.m35149equalsimpl0(this.f25729a, ((C10374A) obj).f25729a);
    }

    public final int hashCode() {
        return Duration.m35172hashCodeimpl(this.f25729a);
    }

    public final String toString() {
        return "Counter(duration=" + Duration.m35193toStringimpl(this.f25729a) + ')';
    }
}
