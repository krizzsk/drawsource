package com.ogury.p377ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.mq */
public class C10263mq {
    private C10263mq() {
    }

    /* renamed from: a */
    public static String m29874a(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: a */
    public static void m29878a(Object obj) {
        if (obj == null) {
            m29877a();
        }
    }

    /* renamed from: a */
    private static void m29877a() {
        throw ((NullPointerException) m29875a(new NullPointerException()));
    }

    /* renamed from: b */
    private static void m29883b(String str) {
        throw ((C10181kd) m29875a(new C10181kd(str)));
    }

    /* renamed from: a */
    public static void m29880a(String str) {
        m29883b("lateinit property " + str + " has not been initialized");
    }

    /* renamed from: a */
    public static void m29879a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m29875a(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: b */
    public static void m29882b(Object obj, String str) {
        if (obj == null) {
            m29884c(str);
        }
    }

    /* renamed from: c */
    private static void m29884c(String str) {
        throw ((NullPointerException) m29875a(new NullPointerException(m29885d(str))));
    }

    /* renamed from: d */
    private static String m29885d(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: a */
    public static boolean m29881a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m29875a(T t) {
        return m29876a(t, C10263mq.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m29876a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
