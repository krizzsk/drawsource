package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.core.reflection.C12090a;
import com.unity3d.services.store.gpbl.bridges.billingclient.C12183c;
import com.unity3d.services.store.gpbl.proxies.C12209c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.b */
/* compiled from: BillingClientBuilderBridgeCommon */
public abstract class C12187b extends C12090a implements C12183c {

    /* renamed from: e */
    protected Object f29754e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.b$a */
    /* compiled from: BillingClientBuilderBridgeCommon */
    class C12188a extends HashMap<String, Class<?>[]> {
        C12188a() throws ClassNotFoundException {
            put("setListener", new Class[]{C12209c.m33246c()});
            put("enablePendingPurchases", new Class[0]);
            put("build", new Class[0]);
        }
    }

    public C12187b(Object obj) throws ClassNotFoundException {
        super(new C12188a());
        this.f29754e = obj;
    }

    /* renamed from: a */
    public C12183c mo71379a(C12209c cVar) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this.f29754e = mo71233a("setListener", this.f29754e, cVar.mo71239b());
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    /* renamed from: a */
    public C12183c mo71378a() {
        this.f29754e = mo71233a("enablePendingPurchases", this.f29754e, new Object[0]);
        return this;
    }
}
