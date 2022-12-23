package com.mbridge.msdk.videocommon.p373b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.c */
/* compiled from: Reward */
public final class C9630c {

    /* renamed from: a */
    private String f23915a;

    /* renamed from: b */
    private int f23916b;

    public C9630c(String str, int i) {
        this.f23915a = str;
        this.f23916b = i;
    }

    /* renamed from: a */
    public final String mo63524a() {
        return this.f23915a;
    }

    /* renamed from: a */
    public final void mo63526a(String str) {
        this.f23915a = str;
    }

    /* renamed from: b */
    public final int mo63527b() {
        return this.f23916b;
    }

    /* renamed from: a */
    public final void mo63525a(int i) {
        this.f23916b = i;
    }

    /* renamed from: c */
    private static C9630c m27343c() {
        return new C9630c("Virtual Item", 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.videocommon.p373b.C9630c m27342b(java.lang.String r3) {
        /*
            r0 = 0
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x002f }
            com.mbridge.msdk.videocommon.d.a r1 = r1.mo63556b()     // Catch:{ Exception -> 0x002f }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x0015
            com.mbridge.msdk.videocommon.b.c r3 = m27343c()     // Catch:{ Exception -> 0x002f }
        L_0x0013:
            r0 = r3
            goto L_0x0028
        L_0x0015:
            if (r1 == 0) goto L_0x0028
            java.util.Map r2 = r1.mo63548i()     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x0028
            java.util.Map r1 = r1.mo63548i()     // Catch:{ Exception -> 0x002f }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x002f }
            com.mbridge.msdk.videocommon.b.c r3 = (com.mbridge.msdk.videocommon.p373b.C9630c) r3     // Catch:{ Exception -> 0x002f }
            goto L_0x0013
        L_0x0028:
            if (r0 != 0) goto L_0x0033
            com.mbridge.msdk.videocommon.b.c r0 = m27343c()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p373b.C9630c.m27342b(java.lang.String):com.mbridge.msdk.videocommon.b.c");
    }

    /* renamed from: a */
    public static Map<String, C9630c> m27341a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new C9630c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C9630c m27340a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new C9630c(optString, optInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String toString() {
        return "Reward{name='" + this.f23915a + '\'' + ", amount=" + this.f23916b + '}';
    }
}
