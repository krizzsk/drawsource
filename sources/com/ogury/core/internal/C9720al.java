package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.al */
/* compiled from: TypeIntrinsics */
public class C9720al {
    /* renamed from: a */
    private static <T extends Throwable> T m28148a(T t) {
        return C9717ai.m28142a(t, C9720al.class.getName());
    }

    /* renamed from: a */
    public static Iterable m28147a(Object obj) {
        if (!(obj instanceof C9721am) || (obj instanceof C9722an)) {
            return m28149b(obj);
        }
        String name = obj == null ? "null" : obj.getClass().getName();
        throw ((ClassCastException) m28148a(new ClassCastException(name + " cannot be cast to " + "kotlin.collections.MutableIterable")));
    }

    /* renamed from: b */
    private static Iterable m28149b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) m28148a(e));
        }
    }
}
