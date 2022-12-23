package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.ads.gmascar.listeners.C11860a;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.reflection.C12090a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.d */
/* compiled from: InitializeListenerBridge */
public class C11846d extends C12090a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11860a f28764e;

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.d$a */
    /* compiled from: InitializeListenerBridge */
    class C11847a extends HashMap<String, Class<?>[]> {
        C11847a() throws RuntimeException, Error {
            try {
                put("onInitializationComplete", new Class[]{Class.forName("com.google.android.gms.ads.initialization.InitializationStatus")});
            } catch (ClassNotFoundException e) {
                C12065a.m32843a("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.d$b */
    /* compiled from: InitializeListenerBridge */
    class C11848b implements InvocationHandler {
        C11848b() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onInitializationComplete") || C11846d.this.f28764e == null) {
                return null;
            }
            C11846d.this.f28764e.mo70801a(objArr[0]);
            return null;
        }
    }

    public C11846d() {
        super(new C11847a());
    }

    /* renamed from: g */
    public String mo70785g() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    /* renamed from: i */
    public Object mo70790i() {
        try {
            return Proxy.newProxyInstance(mo71235e().getClassLoader(), new Class[]{mo71235e()}, new C11848b());
        } catch (Exception unused) {
            C12065a.m32845b("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    /* renamed from: a */
    public void mo70789a(C11860a aVar) {
        this.f28764e = aVar;
    }
}
