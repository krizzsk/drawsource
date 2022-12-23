package com.bytedance.sdk.openadsdk.core.p148d;

import android.content.Context;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.p118e.p120b.C2849d;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.c */
/* compiled from: FrequentCallEventHelper */
public class C3399c {
    /* renamed from: a */
    public static void m10119a(Context context, String str, long j) {
        JSONObject a = m10118a(str, j);
        C2849d b = C3792d.m12395a().mo20615b().mo17683b();
        b.mo17711a(C3898x.m12802g("/api/ad/union/sdk/stats/"));
        b.mo17721c(a.toString());
        b.mo17719a((C2842a) new C2842a() {
            /* renamed from: a */
            public void mo17693a(C2848c cVar, C2843b bVar) {
                if (bVar != null) {
                    C2905l.m8107a("uploadFrequentEvent", Boolean.valueOf(bVar.mo17701f()), bVar.mo17699d());
                    return;
                }
                C2905l.m8114c("uploadFrequentEvent", "NetResponse is null");
            }

            /* renamed from: a */
            public void mo17694a(C2848c cVar, IOException iOException) {
                C2905l.m8114c("uploadFrequentEvent", iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private static JSONObject m10118a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
