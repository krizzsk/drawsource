package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.p107c.C2753a;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: com.bytedance.sdk.component.utils.a */
/* compiled from: AESUtils */
public class C2888a {

    /* renamed from: a */
    private static Random f6502a = new SecureRandom();

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.put("message", r6.toString());
        r2.put("cypher", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        com.bytedance.sdk.component.utils.C2905l.m8104a(r6.getMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m8062a(org.json.JSONObject r6) {
        /*
            java.lang.String r0 = "cypher"
            java.lang.String r1 = "message"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r6 != 0) goto L_0x000c
            return r2
        L_0x000c:
            r3 = 0
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x002e }
            java.lang.String r4 = m8060a((java.lang.String) r4)     // Catch:{ all -> 0x002e }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x002e }
            if (r5 != 0) goto L_0x0023
            r2.put(r1, r4)     // Catch:{ all -> 0x002e }
            r4 = 3
            r2.put(r0, r4)     // Catch:{ all -> 0x002e }
            goto L_0x0041
        L_0x0023:
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x002e }
            r2.put(r1, r4)     // Catch:{ all -> 0x002e }
            r2.put(r0, r3)     // Catch:{ all -> 0x002e }
            goto L_0x0041
        L_0x002e:
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0039 }
            r2.put(r1, r6)     // Catch:{ all -> 0x0039 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0041
        L_0x0039:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.bytedance.sdk.component.utils.C2905l.m8104a((java.lang.String) r6)
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2888a.m8062a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public static String m8060a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a = m8058a();
        String a2 = m8061a(a, 32);
        String b = m8063b();
        String str2 = null;
        if (!(a2 == null || b == null)) {
            str2 = C2753a.m7506a(str, b, a2);
        }
        return 3 + a + b + str2;
    }

    /* renamed from: b */
    public static String m8064b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String a = m8061a(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || a == null) ? str : C2753a.m7508b(str.substring(49), substring, a);
    }

    /* renamed from: a */
    public static String m8058a() {
        String a = m8059a(16);
        if (a == null || a.length() != 32) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static String m8061a(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    /* renamed from: b */
    public static String m8063b() {
        String a = m8059a(8);
        if (a == null || a.length() != 16) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static String m8059a(int i) {
        try {
            byte[] bArr = new byte[i];
            f6502a.nextBytes(bArr);
            return C2893e.m8078a(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
