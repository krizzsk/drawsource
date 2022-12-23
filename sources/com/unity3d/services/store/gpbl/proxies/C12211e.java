package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.C12091b;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12200f;
import com.unity3d.services.store.listeners.C12215d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.e */
/* compiled from: SkuDetailsResponseListenerProxy */
public class C12211e extends C12091b {

    /* renamed from: a */
    private C12215d f29768a;

    public C12211e(C12215d dVar) {
        this.f29768a = dVar;
    }

    /* renamed from: c */
    public static Class<?> m33253c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
    }

    /* renamed from: a */
    public Class<?> mo71238a() throws ClassNotFoundException {
        return m33253c();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onSkuDetailsResponse")) {
            return super.invoke(obj, method, objArr);
        }
        mo71399a(objArr[0], objArr[1]);
        return null;
    }

    /* renamed from: a */
    public void mo71399a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object fVar : list) {
                arrayList.add(new C12200f(fVar));
            }
        } else {
            arrayList = null;
        }
        C12215d dVar = this.f29768a;
        if (dVar != null) {
            dVar.mo71359a(new C12177a(obj), arrayList);
        }
    }
}
