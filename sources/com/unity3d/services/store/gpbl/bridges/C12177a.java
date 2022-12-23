package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.C12090a;
import com.unity3d.services.store.gpbl.C12175a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.a */
/* compiled from: BillingResultBridge */
public class C12177a extends C12090a {

    /* renamed from: e */
    private final Object f29750e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.a$a */
    /* compiled from: BillingResultBridge */
    class C12178a extends HashMap<String, Class<?>[]> {
        C12178a() {
            put("getResponseCode", new Class[0]);
        }
    }

    public C12177a(Object obj) {
        super(new C12178a());
        this.f29750e = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.BillingResult";
    }

    /* renamed from: i */
    public C12175a mo71370i() {
        return C12175a.m33179a(((Integer) mo71233a("getResponseCode", this.f29750e, new Object[0])).intValue());
    }
}
