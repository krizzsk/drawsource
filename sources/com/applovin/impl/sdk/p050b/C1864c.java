package com.applovin.impl.sdk.p050b;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.c */
public class C1864c {

    /* renamed from: a */
    private final String f3040a;

    /* renamed from: b */
    private Map<String, String> f3041b;

    private C1864c(String str, Map<String, String> map) {
        this.f3040a = str;
        this.f3041b = map;
    }

    /* renamed from: a */
    public static C1864c m4068a(String str) {
        return m4069a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C1864c m4069a(String str, Map<String, String> map) {
        return new C1864c(str, map);
    }

    /* renamed from: a */
    public Map<String, String> mo14272a() {
        return this.f3041b;
    }

    /* renamed from: b */
    public String mo14273b() {
        return this.f3040a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f3040a + '\'' + "params='" + this.f3041b + '\'' + '}';
    }
}
