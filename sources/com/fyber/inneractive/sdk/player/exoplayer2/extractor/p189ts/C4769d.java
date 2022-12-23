package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4664e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4968c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d */
public final class C4769d implements C4773h {

    /* renamed from: r */
    public static final byte[] f12428r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f12429a;

    /* renamed from: b */
    public final C4977j f12430b = new C4977j(new byte[7]);

    /* renamed from: c */
    public final C4978k f12431c = new C4978k(Arrays.copyOf(f12428r, 10));

    /* renamed from: d */
    public final String f12432d;

    /* renamed from: e */
    public String f12433e;

    /* renamed from: f */
    public C4746n f12434f;

    /* renamed from: g */
    public C4746n f12435g;

    /* renamed from: h */
    public int f12436h;

    /* renamed from: i */
    public int f12437i;

    /* renamed from: j */
    public int f12438j;

    /* renamed from: k */
    public boolean f12439k;

    /* renamed from: l */
    public boolean f12440l;

    /* renamed from: m */
    public long f12441m;

    /* renamed from: n */
    public int f12442n;

    /* renamed from: o */
    public long f12443o;

    /* renamed from: p */
    public C4746n f12444p;

    /* renamed from: q */
    public long f12445q;

    public C4769d(boolean z, String str) {
        mo25224c();
        this.f12429a = z;
        this.f12432d = str;
    }

    /* renamed from: a */
    public void mo25218a() {
        mo25224c();
    }

    /* renamed from: b */
    public void mo25222b() {
    }

    /* renamed from: c */
    public final void mo25224c() {
        this.f12436h = 0;
        this.f12437i = 0;
        this.f12438j = 256;
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        this.f12433e = dVar.mo25248b();
        this.f12434f = hVar.mo25098a(dVar.mo25249c(), 1);
        if (this.f12429a) {
            dVar.mo25247a();
            C4746n a = hVar.mo25098a(dVar.mo25249c(), 4);
            this.f12435g = a;
            a.mo25074a(C4811i.m14725a(dVar.mo25248b(), "application/id3", (String) null, -1, (C4644a) null));
            return;
        }
        this.f12435g = new C4664e();
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        this.f12443o = j;
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        C4978k kVar2 = kVar;
        while (kVar.mo25513a() > 0) {
            int i = this.f12436h;
            boolean z = true;
            if (i == 0) {
                byte[] bArr = kVar2.f13243a;
                int i2 = kVar2.f13244b;
                int i3 = kVar2.f13245c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo25525e(i2);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2] & 255;
                    int i5 = this.f12438j;
                    if (i5 != 512 || b < 240 || b == 255) {
                        byte b2 = b | i5;
                        if (b2 == 329) {
                            this.f12438j = 768;
                        } else if (b2 == 511) {
                            this.f12438j = 512;
                        } else if (b2 != 836) {
                            if (b2 == 1075) {
                                this.f12436h = 1;
                                this.f12437i = f12428r.length;
                                this.f12442n = 0;
                                this.f12431c.mo25525e(0);
                                kVar2.mo25525e(i4);
                                break;
                            } else if (i5 != 256) {
                                this.f12438j = 256;
                                i2 = i4 - 1;
                            }
                        } else {
                            this.f12438j = 1024;
                        }
                        i2 = i4;
                    } else {
                        if ((b & 1) != 0) {
                            z = false;
                        }
                        this.f12439k = z;
                        this.f12436h = 2;
                        this.f12437i = 0;
                        kVar2.mo25525e(i4);
                    }
                }
            } else if (i != 1) {
                if (i == 2) {
                    if (mo25223a(kVar2, this.f12430b.f13239a, this.f12439k ? 7 : 5)) {
                        this.f12430b.mo25510b(0);
                        if (!this.f12440l) {
                            int a = this.f12430b.mo25508a(2) + 1;
                            if (a != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + a + ", but assuming AAC LC.");
                                a = 2;
                            }
                            int a2 = this.f12430b.mo25508a(4);
                            this.f12430b.mo25512c(1);
                            byte[] bArr2 = {(byte) (((a << 3) & 248) | ((a2 >> 1) & 7)), (byte) (((a2 << 7) & 128) | ((this.f12430b.mo25508a(3) << 3) & 120))};
                            Pair<Integer, Integer> a3 = C4968c.m15056a(bArr2);
                            C4811i a4 = C4811i.m14722a(this.f12433e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr2), (C4644a) null, 0, this.f12432d);
                            this.f12441m = 1024000000 / ((long) a4.f12768s);
                            this.f12434f.mo25074a(a4);
                            this.f12440l = true;
                        } else {
                            this.f12430b.mo25512c(10);
                        }
                        this.f12430b.mo25512c(4);
                        int a5 = (this.f12430b.mo25508a(13) - 2) - 5;
                        if (this.f12439k) {
                            a5 -= 2;
                        }
                        C4746n nVar = this.f12434f;
                        long j = this.f12441m;
                        this.f12436h = 3;
                        this.f12437i = 0;
                        this.f12444p = nVar;
                        this.f12445q = j;
                        this.f12442n = a5;
                    }
                } else if (i == 3) {
                    int min = Math.min(kVar.mo25513a(), this.f12442n - this.f12437i);
                    this.f12444p.mo25075a(kVar2, min);
                    int i6 = this.f12437i + min;
                    this.f12437i = i6;
                    int i7 = this.f12442n;
                    if (i6 == i7) {
                        this.f12444p.mo25072a(this.f12443o, 1, i7, 0, (byte[]) null);
                        this.f12443o += this.f12445q;
                        mo25224c();
                    }
                }
            } else if (mo25223a(kVar2, this.f12431c.f13243a, 10)) {
                this.f12435g.mo25075a(this.f12431c, 10);
                this.f12431c.mo25525e(6);
                C4746n nVar2 = this.f12435g;
                this.f12436h = 3;
                this.f12437i = 10;
                this.f12444p = nVar2;
                this.f12445q = 0;
                this.f12442n = this.f12431c.mo25532k() + 10;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25223a(C4978k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo25513a(), i - this.f12437i);
        System.arraycopy(kVar.f13243a, kVar.f13244b, bArr, this.f12437i, min);
        kVar.f13244b += min;
        int i2 = this.f12437i + min;
        this.f12437i = i2;
        return i2 == i;
    }
}
