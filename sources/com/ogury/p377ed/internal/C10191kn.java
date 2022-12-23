package com.ogury.p377ed.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.kn */
class C10191kn {
    /* renamed from: a */
    public static final <T> List<T> m29753a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C10263mq.m29879a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m29754a(T[] tArr, boolean z) {
        C10263mq.m29882b(tArr, "$this$copyToArrayOfAny");
        if (z && C10263mq.m29881a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C10263mq.m29879a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
