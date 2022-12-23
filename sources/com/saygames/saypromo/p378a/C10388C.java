package com.saygames.saypromo.p378a;

import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.C */
public final class C10388C implements C10395D {

    /* renamed from: a */
    private final long f25742a;

    private C10388C(long j) {
        this.f25742a = j;
    }

    public /* synthetic */ C10388C(long j, int i) {
        this(j);
    }

    /* renamed from: a */
    public final long mo65250a() {
        return this.f25742a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10388C) && Duration.m35149equalsimpl0(this.f25742a, ((C10388C) obj).f25742a);
    }

    public final int hashCode() {
        return Duration.m35172hashCodeimpl(this.f25742a);
    }

    public final String toString() {
        return "Timer(duration=" + Duration.m35193toStringimpl(this.f25742a) + ')';
    }
}
