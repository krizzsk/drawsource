package com.apm.insight.p025k;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.C1250h;
import com.apm.insight.Npth;
import com.apm.insight.p026l.C1310k;
import com.apm.insight.p026l.C1321q;
import com.facebook.share.internal.ShareInternalUtility;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.e */
public class C1280e {

    /* renamed from: a */
    public static boolean f1261a = false;

    /* renamed from: b */
    private static C1288h f1262b;

    /* renamed from: com.apm.insight.k.e$a */
    public enum C1281a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: d */
        final int f1267d;

        private C1281a(int i) {
            this.f1267d = i;
        }
    }

    /* renamed from: com.apm.insight.k.e$b */
    public enum C1282b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: l */
        final int f1280l;

        private C1282b(int i) {
            this.f1280l = i;
        }
    }

    /* renamed from: a */
    public static C1293l m1711a(long j, String str, byte[] bArr, C1281a aVar, String str2, boolean z) {
        StringBuilder sb;
        String str3;
        if (Npth.isStopUpload()) {
            return new C1293l(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        }
        if (str == null) {
            return new C1293l(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str4 = null;
        if (C1281a.GZIP == aVar && length > 128) {
            bArr = m1727b(bArr);
            str4 = "gzip";
        } else if (C1281a.DEFLATER == aVar && length > 128) {
            bArr = m1722a(bArr);
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new C1293l(ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR);
        }
        if (!z) {
            return m1715a(str, bArr2, str2, str5, ShareTarget.METHOD_POST, true, false);
        }
        byte[] a = C1250h.m1617i().getEncryptImpl().mo12444a(bArr2);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                str3 = "?";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a;
            } else {
                str3 = "&";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a;
            }
            sb.append(str);
            sb.append(str3);
            str = sb.toString();
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a;
        }
        return m1715a(str, bArr2, str2, str5, ShareTarget.METHOD_POST, true, true);
    }

    /* renamed from: a */
    public static C1293l m1712a(String str, String str2) {
        return m1713a(str, str2, m1726b());
    }

    /* renamed from: a */
    public static C1293l m1713a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return m1711a(2097152, str, str2.getBytes(), C1281a.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new C1293l(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        } catch (Throwable th) {
            C1321q.m1934b(th);
            return new C1293l(207, th);
        }
    }

    /* renamed from: a */
    public static C1293l m1714a(String str, String str2, File... fileArr) {
        return m1724b(str, str2, fileArr);
    }

    /* renamed from: a */
    private static C1293l m1715a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return m1725b(str, bArr, str2, str3, str4, z, z2);
    }

    /* renamed from: a */
    private static String m1716a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m1732d(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m1732d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m1717a(C1288h hVar) {
        f1262b = hVar;
    }

    /* renamed from: a */
    public static boolean m1718a() {
        return true;
    }

    /* renamed from: a */
    public static boolean m1719a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            C1290j jVar = new C1290j(str, "UTF-8", false);
            jVar.mo12570a("aid", str2);
            jVar.mo12570a("device_id", str3);
            jVar.mo12570a("os", APSAnalytics.OS_NAME);
            jVar.mo12570a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    jVar.mo12569a(file2.getName(), file2, (Map<String, String>) hashMap);
                }
            }
            try {
                return new JSONObject(jVar.mo12568a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m1720a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C1310k.m1852a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m1721a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return m1711a(2097152, m1716a(str, (Map) map), bArr, C1281a.GZIP, "application/json; charset=utf-8", false).mo12575b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m1722a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static C1293l m1723b(String str, String str2) {
        return m1713a(str, str2, m1718a());
    }

    /* renamed from: b */
    public static C1293l m1724b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new C1293l(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        }
        try {
            C1290j jVar = new C1290j(m1730c(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            jVar.mo12571a("json", str2, true);
            jVar.mo12572a(ShareInternalUtility.STAGING_PARAM, fileArr);
            try {
                return new C1293l(0, new JSONObject(jVar.mo12568a()));
            } catch (JSONException e) {
                return new C1293l(0, (Throwable) e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new C1293l(207);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:4|5)|6|7|(3:9|10|11)(1:12)|(1:14)|(1:16)|17|(4:19|(6:23|24|25|26|27|28)|35|(8:37|38|39|(6:41|42|43|44|45|46)(1:52)|53|(2:55|56)|57|59)(5:62|63|(2:65|66)|67|69))(3:70|71|72)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC, Splitter:B:70:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d8 A[SYNTHETIC, Splitter:B:80:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apm.insight.p025k.C1293l m1725b(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.lang.String r9 = "gzip"
            r0 = 0
            com.apm.insight.k.h r1 = f1262b     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x000d
            com.apm.insight.k.h r1 = f1262b     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r1.mo12566a(r3, r4)     // Catch:{ all -> 0x000d }
        L_0x000d:
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00ca }
            r1.<init>(r3)     // Catch:{ all -> 0x00ca }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x00ca }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x001f
            r8 = 1
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x0023
        L_0x001f:
            r8 = 0
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
        L_0x0023:
            if (r5 == 0) goto L_0x002a
            java.lang.String r8 = "Content-Type"
            r3.setRequestProperty(r8, r5)     // Catch:{ all -> 0x00c5 }
        L_0x002a:
            if (r6 == 0) goto L_0x0031
            java.lang.String r5 = "Content-Encoding"
            r3.setRequestProperty(r5, r6)     // Catch:{ all -> 0x00c5 }
        L_0x0031:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r9)     // Catch:{ all -> 0x00c5 }
            if (r7 == 0) goto L_0x00bd
            r3.setRequestMethod(r7)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x005b
            int r5 = r4.length     // Catch:{ all -> 0x00c5 }
            if (r5 <= 0) goto L_0x005b
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ all -> 0x0055 }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ all -> 0x0055 }
            r5.<init>(r6)     // Catch:{ all -> 0x0055 }
            r5.write(r4)     // Catch:{ all -> 0x0053 }
            r5.flush()     // Catch:{ all -> 0x0053 }
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x005b
        L_0x0053:
            r4 = move-exception
            goto L_0x0057
        L_0x0055:
            r4 = move-exception
            r5 = r0
        L_0x0057:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x005b:
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x00c5 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x009c
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ all -> 0x0097 }
            boolean r5 = r9.equalsIgnoreCase(r5)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0086
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0081 }
            r5.<init>(r4)     // Catch:{ all -> 0x0081 }
            byte[] r6 = m1720a((java.io.InputStream) r5)     // Catch:{ all -> 0x007e }
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r5)     // Catch:{ all -> 0x0097 }
            goto L_0x008a
        L_0x007e:
            r6 = move-exception
            r0 = r5
            goto L_0x0082
        L_0x0081:
            r6 = move-exception
        L_0x0082:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x0086:
            byte[] r6 = m1720a((java.io.InputStream) r4)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            com.apm.insight.k.l r5 = m1728c(r6)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0093
            r3.disconnect()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r4)
            return r5
        L_0x0097:
            r5 = move-exception
            r0 = r3
            r3 = r4
            r4 = r5
            goto L_0x00cc
        L_0x009c:
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00c5 }
            r6 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r7.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "http response code "
            r7.append(r8)     // Catch:{ all -> 0x00c5 }
            r7.append(r4)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00c5 }
            r5.<init>((int) r6, (java.lang.String) r4)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00b9
            r3.disconnect()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r0)
            return r5
        L_0x00bd:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "request method is not null"
            r4.<init>(r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r4 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x00cc
        L_0x00ca:
            r4 = move-exception
            r3 = r0
        L_0x00cc:
            com.apm.insight.p026l.C1321q.m1932a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00df }
            r6 = 207(0xcf, float:2.9E-43)
            r5.<init>((int) r6, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00db
            r0.disconnect()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r3)
            return r5
        L_0x00df:
            r4 = move-exception
            if (r0 == 0) goto L_0x00e5
            r0.disconnect()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1280e.m1725b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.apm.insight.k.l");
    }

    /* renamed from: b */
    public static boolean m1726b() {
        return true;
    }

    /* renamed from: b */
    private static byte[] m1727b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    /* renamed from: c */
    private static C1293l m1728c(byte[] bArr) {
        return new C1293l(204, bArr);
    }

    /* renamed from: c */
    public static String m1729c() {
        return C1250h.m1617i().getJavaCrashUploadUrl();
    }

    /* renamed from: c */
    private static String m1730c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m1731d() {
        return C1250h.m1617i().getAlogUploadUrl();
    }

    /* renamed from: d */
    private static String m1732d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static String m1733e() {
        return C1250h.m1617i().getLaunchCrashUploadUrl();
    }

    /* renamed from: f */
    public static String m1734f() {
        return C1250h.m1617i().getExceptionUploadUrl();
    }

    /* renamed from: g */
    public static String m1735g() {
        return C1250h.m1617i().getNativeCrashUploadUrl();
    }
}
