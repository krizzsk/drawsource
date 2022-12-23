package com.bytedance.sdk.openadsdk.p128b;

import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.p128b.C3095h;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.t */
/* compiled from: StatsEventThread */
public class C3117t extends C3095h<C3775c.C3778a> {

    /* renamed from: l */
    private C3516n<C3060a> f7330l = C3513m.m10971f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18674a() {
        return false;
    }

    public C3117t(String str, String str2, C3093f fVar, C3516n nVar, C3095h.C3098c cVar, C3095h.C3097b bVar) {
        super(str, str2, fVar, nVar, cVar, bVar);
    }

    /* renamed from: a */
    public C3099i mo18673a(List<C3775c.C3778a> list) {
        if (this.f7330l == null) {
            this.f7330l = C3513m.m10971f();
        }
        if (list == null || list.size() == 0 || !C3470e.m10697a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C3775c.C3778a aVar : list) {
                jSONArray.put(aVar.f9744b);
            }
            jSONObject.put("stats_list", jSONArray);
        } catch (Exception unused) {
        }
        return this.f7330l.mo19988b(jSONObject);
    }
}
