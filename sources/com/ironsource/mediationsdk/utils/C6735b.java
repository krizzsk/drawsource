package com.ironsource.mediationsdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/utils/ApplicationGeneralSettings;", "", "isExternalArmEventsEnabled", "", "externalArmEventsUrl", "", "shouldUseAppSet", "shouldReuseAdvId", "(ZLjava/lang/String;ZZ)V", "getExternalArmEventsUrl", "()Ljava/lang/String;", "()Z", "getShouldReuseAdvId", "getShouldUseAppSet", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.utils.b */
public final class C6735b {

    /* renamed from: a */
    public final boolean f17564a;

    /* renamed from: b */
    public final String f17565b;

    /* renamed from: c */
    public final boolean f17566c;

    /* renamed from: d */
    public final boolean f17567d;

    public C6735b() {
        this(false, (String) null, false, false, 15);
    }

    public C6735b(boolean z, String str, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "externalArmEventsUrl");
        this.f17564a = z;
        this.f17565b = str;
        this.f17566c = z2;
        this.f17567d = z3;
    }

    private /* synthetic */ C6735b(boolean z, String str, boolean z2, boolean z3, int i) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6735b)) {
            return false;
        }
        C6735b bVar = (C6735b) obj;
        return this.f17564a == bVar.f17564a && Intrinsics.areEqual((Object) this.f17565b, (Object) bVar.f17565b) && this.f17566c == bVar.f17566c && this.f17567d == bVar.f17567d;
    }

    public final int hashCode() {
        boolean z = this.f17564a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f17565b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f17566c;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f17567d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f17564a + ", externalArmEventsUrl=" + this.f17565b + ", shouldUseAppSet=" + this.f17566c + ", shouldReuseAdvId=" + this.f17567d + ")";
    }
}
