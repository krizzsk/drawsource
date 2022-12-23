package com.ogury.p377ed.internal;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* renamed from: com.ogury.ed.internal.fu */
public final class C10036fu {
    /* renamed from: a */
    public static boolean m29152a(Context context) {
        C10263mq.m29882b(context, "context");
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && C10263mq.m29881a((Object) next.processName, (Object) packageName)) {
                    return false;
                }
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
