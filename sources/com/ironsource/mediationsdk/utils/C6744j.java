package com.ironsource.mediationsdk.utils;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006&"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/utils/PixelSettings;", "", "pixelEventsEnabled", "", "pixelEventsUrl", "", "pixelEventsCompression", "pixelOptOut", "", "pixelOptIn", "(ZLjava/lang/String;Z[I[I)V", "getPixelEventsCompression", "()Z", "setPixelEventsCompression", "(Z)V", "getPixelEventsEnabled", "setPixelEventsEnabled", "getPixelEventsUrl", "()Ljava/lang/String;", "setPixelEventsUrl", "(Ljava/lang/String;)V", "getPixelOptIn", "()[I", "setPixelOptIn", "([I)V", "getPixelOptOut", "setPixelOptOut", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.utils.j */
public final class C6744j {

    /* renamed from: a */
    public boolean f17632a;

    /* renamed from: b */
    public String f17633b;

    /* renamed from: c */
    public boolean f17634c;

    /* renamed from: d */
    public int[] f17635d;

    /* renamed from: e */
    public int[] f17636e;

    public C6744j() {
        this(false, (String) null, false, (int[]) null, (int[]) null, 31);
    }

    private C6744j(boolean z, String str, boolean z2, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(str, "pixelEventsUrl");
        this.f17632a = z;
        this.f17633b = str;
        this.f17634c = z2;
        this.f17635d = iArr;
        this.f17636e = iArr2;
    }

    private /* synthetic */ C6744j(boolean z, String str, boolean z2, int[] iArr, int[] iArr2, int i) {
        this(true, "https://outcome-ssp.supersonicads.com/mediation?adUnit=3", false, (int[]) null, (int[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6744j)) {
            return false;
        }
        C6744j jVar = (C6744j) obj;
        return this.f17632a == jVar.f17632a && Intrinsics.areEqual((Object) this.f17633b, (Object) jVar.f17633b) && this.f17634c == jVar.f17634c && Intrinsics.areEqual((Object) this.f17635d, (Object) jVar.f17635d) && Intrinsics.areEqual((Object) this.f17636e, (Object) jVar.f17636e);
    }

    public final int hashCode() {
        boolean z = this.f17632a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f17633b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f17634c;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        int[] iArr = this.f17635d;
        int hashCode2 = (i3 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f17636e;
        if (iArr2 != null) {
            i2 = Arrays.hashCode(iArr2);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f17632a + ", pixelEventsUrl=" + this.f17633b + ", pixelEventsCompression=" + this.f17634c + ", pixelOptOut=" + Arrays.toString(this.f17635d) + ", pixelOptIn=" + Arrays.toString(this.f17636e) + ")";
    }
}
