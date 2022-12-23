package com.unity3d.services.store.gpbl.bridges.billingclient.p394v4;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.C12184a;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.C12187b;
import com.unity3d.services.store.gpbl.proxies.C12210d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a */
/* compiled from: BillingClientBridge */
public class C12192a extends C12184a {

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a$a */
    /* compiled from: BillingClientBridge */
    class C12193a extends HashMap<String, Class<?>[]> {
        C12193a() throws ClassNotFoundException {
            put("queryPurchasesAsync", new Class[]{String.class, C12210d.m33249c()});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a$b */
    /* compiled from: BillingClientBridge */
    public static class C12194b extends C12187b {
        public C12194b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        /* renamed from: i */
        public C12184a mo71380c() throws ClassNotFoundException {
            return new C12192a(mo71233a("build", this.f29754e, new Object[0]));
        }
    }

    public C12192a(Object obj) throws ClassNotFoundException {
        super(obj, new C12193a());
    }

    /* renamed from: j */
    public static boolean m33213j() {
        try {
            Class<?> i = C12184a.m33199i();
            i.getMethod("queryPurchasesAsync", new Class[]{String.class, C12210d.m33249c()});
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo71376a(String str, C12210d dVar) throws ClassNotFoundException {
        mo71234b("queryPurchasesAsync", this.f29753f, str, dVar.mo71239b());
    }

    /* renamed from: a */
    public static C12194b m33212a(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C12194b(C12184a.m33197a("newBuilder", context));
    }
}
