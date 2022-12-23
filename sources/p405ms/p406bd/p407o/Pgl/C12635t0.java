package p405ms.p406bd.p407o.Pgl;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;
import okio.Utf8;
import org.json.JSONObject;

/* renamed from: ms.bd.o.Pgl.t0 */
public class C12635t0 {

    /* renamed from: a */
    private static final String f29911a = ((String) pblk.m33455a(16777217, 0, 0, "da92a1", new byte[]{69, 113, 69, 69, 91, 53, 116, 79, 122}));

    /* renamed from: b */
    private static final String f29912b = ((String) pblk.m33455a(16777217, 0, 0, "5e9757", new byte[]{Ascii.f18298FF, 102, 88, 71, Ascii.f18300GS, 33, 36, 65}));

    /* renamed from: c */
    private static final String f29913c = ((String) pblk.m33455a(16777217, 0, 0, "ace8a6", new byte[]{86, 100, Ascii.ETB, 88, 75, 51, 103, 81}));

    /* renamed from: d */
    private static final String f29914d = ((String) pblk.m33455a(16777217, 0, 0, "bb41d1", new byte[]{99, 99}));

    /* renamed from: e */
    private static final String f29915e = ((String) pblk.m33455a(16777217, 0, 0, "1355fe", new byte[]{40, 38}));

    /* renamed from: f */
    private static final String f29916f = ((String) pblk.m33455a(16777217, 0, 0, "28bbd6", new byte[]{37, 46}));

    /* renamed from: g */
    private static final String f29917g = ((String) pblk.m33455a(16777217, 0, 0, "f56368", new byte[]{122, 54, 93}));

    /* renamed from: h */
    private static final String f29918h = ((String) pblk.m33455a(16777217, 0, 0, "d724f4", new byte[]{120, 60, 79}));

    /* renamed from: i */
    private static final String f29919i = ((String) pblk.m33455a(16777217, 0, 0, "26cd34", new byte[]{32, 59, 2, Ascii.NAK}));

    /* renamed from: j */
    private static final FileFilter f29920j = new pgla();

    /* renamed from: ms.bd.o.Pgl.t0$pgla */
    static class pgla implements FileFilter {
        pgla() {
        }

        public boolean accept(File file) {
            return Pattern.matches((String) pblk.m33455a(16777217, 0, 0, "9e3449", new byte[]{43, 119, 85, 123, 91, 99, 99, 121}), file.getName());
        }
    }

