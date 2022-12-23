package com.bytedance.sdk.component.p108d.p117d;

import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import com.bytedance.sdk.component.p108d.p111c.p116c.C2797a;

/* renamed from: com.bytedance.sdk.component.d.d.b */
/* compiled from: BytesVisitor */
public class C2809b implements C2817i {

    /* renamed from: a */
    private byte[] f6325a;

    /* renamed from: b */
    private C2824f f6326b;

    /* renamed from: a */
    public String mo17677a() {
        return "image_type";
    }

    public C2809b(byte[] bArr, C2824f fVar) {
        this.f6325a = bArr;
        this.f6326b = fVar;
    }

    /* renamed from: a */
    public void mo17678a(C2790c cVar) {
        C2817i iVar;
        C2838t i = cVar.mo17618i();
        cVar.mo17604a(this.f6325a.length);
        int i2 = C28101.f6327a[i.ordinal()];
        if (i2 == 1) {
            byte[] bArr = this.f6325a;
            iVar = new C2822m(bArr, this.f6326b, C2797a.m7726b(bArr));
        } else if (i2 != 3) {
            if (C2797a.m7725a(this.f6325a)) {
                iVar = new C2813e(this.f6325a, this.f6326b);
            } else {
                byte[] bArr2 = this.f6325a;
                iVar = new C2822m(bArr2, this.f6326b, C2797a.m7726b(bArr2));
            }
        } else if (C2797a.m7725a(this.f6325a)) {
            iVar = new C2813e(this.f6325a, this.f6326b);
        } else if (this.f6326b == null) {
            iVar = new C2819k();
        } else {
            iVar = new C2816h(1001, "not image format", (Throwable) null);
        }
        cVar.mo17609a(iVar);
    }

    /* renamed from: com.bytedance.sdk.component.d.d.b$1 */
    /* compiled from: BytesVisitor */
    static /* synthetic */ class C28101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6327a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.component.d.t[] r0 = com.bytedance.sdk.component.p108d.C2838t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6327a = r0
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p108d.C2838t.RAW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6327a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p108d.C2838t.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6327a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p108d.C2838t.BITMAP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p117d.C2809b.C28101.<clinit>():void");
        }
    }
}
