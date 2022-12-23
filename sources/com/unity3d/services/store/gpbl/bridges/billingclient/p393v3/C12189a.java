package com.unity3d.services.store.gpbl.bridges.billingclient.p393v3;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.C12198e;
import com.unity3d.services.store.gpbl.bridges.billingclient.C12182b;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.C12184a;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.C12187b;
import com.unity3d.services.store.gpbl.proxies.C12210d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a */
/* compiled from: BillingClientBridge */
public class C12189a extends C12184a {

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a$a */
    /* compiled from: BillingClientBridge */
    class C12190a extends HashMap<String, Class<?>[]> {
        C12190a() {
            put("queryPurchases", new Class[]{String.class});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a$b */
    /* compiled from: BillingClientBridge */
    public static class C12191b extends C12187b {
        public C12191b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        /* renamed from: c */
        public C12182b mo71380c() throws ClassNotFoundException {
            return new C12189a(mo71233a("build", this.f29754e, new Object[0]));
        }
    }

    public C12189a(Object obj) throws ClassNotFoundException {
        super(obj, new C12190a());
    }

    /* renamed from: a */
    public void mo71376a(String str, C12210d dVar) {
        C12198e eVar = new C12198e(mo71233a("queryPurchases", this.f29753f, str));
        dVar.mo71398d().mo71400a(eVar.mo71384i(), eVar.mo71385j());
    }

    /* renamed from: a */
    public static C12191b m33209a(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C12191b(C12184a.m33197a("newBuilder", context));
    }
}
