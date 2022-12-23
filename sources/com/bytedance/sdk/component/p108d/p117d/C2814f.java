package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2765c;
import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.p111c.C2790c;

/* renamed from: com.bytedance.sdk.component.d.d.f */
/* compiled from: DiskCacheVisitor */
public class C2814f extends C2808a {
    /* renamed from: a */
    public String mo17677a() {
        return "disk_cache";
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        String g = cVar.mo17616g();
        C2765c c = cVar.mo17625p().mo17670c(cVar.mo17626q());
        if (c == null) {
            cVar.mo17609a((C2817i) new C2819k());
            return;
        }
        byte[] bArr = (byte[]) c.mo17521a(g);
        if (bArr == null) {
            cVar.mo17609a((C2817i) new C2819k());
            return;
        }
        cVar.mo17609a((C2817i) new C2809b(bArr, (C2824f) null));
        cVar.mo17625p().mo17668b(cVar.mo17626q()).mo17522a(g, bArr);
    }
}
