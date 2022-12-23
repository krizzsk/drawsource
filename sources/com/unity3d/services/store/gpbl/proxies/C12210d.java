package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.C12091b;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12195c;
import com.unity3d.services.store.listeners.C12214c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.d */
/* compiled from: PurchasesResponseListenerProxy */
public class C12210d extends C12091b {

    /* renamed from: a */
    private C12214c f29767a;

    public C12210d(C12214c cVar) {
        this.f29767a = cVar;
    }

    /* renamed from: c */
    public static Class<?> m33249c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    /* renamed from: a */
    public Class<?> mo71238a() throws ClassNotFoundException {
        return m33249c();
    }

    /* renamed from: d */
    public C12214c mo71398d() {
        return this.f29767a;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onQueryPurchasesResponse")) {
            return super.invoke(obj, method, objArr);
        }
        mo71397a(objArr[0], objArr[1]);
        return null;
    }

    /* renamed from: a */
    public void mo71397a(Object obj, List<Object> list) {
        ArrayList arrayList;
        C12177a aVar = new C12177a(obj);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object cVar : list) {
                arrayList.add(new C12195c(cVar));
            }
        } else {
            arrayList = null;
        }
        C12214c cVar2 = this.f29767a;
        if (cVar2 != null) {
            cVar2.mo71400a(aVar, arrayList);
        }
    }
}
