package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b */
public final class C4767b implements C4773h {

    /* renamed from: a */
    public final C4977j f12411a;

    /* renamed from: b */
    public final C4978k f12412b;

    /* renamed from: c */
    public final String f12413c;

    /* renamed from: d */
    public String f12414d;

    /* renamed from: e */
    public C4746n f12415e;

    /* renamed from: f */
    public int f12416f = 0;

    /* renamed from: g */
    public int f12417g;

    /* renamed from: h */
    public boolean f12418h;

    /* renamed from: i */
    public long f12419i;

    /* renamed from: j */
    public C4811i f12420j;

    /* renamed from: k */
    public int f12421k;

    /* renamed from: l */
    public long f12422l;

    public C4767b(String str) {
        byte[] bArr = new byte[8];
        this.f12411a = new C4977j(bArr);
        this.f12412b = new C4978k(bArr);
        this.f12413c = str;
    }

    /* renamed from: a */
    public void mo25218a() {
        this.f12416f = 0;
        this.f12417g = 0;
        this.f12418h = false;
    }

    /* renamed from: b */
    public void mo25222b() {
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        this.f12414d = dVar.mo25248b();
        this.f12415e = hVar.mo25098a(dVar.mo25249c(), 1);
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        this.f12422l = j;
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        C4978k kVar2 = kVar;
        while (kVar.mo25513a() > 0) {
            int i5 = this.f12416f;
            if (i5 == 0) {
                while (true) {
                    if (kVar.mo25513a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f12418h) {
                        this.f12418h = kVar.mo25533l() == 11;
                    } else {
                        int l = kVar.mo25533l();
                        if (l == 119) {
                            this.f12418h = false;
                            z = true;
                            break;
                        }
                        this.f12418h = l == 11;
                    }
                }
                if (z) {
                    this.f12416f = 1;
                    byte[] bArr = this.f12412b.f13243a;
                    bArr[0] = Ascii.f18309VT;
                    bArr[1] = 119;
                    this.f12417g = 2;
                }
            } else if (i5 == 1) {
                byte[] bArr2 = this.f12412b.f13243a;
                int min = Math.min(kVar.mo25513a(), 8 - this.f12417g);
                System.arraycopy(kVar2.f13243a, kVar2.f13244b, bArr2, this.f12417g, min);
                kVar2.f13244b += min;
                int i6 = this.f12417g + min;
                this.f12417g = i6;
                if (i6 == 8) {
                    this.f12411a.mo25510b(0);
                    C4977j jVar = this.f12411a;
                    int i7 = (jVar.f13240b * 8) + jVar.f13241c;
                    jVar.mo25512c(40);
                    boolean z2 = jVar.mo25508a(5) == 16;
                    jVar.mo25510b(i7);
                    int i8 = 6;
                    if (z2) {
                        jVar.mo25512c(21);
                        i4 = (jVar.mo25508a(11) + 1) * 2;
                        int a = jVar.mo25508a(2);
                        if (a == 3) {
                            i3 = C4620a.f11499c[jVar.mo25508a(2)];
                        } else {
                            i8 = C4620a.f11497a[jVar.mo25508a(2)];
                            i3 = C4620a.f11498b[a];
                        }
                        i2 = i8 * 256;
                        i = jVar.mo25508a(3);
                        str = "audio/eac3";
                    } else {
                        jVar.mo25512c(32);
                        int a2 = jVar.mo25508a(2);
                        int a3 = C4620a.m14129a(a2, jVar.mo25508a(6));
                        jVar.mo25512c(8);
                        i = jVar.mo25508a(3);
                        if (!((i & 1) == 0 || i == 1)) {
                            jVar.mo25512c(2);
                        }
                        if ((i & 4) != 0) {
                            jVar.mo25512c(2);
                        }
                        if (i == 2) {
                            jVar.mo25512c(2);
                        }
                        i3 = C4620a.f11498b[a2];
                        str = "audio/ac3";
                        int i9 = a3;
                        i2 = 1536;
                        i4 = i9;
                    }
                    int i10 = C4620a.f11500d[i] + (jVar.mo25511b() ? 1 : 0);
                    C4811i iVar = this.f12420j;
                    if (!(iVar != null && i10 == iVar.f12767r && i3 == iVar.f12768s && str == iVar.f12755f)) {
                        C4811i a4 = C4811i.m14722a(this.f12414d, str, (String) null, -1, -1, i10, i3, -1, (List<byte[]>) null, (C4644a) null, 0, this.f12413c);
                        this.f12420j = a4;
                        this.f12415e.mo25074a(a4);
                    }
                    this.f12421k = i4;
                    this.f12419i = (((long) i2) * 1000000) / ((long) this.f12420j.f12768s);
                    this.f12412b.mo25525e(0);
                    this.f12415e.mo25075a(this.f12412b, 8);
                    this.f12416f = 2;
                }
            } else if (i5 == 2) {
                int min2 = Math.min(kVar.mo25513a(), this.f12421k - this.f12417g);
                this.f12415e.mo25075a(kVar2, min2);
                int i11 = this.f12417g + min2;
                this.f12417g = i11;
                int i12 = this.f12421k;
                if (i11 == i12) {
                    this.f12415e.mo25072a(this.f12422l, 1, i12, 0, (byte[]) null);
                    this.f12422l += this.f12419i;
                    this.f12416f = 0;
                }
            }
        }
    }
}
