package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.reflection.C12090a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.a */
/* compiled from: AdapterStatusBridge */
public class C11841a extends C12090a {

    /* renamed from: e */
    private Class f28763e;

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.a$a */
    /* compiled from: AdapterStatusBridge */
    class C11842a extends HashMap<String, Class<?>[]> {
        C11842a() {
            put("getInitializationState", new Class[0]);
        }
    }

    public C11841a() {
        super(new C11842a());
        C11843b bVar = new C11843b();
        try {
            this.f28763e = Class.forName(bVar.mo70787a());
        } catch (ClassNotFoundException e) {
            C12065a.m32843a("ERROR: Could not find class %s %s", bVar.mo70787a(), e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public boolean mo70784a(Object obj) {
        Object[] i = mo70786i();
        if (i == null) {
            C12065a.m32845b("ERROR: Could not get adapter states enum from AdapterStatus.State");
            return false;
        } else if (mo71233a("getInitializationState", obj, new Object[0]) == i[1]) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    /* renamed from: i */
    public Object[] mo70786i() {
        return this.f28763e.getEnumConstants();
    }
}
