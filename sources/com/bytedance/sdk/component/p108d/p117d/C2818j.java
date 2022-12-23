package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.p108d.p111c.C2790c;

/* renamed from: com.bytedance.sdk.component.d.d.j */
/* compiled from: MemoryCacheVisitor */
public class C2818j extends C2808a {
    /* renamed from: a */
    public String mo17677a() {
        return "memory_cache";
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        Object obj;
        C2838t i = cVar.mo17618i();
        if (i == C2838t.BITMAP || i == C2838t.AUTO) {
            obj = cVar.mo17625p().mo17666a(cVar.mo17626q()).mo17521a(cVar.mo17614e());
        } else {
            obj = null;
        }
        if (obj == null) {
            cVar.mo17609a((C2817i) new C2821l());
        } else {
            cVar.mo17609a((C2817i) new C2822m(obj, (C2824f) null, false));
        }
    }
}
