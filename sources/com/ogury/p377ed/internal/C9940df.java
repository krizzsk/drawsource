package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.df */
public final class C9940df {

    /* renamed from: a */
    public static final C9940df f25008a = new C9940df();

    private C9940df() {
    }

    /* renamed from: a */
    public static void m28705a(Context context) {
        C10263mq.m29882b(context, "context");
        if (!m28708b(context)) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Checking permissions...");
            if (!C10053gh.m29193a(context, "android.permission.INTERNET")) {
                OguryIntegrationLogger.m28106e("[Ads][setup] No Internet permission");
            } else {
                OguryIntegrationLogger.m28105d("[Ads][setup] Permissions checked");
            }
            m28709c(context);
        }
    }

    /* renamed from: b */
    private static boolean m28708b(Context context) {
        return (context.getApplicationInfo().flags & 2) == 0;
    }

    /* renamed from: c */
    private static void m28709c(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        OguryIntegrationLogger.m28105d("[Ads][setup] Checking components...");
        C10263mq.m29879a((Object) packageInfo, "activitiesInfo");
        m28706a(packageInfo);
        OguryIntegrationLogger.m28105d("[Ads][setup] Components checked");
    }

    /* renamed from: a */
    private static void m28706a(PackageInfo packageInfo) {
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            m28707a(activityInfoArr, "io.presage.interstitial.ui.InterstitialActivity");
            m28707a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8TransparentActivity");
            m28707a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8RotableActivity");
        }
    }

    /* renamed from: a */
    private static void m28707a(ActivityInfo[] activityInfoArr, String str) {
        int length = activityInfoArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (C10263mq.m29881a((Object) activityInfoArr[i].name, (Object) str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            OguryIntegrationLogger.m28106e(C10263mq.m29874a("[Ads][setup] Missing activity: ", (Object) str));
        }
    }
}
