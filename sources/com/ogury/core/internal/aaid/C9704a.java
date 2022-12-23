package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C9717ai;

/* renamed from: com.ogury.core.internal.aaid.a */
/* compiled from: AdInfo.kt */
public final class C9704a {

    /* renamed from: a */
    private final String f24588a;

    /* renamed from: b */
    private final boolean f24589b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9704a)) {
            return false;
        }
        C9704a aVar = (C9704a) obj;
        return C9717ai.m28144a((Object) this.f24588a, (Object) aVar.f24588a) && this.f24589b == aVar.f24589b;
    }

    public final int hashCode() {
        String str = this.f24588a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f24589b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        return "AdInfo(id=" + this.f24588a + ", isLimitAdTrackingEnabled=" + this.f24589b + ")";
    }

    public C9704a(String str, boolean z) {
        C9717ai.m28145b(str, "id");
        this.f24588a = str;
        this.f24589b = z;
    }

    /* renamed from: a */
    public final String mo64045a() {
        return this.f24588a;
    }

    /* renamed from: b */
    public final boolean mo64046b() {
        return this.f24589b;
    }
}
