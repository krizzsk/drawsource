package com.ogury.p377ed.internal;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dt */
public final class C9965dt {
    /* renamed from: a */
    public static boolean m28763a(JSONObject jSONObject) {
        C10263mq.m29882b(jSONObject, "requestBody");
        return m28762a() && C10050ge.m29189a(jSONObject);
    }

    /* renamed from: a */
    private static boolean m28762a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }
}
