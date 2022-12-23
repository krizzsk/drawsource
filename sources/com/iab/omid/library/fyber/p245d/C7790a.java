package com.iab.omid.library.fyber.p245d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.d.a */
public final class C7790a {
    /* renamed from: a */
    public static String m21762a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21763b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21764c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21765d() {
        JSONObject jSONObject = new JSONObject();
        C7791b.m21773a(jSONObject, "deviceType", m21762a());
        C7791b.m21773a(jSONObject, "osVersion", m21763b());
        C7791b.m21773a(jSONObject, "os", m21764c());
        return jSONObject;
    }
}
