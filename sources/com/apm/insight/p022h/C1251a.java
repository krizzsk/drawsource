package com.apm.insight.p022h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.h.a */
public class C1251a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f1193a;

    /* renamed from: com.apm.insight.h.a$a */
    public static class C1252a<T> {

        /* renamed from: a */
        public final Class<? extends T> f1194a;

        /* renamed from: b */
        public final T f1195b;
    }

    static {
        HashMap hashMap = new HashMap();
        f1193a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f1193a.put(Byte.class, Byte.TYPE);
        f1193a.put(Character.class, Character.TYPE);
        f1193a.put(Short.class, Short.TYPE);
        f1193a.put(Integer.class, Integer.TYPE);
        f1193a.put(Float.class, Float.TYPE);
        f1193a.put(Long.class, Long.TYPE);
        f1193a.put(Double.class, Double.TYPE);
        f1193a.put(Boolean.TYPE, Boolean.TYPE);
        f1193a.put(Byte.TYPE, Byte.TYPE);
        f1193a.put(Character.TYPE, Character.TYPE);
        f1193a.put(Short.TYPE, Short.TYPE);
        f1193a.put(Integer.TYPE, Integer.TYPE);
        f1193a.put(Float.TYPE, Float.TYPE);
        f1193a.put(Long.TYPE, Long.TYPE);
        f1193a.put(Double.TYPE, Double.TYPE);
    }

    /* renamed from: a */
    public static <T> T m1626a(Class<?> cls, String str, Object... objArr) {
        return m1628a(cls, str, (Class<?>[]) m1631a(objArr)).invoke((Object) null, m1632b(objArr));
    }

    /* renamed from: a */
    public static <T> T m1627a(String str, String str2, Object... objArr) {
        try {
            return m1626a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m1628a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m1629a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m1628a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m1629a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m1630a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static boolean m1630a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f1193a.containsKey(clsArr[i]) || !f1193a.get(clsArr[i]).equals(f1193a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m1631a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C1252a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C1252a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f1194a;
            }
        }
        return clsArr;
    }

    /* renamed from: b */
    private static Object[] m1632b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C1252a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C1252a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f1195b;
            }
        }
        return objArr2;
    }
}
