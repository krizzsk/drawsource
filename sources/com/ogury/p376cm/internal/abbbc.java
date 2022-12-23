package com.ogury.p376cm.internal;

import android.util.Log;

/* renamed from: com.ogury.cm.internal.abbbc */
public final class abbbc {

    /* renamed from: a */
    public static final abbbc f24336a = new abbbc();

    private abbbc() {
    }

    /* renamed from: a */
    public static void m27854a(String str) {
        bbabc.m28052b(str, "message");
        Log.e("consent_sdk", str);
    }

    /* renamed from: a */
    public static void m27855a(String str, Throwable th) {
        bbabc.m28052b(str, "message");
        bbabc.m28052b(th, "error");
        Log.e("consent_sdk", str, th);
    }

    /* renamed from: a */
    public static void m27856a(Throwable th) {
        bbabc.m28052b(th, "error");
        Log.e("consent_sdk", "caught_error", th);
    }

    /* renamed from: b */
    public static void m27857b(String str) {
        bbabc.m28052b(str, "message");
        Log.d("consent_sdk", str);
    }
}
