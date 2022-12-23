package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c */
public final class C4802c {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c$a */
    public static final class C4803a {

        /* renamed from: a */
        public final int f12662a;

        /* renamed from: b */
        public final long f12663b;

        public C4803a(int i, long j) {
            this.f12662a = i;
            this.f12663b = j;
        }

        /* renamed from: a */
        public static C4803a m14671a(C4672g gVar, C4978k kVar) throws IOException, InterruptedException {
            ((C4657b) gVar).mo25061a(kVar.f13243a, 0, 8, false);
            kVar.mo25525e(0);
            return new C4803a(kVar.mo25520c(), kVar.mo25526f());
        }
    }

    /* renamed from: a */
    public static C4801b m14670a(C4672g gVar) throws IOException, InterruptedException {
        gVar.getClass();
        C4978k kVar = new C4978k(16);
        if (C4803a.m14671a(gVar, kVar).f12662a != C4991u.m15133a("RIFF")) {
            return null;
        }
        C4657b bVar = (C4657b) gVar;
        bVar.mo25061a(kVar.f13243a, 0, 4, false);
        kVar.mo25525e(0);
        int c = kVar.mo25520c();
        if (c != C4991u.m15133a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + c);
            return null;
        }
        C4803a a = C4803a.m14671a(gVar, kVar);
        while (a.f12662a != C4991u.m15133a("fmt ")) {
            bVar.mo25060a((int) a.f12663b, false);
            a = C4803a.m14671a(gVar, kVar);
        }
        C4965a.m15051b(a.f12663b >= 16);
        bVar.mo25061a(kVar.f13243a, 0, 16, false);
        kVar.mo25525e(0);
        int h = kVar.mo25529h();
        int h2 = kVar.mo25529h();
        int g = kVar.mo25528g();
        int g2 = kVar.mo25528g();
        int h3 = kVar.mo25529h();
        int h4 = kVar.mo25529h();
        int i = (h2 * h4) / 8;
        if (h3 == i) {
            int a2 = C4991u.m15131a(h4);
            if (a2 == 0) {
                Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + h4);
                return null;
            } else if (h == 1 || h == 65534) {
                bVar.mo25060a(((int) a.f12663b) - 16, false);
                return new C4801b(h2, g, g2, h3, h4, a2);
            } else {
                Log.e("WavHeaderReader", "Unsupported WAV format type: " + h);
                return null;
            }
        } else {
            throw new C4815l("Expected block alignment: " + i + "; got: " + h3);
        }
    }
}
