package com.mbridge.msdk.foundation.same.p301b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.a */
/* compiled from: Directory */
public final class C8474a {

    /* renamed from: a */
    private C8476c f20785a;

    /* renamed from: b */
    private String f20786b;

    /* renamed from: c */
    private C8474a f20787c;

    /* renamed from: d */
    private List<C8474a> f20788d;

    /* renamed from: a */
    public final C8476c mo57868a() {
        return this.f20785a;
    }

    /* renamed from: a */
    public final void mo57869a(C8476c cVar) {
        this.f20785a = cVar;
    }

    /* renamed from: b */
    public final String mo57873b() {
        return this.f20786b;
    }

    /* renamed from: a */
    public final void mo57871a(String str) {
        this.f20786b = str;
    }

    /* renamed from: c */
    public final C8474a mo57874c() {
        return this.f20787c;
    }

    /* renamed from: d */
    public final List<C8474a> mo57875d() {
        return this.f20788d;
    }

    /* renamed from: a */
    private void m24289a(C8474a aVar) {
        if (this.f20788d == null) {
            this.f20788d = new ArrayList();
        }
        aVar.f20787c = this;
        this.f20788d.add(aVar);
    }

    /* renamed from: a */
    public final void mo57870a(C8476c cVar, String str) {
        C8474a aVar = new C8474a();
        aVar.f20785a = cVar;
        aVar.f20786b = str;
        m24289a(aVar);
    }

    /* renamed from: a */
    public final void mo57872a(List<C8474a> list) {
        if (list != null && list.size() != 0) {
            for (C8474a a : list) {
                m24289a(a);
            }
        }
    }
}
