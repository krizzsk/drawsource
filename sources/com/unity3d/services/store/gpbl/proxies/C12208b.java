package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.C12091b;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12197d;
import com.unity3d.services.store.listeners.C12212a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.b */
/* compiled from: PurchaseHistoryResponseListenerProxy */
public class C12208b extends C12091b {

    /* renamed from: a */
    private C12212a f29764a;

    /* renamed from: b */
    private int f29765b;

    public C12208b(C12212a aVar, int i) {
        this.f29764a = aVar;
        this.f29765b = i;
    }

    /* renamed from: c */
    public static Class<?> m33243c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    /* renamed from: a */
    public Class<?> mo71238a() throws ClassNotFoundException {
        return m33243c();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onPurchaseHistoryResponse")) {
            return super.invoke(obj, method, objArr);
        }
        mo71395a(objArr[0], objArr[1]);
        return null;
    }

    /* renamed from: a */
    public void mo71395a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            int i = 0;
            while (i < this.f29765b && i < list.size()) {
                arrayList.add(new C12197d(list.get(i)));
                i++;
            }
        } else {
            arrayList = null;
        }
        C12212a aVar = this.f29764a;
        if (aVar != null) {
            aVar.mo71358a(new C12177a(obj), arrayList);
        }
    }
}
