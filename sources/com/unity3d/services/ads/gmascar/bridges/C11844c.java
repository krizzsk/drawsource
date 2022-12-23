package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.reflection.C12090a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.c */
/* compiled from: InitializationStatusBridge */
public class C11844c extends C12090a {

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.c$a */
    /* compiled from: InitializationStatusBridge */
    class C11845a extends HashMap<String, Class<?>[]> {
        C11845a() {
            put("getAdapterStatusMap", new Class[0]);
        }
    }

    public C11844c() {
        super(new C11845a());
    }

    /* renamed from: a */
    public Map<String, Object> mo70788a(Object obj) {
        return (Map) mo71233a("getAdapterStatusMap", obj, new Object[0]);
    }

    /* renamed from: g */
    public String mo70785g() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}
