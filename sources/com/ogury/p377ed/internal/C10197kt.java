package com.ogury.p377ed.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.ogury.ed.internal.kt */
class C10197kt extends C10196ks {
    /* renamed from: a */
    private static final <T> boolean m29761a(Iterable<? extends T> iterable, C10228lk<? super T, Boolean> lkVar) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (lkVar.mo64242a(it.next()).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final <T> boolean m29762a(List<T> list, C10228lk<? super T, Boolean> lkVar) {
        C10263mq.m29882b(list, "$this$removeAll");
        C10263mq.m29882b(lkVar, "predicate");
        return m29763b(list, lkVar);
    }

    /* renamed from: b */
    private static final <T> boolean m29763b(List<T> list, C10228lk<? super T, Boolean> lkVar) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C10190km.m29755a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!lkVar.mo64242a(t).booleanValue()) {
                        if (i != i2) {
                            list.set(i, t);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C10190km.m29755a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m29761a(C10269mw.m29897a((Object) list), lkVar);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
