package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4669d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5002a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.e */
public final class C4671e extends C4669d {

    /* renamed from: b */
    public final C4978k f11731b = new C4978k(C4974i.f13222a);

    /* renamed from: c */
    public final C4978k f11732c = new C4978k(4);

    /* renamed from: d */
    public int f11733d;

    /* renamed from: e */
    public boolean f11734e;

    /* renamed from: f */
    public int f11735f;

    public C4671e(C4746n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo25093a(C4978k kVar) throws C4669d.C4670a {
        int l = kVar.mo25533l();
        int i = (l >> 4) & 15;
        int i2 = l & 15;
        if (i2 == 7) {
            this.f11735f = i;
            return i != 5;
        }
        throw new C4669d.C4670a("Video format not supported: " + i2);
    }

    /* renamed from: b */
    public void mo25094b(C4978k kVar, long j) throws C4815l {
        int l = kVar.mo25533l();
        long n = j + (((long) kVar.mo25535n()) * 1000);
        if (l == 0 && !this.f11734e) {
            C4978k kVar2 = new C4978k(new byte[kVar.mo25513a()]);
            kVar.mo25517a(kVar2.f13243a, 0, kVar.mo25513a());
            C5002a b = C5002a.m15175b(kVar2);
            this.f11733d = b.f13332b;
            this.f11730a.mo25074a(C4811i.m14719a((String) null, "video/avc", (String) null, -1, -1, b.f13333c, b.f13334d, -1.0f, b.f13331a, -1, b.f13335e, (C4644a) null));
            this.f11734e = true;
        } else if (l == 1 && this.f11734e) {
            byte[] bArr = this.f11732c.f13243a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f11733d;
            int i2 = 0;
            while (kVar.mo25513a() > 0) {
                kVar.mo25517a(this.f11732c.f13243a, i, this.f11733d);
                this.f11732c.mo25525e(0);
                int o = this.f11732c.mo25536o();
                this.f11731b.mo25525e(0);
                this.f11730a.mo25075a(this.f11731b, 4);
                this.f11730a.mo25075a(kVar, o);
                i2 = i2 + 4 + o;
            }
            this.f11730a.mo25072a(n, this.f11735f == 1 ? 1 : 0, i2, 0, (byte[]) null);
        }
    }
}
