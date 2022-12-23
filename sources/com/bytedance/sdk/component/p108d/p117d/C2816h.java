package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.p111c.C2766a;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.h */
/* compiled from: FailVisitor */
public class C2816h extends C2808a {

    /* renamed from: a */
    private Throwable f6330a;

    /* renamed from: b */
    private int f6331b;

    /* renamed from: c */
    private String f6332c;

    /* renamed from: a */
    public String mo17677a() {
        return "failed";
    }

    public C2816h(int i, String str, Throwable th) {
        this.f6331b = i;
        this.f6332c = str;
        this.f6330a = th;
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        cVar.mo17605a(new C2766a(this.f6331b, this.f6332c, this.f6330a));
        String r = cVar.mo17627r();
        Map<String, List<C2790c>> f = cVar.mo17625p().mo17674f();
        List<C2790c> list = f.get(r);
        if (list == null) {
            m7795b(cVar);
            return;
        }
        synchronized (list) {
            for (C2790c b : list) {
                m7795b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private void m7795b(C2790c cVar) {
        C2832n f = cVar.mo17615f();
        if (f != null) {
            f.mo17178a(this.f6331b, this.f6332c, this.f6330a);
        }
    }
}
