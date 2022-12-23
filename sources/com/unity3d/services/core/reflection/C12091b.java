package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.unity3d.services.core.reflection.b */
/* compiled from: GenericListenerProxy */
public abstract class C12091b implements InvocationHandler {
    /* renamed from: a */
    public abstract Class<?> mo71238a() throws ClassNotFoundException;

    /* renamed from: b */
    public Object mo71239b() throws ClassNotFoundException {
        return Proxy.newProxyInstance(mo71238a().getClassLoader(), new Class[]{mo71238a()}, this);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return method.invoke(this, objArr);
    }
}
