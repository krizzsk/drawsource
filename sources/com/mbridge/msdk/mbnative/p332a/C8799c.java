package com.mbridge.msdk.mbnative.p332a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.mbnative.a.c */
/* compiled from: NativeCacheFactory */
public final class C8799c {

    /* renamed from: a */
    public static Map<Integer, C8798b<String, List<Campaign>>> f21618a = new HashMap();

    /* renamed from: a */
    public static C8798b<String, List<Campaign>> m25351a(int i) {
        if (f21618a.containsKey(Integer.valueOf(i))) {
            return f21618a.get(Integer.valueOf(i));
        }
        C8796a aVar = new C8796a(i);
        f21618a.put(Integer.valueOf(i), aVar);
        return aVar;
    }
}
