package com.ogury.p376cm.internal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.ogury.cm.internal.bbabc */
public class bbabc {
    private bbabc() {
    }

    /* renamed from: a */
    private static <T extends Throwable> T m28046a(T t) {
        return m28047a(t, bbabc.class.getName());
    }

    /* renamed from: a */
    private static <T extends Throwable> T m28047a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public static void m28048a() {
        throw ((babba) m28046a(new babba()));
    }

    /* renamed from: a */
    public static void m28049a(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m28046a(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: a */
    public static void m28050a(String str) {
        throw ((babcb) m28046a(new babcb("lateinit property " + str + " has not been initialized")));
    }

    /* renamed from: a */
    public static boolean m28051a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m28052b(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            throw ((IllegalArgumentException) m28046a(new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str)));
        }
    }
}
