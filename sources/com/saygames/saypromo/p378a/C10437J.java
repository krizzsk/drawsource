package com.saygames.saypromo.p378a;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.saygames.saypromo.a.J */
public final class C10437J implements C10444K {

    /* renamed from: a */
    private final boolean f25858a;

    /* renamed from: b */
    private final File f25859b;

    public C10437J(boolean z, File file) {
        this.f25858a = z;
        this.f25859b = file;
    }

    /* renamed from: a */
    public final File mo65340a() {
        return this.f25859b;
    }

    /* renamed from: b */
    public final boolean mo65341b() {
        return this.f25858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10437J)) {
            return false;
        }
        C10437J j = (C10437J) obj;
        return this.f25858a == j.f25858a && Intrinsics.areEqual((Object) this.f25859b, (Object) j.f25859b);
    }

    public final int hashCode() {
        boolean z = this.f25858a;
        if (z) {
            z = true;
        }
        return this.f25859b.hashCode() + ((z ? 1 : 0) * true);
    }

    public final String toString() {
        return "Web(useEndCardLinks=" + this.f25858a + ", file=" + this.f25859b + ')';
    }
}
