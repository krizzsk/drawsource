package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.ix */
public final class C10144ix {

    /* renamed from: a */
    private final String f25475a;

    /* renamed from: b */
    private final String f25476b;

    /* renamed from: c */
    private final String f25477c;

    /* renamed from: d */
    private final String f25478d;

    public C10144ix(String str, String str2, String str3, String str4) {
        C10263mq.m29882b(str, "identifier");
        C10263mq.m29882b(str2, "name");
        C10263mq.m29882b(str3, "iconUrl");
        C10263mq.m29882b(str4, "argsJson");
        this.f25475a = str;
        this.f25476b = str2;
        this.f25477c = str3;
        this.f25478d = str4;
    }

    /* renamed from: a */
    public final String mo64939a() {
        return this.f25475a;
    }

    /* renamed from: b */
    public final String mo64940b() {
        return this.f25476b;
    }

    /* renamed from: c */
    public final String mo64941c() {
        return this.f25477c;
    }

    /* renamed from: d */
    public final String mo64942d() {
        return this.f25478d;
    }

    /* renamed from: e */
    public final boolean mo64943e() {
        if (!(this.f25478d.length() == 0)) {
            if (!(this.f25475a.length() == 0)) {
                return this.f25477c.length() == 0;
            }
        }
    }
}
