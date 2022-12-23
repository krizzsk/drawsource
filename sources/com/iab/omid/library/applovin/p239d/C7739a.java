package com.iab.omid.library.applovin.p239d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.a */
public final class C7739a {
    /* renamed from: a */
    public static String m21532a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m21533b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m21534c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m21535d() {
        JSONObject jSONObject = new JSONObject();
        C7740b.m21543a(jSONObject, "deviceType", m21532a());
        C7740b.m21543a(jSONObject, "osVersion", m21533b());
        C7740b.m21543a(jSONObject, "os", m21534c());
        return jSONObject;
    }
}
