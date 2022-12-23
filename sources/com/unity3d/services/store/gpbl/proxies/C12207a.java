package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.C12091b;
import com.unity3d.services.store.gpbl.C12176b;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.services.store.gpbl.proxies.a */
/* compiled from: BillingClientStateListenerProxy */
public class C12207a extends C12091b {

    /* renamed from: a */
    private static String f29761a = "onBillingServiceDisconnected";

    /* renamed from: b */
    private static String f29762b = "onBillingSetupFinished";

    /* renamed from: c */
    private C12176b f29763c;

    public C12207a(C12176b bVar) {
        this.f29763c = bVar;
    }

    /* renamed from: c */
    public static Class<?> m33240c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    /* renamed from: d */
    private void m33241d() {
        C12176b bVar = this.f29763c;
        if (bVar != null) {
            bVar.mo71356a();
        }
    }

    /* renamed from: a */
    public Class<?> mo71238a() throws ClassNotFoundException {
        return m33240c();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(f29762b)) {
            m33239a(objArr[0]);
        } else if (!method.getName().equals(f29761a)) {
            return super.invoke(obj, method, objArr);
        } else {
            m33241d();
        }
        return null;
    }

    /* renamed from: a */
    private void m33239a(Object obj) {
        C12176b bVar = this.f29763c;
        if (bVar != null) {
            bVar.mo71357a(new C12177a(obj));
        }
    }
}
