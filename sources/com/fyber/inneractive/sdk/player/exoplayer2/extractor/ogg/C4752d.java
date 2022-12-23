package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d */
public final class C4752d {

    /* renamed from: a */
    public final C4753e f12355a = new C4753e();

    /* renamed from: b */
    public final C4978k f12356b = new C4978k(new byte[65025], 0);

    /* renamed from: c */
    public int f12357c = -1;

    /* renamed from: d */
    public int f12358d;

    /* renamed from: e */
    public boolean f12359e;

    /* renamed from: a */
    public boolean mo25209a(C4672g gVar) throws IOException, InterruptedException {
        int i;
        C4965a.m15051b(gVar != null);
        if (this.f12359e) {
            this.f12359e = false;
            this.f12356b.mo25539r();
        }
        while (!this.f12359e) {
            if (this.f12357c < 0) {
                if (!this.f12355a.mo25211a(gVar, true)) {
                    return false;
                }
                C4753e eVar = this.f12355a;
                int i2 = eVar.f12364d;
                if ((eVar.f12361a & 1) == 1 && this.f12356b.f13245c == 0) {
                    i2 += mo25208a(0);
                    i = this.f12358d + 0;
                } else {
                    i = 0;
                }
                ((C4657b) gVar).mo25064c(i2);
                this.f12357c = i;
            }
            int a = mo25208a(this.f12357c);
            int i3 = this.f12357c + this.f12358d;
            if (a > 0) {
                int b = this.f12356b.mo25518b();
                C4978k kVar = this.f12356b;
                int i4 = kVar.f13245c + a;
                if (b < i4) {
                    kVar.f13243a = Arrays.copyOf(kVar.f13243a, i4);
                }
                C4978k kVar2 = this.f12356b;
                ((C4657b) gVar).mo25063b(kVar2.f13243a, kVar2.f13245c, a, false);
                C4978k kVar3 = this.f12356b;
                kVar3.mo25523d(kVar3.f13245c + a);
                this.f12359e = this.f12355a.f12366f[i3 + -1] != 255;
            }
            if (i3 == this.f12355a.f12363c) {
                i3 = -1;
            }
            this.f12357c = i3;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo25208a(int i) {
        int i2;
        int i3 = 0;
        this.f12358d = 0;
        do {
            int i4 = this.f12358d;
            int i5 = i + i4;
            C4753e eVar = this.f12355a;
            if (i5 >= eVar.f12363c) {
                break;
            }
            int[] iArr = eVar.f12366f;
            this.f12358d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
