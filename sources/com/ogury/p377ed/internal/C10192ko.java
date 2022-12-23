package com.ogury.p377ed.internal;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ko */
class C10192ko extends C10191kn {
    /* renamed from: a */
    public static final <T> Collection<T> m29756a(T[] tArr) {
        C10263mq.m29882b(tArr, "$this$asCollection");
        return new C10183kf<>(tArr);
    }

    /* renamed from: a */
    public static final <T> List<T> m29757a() {
        return C10202ky.f25546a;
    }

    /* renamed from: b */
    public static final <T> List<T> m29758b(T... tArr) {
        C10263mq.m29882b(tArr, "elements");
        return tArr.length > 0 ? C10184kg.m29746a(tArr) : C10190km.m29757a();
    }

    /* renamed from: a */
    public static final <T> int m29755a(List<? extends T> list) {
        C10263mq.m29882b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: b */
    public static final void m29759b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
