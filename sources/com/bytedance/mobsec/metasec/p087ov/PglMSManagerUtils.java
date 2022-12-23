package com.bytedance.mobsec.metasec.p087ov;

import android.content.Context;
import p405ms.p406bd.p407o.Pgl.C12619l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManagerUtils */
public final class PglMSManagerUtils {
    private PglMSManagerUtils() {
    }

    public static synchronized PglMSManager get(String str) {
        PglMSManager pglMSManager;
        synchronized (PglMSManagerUtils.class) {
            C12619l0.pgla a = C12619l0.m33417a(str);
            pglMSManager = a != null ? new PglMSManager(a) : null;
        }
        return pglMSManager;
    }

    public static synchronized boolean init(Context context, PglMSConfig pglMSConfig) {
        boolean a;
        synchronized (PglMSManagerUtils.class) {
            a = C12619l0.m33418a(context, pglMSConfig.mo16431a(), "Pglmetasec_ov", "ms_sensor_ov");
        }
        return a;
    }

    public static String versionInfo() {
        return C12619l0.m33416a();
    }
}
