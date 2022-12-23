package com.ogury.p377ed.internal;

import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mw */
public class C10269mw {
    /* renamed from: a */
    private static <T extends Throwable> T m29898a(T t) {
        return C10263mq.m29876a(t, C10269mw.class.getName());
    }

    /* renamed from: a */
    private static void m29899a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m29900a(name + " cannot be cast to " + str);
    }

    /* renamed from: a */
    private static void m29900a(String str) {
        throw m29896a(new ClassCastException(str));
    }

    /* renamed from: a */
    private static ClassCastException m29896a(ClassCastException classCastException) {
        throw ((ClassCastException) m29898a(classCastException));
    }

    /* renamed from: a */
    public static Iterable m29897a(Object obj) {
        if ((obj instanceof C10270mx) && !(obj instanceof C10272mz)) {
            m29899a(obj, "kotlin.collections.MutableIterable");
        }
        return m29903d(obj);
    }

    /* renamed from: d */
    private static Iterable m29903d(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m29896a(e);
        }
    }

    /* renamed from: b */
    public static List m29901b(Object obj) {
        if ((obj instanceof C10270mx) && !(obj instanceof C10274na)) {
            m29899a(obj, "kotlin.collections.MutableList");
        }
        return m29904e(obj);
    }

    /* renamed from: e */
    private static List m29904e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m29896a(e);
        }
    }

    /* renamed from: c */
    public static Map m29902c(Object obj) {
        if ((obj instanceof C10270mx) && !(obj instanceof C10275nb)) {
            m29899a(obj, "kotlin.collections.MutableMap");
        }
        return m29905f(obj);
    }

    /* renamed from: f */
    private static Map m29905f(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m29896a(e);
        }
    }
}
