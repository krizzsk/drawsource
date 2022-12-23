package com.tapjoy.internal;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dn */
public final class C11364dn {
    /* renamed from: a */
    public static JSONObject m31077a() {
        JSONObject jSONObject = new JSONObject();
        C11365do.m31083a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C11365do.m31083a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C11365do.m31083a(jSONObject, "os", APSAnalytics.OS_NAME);
        return jSONObject;
    }
}
