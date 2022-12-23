package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4633e;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f */
public final class C4771f implements C4773h {

    /* renamed from: a */
    public final C4978k f12448a;

    /* renamed from: b */
    public final String f12449b;

    /* renamed from: c */
    public String f12450c;

    /* renamed from: d */
    public C4746n f12451d;

    /* renamed from: e */
    public int f12452e = 0;

    /* renamed from: f */
    public int f12453f;

    /* renamed from: g */
    public int f12454g;

    /* renamed from: h */
    public long f12455h;

    /* renamed from: i */
    public C4811i f12456i;

    /* renamed from: j */
    public int f12457j;

    /* renamed from: k */
    public long f12458k;

    public C4771f(String str) {
        C4978k kVar = new C4978k(new byte[15]);
        this.f12448a = kVar;
        byte[] bArr = kVar.f13243a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f12449b = str;
    }

    /* renamed from: a */
    public void mo25218a() {
        this.f12452e = 0;
        this.f12453f = 0;
        this.f12454g = 0;
    }

    /* renamed from: b */
    public void mo25222b() {
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        this.f12450c = dVar.mo25248b();
        this.f12451d = hVar.mo25098a(dVar.mo25249c(), 1);
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        this.f12458k = j;
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        int i;
        C4978k kVar2 = kVar;
        while (kVar.mo25513a() > 0) {
            int i2 = this.f12452e;
            boolean z = false;
            if (i2 == 0) {
                while (true) {
                    if (kVar.mo25513a() <= 0) {
                        break;
                    }
                    int i3 = this.f12454g << 8;
                    this.f12454g = i3;
                    int l = i3 | kVar.mo25533l();
                    this.f12454g = l;
                    if (l == 2147385345) {
                        this.f12454g = 0;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f12453f = 4;
                    this.f12452e = 1;
                }
            } else if (i2 == 1) {
                byte[] bArr = this.f12448a.f13243a;
                int min = Math.min(kVar.mo25513a(), 15 - this.f12453f);
                System.arraycopy(kVar2.f13243a, kVar2.f13244b, bArr, this.f12453f, min);
                kVar2.f13244b += min;
                int i4 = this.f12453f + min;
                this.f12453f = i4;
                if (i4 == 15) {
                    byte[] bArr2 = this.f12448a.f13243a;
                    if (this.f12456i == null) {
                        String str = this.f12450c;
                        String str2 = this.f12449b;
                        C4977j jVar = new C4977j(bArr2, bArr2.length);
                        jVar.mo25512c(60);
                        int i5 = C4633e.f11585a[jVar.mo25508a(6)];
                        int i6 = C4633e.f11586b[jVar.mo25508a(4)];
                        int a = jVar.mo25508a(5);
                        int[] iArr = C4633e.f11587c;
                        if (a >= iArr.length) {
                            i = -1;
                        } else {
                            i = (iArr[a] * 1000) / 2;
                        }
                        int i7 = i;
                        jVar.mo25512c(10);
                        C4811i a2 = C4811i.m14722a(str, "audio/vnd.dts", (String) null, i7, -1, i5 + (jVar.mo25508a(2) > 0 ? 1 : 0), i6, -1, (List<byte[]>) null, (C4644a) null, 0, str2);
                        this.f12456i = a2;
                        this.f12451d.mo25074a(a2);
                    }
                    this.f12457j = (((bArr2[5] & 2) << Ascii.f18298FF) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f12455h = (long) ((int) ((((long) (((((bArr2[5] & 252) >> 2) | ((bArr2[4] & 1) << 6)) + 1) * 32)) * 1000000) / ((long) this.f12456i.f12768s)));
                    this.f12448a.mo25525e(0);
                    this.f12451d.mo25075a(this.f12448a, 15);
                    this.f12452e = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(kVar.mo25513a(), this.f12457j - this.f12453f);
                this.f12451d.mo25075a(kVar2, min2);
                int i8 = this.f12453f + min2;
                this.f12453f = i8;
                int i9 = this.f12457j;
                if (i8 == i9) {
                    this.f12451d.mo25072a(this.f12458k, 1, i9, 0, (byte[]) null);
                    this.f12458k += this.f12455h;
                    this.f12452e = 0;
                }
            }
        }
    }
}
