package com.ogury.p377ed.internal;

import java.util.Collection;

/* renamed from: com.ogury.ed.internal.kp */
class C10193kp extends C10192ko {
    /* renamed from: a */
    public static final <T> int m29760a(Iterable<? extends T> iterable) {
        C10263mq.m29882b(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
