package com.iab.omid.library.mmadbridge.p263d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.d.a */
public final class C7941a {
    /* renamed from: a */
    public static String m22437a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22438b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22439c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22440d() {
        JSONObject jSONObject = new JSONObject();
        C7942b.m22448a(jSONObject, "deviceType", m22437a());
        C7942b.m22448a(jSONObject, "osVersion", m22438b());
        C7942b.m22448a(jSONObject, "os", m22439c());
        return jSONObject;
    }
}
