package com.bytedance.sdk.openadsdk.component.p136c;

import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3436r;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.c.a */
/* compiled from: TTAppOpenAdReport */
public class C3205a {
    /* renamed from: a */
    public static void m9274a(final int i, final int i2) {
        C3753b.m12287a().mo20569a((C3750a) new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return C3752b.m12257b().mo20544a("openad_load_ad_timeout").mo20546b(jSONObject.toString());
            }
        });
    }

    /* renamed from: a */
    public static void m9276a(C3431n nVar, int i, int i2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("skip_time", Integer.valueOf(i));
        hashMap.put("skip_show_time", Integer.valueOf(i2));
        hashMap.put("total_time", Float.valueOf(f));
        C3090e.m8920b(nVar, "skip", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9279a(C3431n nVar, long j, float f, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        if (z) {
            hashMap.put("video_duration", Float.valueOf(f));
            hashMap.put("video_percent", Integer.valueOf((int) (((((double) j) * 1.0d) / 10.0d) / ((double) f))));
        } else {
            hashMap.put("image_duration", Float.valueOf(f));
        }
        C3090e.m8920b(nVar, "destroy", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9275a(C3431n nVar) {
        C3090e.m8920b(nVar, "cache_expire", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public static void m9281b(C3431n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C3090e.m8920b(nVar, "cache_loss", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9280a(C3431n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C3090e.m8906a(nVar, "download_image_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m9282b(C3431n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("size", Long.valueOf(nVar.mo19517J().mo15943e()));
        hashMap.put("video_duration", Double.valueOf(nVar.mo19517J().mo15946f()));
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C3090e.m8906a(nVar, "download_video_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9277a(C3431n nVar, int i, C3436r rVar) {
        long j;
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("open_ad_cache_type", Integer.valueOf(i));
        if (rVar != null) {
            rVar.mo19698b(System.currentTimeMillis());
            hashMap.put("client_start_time", Long.valueOf(rVar.mo19697b()));
            hashMap.put("sever_time", Long.valueOf(rVar.mo19701d()));
            hashMap.put("network_time", Long.valueOf(rVar.mo19699c()));
            hashMap.put("client_end_time", Long.valueOf(rVar.mo19702e()));
            hashMap.put("download_resource_duration", Long.valueOf(rVar.mo19704g()));
            hashMap.put("resource_source", Integer.valueOf(rVar.mo19705h()));
            j = rVar.mo19703f();
        } else {
            j = 0;
        }
        C3090e.m8906a(nVar, "load_net_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9278a(C3431n nVar, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3431n.m10311c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C3090e.m8906a(nVar, "load_cache_duration", j, (Map<String, Object>) hashMap);
    }
}
