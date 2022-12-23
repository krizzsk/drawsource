package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r */
public final class C4789r implements C4795v {

    /* renamed from: a */
    public final C4788q f12607a;

    /* renamed from: b */
    public final C4978k f12608b = new C4978k(32);

    /* renamed from: c */
    public int f12609c;

    /* renamed from: d */
    public int f12610d;

    /* renamed from: e */
    public boolean f12611e;

    /* renamed from: f */
    public boolean f12612f;

    public C4789r(C4788q qVar) {
        this.f12607a = qVar;
    }

    /* renamed from: a */
    public void mo25241a(C4988r rVar, C4673h hVar, C4795v.C4799d dVar) {
        this.f12607a.mo25244a(rVar, hVar, dVar);
        this.f12612f = true;
    }

    /* renamed from: a */
    public void mo25238a() {
        this.f12612f = true;
    }

    /* renamed from: a */
    public void mo25240a(C4978k kVar, boolean z) {
        int i;
        if (z) {
            i = kVar.f13244b + kVar.mo25533l();
        } else {
            i = -1;
        }
        if (this.f12612f) {
            if (z) {
                this.f12612f = false;
                kVar.mo25525e(i);
                this.f12610d = 0;
            } else {
                return;
            }
        }
        while (kVar.mo25513a() > 0) {
            int i2 = this.f12610d;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int l = kVar.mo25533l();
                    kVar.mo25525e(kVar.f13244b - 1);
                    if (l == 255) {
                        this.f12612f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.mo25513a(), 3 - this.f12610d);
                kVar.mo25517a(this.f12608b.f13243a, this.f12610d, min);
                int i3 = this.f12610d + min;
                this.f12610d = i3;
                if (i3 == 3) {
                    this.f12608b.mo25521c(3);
                    this.f12608b.mo25527f(1);
                    int l2 = this.f12608b.mo25533l();
                    int l3 = this.f12608b.mo25533l();
                    if ((l2 & 128) == 0) {
                        z2 = false;
                    }
                    this.f12611e = z2;
                    this.f12609c = (((l2 & 15) << 8) | l3) + 3;
                    int b = this.f12608b.mo25518b();
                    int i4 = this.f12609c;
                    if (b < i4) {
                        C4978k kVar2 = this.f12608b;
                        byte[] bArr = kVar2.f13243a;
                        kVar2.mo25521c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f12608b.f13243a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.mo25513a(), this.f12609c - this.f12610d);
                kVar.mo25517a(this.f12608b.f13243a, this.f12610d, min2);
                int i5 = this.f12610d + min2;
                this.f12610d = i5;
                int i6 = this.f12609c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f12611e) {
                        byte[] bArr2 = this.f12608b.f13243a;
                        int i7 = C4991u.f13270a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = C4991u.f13277h[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f12612f = true;
                            return;
                        }
                        this.f12608b.mo25521c(this.f12609c - 4);
                    } else {
                        this.f12608b.mo25521c(i6);
                    }
                    this.f12607a.mo25243a(this.f12608b);
                    this.f12610d = 0;
                }
            }
        }
    }
}
