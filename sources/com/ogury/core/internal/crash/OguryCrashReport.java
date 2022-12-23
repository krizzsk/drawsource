package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C9717ai;

/* compiled from: OguryCrashReport.kt */
public final class OguryCrashReport {
    public static final int LOG_LEVEL_CRASH_REPORT = 1;
    public static final int LOG_LEVEL_TWO = 2;

    /* renamed from: a */
    private static final C9753h f24615a = new C9753h();

    /* renamed from: b */
    private static C9752g f24616b;

    /* renamed from: c */
    private static OguryCrashReport f24617c = new OguryCrashReport();

    private OguryCrashReport() {
    }

    public static final synchronized void start(String str, Context context, SdkInfo sdkInfo, CrashConfig crashConfig) {
        synchronized (OguryCrashReport.class) {
            C9717ai.m28145b(str, "sdkKey");
            C9717ai.m28145b(context, "context");
            C9717ai.m28145b(sdkInfo, "sdkInfo");
            C9717ai.m28145b(crashConfig, "crashConfig");
            m28168a(context, sdkInfo);
            C9752g gVar = f24616b;
            if (gVar != null) {
                gVar.mo64108a(str, crashConfig);
            }
        }
    }

    /* renamed from: a */
    private static void m28168a(Context context, SdkInfo sdkInfo) {
        if (f24616b == null) {
            f24616b = C9753h.m28206a(context, sdkInfo);
        }
    }

    public static final void uploadLevelTwoCrashes(String str) {
        C9717ai.m28145b(str, "sdkKey");
        C9752g gVar = f24616b;
        if (gVar != null) {
            gVar.mo64107a(str);
        }
    }

    public static final synchronized void stop(String str, Context context, SdkInfo sdkInfo) {
        synchronized (OguryCrashReport.class) {
            C9717ai.m28145b(str, "sdkKey");
            C9717ai.m28145b(context, "context");
            C9717ai.m28145b(sdkInfo, "sdkInfo");
            m28168a(context, sdkInfo);
            C9752g gVar = f24616b;
            if (gVar != null) {
                gVar.mo64110b(str);
            }
        }
    }

    public static final void logException(String str, Throwable th) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(th, "throwable");
        C9752g gVar = f24616b;
        if (gVar != null) {
            gVar.mo64111b(str, th);
        }
    }

    public static final void logLevelTwoException(String str, Throwable th) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(th, "throwable");
        C9752g gVar = f24616b;
        if (gVar != null) {
            gVar.mo64109a(str, th);
        }
    }
}
