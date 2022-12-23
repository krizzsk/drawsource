package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2893e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.s */
/* compiled from: SecSdkHelperUtil */
public class C3579s {
    /* renamed from: a */
    public static void m11319a(String str) {
        if (!TextUtils.isEmpty(str) && C3513m.m10973h().mo19826C()) {
            C3576r.m11309a().mo20123a(str);
        }
    }

    /* renamed from: a */
    public static String m11317a() {
        if (C3513m.m10973h().mo19826C()) {
            return C3576r.m11309a().mo20124b();
        }
        return null;
    }

    /* renamed from: b */
    public static void m11321b() {
        if (C3513m.m10973h().mo19826C()) {
            C3576r.m11309a().mo20125b("AdShow");
        }
    }

    /* renamed from: a */
    public static Map<String, String> m11318a(String str, String str2) {
        if (!C3513m.m10973h().mo19826C()) {
            return new HashMap();
        }
        return C3576r.m11309a().mo20122a(str, str2 != null ? str2.getBytes() : new byte[0]);
    }

    /* renamed from: a */
    public static void m11320a(JSONObject jSONObject) {
        if (jSONObject != null && C3513m.m10973h().mo19826C()) {
            try {
                jSONObject.put("sec_did", C3576r.m11309a().mo20126c());
                String a = C2893e.m8077a(jSONObject.toString());
                Map<String, String> a2 = C3576r.m11309a().mo20122a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", a != null ? a.getBytes() : new byte[0]);
                if (a2 != null && a2.size() > 0) {
                    for (String next : a2.keySet()) {
                        jSONObject.put(next, a2.get(next));
                    }
                    jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                    jSONObject.put("pangle_m", a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
