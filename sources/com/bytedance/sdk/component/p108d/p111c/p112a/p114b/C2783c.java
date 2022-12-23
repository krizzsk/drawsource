package com.bytedance.sdk.component.p108d.p111c.p112a.p114b;

import com.bytedance.sdk.component.p108d.C2835q;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2787c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.c */
/* compiled from: LruCountRawCache */
public class C2783c implements C2835q {

    /* renamed from: a */
    private int f6214a;

    /* renamed from: b */
    private int f6215b;

    /* renamed from: c */
    private int f6216c;

    /* renamed from: d */
    private C2787c<String, byte[]> f6217d;

    public C2783c(int i, int i2) {
        this.f6216c = i;
        this.f6214a = i2;
        this.f6217d = new C2787c<String, byte[]>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo17585b(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    /* renamed from: a */
    public boolean mo17522a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f6217d.mo17594a(str, bArr);
        return true;
    }

    /* renamed from: a */
    public byte[] mo17521a(String str) {
        return this.f6217d.mo17593a(str);
    }

    /* renamed from: b */
    public boolean mo17523b(String str) {
        return this.f6217d.mo17593a(str) != null;
    }
}
