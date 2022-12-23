package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.p111c.C2790c;

/* renamed from: com.bytedance.sdk.component.d.d.l */
/* compiled from: RawCacheVisitor */
public class C2821l extends C2808a {
    /* renamed from: a */
    public String mo17677a() {
        return "raw_cache";
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        byte[] bArr = (byte[]) cVar.mo17625p().mo17668b(cVar.mo17626q()).mo17521a(cVar.mo17616g());
        if (bArr == null) {
            cVar.mo17609a((C2817i) new C2814f());
        } else {
            cVar.mo17609a((C2817i) new C2809b(bArr, (C2824f) null));
        }
    }
}
