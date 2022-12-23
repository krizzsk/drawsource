package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4813j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4867e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4886o;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i */
public final class C4685i implements C4886o {

    /* renamed from: a */
    public final int f11808a;

    /* renamed from: b */
    public final C4686j f11809b;

    public C4685i(C4686j jVar, int i) {
        this.f11809b = jVar;
        this.f11808a = i;
    }

    /* renamed from: a */
    public void mo25135a() throws IOException {
        this.f11809b.mo25148j();
    }

    public boolean isReady() {
        C4686j jVar = this.f11809b;
        return jVar.f11834y || (!jVar.mo25146h() && !jVar.f11819j.valueAt(this.f11808a).mo25082f());
    }

    /* renamed from: a */
    public int mo25134a(C4813j jVar, C4643b bVar, boolean z) {
        C4686j jVar2 = this.f11809b;
        int i = this.f11808a;
        if (jVar2.mo25146h()) {
            return -3;
        }
        while (true) {
            boolean z2 = true;
            if (jVar2.f11820k.size() <= 1) {
                break;
            }
            int i2 = jVar2.f11820k.getFirst().f11770j;
            int i3 = 0;
            while (true) {
                if (i3 >= jVar2.f11819j.size()) {
                    break;
                }
                if (jVar2.f11831v[i3]) {
                    C4659d.C4662c cVar = jVar2.f11819j.valueAt(i3).f11677c;
                    if ((cVar.f11701i == 0 ? cVar.f11710r : cVar.f11694b[cVar.f11703k]) == i2) {
                        z2 = false;
                        break;
                    }
                }
                i3++;
            }
            if (!z2) {
                break;
            }
            jVar2.f11820k.removeFirst();
        }
        C4682f first = jVar2.f11820k.getFirst();
        C4811i iVar = first.f12902c;
        if (!iVar.equals(jVar2.f11826q)) {
            C4868f.C4869a aVar = jVar2.f11817h;
            int i4 = jVar2.f11810a;
            int i5 = first.f12903d;
            Object obj = first.f12904e;
            long j = first.f12905f;
            if (aVar.f12921b != null) {
                aVar.f12920a.post(new C4867e(aVar, i4, iVar, i5, obj, j));
            }
        }
        jVar2.f11826q = iVar;
        return jVar2.f11819j.valueAt(i).mo25069a(jVar, bVar, z, jVar2.f11834y, jVar2.f11832w);
    }

    /* renamed from: a */
    public void mo25136a(long j) {
        C4686j jVar = this.f11809b;
        C4659d valueAt = jVar.f11819j.valueAt(this.f11808a);
        if (!jVar.f11834y || j <= valueAt.mo25080d()) {
            valueAt.mo25077a(j, true);
        } else {
            valueAt.mo25083g();
        }
    }
}
