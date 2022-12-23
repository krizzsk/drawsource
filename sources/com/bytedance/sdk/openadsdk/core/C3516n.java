package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.adexpress.p089a.p092c.C2544a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3562o;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.p128b.C3099i;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.n */
/* compiled from: NetApi */
public interface C3516n<T> {

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$a */
    /* compiled from: NetApi */
    public interface C3517a {
        /* renamed from: a */
        void mo18456a(int i, String str);

        /* renamed from: a */
        void mo18457a(C3402a aVar, C3403b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$b */
    /* compiled from: NetApi */
    public interface C3518b {
        /* renamed from: a */
        void mo18497a(int i, String str);

        /* renamed from: a */
        void mo18498a(C3562o.C3573b bVar);
    }

    /* renamed from: a */
    C2544a mo19980a();

    /* renamed from: a */
    C3099i mo19981a(List<T> list);

    /* renamed from: a */
    JSONObject mo19982a(JSONObject jSONObject);

    /* renamed from: a */
    void mo19983a(AdSlot adSlot, C3433o oVar, int i, C3517a aVar);

    /* renamed from: a */
    void mo19984a(C3431n nVar, List<FilterWord> list);

    /* renamed from: a */
    void mo19985a(String str);

    /* renamed from: a */
    void mo19986a(JSONObject jSONObject, C3518b bVar);

    /* renamed from: a */
    void mo19987a(JSONObject jSONObject, String str);

    /* renamed from: b */
    C3099i mo19988b(JSONObject jSONObject);
}
