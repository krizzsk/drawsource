package com.bytedance.sdk.openadsdk.p178l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.l.i */
/* compiled from: InitChecker */
public class C3880i {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12664a() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r1 = com.bytedance.sdk.component.utils.C2905l.m8116c()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r1 = m12663a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current process name："
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r1)
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r6 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch:{ all -> 0x009b }
            java.lang.String[] r0 = r0.requestedPermissions     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0095
            int r1 = r0.length     // Catch:{ all -> 0x009b }
            if (r1 <= 0) goto L_0x0095
            java.util.List r1 = m12665b()     // Catch:{ all -> 0x009b }
            int r4 = r0.length     // Catch:{ all -> 0x009b }
            r7 = r5
        L_0x0050:
            if (r7 >= r4) goto L_0x005c
            r8 = r0[r7]     // Catch:{ all -> 0x009b }
            if (r8 == 0) goto L_0x0059
            r1.remove(r8)     // Catch:{ all -> 0x009b }
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0050
        L_0x005c:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a3
        L_0x0068:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x009b }
        L_0x006c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r4.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r6 = "    May be missing permissions："
            r4.append(r6)     // Catch:{ all -> 0x0093 }
            r4.append(r1)     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0093 }
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r1)     // Catch:{ all -> 0x0093 }
            r6 = r5
            goto L_0x006c
        L_0x0093:
            r0 = move-exception
            goto L_0x009d
        L_0x0095:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a3
        L_0x009b:
            r0 = move-exception
            r5 = r6
        L_0x009d:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.C2905l.m8115c(r2, r1, r0)
            r6 = r5
        L_0x00a3:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d2 }
            r1 = 23
            if (r0 < r1) goto L_0x00ab
            if (r3 >= r1) goto L_0x00d8
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r0.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r0.append(r4)     // Catch:{ all -> 0x00d2 }
            r0.append(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "&phone="
            r0.append(r3)     // Catch:{ all -> 0x00d2 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d2 }
            r0.append(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = ", require="
            r0.append(r3)     // Catch:{ all -> 0x00d2 }
            r0.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d2 }
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.C2905l.m8115c(r2, r1, r0)
        L_0x00d8:
            if (r6 != 0) goto L_0x00df
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r0)
        L_0x00df:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.C2905l.m8118e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3880i.m12664a():void");
    }

    /* renamed from: a */
    private static String m12663a(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "unknown";
            }
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    private static List<String> m12665b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
