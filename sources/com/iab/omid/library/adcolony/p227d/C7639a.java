package com.iab.omid.library.adcolony.p227d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
public final class C7639a {
    /* renamed from: a */
    public static String m21072a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21073b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21074c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21075d() {
        JSONObject jSONObject = new JSONObject();
        C7640b.m21083a(jSONObject, "deviceType", m21072a());
        C7640b.m21083a(jSONObject, "osVersion", m21073b());
        C7640b.m21083a(jSONObject, "os", m21074c());
        return jSONObject;
    }
}
