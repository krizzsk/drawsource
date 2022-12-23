package com.iab.omid.library.vungle.p275d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.a */
public final class C8055a {
    /* renamed from: a */
    public static String m22991a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22992b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22993c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m22994d() {
        JSONObject jSONObject = new JSONObject();
        C8056b.m23001a(jSONObject, "deviceType", m22991a());
        C8056b.m23001a(jSONObject, "osVersion", m22992b());
        C8056b.m23001a(jSONObject, "os", m22993c());
        return jSONObject;
    }
}
