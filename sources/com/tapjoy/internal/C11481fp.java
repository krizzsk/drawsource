package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.tapjoy.internal.fp */
public final class C11481fp {
    /* renamed from: a */
    public static <T> T m31447a(T t, Class<T> cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C11482a(t, Thread.currentThread(), Looper.myLooper()));
    }

    /* renamed from: com.tapjoy.internal.fp$a */
    static class C11482a implements InvocationHandler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Object f27559a;

        /* renamed from: b */
        private final Thread f27560b;

        /* renamed from: c */
        private final Looper f27561c;

        public C11482a(Object obj, Thread thread, Looper looper) {
            this.f27559a = obj;
            this.f27560b = thread;
            this.f27561c = looper;
        }

        public final Object invoke(Object obj, final Method method, final Object[] objArr) {
            if (this.f27560b == Thread.currentThread()) {
                return method.invoke(this.f27559a, objArr);
            }
            if (method.getReturnType().equals(Void.TYPE)) {
                C114831 r4 = new Runnable() {
                    public final void run() {
                        try {
                            method.invoke(C11482a.this.f27559a, objArr);
                        } catch (IllegalArgumentException e) {
                            throw C11535gt.m31574a(e);
                        } catch (IllegalAccessException e2) {
                            throw C11535gt.m31574a(e2);
                        } catch (InvocationTargetException e3) {
                            throw C11535gt.m31574a(e3);
                        }
                    }
                };
                if (this.f27561c != null && new Handler(this.f27561c).post(r4)) {
                    return null;
                }
                if (this.f27560b == C11544hb.m31601b() && C11544hb.f27700a.mo69681a(r4)) {
                    return null;
                }
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null || !new Handler(mainLooper).post(r4)) {
                    return method.invoke(this.f27559a, objArr);
                }
                return null;
            }
            throw new UnsupportedOperationException("method not return void: " + method.getName());
        }
    }
}
