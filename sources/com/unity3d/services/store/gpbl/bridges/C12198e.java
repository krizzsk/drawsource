package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.C12090a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.bridges.e */
/* compiled from: PurchasesResultBridge */
public class C12198e extends C12090a {

    /* renamed from: e */
    private final Object f29756e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.e$a */
    /* compiled from: PurchasesResultBridge */
    class C12199a extends HashMap<String, Class<?>[]> {
        C12199a() {
            put("getBillingResult", new Class[0]);
            put("getPurchasesList", new Class[0]);
        }
    }

    public C12198e(Object obj) {
        super(new C12199a());
        this.f29756e = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    /* renamed from: i */
    public C12177a mo71384i() {
        return new C12177a(mo71233a("getBillingResult", this.f29756e, new Object[0]));
    }

    /* renamed from: j */
    public List<C12195c> mo71385j() {
        List<Object> list = (List) mo71233a("getPurchasesList", this.f29756e, new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object cVar : list) {
                arrayList.add(new C12195c(cVar));
            }
        }
        return arrayList;
    }
}
