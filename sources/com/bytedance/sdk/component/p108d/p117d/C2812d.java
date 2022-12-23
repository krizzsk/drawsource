package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2759b;
import com.bytedance.sdk.component.p108d.p111c.C2790c;

/* renamed from: com.bytedance.sdk.component.d.d.d */
/* compiled from: CachePolicyVisitor */
public class C2812d extends C2808a {
    /* renamed from: a */
    public String mo17677a() {
        return "cache_policy";
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        C2759b q = cVar.mo17626q();
        if (q != null) {
            if (q.mo17529c()) {
                cVar.mo17609a((C2817i) new C2818j());
                return;
            } else if (q.mo17530d()) {
                cVar.mo17609a((C2817i) new C2814f());
                return;
            }
        }
        cVar.mo17609a((C2817i) new C2819k());
    }
}
