package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4669d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4968c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a */
public final class C4666a extends C4669d {

    /* renamed from: e */
    public static final int[] f11711e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f11712b;

    /* renamed from: c */
    public boolean f11713c;

    /* renamed from: d */
    public int f11714d;

    public C4666a(C4746n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo25093a(C4978k kVar) throws C4669d.C4670a {
        if (!this.f11712b) {
            int l = kVar.mo25533l();
            int i = (l >> 4) & 15;
            this.f11714d = i;
            if (i == 2) {
                this.f11730a.mo25074a(C4811i.m14722a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f11711e[(l >> 2) & 3], -1, (List<byte[]>) null, (C4644a) null, 0, (String) null));
                this.f11713c = true;
            } else if (i == 7 || i == 8) {
                this.f11730a.mo25074a(C4811i.m14722a((String) null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (l & 1) == 1 ? 2 : 3, (List<byte[]>) null, (C4644a) null, 0, (String) null));
                this.f11713c = true;
            } else if (i != 10) {
                throw new C4669d.C4670a("Audio format not supported: " + this.f11714d);
            }
            this.f11712b = true;
        } else {
            kVar.mo25527f(1);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25094b(C4978k kVar, long j) {
        C4978k kVar2 = kVar;
        if (this.f11714d == 2) {
            int a = kVar.mo25513a();
            this.f11730a.mo25075a(kVar2, a);
            this.f11730a.mo25072a(j, 1, a, 0, (byte[]) null);
            return;
        }
        int l = kVar.mo25533l();
        if (l == 0 && !this.f11713c) {
            int a2 = kVar.mo25513a();
            byte[] bArr = new byte[a2];
            System.arraycopy(kVar2.f13243a, kVar2.f13244b, bArr, 0, a2);
            kVar2.f13244b += a2;
            Pair<Integer, Integer> a3 = C4968c.m15056a(bArr);
            this.f11730a.mo25074a(C4811i.m14722a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr), (C4644a) null, 0, (String) null));
            this.f11713c = true;
        } else if (this.f11714d != 10 || l == 1) {
            int a4 = kVar.mo25513a();
            this.f11730a.mo25075a(kVar2, a4);
            this.f11730a.mo25072a(j, 1, a4, 0, (byte[]) null);
        }
    }
}
