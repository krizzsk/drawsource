package com.unity3d.services.core.request.metrics;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.h */
/* compiled from: MetricsContainer */
public class C12119h {

    /* renamed from: a */
    private final C12114e f29586a;

    /* renamed from: b */
    private final List<C12113d> f29587b;

    /* renamed from: c */
    private final String f29588c;

    public C12119h(String str, C12114e eVar, List<C12113d> list) {
        this.f29588c = str;
        this.f29586a = eVar;
        this.f29587b = list;
    }

    /* renamed from: a */
    public Map<String, Object> mo71287a() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C12113d a : this.f29587b) {
            arrayList.add(a.mo71272a());
        }
        hashMap.put("msr", this.f29588c);
        hashMap.put(InneractiveMediationDefs.GENDER_MALE, arrayList);
        hashMap.put("t", this.f29586a.mo71277a());
        return hashMap;
    }
}
