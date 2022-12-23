package com.applovin.impl.mediation.debugger.p037b.p039b;

import android.content.Context;
import com.applovin.impl.sdk.utils.C2049g;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.d */
public class C1675d {

    /* renamed from: a */
    private final String f2424a;

    /* renamed from: b */
    private final String f2425b;

    /* renamed from: c */
    private final boolean f2426c;

    C1675d(String str, String str2, Context context) {
        this.f2424a = str.replace("android.permission.", "");
        this.f2425b = str2;
        this.f2426c = C2049g.m4939a(str, context);
    }

    /* renamed from: a */
    public String mo13685a() {
        return this.f2424a;
    }

    /* renamed from: b */
    public String mo13686b() {
        return this.f2425b;
    }

    /* renamed from: c */
    public boolean mo13687c() {
        return this.f2426c;
    }
}
