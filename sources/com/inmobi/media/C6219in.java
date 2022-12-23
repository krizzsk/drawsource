package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.inmobi.media.C6094fv;
import com.inmobi.sdk.InMobiSdk;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.in */
/* compiled from: GDPRInfo */
public final class C6219in {

    /* renamed from: a */
    private static final String f15675a = C6219in.class.getSimpleName();

    /* renamed from: b */
    private static JSONObject f15676b;

    /* renamed from: c */
    private static JSONObject f15677c;

    /* renamed from: d */
    private static JSONObject f15678d;

    /* renamed from: e */
    private static C6115gg f15679e;

    private C6219in() {
    }

    /* renamed from: a */
    public static void m18455a() {
        f15679e = (C6115gg) C6093fu.m18077a("root", C6183hw.m18332f());
    }

    /* renamed from: b */
    public static JSONObject m18458b() {
        Context c = C6183hw.m18324c();
        if (c != null) {
            SharedPreferences sharedPreferences = c.getSharedPreferences(c.getPackageName() + "_preferences", 0);
            if (sharedPreferences != null) {
                JSONObject b = m18459b(sharedPreferences);
                if (b != null) {
                    return b;
                }
                JSONObject a = m18454a(sharedPreferences);
                if (a != null) {
                    return a;
                }
            }
        }
        return m18468i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[SYNTHETIC, Splitter:B:11:0x0012] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m18454a(android.content.SharedPreferences r4) {
        /*
            r0 = 0
            java.lang.String r1 = "IABConsent_ConsentString"
            java.lang.String r1 = r4.getString(r1, r0)     // Catch:{ Exception -> 0x000e }
            java.lang.String r2 = "IABConsent_SubjectToGDPR"
            java.lang.String r4 = r4.getString(r2, r0)     // Catch:{ Exception -> 0x000f }
            goto L_0x0010
        L_0x000e:
            r1 = r0
        L_0x000f:
            r4 = r0
        L_0x0010:
            if (r1 == 0) goto L_0x0024
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0024 }
            r2.<init>()     // Catch:{ JSONException -> 0x0024 }
            java.lang.String r3 = "gdpr_consent"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x0024 }
            if (r4 == 0) goto L_0x0023
            java.lang.String r1 = "gdpr"
            r2.put(r1, r4)     // Catch:{ JSONException -> 0x0024 }
        L_0x0023:
            return r2
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6219in.m18454a(android.content.SharedPreferences):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0013 A[SYNTHETIC, Splitter:B:11:0x0013] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m18459b(android.content.SharedPreferences r5) {
        /*
            r0 = -1
            r1 = 0
            java.lang.String r2 = "IABTCF_TCString"
            java.lang.String r2 = r5.getString(r2, r1)     // Catch:{ Exception -> 0x000f }
            java.lang.String r3 = "IABTCF_gdprApplies"
            int r5 = r5.getInt(r3, r0)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0011
        L_0x000f:
            r2 = r1
        L_0x0010:
            r5 = r0
        L_0x0011:
            if (r2 == 0) goto L_0x0029
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0029 }
            r3.<init>()     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r4 = "gdpr_consent"
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x0029 }
            if (r0 == r5) goto L_0x0028
            java.lang.String r0 = "gdpr"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0029 }
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x0029 }
        L_0x0028:
            return r3
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6219in.m18459b(android.content.SharedPreferences):org.json.JSONObject");
    }

    /* renamed from: c */
    public static JSONObject m18461c() {
        return f15676b;
    }

    /* renamed from: a */
    public static void m18456a(JSONObject jSONObject) {
        if (jSONObject != null) {
            f15676b = jSONObject;
        }
    }

    /* renamed from: b */
    public static void m18460b(JSONObject jSONObject) {
        if (jSONObject != null) {
            f15677c = jSONObject;
        }
    }

    /* renamed from: i */
    private static JSONObject m18468i() {
        JSONObject jSONObject = f15677c;
        if (jSONObject == null) {
            return f15676b;
        }
        if (f15676b == null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = f15677c.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, f15677c.opt(next));
            } catch (JSONException unused) {
            }
        }
        Iterator<String> keys2 = f15676b.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject2.put(next2, f15676b.opt(next2));
            } catch (JSONException unused2) {
            }
        }
        return jSONObject2;
    }

    /* renamed from: d */
    public static byte m18463d() {
        JSONObject b = m18458b();
        if (b == null) {
            return -1;
        }
        if (b.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            return 1;
        }
        if (!b.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            return -1;
        }
        try {
            if (b.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                return 1;
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m18462c(JSONObject jSONObject) {
        f15678d = jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m18464e() {
        return f15678d;
    }

    /* renamed from: f */
    public static boolean m18465f() {
        return m18457a(false);
    }

    /* renamed from: g */
    public static void m18466g() {
        f15679e = (C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null);
    }

    /* renamed from: a */
    public static boolean m18457a(boolean z) {
        if (f15679e == null) {
            m18466g();
        }
        return m18463d() == 1 || f15679e.mo35306j() || z;
    }

    /* renamed from: h */
    public static boolean m18467h() {
        return m18465f();
    }
}
