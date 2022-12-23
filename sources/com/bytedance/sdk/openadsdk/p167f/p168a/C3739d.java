package com.bytedance.sdk.openadsdk.p167f.p168a;

import com.bytedance.sdk.component.p088a.C2491e;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.d */
/* compiled from: InteractiveFinishMethod */
public class C3739d extends C2491e<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3666w> f9669a;

    /* renamed from: a */
    public static void m12225a(C2512r rVar, C3666w wVar) {
        rVar.mo16525a("interactiveFinish", (C2491e<?, ?>) new C3739d(wVar));
    }

    /* renamed from: a */
    public JSONObject mo16486a(JSONObject jSONObject, C2492f fVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<C3666w> weakReference = this.f9669a;
        if (!(weakReference == null || weakReference.get() == null)) {
            C3666w wVar = (C3666w) this.f9669a.get();
            C3431n c = wVar.mo20359c();
            boolean z = true;
            try {
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int aA = c != null ? c.mo19557aA() : 0;
                if (optInt >= 0 && aA >= 0) {
                    optInt = Math.min(optInt, aA);
                } else if (optInt < 0) {
                    optInt = aA >= 0 ? aA : 0;
                }
                if (z) {
                    wVar.mo20362c(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public C3739d(C3666w wVar) {
        this.f9669a = new WeakReference<>(wVar);
    }
}
