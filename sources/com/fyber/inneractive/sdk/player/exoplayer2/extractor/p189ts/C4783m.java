package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4707k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m */
public final class C4783m implements C4773h {

    /* renamed from: a */
    public final C4978k f12564a;

    /* renamed from: b */
    public final C4707k f12565b;

    /* renamed from: c */
    public final String f12566c;

    /* renamed from: d */
    public String f12567d;

    /* renamed from: e */
    public C4746n f12568e;

    /* renamed from: f */
    public int f12569f = 0;

    /* renamed from: g */
    public int f12570g;

    /* renamed from: h */
    public boolean f12571h;

    /* renamed from: i */
    public boolean f12572i;

    /* renamed from: j */
    public long f12573j;

    /* renamed from: k */
    public int f12574k;

    /* renamed from: l */
    public long f12575l;

    public C4783m(String str) {
        C4978k kVar = new C4978k(4);
        this.f12564a = kVar;
        kVar.f13243a[0] = -1;
        this.f12565b = new C4707k();
        this.f12566c = str;
    }

    /* renamed from: a */
    public void mo25218a() {
        this.f12569f = 0;
        this.f12570g = 0;
        this.f12572i = false;
    }

    /* renamed from: b */
    public void mo25222b() {
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        this.f12567d = dVar.mo25248b();
        this.f12568e = hVar.mo25098a(dVar.mo25249c(), 1);
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        this.f12575l = j;
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        C4978k kVar2 = kVar;
        while (kVar.mo25513a() > 0) {
            int i = this.f12569f;
            if (i == 0) {
                byte[] bArr = kVar2.f13243a;
                int i2 = kVar2.f13244b;
                int i3 = kVar2.f13245c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo25525e(i3);
                        break;
                    }
                    boolean z = (bArr[i2] & 255) == 255;
                    boolean z2 = this.f12572i && (bArr[i2] & 224) == 224;
                    this.f12572i = z;
                    if (z2) {
                        kVar2.mo25525e(i2 + 1);
                        this.f12572i = false;
                        this.f12564a.f13243a[1] = bArr[i2];
                        this.f12570g = 2;
                        this.f12569f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(kVar.mo25513a(), 4 - this.f12570g);
                kVar2.mo25517a(this.f12564a.f13243a, this.f12570g, min);
                int i4 = this.f12570g + min;
                this.f12570g = i4;
                if (i4 >= 4) {
                    this.f12564a.mo25525e(0);
                    if (!C4707k.m14391a(this.f12564a.mo25520c(), this.f12565b)) {
                        this.f12570g = 0;
                        this.f12569f = 1;
                    } else {
                        C4707k kVar3 = this.f12565b;
                        this.f12574k = kVar3.f11939c;
                        if (!this.f12571h) {
                            int i5 = kVar3.f11940d;
                            this.f12573j = (((long) kVar3.f11943g) * 1000000) / ((long) i5);
                            this.f12568e.mo25074a(C4811i.m14722a(this.f12567d, kVar3.f11938b, (String) null, -1, 4096, kVar3.f11941e, i5, -1, (List<byte[]>) null, (C4644a) null, 0, this.f12566c));
                            this.f12571h = true;
                        }
                        this.f12564a.mo25525e(0);
                        this.f12568e.mo25075a(this.f12564a, 4);
                        this.f12569f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo25513a(), this.f12574k - this.f12570g);
                this.f12568e.mo25075a(kVar2, min2);
                int i6 = this.f12570g + min2;
                this.f12570g = i6;
                int i7 = this.f12574k;
                if (i6 >= i7) {
                    this.f12568e.mo25072a(this.f12575l, 1, i7, 0, (byte[]) null);
                    this.f12575l += this.f12573j;
                    this.f12570g = 0;
                    this.f12569f = 0;
                }
            }
        }
    }
}
