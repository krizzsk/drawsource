package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.g */
public final class C4772g implements C4773h {

    /* renamed from: a */
    public final List<C4795v.C4796a> f12459a;

    /* renamed from: b */
    public final C4746n[] f12460b;

    /* renamed from: c */
    public boolean f12461c;

    /* renamed from: d */
    public int f12462d;

    /* renamed from: e */
    public int f12463e;

    /* renamed from: f */
    public long f12464f;

    public C4772g(List<C4795v.C4796a> list) {
        this.f12459a = list;
        this.f12460b = new C4746n[list.size()];
    }

    /* renamed from: a */
    public void mo25218a() {
        this.f12461c = false;
    }

    /* renamed from: b */
    public void mo25222b() {
        if (this.f12461c) {
            for (C4746n a : this.f12460b) {
                a.mo25072a(this.f12464f, 1, this.f12463e, 0, (byte[]) null);
            }
            this.f12461c = false;
        }
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        for (int i = 0; i < this.f12460b.length; i++) {
            C4795v.C4796a aVar = this.f12459a.get(i);
            dVar.mo25247a();
            C4746n a = hVar.mo25098a(dVar.mo25249c(), 3);
            a.mo25074a(C4811i.m14726a(dVar.mo25248b(), "application/dvbsubs", (String) null, -1, (List<byte[]>) Collections.singletonList(aVar.f12640b), aVar.f12639a, (C4644a) null));
            this.f12460b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        if (z) {
            this.f12461c = true;
            this.f12464f = j;
            this.f12463e = 0;
            this.f12462d = 2;
        }
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        if (!this.f12461c) {
            return;
        }
        if (this.f12462d != 2 || mo25229a(kVar, 32)) {
            if (this.f12462d != 1 || mo25229a(kVar, 0)) {
                int i = kVar.f13244b;
                int a = kVar.mo25513a();
                for (C4746n a2 : this.f12460b) {
                    kVar.mo25525e(i);
                    a2.mo25075a(kVar, a);
                }
                this.f12463e += a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25229a(C4978k kVar, int i) {
        if (kVar.mo25513a() == 0) {
            return false;
        }
        if (kVar.mo25533l() != i) {
            this.f12461c = false;
        }
        this.f12462d--;
        return this.f12461c;
    }
}
