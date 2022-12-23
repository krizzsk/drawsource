package com.ogury.core.internal;

import android.util.Log;

/* compiled from: OguryIntegrationLogger.kt */
public final class OguryIntegrationLogger {
    public static final OguryIntegrationLogger INSTANCE = new OguryIntegrationLogger();
    private static final String TAG = "OGURY";
    private static int level = 4;

    public static /* synthetic */ void getLevel$annotations() {
    }

    private OguryIntegrationLogger() {
    }

    public static final int getLevel() {
        return level;
    }

    public static final void setLevel(int i) {
        level = i;
    }

    /* renamed from: d */
    public static final void m28105d(String str) {
        C9717ai.m28145b(str, "message");
        INSTANCE.print(3, str);
    }

    /* renamed from: i */
    public static final void m28108i(String str) {
        C9717ai.m28145b(str, "message");
        INSTANCE.print(4, str);
    }

    /* renamed from: i */
    public static final void m28109i(Throwable th) {
        C9717ai.m28145b(th, "throwable");
        OguryIntegrationLogger oguryIntegrationLogger = INSTANCE;
        oguryIntegrationLogger.print(4, "error\n" + Log.getStackTraceString(th));
    }

    /* renamed from: e */
    public static final void m28106e(String str) {
        C9717ai.m28145b(str, "message");
        INSTANCE.print(6, str);
    }

    /* renamed from: e */
    public static final void m28107e(Throwable th) {
        C9717ai.m28145b(th, "throwable");
        OguryIntegrationLogger oguryIntegrationLogger = INSTANCE;
        oguryIntegrationLogger.print(4, th.getMessage() + "\n" + Log.getStackTraceString(th));
    }

    private final void print(int i, String str) {
        if (i >= level) {
            Log.println(i, TAG, str);
        }
    }
}
