package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.C12091b;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12195c;
import com.unity3d.services.store.listeners.C12213b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.c */
/* compiled from: PurchaseUpdatedListenerProxy */
public class C12209c extends C12091b {

    /* renamed from: a */
    private C12213b f29766a;

    public C12209c(C12213b bVar) {
        this.f29766a = bVar;
    }

    /* renamed from: c */
    public static Class<?> m33246c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesUpdatedListener");
    }

    /* renamed from: a */
    public Class<?> mo71238a() throws ClassNotFoundException {
        return m33246c();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onPurchasesUpdated")) {
            return super.invoke(obj, method, objArr);
        }
        mo71396a(objArr[0], objArr[1]);
        return null;
    }

    /* renamed from: a */
    public void mo71396a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object cVar : list) {
                arrayList.add(new C12195c(cVar));
            }
        } else {
            arrayList = null;
        }
        C12213b bVar = this.f29766a;
        if (bVar != null) {
            bVar.mo71355a(new C12177a(obj), arrayList);
        }
    }
}
