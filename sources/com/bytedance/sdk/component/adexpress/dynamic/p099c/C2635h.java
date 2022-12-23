package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2643b;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.p123f.C2882e;
import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.h */
/* compiled from: DynamicNativeParser */
public class C2635h implements C2637i {

    /* renamed from: a */
    private C2643b f5725a;

    /* renamed from: a */
    public void mo17120a(C2643b bVar) {
        this.f5725a = bVar;
    }

    /* renamed from: a */
    public void mo17119a(final C2563l lVar) {
        if (lVar.mo16683m() == 1) {
            m7063b(lVar);
        } else {
            C2882e.m8032a().execute(new Runnable() {
                public void run() {
                    C2635h.this.m7063b(lVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7063b(C2563l lVar) {
        try {
            JSONObject a = lVar.mo16671a();
            JSONObject jSONObject = new JSONObject(a.optString("template_Plugin"));
            JSONObject optJSONObject = a.optJSONObject(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
            C2618h a2 = new C2633g(jSONObject, optJSONObject, a.optJSONObject("AdSize"), new JSONObject(a.optString("diff_template_Plugin"))).mo17126a();
            a2.mo17064a(new JSONObject(optJSONObject.optString("dynamic_creative")).optString("color"));
            this.f5725a.mo16796a(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
