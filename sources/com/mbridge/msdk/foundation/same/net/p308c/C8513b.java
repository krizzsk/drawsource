package com.mbridge.msdk.foundation.same.net.p308c;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.same.net.c.b */
/* compiled from: Header */
public final class C8513b {

    /* renamed from: a */
    private final String f20863a;

    /* renamed from: b */
    private final String f20864b;

    public C8513b(String str, String str2) {
        this.f20863a = str;
        this.f20864b = str2;
    }

    /* renamed from: a */
    public final String mo57933a() {
        return this.f20863a;
    }

    /* renamed from: b */
    public final String mo57934b() {
        return this.f20864b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8513b bVar = (C8513b) obj;
        if (!TextUtils.equals(this.f20863a, bVar.f20863a) || !TextUtils.equals(this.f20864b, bVar.f20864b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f20863a.hashCode() * 31) + this.f20864b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20863a + ",value=" + this.f20864b + "]";
    }
}
