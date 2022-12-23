package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.I */
public final class C10430I implements C10444K {

    /* renamed from: a */
    private final boolean f25843a;

    /* renamed from: b */
    private final C10416G f25844b;

    /* renamed from: c */
    private final long f25845c;

    /* renamed from: d */
    private final File f25846d;

    /* renamed from: e */
    private final C10423H f25847e;

    private C10430I(boolean z, C10416G g, long j, File file, C10423H h) {
        this.f25843a = z;
        this.f25844b = g;
        this.f25845c = j;
        this.f25846d = file;
        this.f25847e = h;
    }

    public /* synthetic */ C10430I(boolean z, C10416G g, long j, File file, C10423H h, int i) {
        this(z, g, j, file, h);
    }

    /* renamed from: a */
    public final C10416G mo65331a() {
        return this.f25844b;
    }

    /* renamed from: b */
    public final long mo65332b() {
        return this.f25845c;
    }

    /* renamed from: c */
    public final File mo65333c() {
        return this.f25846d;
    }

    /* renamed from: d */
    public final C10423H mo65334d() {
        return this.f25847e;
    }

    /* renamed from: e */
    public final boolean mo65335e() {
        return this.f25843a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10430I)) {
            return false;
        }
        C10430I i = (C10430I) obj;
        return this.f25843a == i.f25843a && Intrinsics.areEqual((Object) this.f25844b, (Object) i.f25844b) && Duration.m35149equalsimpl0(this.f25845c, i.f25845c) && Intrinsics.areEqual((Object) this.f25846d, (Object) i.f25846d) && Intrinsics.areEqual((Object) this.f25847e, (Object) i.f25847e);
    }

    public final int hashCode() {
        boolean z = this.f25843a;
        if (z) {
            z = true;
        }
        int hashCode = this.f25844b.hashCode();
        int r0 = Duration.m35172hashCodeimpl(this.f25845c);
        int hashCode2 = this.f25846d.hashCode();
        return this.f25847e.hashCode() + ((hashCode2 + ((r0 + ((hashCode + ((z ? 1 : 0) * true)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Video(withProgress=" + this.f25843a + ", click=" + this.f25844b + ", clickableAfter=" + Duration.m35193toStringimpl(this.f25845c) + ", file=" + this.f25846d + ", size=" + this.f25847e + ')';
    }
}
