package com.mbridge.msdk.foundation.same.p301b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.b */
/* compiled from: DirectoryContext */
public abstract class C8475b {

    /* renamed from: a */
    protected C8474a f20789a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C8474a> mo57878b();

    public C8475b(String str) {
        C8474a aVar = new C8474a();
        aVar.mo57871a(str);
        aVar.mo57869a(C8476c.AD_ROOT);
        List<C8474a> b = mo57878b();
        if (b != null && b.size() > 0) {
            aVar.mo57872a(b);
        }
        this.f20789a = aVar;
    }

    /* renamed from: a */
    public final C8474a mo57876a() {
        return this.f20789a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8474a mo57877a(ArrayList<C8474a> arrayList, C8476c cVar, String str) {
        C8474a aVar = new C8474a();
        aVar.mo57869a(cVar);
        aVar.mo57871a(str);
        arrayList.add(aVar);
        return aVar;
    }
}
