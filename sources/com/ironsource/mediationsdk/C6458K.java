package com.ironsource.mediationsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/IronSourceAdvId;", "", "advId", "", "advIdType", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdvId", "()Ljava/lang/String;", "getAdvIdType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.K */
public final class C6458K {

    /* renamed from: a */
    public final String f16366a;

    /* renamed from: b */
    public final String f16367b;

    public C6458K(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "advId");
        Intrinsics.checkNotNullParameter(str2, "advIdType");
        this.f16366a = str;
        this.f16367b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6458K)) {
            return false;
        }
        C6458K k = (C6458K) obj;
        return Intrinsics.areEqual((Object) this.f16366a, (Object) k.f16366a) && Intrinsics.areEqual((Object) this.f16367b, (Object) k.f16367b);
    }

    public final int hashCode() {
        String str = this.f16366a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16367b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IronSourceAdvId(advId=" + this.f16366a + ", advIdType=" + this.f16367b + ")";
    }
}
