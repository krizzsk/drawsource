package com.applovin.impl.sdk.p052d;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.a */
public class C1875a {

    /* renamed from: a */
    private final String f3409a;

    /* renamed from: b */
    private final String f3410b;

    /* renamed from: c */
    private final Map<String, String> f3411c;

    /* renamed from: d */
    private final boolean f3412d;

    public C1875a(String str, String str2) {
        this(str, str2, (Map<String, String>) null, false);
    }

    public C1875a(String str, String str2, Map<String, String> map, boolean z) {
        this.f3409a = str;
        this.f3410b = str2;
        this.f3411c = map;
        this.f3412d = z;
    }

    /* renamed from: a */
    public String mo14315a() {
        return this.f3409a;
    }

    /* renamed from: b */
    public String mo14316b() {
        return this.f3410b;
    }

    /* renamed from: c */
    public Map<String, String> mo14317c() {
        return this.f3411c;
    }

    /* renamed from: d */
    public boolean mo14318d() {
        return this.f3412d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f3409a + '\'' + ", backupUrl='" + this.f3410b + '\'' + ", headers='" + this.f3411c + '\'' + ", shouldFireInWebView='" + this.f3412d + '\'' + '}';
    }
}
