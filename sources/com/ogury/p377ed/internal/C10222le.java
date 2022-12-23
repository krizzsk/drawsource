package com.ogury.p377ed.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.le */
class C10222le extends C10221ld {
    /* renamed from: a */
    public static final int m29845a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m29846a(C10176jz<? extends K, ? extends V> jzVar) {
        C10263mq.m29882b(jzVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jzVar.mo65018a(), jzVar.mo65019b());
        C10263mq.m29879a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }
}
