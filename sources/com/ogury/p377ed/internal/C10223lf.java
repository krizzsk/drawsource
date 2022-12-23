package com.ogury.p377ed.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.lf */
class C10223lf extends C10222le {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m29847a() {
        C10203kz kzVar = C10203kz.f25547a;
        if (kzVar != null) {
            return kzVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: a */
    public static final <K, V> void m29850a(Map<? super K, ? super V> map, Iterable<? extends C10176jz<? extends K, ? extends V>> iterable) {
        C10263mq.m29882b(map, "$this$putAll");
        C10263mq.m29882b(iterable, "pairs");
        for (C10176jz jzVar : iterable) {
            map.put(jzVar.mo65020c(), jzVar.mo65021d());
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m29848a(Iterable<? extends C10176jz<? extends K, ? extends V>> iterable) {
        C10263mq.m29882b(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10220lc.m29847a();
        }
        if (size != 1) {
            return C10220lc.m29849a(iterable, new LinkedHashMap(C10220lc.m29845a(collection.size())));
        }
        return C10220lc.m29846a((C10176jz) ((List) iterable).get(0));
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m29849a(Iterable<? extends C10176jz<? extends K, ? extends V>> iterable, M m) {
        C10263mq.m29882b(iterable, "$this$toMap");
        C10263mq.m29882b(m, "destination");
        C10220lc.m29850a(m, iterable);
        return m;
    }
}
