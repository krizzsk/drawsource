package com.ogury.p377ed.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.aw */
public final class C9842aw {

    /* renamed from: a */
    public static final C9842aw f24821a = new C9842aw();

    /* renamed from: b */
    private static final Map<String, C9841av> f24822b;

    private C9842aw() {
    }

    static {
        Map<String, C9841av> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C10263mq.m29879a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
        f24822b = synchronizedMap;
    }

    /* renamed from: a */
    public static String m28410a(C9841av avVar) {
        C10263mq.m29882b(avVar, "item");
        String uuid = UUID.randomUUID().toString();
        C10263mq.m29879a((Object) uuid, "randomUUID().toString()");
        f24822b.put(uuid, avVar);
        return uuid;
    }

    /* renamed from: a */
    public static C9841av m28409a(String str) {
        Map<String, C9841av> map = f24822b;
        if (map != null) {
            return (C9841av) C10269mw.m29902c(map).remove(str);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
