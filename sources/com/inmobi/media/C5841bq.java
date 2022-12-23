package com.inmobi.media;

import com.google.common.base.Ascii;

/* renamed from: com.inmobi.media.bq */
/* compiled from: RawAsset */
public final class C5841bq {

    /* renamed from: a */
    final byte f14696a;

    /* renamed from: b */
    final String f14697b;

    public C5841bq(byte b, String str) {
        this.f14696a = b;
        this.f14697b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5841bq)) {
            return false;
        }
        C5841bq bqVar = (C5841bq) obj;
        return this.f14696a == bqVar.f14696a && this.f14697b.equals(bqVar.f14697b);
    }

    public final int hashCode() {
        return (this.f14696a * Ascii.f18308US) + this.f14697b.hashCode();
    }
}
