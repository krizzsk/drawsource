package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C4802c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a */
public final class C4800a implements C4665f, C4709m {

    /* renamed from: a */
    public C4673h f12649a;

    /* renamed from: b */
    public C4746n f12650b;

    /* renamed from: c */
    public C4801b f12651c;

    /* renamed from: d */
    public int f12652d;

    /* renamed from: e */
    public int f12653e;

    /* renamed from: a */
    public boolean mo25055a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        return C4802c.m14670a(gVar) != null;
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: c */
    public long mo25056c() {
        C4801b bVar = this.f12651c;
        return ((bVar.f12661h / ((long) bVar.f12657d)) * 1000000) / ((long) bVar.f12655b);
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f12649a = hVar;
        this.f12650b = hVar.mo25098a(0, 1);
        this.f12651c = null;
        hVar.mo25100c();
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12653e = 0;
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        C4672g gVar2 = gVar;
        if (this.f12651c == null) {
            C4801b a = C4802c.m14670a(gVar);
            this.f12651c = a;
            if (a != null) {
                int i = a.f12655b;
                int i2 = a.f12654a;
                this.f12650b.mo25074a(C4811i.m14722a((String) null, "audio/raw", (String) null, a.f12658e * i * i2, 32768, i2, i, a.f12659f, (List<byte[]>) null, (C4644a) null, 0, (String) null));
                this.f12652d = this.f12651c.f12657d;
            } else {
                throw new C4815l("Unsupported or unrecognized wav header.");
            }
        }
        C4801b bVar = this.f12651c;
        if (!((bVar.f12660g == 0 || bVar.f12661h == 0) ? false : true)) {
            gVar.getClass();
            bVar.getClass();
            C4657b bVar2 = (C4657b) gVar2;
            bVar2.f11672e = 0;
            C4978k kVar = new C4978k(8);
            C4802c.C4803a a2 = C4802c.C4803a.m14671a(gVar2, kVar);
            while (a2.f12662a != C4991u.m15133a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f12662a);
                long j = a2.f12663b + 8;
                if (a2.f12662a == C4991u.m15133a("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bVar2.mo25064c((int) j);
                    a2 = C4802c.C4803a.m14671a(gVar2, kVar);
                } else {
                    throw new C4815l("Chunk is too large (~2GB+) to skip; id: " + a2.f12662a);
                }
            }
            bVar2.mo25064c(8);
            long j2 = bVar2.f11670c;
            long j3 = a2.f12663b;
            bVar.f12660g = j2;
            bVar.f12661h = j3;
            this.f12649a.mo25099a(this);
        }
        int a3 = this.f12650b.mo25068a(gVar2, 32768 - this.f12653e, true);
        if (a3 != -1) {
            this.f12653e += a3;
        }
        int i3 = this.f12653e;
        int i4 = this.f12652d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            C4801b bVar3 = this.f12651c;
            int i6 = i5 * i4;
            int i7 = i3 - i6;
            this.f12653e = i7;
            this.f12650b.mo25072a(((((C4657b) gVar2).f11670c - ((long) i3)) * 1000000) / ((long) bVar3.f12656c), 1, i6, i7, (byte[]) null);
        }
        if (a3 == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        C4801b bVar = this.f12651c;
        long j2 = (long) bVar.f12657d;
        return Math.min((((j * ((long) bVar.f12656c)) / 1000000) / j2) * j2, bVar.f12661h - j2) + bVar.f12660g;
    }
}