    /* renamed from: a */
    private static int m33523a() {
        try {
            return new File((String) pblk.m33455a(16777217, 0, 0, "092ead", new byte[]{110, 40, 88, 2, 17, 119, 54, Ascii.f18306SO, 106, 54, 36, 40, Ascii.f18306SO, 2, 71, 96, 39, Ascii.f18300GS, 110, 122, 34, 43, 84, 94})).listFiles(f29920j).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r11 == null) goto L_0x0043;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m33524a(java.lang.String r11) {
        /*
            r0 = 114(0x72, float:1.6E-43)
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0037 }
            r4.<init>(r11)     // Catch:{ all -> 0x0037 }
            boolean r11 = r4.exists()     // Catch:{ all -> 0x0037 }
            if (r11 != 0) goto L_0x0023
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.String r9 = "39cd10"
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x0037 }
            r10[r1] = r0     // Catch:{ all -> 0x0037 }
            java.lang.Object r11 = p405ms.p406bd.p407o.Pgl.pblk.m33455a(r5, r6, r7, r9, r10)     // Catch:{ all -> 0x0037 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0037 }
            return r11
        L_0x0023:
            java.io.FileReader r11 = new java.io.FileReader     // Catch:{ all -> 0x0037 }
            r11.<init>(r4)     // Catch:{ all -> 0x0037 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            r4.<init>(r11)     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r4.readLine()     // Catch:{ all -> 0x0039 }
            r4.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0040
        L_0x0035:
            r4 = r3
            goto L_0x0039
        L_0x0037:
            r11 = r3
            r4 = r11
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r4.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            if (r11 == 0) goto L_0x0043
        L_0x0040:
            r11.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            if (r3 != 0) goto L_0x0058
            byte[] r9 = new byte[r2]
            r9[r1] = r0
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.String r8 = "3d7bc4"
            java.lang.Object r11 = p405ms.p406bd.p407o.Pgl.pblk.m33455a(r4, r5, r6, r8, r9)
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x005c
        L_0x0058:
            java.lang.String r11 = r3.trim()
        L_0x005c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p405ms.p406bd.p407o.Pgl.C12635t0.m33524a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m33525a(HashMap<String, String> hashMap, String str) {
        String str2;
        try {
            str2 = hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r2 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ab */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6 A[SYNTHETIC, Splitter:B:28:0x00a6] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m33526b() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x00a3 }
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "a47945"
            r8 = 13
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x00a3 }
            r9 = 63
            r10 = 0
            r8[r10] = r9     // Catch:{ all -> 0x00a3 }
            r9 = 38
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x00a3 }
            r9 = 86
            r12 = 2
            r8[r12] = r9     // Catch:{ all -> 0x00a3 }
            r9 = 3
            r13 = 66
            r8[r9] = r13     // Catch:{ all -> 0x00a3 }
            r9 = 4
            r13 = 8
            r8[r9] = r13     // Catch:{ all -> 0x00a3 }
            r9 = 109(0x6d, float:1.53E-43)
            r14 = 5
            r8[r14] = r9     // Catch:{ all -> 0x00a3 }
            r9 = 6
            r15 = 97
            r8[r9] = r15     // Catch:{ all -> 0x00a3 }
            r9 = 7
            r8[r9] = r14     // Catch:{ all -> 0x00a3 }
            r9 = 115(0x73, float:1.61E-43)
            r8[r13] = r9     // Catch:{ all -> 0x00a3 }
            r13 = 9
            r14 = 96
            r8[r13] = r14     // Catch:{ all -> 0x00a3 }
            r13 = 10
            r14 = 126(0x7e, float:1.77E-43)
            r8[r13] = r14     // Catch:{ all -> 0x00a3 }
            r13 = 11
            r14 = 48
            r8[r13] = r14     // Catch:{ all -> 0x00a3 }
            r13 = 12
            r14 = 75
            r8[r13] = r14     // Catch:{ all -> 0x00a3 }
            java.lang.Object r3 = p405ms.p406bd.p407o.Pgl.pblk.m33455a(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a3 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a3 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00a4 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a4 }
        L_0x0064:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x006e
            r3.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00ab
        L_0x006e:
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            java.lang.String r17 = "8519ee"
            byte[] r4 = new byte[r11]     // Catch:{ all -> 0x00a1 }
            r4[r10] = r9     // Catch:{ all -> 0x00a1 }
            r18 = r4
            java.lang.Object r4 = p405ms.p406bd.p407o.Pgl.pblk.m33455a(r13, r14, r15, r17, r18)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a1 }
            java.lang.String[] r1 = r1.split(r4, r12)     // Catch:{ all -> 0x00a1 }
            int r4 = r1.length     // Catch:{ all -> 0x00a1 }
            if (r4 >= r12) goto L_0x008a
            goto L_0x0064
        L_0x008a:
            r4 = r1[r10]     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x00a1 }
            r1 = r1[r11]     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x00a1 }
            java.lang.Object r5 = r0.get(r4)     // Catch:{ all -> 0x00a1 }
            if (r5 == 0) goto L_0x009d
            goto L_0x0064
        L_0x009d:
            r0.put(r4, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x0064
        L_0x00a1:
            r1 = r3
            goto L_0x00a4
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            if (r1 == 0) goto L_0x00a9
            r1.close()     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
        L_0x00ab:
            r2.close()     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p405ms.p406bd.p407o.Pgl.C12635t0.m33526b():java.util.HashMap");
    }

    /* renamed from: c */
    public static String m33527c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> b = m33526b();
            jSONObject.put(f29919i, m33523a());
            jSONObject.put(f29914d, m33525a(b, f29911a));
            jSONObject.put(f29915e, m33525a(b, f29912b));
            jSONObject.put(f29917g, m33524a((String) pblk.m33455a(16777217, 0, 0, "58cb7a", new byte[]{107, 41, 9, 5, 71, 114, 51, Ascii.f18305SI, 59, 49, 33, 41, 95, 5, 17, 101, 34, Ascii.f18299FS, Utf8.REPLACEMENT_BYTE, 125, 39, 42, 5, 89, Ascii.f18309VT, 102, 35, 73, 125, 49, 52, 47, Ascii.SYN, 4, Ascii.f18296CR, 103, 121, Ascii.SUB, 34, 39, 45, 52, Ascii.SYN, Ascii.f18297EM, 55, 123, 55, 1, Ascii.f18296CR, 52, 54, Utf8.REPLACEMENT_BYTE, 1})));
            jSONObject.put(f29918h, m33524a((String) pblk.m33455a(16777217, 0, 0, "f0dc27", new byte[]{56, 33, Ascii.f18306SO, 4, 66, 36, 96, 7, 60, 48, 114, 33, 88, 4, Ascii.DC4, 51, 113, Ascii.DC4, 56, 124, 116, 34, 2, 88, Ascii.f18306SO, 48, 112, 65, 122, 48, 103, 39, 17, 5, 8, 49, 42, Ascii.DC2, 37, 38, 126, 60, 17, Ascii.CAN, 50, 45, 108, Ascii.f18308US, 10, 53, 101, 55, 6})));
            jSONObject.put(f29916f, m33525a(b, f29913c));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        return TextUtils.isEmpty(jSONObject2) ? (String) pblk.m33455a(16777217, 0, 0, "09c07f", new byte[]{58, 38}) : jSONObject2.trim();
    }
}
