package com.bytedance.sdk.openadsdk.core.p145c;

import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p145c.p146a.C3390a;
import com.bytedance.sdk.openadsdk.core.p145c.p146a.C3391b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a */
/* compiled from: DynamicUtils */
public class C3389a {
    /* renamed from: a */
    public static String m10087a(C2563l lVar, C3431n nVar) {
        return m10088a(lVar.mo16671a(), lVar.mo16675e(), lVar.mo16676f(), lVar.mo16677g(), lVar.mo16678h(), lVar.mo16679i(), nVar);
    }

    /* renamed from: a */
    public static String m10088a(JSONObject jSONObject, String str, String str2, String str3, boolean z, int i, C3431n nVar) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject.put("setting", m10089a(str3, z, i, nVar));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("templateInfo", jSONObject);
        jSONObject2.put("adInfo", new C3390a(str, str3, str2).mo19372a());
        jSONObject2.put("appInfo", new C3391b().mo19373a());
        return jSONObject2.toString();
    }

    /* renamed from: a */
    private static JSONObject m10089a(String str, boolean z, int i, C3431n nVar) {
        JSONObject jSONObject = new JSONObject();
        if (C3513m.m10973h() != null) {
            try {
                int f = C3898x.m12794f(nVar);
                int f2 = C3513m.m10973h().mo19851f(String.valueOf(f));
                boolean c = C3513m.m10973h().mo19843c(String.valueOf(f));
                jSONObject.put("voice_control", C3513m.m10973h().mo19839b(f));
                jSONObject.put("rv_skip_time", f2);
                jSONObject.put("fv_skip_show", c);
                jSONObject.put("show_dislike", z);
                jSONObject.put("video_adaptation", i);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
