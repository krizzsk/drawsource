package bitter.jnibridge;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JNIBridge {

    /* renamed from: bitter.jnibridge.JNIBridge$a */
    private static class C0649a implements InvocationHandler {

        /* renamed from: a */
        private Object f49a = new Object[0];

        /* renamed from: b */
        private long f50b;

        /* renamed from: c */
        private Constructor f51c;

        public C0649a(long j) {
            this.f50b = j;
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                Constructor<MethodHandles.Lookup> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                this.f51c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError unused) {
                this.f51c = null;
            } catch (NoSuchMethodException unused2) {
                this.f51c = null;
            }
        }

        /* renamed from: a */
        private Object m32a(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Class<?> declaringClass = method.getDeclaringClass();
            return ((MethodHandles.Lookup) this.f51c.newInstance(new Object[]{declaringClass, 2})).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }

        /* renamed from: a */
        public final void mo10094a() {
            synchronized (this.f49a) {
                this.f50b = 0;
            }
        }

        public final void finalize() {
            synchronized (this.f49a) {
                if (this.f50b != 0) {
                    JNIBridge.delete(this.f50b);
                }
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f49a) {
                if (this.f50b == 0) {
                    return null;
                }
                try {
                    Object invoke = JNIBridge.invoke(this.f50b, method.getDeclaringClass(), method, objArr);
                    return invoke;
                } catch (NoSuchMethodError e) {
                    if (this.f51c == null) {
                        System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                        throw e;
                    } else if ((method.getModifiers() & 1024) == 0) {
                        return m32a(obj, method, objArr);
                    } else {
                        throw e;
                    }
                }
            }
        }
    }

    static native void delete(long j);

    static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            ((C0649a) Proxy.getInvocationHandler(obj)).mo10094a();
        }
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new C0649a(j));
    }
}
