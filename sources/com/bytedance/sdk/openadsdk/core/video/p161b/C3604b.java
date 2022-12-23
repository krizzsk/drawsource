package com.bytedance.sdk.openadsdk.core.video.p161b;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.b */
/* compiled from: PlayableEvent */
public class C3604b {
    /* renamed from: a */
    public static void m11424a(Context context, C3431n nVar) {
        if (C3434p.m10489a(nVar)) {
            C3090e.m8926e(context, nVar, "playable_preload", "preload_start", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public static void m11426a(Context context, C3431n nVar, long j, long j2) {
        if (nVar == null) {
            return;
        }
        if (C3434p.m10497i(nVar) || C3434p.m10489a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("loadzip_success_time", Long.valueOf(j));
            hashMap.put("unzip_success_time", Long.valueOf(j2));
            C3090e.m8926e(context, nVar, "playable_preload", "preload_success", (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m11425a(Context context, C3431n nVar, int i, String str) {
        if (nVar == null) {
            return;
        }
        if (C3434p.m10497i(nVar) || C3434p.m10489a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", Integer.valueOf(i));
            hashMap.put("error_reason", str);
            C3090e.m8926e(context, nVar, "playable_preload", "preload_fail", (Map<String, Object>) hashMap);
        }
    }
}
