package com.tapjoy.internal;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.y */
public final class C11691y {
    @Nullable
    /* renamed from: a */
    public static String m32063a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m32064b(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static long m32065c(PackageManager packageManager, String str) {
        if (Build.VERSION.SDK_INT >= 9) {
            try {
                long j = packageManager.getPackageInfo(str, 0).firstInstallTime;
                if (j > 0) {
                    return j;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static String m32066d(PackageManager packageManager, String str) {
        try {
            return C11534gs.m31572b(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public static Signature[] m32067e(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
