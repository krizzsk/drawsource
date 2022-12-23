package com.unity3d.services.core.misc;

import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.Constants;
import com.unity3d.services.core.log.C12065a;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.j */
/* compiled from: Utilities */
public class C12080j {
    /* renamed from: a */
    public static void m32879a(Runnable runnable) {
        m32880a(runnable, 0);
    }

    /* renamed from: b */
    public static String m32883b(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 <= 15) {
                str = str + "0";
            }
            str = str + Integer.toHexString(b2);
        }
        return str;
    }

    /* renamed from: a */
    public static void m32880a(Runnable runnable, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public static String m32874a(String str) {
        return m32875a(str.getBytes());
    }

    /* renamed from: a */
    public static String m32875a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            instance.update(bArr, 0, bArr.length);
            return m32883b(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C12065a.m32842a("SHA-256 algorithm not found", (Exception) e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m32873a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m32883b(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (NoSuchAlgorithmException e) {
            C12065a.m32842a("SHA-256 algorithm not found", (Exception) e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f A[SYNTHETIC, Splitter:B:23:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[SYNTHETIC, Splitter:B:31:0x0054] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32881a(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = 0
            if (r5 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 0
            r3 = 1
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0027 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0027 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r4.write(r6)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r4.flush()     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r4.close()     // Catch:{ Exception -> 0x001c }
            r1 = r3
            goto L_0x0037
        L_0x001c:
            r6 = move-exception
            r1 = r3
            goto L_0x0034
        L_0x001f:
            r5 = move-exception
            r2 = r4
            goto L_0x0052
        L_0x0022:
            r6 = move-exception
            r2 = r4
            goto L_0x0028
        L_0x0025:
            r5 = move-exception
            goto L_0x0052
        L_0x0027:
            r6 = move-exception
        L_0x0028:
            java.lang.String r3 = "Could not write file"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r3, (java.lang.Exception) r6)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ Exception -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r6 = move-exception
        L_0x0034:
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r6)
        L_0x0037:
            if (r1 == 0) goto L_0x0051
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Wrote file: "
            r6.append(r0)
            java.lang.String r5 = r5.getAbsolutePath()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.unity3d.services.core.log.C12065a.m32845b(r5)
        L_0x0051:
            return r1
        L_0x0052:
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r6 = move-exception
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r6)
        L_0x005c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.C12080j.m32881a(java.io.File, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m32882a(java.io.File r4) throws java.io.IOException {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0054
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x000a
            goto L_0x0054
        L_0x000a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0019
            java.nio.file.Path r4 = r4.toPath()
            byte[] r4 = java.nio.file.Files.readAllBytes(r4)
            return r4
        L_0x0019:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x004d }
            r1.<init>(r4)     // Catch:{ all -> 0x004d }
            long r2 = r4.length()     // Catch:{ all -> 0x004a }
            int r0 = (int) r2     // Catch:{ all -> 0x004a }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x004a }
            int r3 = r1.read(r2)     // Catch:{ all -> 0x004a }
            if (r3 != r0) goto L_0x002f
            r1.close()
            return r2
        L_0x002f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r2.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "Failed to read all bytes from input file path: "
            r2.append(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x004a }
            r2.append(r4)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x004a }
            r0.<init>(r4)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r4
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.C12080j.m32882a(java.io.File):byte[]");
    }

    /* renamed from: a */
    public static JSONObject m32878a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            if (!jSONObject3.has(next2) || !(jSONObject3.get(next2) instanceof JSONObject) || !(jSONObject.get(next2) instanceof JSONObject)) {
                jSONObject3.put(next2, jSONObject.get(next2));
            } else {
                jSONObject3.put(next2, m32878a(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
            }
        }
        return jSONObject3;
    }

    /* renamed from: a */
    public static Map<String, Object> m32877a(Map<String, Object> map, JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap(map);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(str + next, jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m32876a(Map<String, Object> map, JSONObject jSONObject) {
        return m32877a(map, jSONObject, "");
    }
}
