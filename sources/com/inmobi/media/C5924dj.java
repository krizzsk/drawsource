package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.dj */
/* compiled from: TokenManager */
public class C5924dj {

    /* renamed from: a */
    public static final String f15005a = C5924dj.class.getName();

    /* renamed from: com.inmobi.media.dj$a */
    /* compiled from: TokenManager */
    static class C5928a {

        /* renamed from: a */
        static final C5924dj f15012a = new C5924dj();
    }

    /* renamed from: a */
    public static C5924dj m17611a() {
        return C5928a.f15012a;
    }

    /* renamed from: a */
    public final void mo35030a(int i, long j) {
        final HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C6210ik.m18428b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("plType", "AB");
        C6183hw.m18316a((Runnable) new Runnable() {
            public final void run() {
                C6168hl.m18270a().mo35377a("AdGetSignalsFailed", (Map<String, Object>) hashMap);
            }
        });
    }
}
