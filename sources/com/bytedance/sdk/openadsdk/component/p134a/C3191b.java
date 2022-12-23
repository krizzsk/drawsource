package com.bytedance.sdk.openadsdk.component.p134a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.b */
/* compiled from: TTAppOpenAdClickManager */
public class C3191b {

    /* renamed from: a */
    private String f7496a = "open_ad";

    /* renamed from: b */
    private int f7497b = 4;

    /* renamed from: c */
    private C3190a f7498c;

    /* renamed from: d */
    private C3968c f7499d;

    public C3191b(C3431n nVar, Activity activity) {
        C3190a aVar = new C3190a(activity.getApplicationContext(), nVar, this.f7496a, this.f7497b);
        this.f7498c = aVar;
        aVar.mo19305a(activity.findViewById(16908290));
        this.f7498c.mo19317b(activity.findViewById(C2914t.m8158e(C3513m.m10963a(), "tt_top_dislike")));
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nVar.mo19601c()));
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(C3434p.m10497i(nVar) ? 3 : 1));
        this.f7498c.mo19313a((Map<String, Object>) hashMap);
        m9224a(activity.getApplicationContext(), nVar);
    }

    /* renamed from: a */
    private void m9224a(Context context, C3431n nVar) {
        if (mo18850a(nVar) == 4) {
            C3968c a = C3969d.m13089a(context, nVar, "open_ad");
            this.f7499d = a;
            this.f7498c.mo19311a(a);
        }
    }

    /* renamed from: a */
    public int mo18850a(C3431n nVar) {
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19519L();
    }

    /* renamed from: a */
    public void mo18852a(C3360b.C3361a aVar) {
        C3190a aVar2 = this.f7498c;
        if (aVar2 != null) {
            aVar2.mo19309a(aVar);
        }
    }

    /* renamed from: a */
    public C3190a mo18851a() {
        return this.f7498c;
    }
}
