package com.iab.omid.library.amazon.p233d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.d.a */
public final class C7689a {
    /* renamed from: a */
    public static String m21302a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21303b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21304c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21305d() {
        JSONObject jSONObject = new JSONObject();
        C7690b.m21313a(jSONObject, "deviceType", m21302a());
        C7690b.m21313a(jSONObject, "osVersion", m21303b());
        C7690b.m21313a(jSONObject, "os", m21304c());
        return jSONObject;
    }
}
