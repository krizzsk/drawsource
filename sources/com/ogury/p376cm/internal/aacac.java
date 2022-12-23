package com.ogury.p376cm.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.cm.internal.aacac */
public final class aacac {

    /* renamed from: a */
    public static final aacac f24275a = new aacac();

    /* renamed from: b */
    private static final Bundle f24276b = new Bundle();

    private aacac() {
    }

    /* renamed from: a */
    public static Boolean m27778a(String str) {
        bbabc.m28052b(str, SDKConstants.PARAM_KEY);
        bbabc.m28052b(str, "configurationKey");
        if (f24276b.containsKey(str)) {
            return Boolean.valueOf(f24276b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: a */
    public static void m27779a(String str, Boolean bool) {
        bbabc.m28052b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f24276b.putBoolean(str, bool.booleanValue());
            return;
        }
        bbabc.m28052b(str, "configurationKey");
        f24276b.remove(str);
    }
}
