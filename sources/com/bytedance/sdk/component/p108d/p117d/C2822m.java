package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import com.bytedance.sdk.component.p108d.p111c.C2800d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.m */
/* compiled from: SuccessVisitor */
public class C2822m<T> extends C2808a {

    /* renamed from: a */
    private T f6337a;

    /* renamed from: b */
    private C2824f f6338b;

    /* renamed from: c */
    private boolean f6339c;

    /* renamed from: a */
    public String mo17677a() {
        return "success";
    }

    public C2822m(T t, C2824f fVar, boolean z) {
        this.f6337a = t;
        this.f6338b = fVar;
        this.f6339c = z;
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        String r = cVar.mo17627r();
        Map<String, List<C2790c>> f = cVar.mo17625p().mo17674f();
        List<C2790c> list = f.get(r);
        if (list == null) {
            m7808b(cVar);
            return;
        }
        synchronized (list) {
            for (C2790c b : list) {
                m7808b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private Map<String, String> m7807b() {
        C2824f fVar = this.f6338b;
        if (fVar != null) {
            return fVar.mo17542e();
        }
        return null;
    }

    /* renamed from: b */
    private void m7808b(C2790c cVar) {
        C2832n f = cVar.mo17615f();
        if (f != null) {
            f.mo17179a(new C2800d().mo17645a(cVar, this.f6337a, m7807b(), this.f6339c));
        }
    }
}
