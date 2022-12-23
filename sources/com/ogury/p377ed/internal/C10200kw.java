package com.ogury.p377ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kw */
class C10200kw extends C10199kv {
    /* renamed from: b */
    public static final <T> T m29765b(List<? extends T> list) {
        C10263mq.m29882b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public static final <T> T m29767c(List<? extends T> list) {
        C10263mq.m29882b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C10190km.m29755a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a */
    public static final <T> List<T> m29764a(Collection<? extends T> collection) {
        C10263mq.m29882b(collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    /* renamed from: b */
    public static final <T> boolean m29766b(Iterable<? extends T> iterable) {
        C10263mq.m29882b(iterable, "$this$none");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
