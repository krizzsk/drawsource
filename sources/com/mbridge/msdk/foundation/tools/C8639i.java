package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.tools.i */
/* compiled from: DynamicViewResourceManager */
public final class C8639i {

    /* renamed from: a */
    static final List<String> f21156a;

    /* renamed from: com.mbridge.msdk.foundation.tools.i$a */
    /* compiled from: DynamicViewResourceManager */
    public interface C8642a {
        /* renamed from: a */
        void mo58125a(String str, DownloadError downloadError);

        /* renamed from: a */
        void mo58126a(String str, String str2, String str3);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f21156a = arrayList;
        if (arrayList != null) {
            arrayList.add("mbridge_splash_native_template_v_v1.xml");
            f21156a.add("mbridge_splash_native_template_h_v1.xml");
        }
    }

    /* renamed from: b */
    private static String m24754b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(substring)) {
                return "";
            }
            String replace = substring.replace(".zip", "");
            if (f21156a == null || f21156a.contains(replace)) {
                return "";
            }
            return replace;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080 A[SYNTHETIC, Splitter:B:36:0x0080] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24752a(int r14, java.lang.String r15, java.lang.String r16, com.mbridge.msdk.foundation.tools.C8639i.C8642a r17) {
        /*
            r0 = r16
            r7 = r17
            java.lang.String r1 = ""
            boolean r2 = android.text.TextUtils.isEmpty(r16)
            if (r2 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r2 = m24753b(r14, r15, r16)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            com.mbridge.msdk.foundation.same.b.c r3 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_XML
            java.lang.String r8 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r3)
            r3 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0026 }
            if (r4 != 0) goto L_0x0026
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0026 }
            r4.<init>(r8, r2)     // Catch:{ Exception -> 0x0026 }
            r3 = r4
        L_0x0026:
            if (r3 == 0) goto L_0x002e
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x004e
        L_0x002e:
            java.lang.String r3 = ".xml"
            java.lang.String r3 = r2.replace(r3, r1)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = java.io.File.separator
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r2)
            r3 = r4
        L_0x004e:
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0061 }
            if (r4 == 0) goto L_0x0061
            boolean r4 = r3.isFile()     // Catch:{ Exception -> 0x0061 }
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r9 = "DynamicViewResourceManager"
            if (r4 != 0) goto L_0x0080
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0080
            if (r7 == 0) goto L_0x007f
            r7.mo58126a(r0, r3, r2)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007f
        L_0x0076:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r9, r0)
        L_0x007f:
            return
        L_0x0080:
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00e8 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x00e8 }
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch:{ Exception -> 0x00e8 }
            r10 = 1
            int r3 = r3 + r10
            java.lang.String r11 = r2.substring(r3)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = ".zip"
            java.lang.String r12 = r11.replace(r2, r1)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.DownloadMessage r13 = new com.mbridge.msdk.foundation.download.DownloadMessage     // Catch:{ Exception -> 0x00e8 }
            java.lang.Object r2 = new java.lang.Object     // Catch:{ Exception -> 0x00e8 }
            r2.<init>()     // Catch:{ Exception -> 0x00e8 }
            r5 = 100
            com.mbridge.msdk.foundation.download.DownloadResourceType r6 = com.mbridge.msdk.foundation.download.DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER     // Catch:{ Exception -> 0x00e8 }
            r1 = r13
            r3 = r16
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.MBDownloadManager r1 = com.mbridge.msdk.foundation.download.MBDownloadManager.getInstance()     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r1 = r1.download(r13)     // Catch:{ Exception -> 0x00e8 }
            r2 = 30000(0x7530, double:1.4822E-319)
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r1 = r1.withReadTimeout((long) r2)     // Catch:{ Exception -> 0x00e8 }
            r2 = 20000(0x4e20, double:9.8813E-320)
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r1 = r1.withConnectTimeout((long) r2)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.DownloadPriority r2 = com.mbridge.msdk.foundation.download.DownloadPriority.MEDIUM     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r1 = r1.withDownloadPriority(r2)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r1 = r1.withHttpRetryCounter(r10)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r10 = r1.withDirectoryPathInternal(r8)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.tools.i$1 r13 = new com.mbridge.msdk.foundation.tools.i$1     // Catch:{ Exception -> 0x00e8 }
            r1 = r13
            r2 = r8
            r3 = r11
            r4 = r17
            r5 = r16
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r0 = r10.withDownloadStateListener(r13)     // Catch:{ Exception -> 0x00e8 }
            com.mbridge.msdk.foundation.download.core.DownloadRequest r0 = r0.build()     // Catch:{ Exception -> 0x00e8 }
            r0.start()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00f0
        L_0x00e8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r9, r0)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8639i.m24752a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.i$a):void");
    }

    /* renamed from: a */
    public static String m24750a(int i, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = m24753b(i, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        File file = null;
        String b = C8478e.m24306b(C8476c.MBRIDGE_700_XML);
        try {
            if (!TextUtils.isEmpty(str3)) {
                file = new File(b, str3);
            }
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            String replace = str3.replace(".xml", "");
            file = new File(b + File.separator + replace, str3);
        }
        if (file != null) {
            return file.getPath();
        }
        return "";
    }

    /* renamed from: b */
    private static String m24753b(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String path = new URL(str2).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            if (!TextUtils.isEmpty(substring)) {
                return substring.replace(".zip", "");
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[SYNTHETIC, Splitter:B:16:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24751a(java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            android.net.Uri r0 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "natmp"
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ all -> 0x0022 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "1"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.lang.String r0 = m24754b(r11)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x002f
            return r1
        L_0x002f:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.same.b.c r3 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_XML     // Catch:{ Exception -> 0x00a9 }
            java.io.File r3 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24303a((com.mbridge.msdk.foundation.same.p301b.C8476c) r3)     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = r2.isFile()     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x004b
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r11 = r2.getPath()     // Catch:{ Exception -> 0x00a9 }
            return r11
        L_0x004b:
            com.mbridge.msdk.foundation.same.b.c r0 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_XML     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r0)     // Catch:{ Exception -> 0x00a9 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x00a9 }
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch:{ Exception -> 0x00a9 }
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r2 = r2.substring(r3)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.DownloadMessage r3 = new com.mbridge.msdk.foundation.download.DownloadMessage     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r6 = new java.lang.Object     // Catch:{ Exception -> 0x00a9 }
            r6.<init>()     // Catch:{ Exception -> 0x00a9 }
            r9 = 100
            com.mbridge.msdk.foundation.download.DownloadResourceType r10 = com.mbridge.msdk.foundation.download.DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER     // Catch:{ Exception -> 0x00a9 }
            r5 = r3
            r7 = r11
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.MBDownloadManager r11 = com.mbridge.msdk.foundation.download.MBDownloadManager.getInstance()     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r11 = r11.download(r3)     // Catch:{ Exception -> 0x00a9 }
            r5 = 30000(0x7530, double:1.4822E-319)
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r11 = r11.withReadTimeout((long) r5)     // Catch:{ Exception -> 0x00a9 }
            r5 = 20000(0x4e20, double:9.8813E-320)
            com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder r11 = r11.withConnectTimeout((long) r5)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.DownloadPriority r3 = com.mbridge.msdk.foundation.download.DownloadPriority.MEDIUM     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r11 = r11.withDownloadPriority(r3)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r11 = r11.withHttpRetryCounter(r4)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r11 = r11.withDirectoryPathInternal(r0)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.tools.i$2 r3 = new com.mbridge.msdk.foundation.tools.i$2     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r0, r2)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.RequestBuilder r11 = r11.withDownloadStateListener(r3)     // Catch:{ Exception -> 0x00a9 }
            com.mbridge.msdk.foundation.download.core.DownloadRequest r11 = r11.build()     // Catch:{ Exception -> 0x00a9 }
            r11.start()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8639i.m24751a(java.lang.String):java.lang.String");
    }
}
