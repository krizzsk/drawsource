package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n */
public final class C4784n {

    /* renamed from: a */
    public final int f12576a;

    /* renamed from: b */
    public boolean f12577b;

    /* renamed from: c */
    public boolean f12578c;

    /* renamed from: d */
    public byte[] f12579d;

    /* renamed from: e */
    public int f12580e;

    public C4784n(int i, int i2) {
        this.f12576a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f12579d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo25234a() {
        this.f12577b = false;
        this.f12578c = false;
    }

    /* renamed from: b */
    public void mo25237b(int i) {
        boolean z = true;
        C4965a.m15051b(!this.f12577b);
        if (i != this.f12576a) {
            z = false;
        }
        this.f12577b = z;
        if (z) {
            this.f12580e = 3;
            this.f12578c = false;
        }
    }

    /* renamed from: a */
    public void mo25235a(byte[] bArr, int i, int i2) {
        if (this.f12577b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f12579d;
            int length = bArr2.length;
            int i4 = this.f12580e + i3;
            if (length < i4) {
                this.f12579d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f12579d, this.f12580e, i3);
            this.f12580e += i3;
        }
    }

    /* renamed from: a */
    public boolean mo25236a(int i) {
        if (!this.f12577b) {
            return false;
        }
        this.f12580e -= i;
        this.f12577b = false;
        this.f12578c = true;
        return true;
    }
}
