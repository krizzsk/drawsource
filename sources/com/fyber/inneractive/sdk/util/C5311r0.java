package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C4215e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.fyber.inneractive.sdk.util.r0 */
public class C5311r0 {
    /* renamed from: a */
    public static boolean m16529a(String str) {
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(AppMeasurement.CRASH_ORIGIN);
    }
}
