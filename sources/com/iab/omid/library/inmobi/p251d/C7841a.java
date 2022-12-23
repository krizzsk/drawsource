package com.iab.omid.library.inmobi.p251d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.a */
public final class C7841a {
    /* renamed from: a */
    public static String m21990a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21991b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21992c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21993d() {
        JSONObject jSONObject = new JSONObject();
        C7842b.m22000a(jSONObject, "deviceType", m21990a());
        C7842b.m22000a(jSONObject, "osVersion", m21991b());
        C7842b.m22000a(jSONObject, "os", m21992c());
        return jSONObject;
    }
}
