package com.iab.omid.library.ironsrc.p257d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.a */
public final class C7891a {
    /* renamed from: a */
    public static String m22211a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22212b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22213c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22214d() {
        JSONObject jSONObject = new JSONObject();
        C7892b.m22221a(jSONObject, "deviceType", m22211a());
        C7892b.m22221a(jSONObject, "osVersion", m22212b());
        C7892b.m22221a(jSONObject, "os", m22213c());
        return jSONObject;
    }
}
