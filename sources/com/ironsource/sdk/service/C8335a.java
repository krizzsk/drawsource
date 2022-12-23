package com.ironsource.sdk.service;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo72583d2 = {"Lcom/ironsource/sdk/service/AdInstanceTimingService;", "", "()V", "instanceToTimingValuesMapping", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getInstanceToTimingValuesMapping", "()Ljava/util/HashMap;", "addTimingValueForInstance", "", "instance", "timingValue", "clearTimingValueForInstance", "getTimeElapsedForInstanceTimer", "getTimingValueForInstance", "sdk5_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.sdk.service.a */
public final class C8335a {

    /* renamed from: a */
    public static final C8335a f20301a = new C8335a();

    /* renamed from: b */
    private static final HashMap<String, Long> f20302b = new HashMap<>();

    private C8335a() {
    }

    /* renamed from: a */
    public static long m23713a(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        Long l = f20302b.get(str);
        if (l == null) {
            return -1;
        }
        Intrinsics.checkNotNullExpressionValue(l, "it");
        return l.longValue();
    }

    /* renamed from: a */
    public static boolean m23714a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "instance");
        if ((str.length() == 0) || f20302b.containsKey(str)) {
            return false;
        }
        f20302b.put(str, Long.valueOf(j));
        return true;
    }

    /* renamed from: b */
    public static boolean m23715b(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        if (f20302b.get(str) == null) {
            return false;
        }
        f20302b.remove(str);
        return true;
    }

    /* renamed from: c */
    public static long m23716c(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        Long l = f20302b.get(str);
        if (l == null) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullExpressionValue(l, "it");
        return currentTimeMillis - l.longValue();
    }
}
