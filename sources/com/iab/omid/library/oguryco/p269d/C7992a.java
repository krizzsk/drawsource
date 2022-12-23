package com.iab.omid.library.oguryco.p269d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.a */
public final class C7992a {
    /* renamed from: a */
    public static String m22670a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22671b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22672c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22673d() {
        JSONObject jSONObject = new JSONObject();
        C7993b.m22680a(jSONObject, "deviceType", m22670a());
        C7993b.m22680a(jSONObject, "osVersion", m22671b());
        C7993b.m22680a(jSONObject, "os", m22672c());
        return jSONObject;
    }
}
