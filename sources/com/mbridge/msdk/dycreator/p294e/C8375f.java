package com.mbridge.msdk.dycreator.p294e;

import android.util.Log;

/* renamed from: com.mbridge.msdk.dycreator.e.f */
/* compiled from: Logger */
public final class C8375f {

    /* renamed from: a */
    public static boolean f20438a = false;

    /* renamed from: a */
    public static void m23831a(String str) {
        if (f20438a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
