package com.ogury.p377ed.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;

/* renamed from: com.ogury.ed.internal.gj */
public final class C10055gj {
    /* renamed from: a */
    public static final boolean m29198a(Context context) {
        C10263mq.m29882b(context, "<this>");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            String b = m29199b(context);
            String str = packageInfo.applicationInfo.processName;
            if (b == null) {
                return true;
            }
            return C10263mq.m29881a((Object) b, (Object) str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: b */
    private static final String m29199b(Context context) {
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
