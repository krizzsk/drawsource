package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.k */
public final class C4943k implements C4913b {

    /* renamed from: a */
    public final boolean f13133a;

    /* renamed from: b */
    public final int f13134b;

    /* renamed from: c */
    public final byte[] f13135c;

    /* renamed from: d */
    public final C4911a[] f13136d;

    /* renamed from: e */
    public int f13137e;

    /* renamed from: f */
    public int f13138f;

    /* renamed from: g */
    public int f13139g;

    /* renamed from: h */
    public C4911a[] f13140h;

    public C4943k(boolean z, int i, int i2) {
        C4965a.m15049a(i > 0);
        C4965a.m15049a(i2 >= 0);
        this.f13133a = z;
        this.f13134b = i;
        this.f13139g = i2;
        this.f13140h = new C4911a[(i2 + 100)];
        if (i2 > 0) {
            this.f13135c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f13140h[i3] = new C4911a(this.f13135c, i3 * i);
            }
        } else {
            this.f13135c = null;
        }
        this.f13136d = new C4911a[1];
    }

    /* renamed from: a */
    public synchronized void mo25481a(C4911a[] aVarArr) {
        boolean z;
        int i = this.f13139g;
        int length = aVarArr.length + i;
        C4911a[] aVarArr2 = this.f13140h;
        if (length >= aVarArr2.length) {
            this.f13140h = (C4911a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C4911a aVar : aVarArr) {
            byte[] bArr = aVar.f13038a;
            if (bArr != this.f13135c) {
                if (bArr.length != this.f13134b) {
                    z = false;
                    C4965a.m15049a(z);
                    C4911a[] aVarArr3 = this.f13140h;
                    int i2 = this.f13139g;
                    this.f13139g = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
            }
            z = true;
            C4965a.m15049a(z);
            C4911a[] aVarArr32 = this.f13140h;
            int i22 = this.f13139g;
            this.f13139g = i22 + 1;
            aVarArr32[i22] = aVar;
        }
        this.f13138f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo25482b() {
        int i = 0;
        int max = Math.max(0, C4991u.m15132a(this.f13137e, this.f13134b) - this.f13138f);
        int i2 = this.f13139g;
        if (max < i2) {
            if (this.f13135c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C4911a[] aVarArr = this.f13140h;
                    C4911a aVar = aVarArr[i];
                    byte[] bArr = aVar.f13038a;
                    byte[] bArr2 = this.f13135c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        C4911a aVar2 = aVarArr[i3];
                        if (aVar2.f13038a != bArr2) {
                            i3--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f13139g) {
                    return;
                }
            }
            Arrays.fill(this.f13140h, max, this.f13139g, (Object) null);
            this.f13139g = max;
        }
    }

    /* renamed from: a */
    public int mo25480a() {
        return this.f13134b;
    }
}
