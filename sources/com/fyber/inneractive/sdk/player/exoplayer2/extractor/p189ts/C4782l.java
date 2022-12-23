package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.l */
public final class C4782l implements C4773h {

    /* renamed from: a */
    public final C4978k f12558a = new C4978k(10);

    /* renamed from: b */
    public C4746n f12559b;

    /* renamed from: c */
    public boolean f12560c;

    /* renamed from: d */
    public long f12561d;

    /* renamed from: e */
    public int f12562e;

    /* renamed from: f */
    public int f12563f;

    /* renamed from: a */
    public void mo25218a() {
        this.f12560c = false;
    }

    /* renamed from: b */
    public void mo25222b() {
        int i;
        if (this.f12560c && (i = this.f12562e) != 0 && this.f12563f == i) {
            this.f12559b.mo25072a(this.f12561d, 1, i, 0, (byte[]) null);
            this.f12560c = false;
        }
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        C4746n a = hVar.mo25098a(dVar.mo25249c(), 4);
        this.f12559b = a;
        a.mo25074a(C4811i.m14725a(dVar.mo25248b(), "application/id3", (String) null, -1, (C4644a) null));
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        if (z) {
            this.f12560c = true;
            this.f12561d = j;
            this.f12562e = 0;
            this.f12563f = 0;
        }
    }

    /* renamed from: a */
    public void mo25221a(C4978k kVar) {
        if (this.f12560c) {
            int a = kVar.mo25513a();
            int i = this.f12563f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(kVar.f13243a, kVar.f13244b, this.f12558a.f13243a, this.f12563f, min);
                if (this.f12563f + min == 10) {
                    this.f12558a.mo25525e(0);
                    if (73 == this.f12558a.mo25533l() && 68 == this.f12558a.mo25533l() && 51 == this.f12558a.mo25533l()) {
                        this.f12558a.mo25527f(3);
                        this.f12562e = this.f12558a.mo25532k() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12560c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f12562e - this.f12563f);
            this.f12559b.mo25075a(kVar, min2);
            this.f12563f += min2;
        }
    }
}
