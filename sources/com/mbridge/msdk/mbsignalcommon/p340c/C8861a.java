package com.mbridge.msdk.mbsignalcommon.p340c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbsignalcommon.c.a */
/* compiled from: Mapping */
public final class C8861a {

    /* renamed from: a */
    private static C8862a f21841a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a */
    /* compiled from: Mapping */
    public interface C8862a {
        /* renamed from: a */
        boolean mo58590a(C8863b.C8864a aVar);
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b */
    /* compiled from: Mapping */
    public static abstract class C8863b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a */
        /* compiled from: Mapping */
        public static class C8864a extends Throwable {

            /* renamed from: a */
            private Class<?> f21842a;

            /* renamed from: b */
            private String f21843b;

            public C8864a(String str) {
                super(str);
            }

            public C8864a(Exception exc) {
                super(exc);
            }

            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            /* renamed from: a */
            public final void mo58591a(Class<?> cls) {
                this.f21842a = cls;
            }

            /* renamed from: a */
            public final void mo58592a(String str) {
                this.f21843b = str;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$d */
    /* compiled from: Mapping */
    public static class C8866d {

        /* renamed from: a */
        protected final Method f21845a;

        /* renamed from: a */
        public final Object mo58595a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            try {
                return this.f21845a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        C8866d(Class<?> cls, String str, Class<?>[] clsArr, int i) throws C8863b.C8864a {
            Method method = null;
            Class<? super Object> cls2 = cls;
            if (cls == null) {
                this.f21845a = null;
                return;
            }
            while (true) {
                if (cls2 == Object.class) {
                    break;
                }
                try {
                    method = cls2.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        C8863b.C8864a aVar = new C8863b.C8864a(e3);
                        aVar.mo58591a(cls2);
                        aVar.mo58592a(str);
                        C8861a.m25579b(aVar);
                    } catch (Throwable th) {
                        this.f21845a = null;
                        throw th;
                    }
                }
                cls2 = cls2.getSuperclass();
            }
            if (i > 0 && (method.getModifiers() & i) != i) {
                C8861a.m25579b(new C8863b.C8864a(method + " does not match modifiers: " + i));
            }
            method.setAccessible(true);
            this.f21845a = method;
        }

        /* renamed from: a */
        public final Method mo58596a() {
            return this.f21845a;
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$c */
    /* compiled from: Mapping */
    public static class C8865c<C> {

        /* renamed from: a */
        protected Class<C> f21844a;

        /* renamed from: a */
        public final C8866d mo58594a(String str, Class<?>... clsArr) throws C8863b.C8864a {
            return new C8866d(this.f21844a, str, clsArr, 0);
        }

        public C8865c(Class<C> cls) {
            this.f21844a = cls;
        }
    }

    /* renamed from: a */
    public static <T> C8865c<T> m25577a(ClassLoader classLoader, String str) throws C8863b.C8864a {
        try {
            return new C8865c<>(classLoader.loadClass(str));
        } catch (Exception e) {
            m25579b(new C8863b.C8864a(e));
            return new C8865c<>((Class) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m25579b(C8863b.C8864a aVar) throws C8863b.C8864a {
        C8862a aVar2 = f21841a;
        if (aVar2 == null || !aVar2.mo58590a(aVar)) {
            throw aVar;
        }
    }
}
