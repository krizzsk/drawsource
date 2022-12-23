package com.bytedance.sdk.component.p108d.p117d;

import android.text.TextUtils;
import com.bytedance.sdk.component.p108d.C2829k;
import com.bytedance.sdk.component.p108d.p111c.C2790c;

/* renamed from: com.bytedance.sdk.component.d.d.c */
/* compiled from: CacheKeyVisitor */
public class C2811c extends C2808a {
    /* renamed from: a */
    public String mo17677a() {
        return "generate_key";
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        if (TextUtils.isEmpty(cVar.mo17614e())) {
            C2829k d = cVar.mo17625p().mo17672d();
            cVar.mo17611b(d.mo17525a(cVar));
            cVar.mo17607a(d.mo17526b(cVar));
        }
        cVar.mo17609a((C2817i) new C2815g());
    }
}
