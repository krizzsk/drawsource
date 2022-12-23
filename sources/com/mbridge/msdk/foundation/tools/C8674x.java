package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p301b.C8475b;
import com.mbridge.msdk.foundation.same.p301b.C8477d;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.UUID;

/* renamed from: com.mbridge.msdk.foundation.tools.x */
/* compiled from: SameSDCardTool */
public final class C8674x {

    /* renamed from: a */
    static boolean f21245a = false;

    /* renamed from: b */
    static String f21246b = "";

    /* renamed from: c */
    public static char[] f21247c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: d */
    private static boolean f21248d = false;

    /* renamed from: e */
    private static int f21249e = -1;

    /* renamed from: f */
    private static int f21250f = -1;

    /* renamed from: g */
    private static int f21251g = -1;

    /* renamed from: h */
    private static int f21252h = -1;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24886a(android.content.Context r2) {
        /*
            boolean r0 = f21248d
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r0.<init>()     // Catch:{ Exception -> 0x0026 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0026 }
            f21246b = r0     // Catch:{ Exception -> 0x0026 }
            r0 = 0
            f21245a = r0     // Catch:{ Exception -> 0x0026 }
            m24888b(r2)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0044
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044 }
            r0.<init>()     // Catch:{ Exception -> 0x0044 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0044 }
            f21246b = r0     // Catch:{ Exception -> 0x0044 }
            m24888b(r2)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r2 = 1
            f21248d = r2
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8674x.m24886a(android.content.Context):void");
    }

    /* renamed from: b */
    private static void m24888b(Context context) {
        C8478e.m24304a((C8475b) new C8477d(m24889c(context)));
        C8478e.m24302a().mo57879b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if ((m24891d() > 31457280) == false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m24889c(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 18
            if (r0 < r2) goto L_0x001a
            java.io.File r0 = r6.getExternalFilesDir(r1)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x001a
            java.io.File r0 = m24885a((java.io.File) r0)     // Catch:{ all -> 0x0012 }
            goto L_0x001b
        L_0x0012:
            r0 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r2, r3, r0)
        L_0x001a:
            r0 = r1
        L_0x001b:
            boolean r2 = f21245a
            if (r2 == 0) goto L_0x006f
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "Android"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "data"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r0 = m24885a((java.io.File) r2)
        L_0x005e:
            long r2 = m24891d()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r0
        L_0x0070:
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0080
        L_0x0078:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r1 = r6.getAbsoluteFile()
        L_0x0080:
            java.lang.String r6 = r1.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8674x.m24889c(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static File m24885a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    /* renamed from: c */
    private static boolean m24890c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            C8672v.m24878d("", "hasSDCard is failed");
            return false;
        }
    }

    /* renamed from: a */
    public static int m24884a() {
        try {
            Context g = C8388a.m23845e().mo56913g();
            long longValue = ((Long) C8614ab.m24713b(g, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f21250f == -1) {
                f21250f = Long.valueOf((m24891d() / 1000) / 1000).intValue();
                C8614ab.m24712a(g, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            C8672v.m24875a("SameSDCardTool", th.getMessage(), th);
        }
        return f21250f;
    }

    /* renamed from: d */
    private static long m24891d() {
        if (m24890c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m24887b() {
        if (f21249e == -1) {
            try {
                f21249e = new Long((m24892e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                C8672v.m24875a("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f21249e;
    }

    /* renamed from: e */
    private static long m24892e() {
        if (m24890c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
