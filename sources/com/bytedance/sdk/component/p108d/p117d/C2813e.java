package com.bytedance.sdk.component.p108d.p117d;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import com.bytedance.sdk.component.p108d.p111c.C2804f;

/* renamed from: com.bytedance.sdk.component.d.d.e */
/* compiled from: DecoderVisitor */
public class C2813e extends C2808a {

    /* renamed from: a */
    private byte[] f6328a;

    /* renamed from: b */
    private C2824f f6329b;

    /* renamed from: a */
    public String mo17677a() {
        return "decode";
    }

    public C2813e(byte[] bArr, C2824f fVar) {
        this.f6328a = bArr;
        this.f6329b = fVar;
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        C2804f p = cVar.mo17625p();
        try {
            Bitmap a = p.mo17664a(cVar).mo17602a(this.f6328a);
            if (a != null) {
                cVar.mo17609a((C2817i) new C2822m(a, this.f6329b, false));
                p.mo17666a(cVar.mo17626q()).mo17522a(cVar.mo17614e(), a);
                return;
            }
            m7788a(1002, "decode failed bitmap null", (Throwable) null, cVar);
        } catch (Throwable th) {
            m7788a(1002, "decode failed:" + th.getMessage(), th, cVar);
        }
    }

    /* renamed from: a */
    private void m7788a(int i, String str, Throwable th, C2790c cVar) {
        if (this.f6329b == null) {
            cVar.mo17609a((C2817i) new C2819k());
        } else {
            cVar.mo17609a((C2817i) new C2816h(i, str, th));
        }
    }
}
