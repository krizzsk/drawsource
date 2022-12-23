package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C6393h;

/* renamed from: com.ironsource.sdk.utils.a */
public final class C8341a {

    /* renamed from: g */
    private static C8341a f20322g;

    /* renamed from: a */
    public String f20323a = C6393h.m19115h();

    /* renamed from: b */
    public String f20324b = C6393h.m19113g();

    /* renamed from: c */
    public String f20325c = C6393h.m19117i();

    /* renamed from: d */
    public String f20326d = C6393h.m19109e();

    /* renamed from: e */
    public int f20327e = C6393h.m19111f();

    /* renamed from: f */
    public String f20328f;

    private C8341a(Context context) {
        this.f20328f = C6393h.m19118i(context);
    }

    /* renamed from: a */
    public static C8341a m23755a(Context context) {
        if (f20322g == null) {
            f20322g = new C8341a(context);
        }
        return f20322g;
    }

    /* renamed from: a */
    public static void m23756a() {
        f20322g = null;
    }

    /* renamed from: b */
    public static float m23757b(Context context) {
        return C6393h.m19123l(context);
    }
}
