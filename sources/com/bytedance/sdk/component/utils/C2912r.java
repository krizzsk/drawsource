package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.utils.r */
/* compiled from: ProcessUtil */
public class C2912r {

    /* renamed from: a */
    private static String f6523a;

    /* renamed from: a */
    public static boolean m8145a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), m8147b(context));
    }

    /* renamed from: b */
    public static String m8147b(Context context) {
        if (!TextUtils.isEmpty(f6523a)) {
            return f6523a;
        }
        String a = m8144a();
        f6523a = a;
        if (!TextUtils.isEmpty(a)) {
            return f6523a;
        }
        String b = m8146b();
        f6523a = b;
        if (!TextUtils.isEmpty(b)) {
            return f6523a;
        }
        String c = m8148c(context);
        f6523a = c;
        return c;
    }

    /* renamed from: a */
    private static String m8144a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static String m8146b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static String m8148c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }
}
