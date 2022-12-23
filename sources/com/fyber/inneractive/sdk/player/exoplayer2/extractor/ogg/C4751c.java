package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4756h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c */
public class C4751c implements C4665f {

    /* renamed from: a */
    public C4756h f12354a;

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        boolean z;
        boolean z2;
        try {
            C4753e eVar = new C4753e();
            if (eVar.mo25211a(gVar, true)) {
                if ((eVar.f12361a & 2) == 2) {
                    int min = Math.min(eVar.f12365e, 8);
                    C4978k kVar = new C4978k(min);
                    ((C4657b) gVar).mo25061a(kVar.f13243a, 0, min, false);
                    kVar.mo25525e(0);
                    if (kVar.mo25513a() >= 5 && kVar.mo25533l() == 127 && kVar.mo25534m() == 1179402563) {
                        this.f12354a = new C4749b();
                    } else {
                        kVar.mo25525e(0);
                        try {
                            z = C4762k.m14548a(1, kVar, true);
                        } catch (C4815l unused) {
                            z = false;
                        }
                        if (z) {
                            this.f12354a = new C4760j();
                        } else {
                            kVar.mo25525e(0);
                            int i = C4755g.f12368o;
                            int a = kVar.mo25513a();
                            byte[] bArr = C4755g.f12369p;
                            if (a < bArr.length) {
                                z2 = false;
                            } else {
                                byte[] bArr2 = new byte[bArr.length];
                                int length = bArr.length;
                                System.arraycopy(kVar.f13243a, kVar.f13244b, bArr2, 0, length);
                                kVar.f13244b += length;
                                z2 = Arrays.equals(bArr2, bArr);
                            }
                            if (z2) {
                                this.f12354a = new C4755g();
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (C4815l unused2) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        C4746n a = hVar.mo25098a(0, 1);
        hVar.mo25100c();
        C4756h hVar2 = this.f12354a;
        hVar2.f12373c = hVar;
        hVar2.f12372b = a;
        hVar2.f12371a = new C4752d();
        hVar2.mo25206a(true);
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        C4756h hVar = this.f12354a;
        C4752d dVar = hVar.f12371a;
        dVar.f12355a.mo25210a();
        dVar.f12356b.mo25539r();
        dVar.f12357c = -1;
        dVar.f12359e = false;
        if (j == 0) {
            hVar.mo25206a(!hVar.f12382l);
        } else if (hVar.f12378h != 0) {
            hVar.f12375e = hVar.f12374d.mo25204c(j2);
            hVar.f12378h = 2;
        }
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        C4672g gVar2 = gVar;
        C4756h hVar = this.f12354a;
        int i = hVar.f12378h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!hVar.f12371a.mo25209a(gVar2)) {
                    hVar.f12378h = 3;
                    return -1;
                }
                C4657b bVar = (C4657b) gVar2;
                long j = bVar.f11670c;
                long j2 = hVar.f12376f;
                hVar.f12381k = j - j2;
                boolean a = hVar.mo25207a(hVar.f12371a.f12356b, j2, hVar.f12380j);
                if (a) {
                    hVar.f12376f = bVar.f11670c;
                }
                z = a;
            }
            C4811i iVar = hVar.f12380j.f12384a;
            hVar.f12379i = iVar.f12768s;
            if (!hVar.f12383m) {
                hVar.f12372b.mo25074a(iVar);
                hVar.f12383m = true;
            }
            C4754f fVar = hVar.f12380j.f12385b;
            if (fVar != null) {
                hVar.f12374d = fVar;
            } else {
                long j3 = ((C4657b) gVar2).f11669b;
                if (j3 == -1) {
                    hVar.f12374d = new C4756h.C4758b();
                } else {
                    C4753e eVar = hVar.f12371a.f12355a;
                    hVar.f12374d = new C4747a(hVar.f12376f, j3, hVar, eVar.f12364d + eVar.f12365e, eVar.f12362b);
                }
            }
            hVar.f12380j = null;
            hVar.f12378h = 2;
            C4978k kVar = hVar.f12371a.f12356b;
            byte[] bArr = kVar.f13243a;
            if (bArr.length != 65025) {
                kVar.f13243a = Arrays.copyOf(bArr, Math.max(65025, kVar.f13245c));
            }
        } else if (i == 1) {
            ((C4657b) gVar2).mo25064c((int) hVar.f12376f);
            hVar.f12378h = 2;
        } else if (i == 2) {
            long a2 = hVar.f12374d.mo25201a(gVar2);
            if (a2 >= 0) {
                lVar.f11944a = a2;
                return 1;
            }
            if (a2 < -1) {
                hVar.mo25214b(-(a2 + 2));
            }
            if (!hVar.f12382l) {
                hVar.f12373c.mo25099a(hVar.f12374d.mo25203b());
                hVar.f12382l = true;
            }
            if (hVar.f12381k > 0 || hVar.f12371a.mo25209a(gVar2)) {
                hVar.f12381k = 0;
                C4978k kVar2 = hVar.f12371a.f12356b;
                long a3 = hVar.mo25205a(kVar2);
                if (a3 >= 0) {
                    long j4 = hVar.f12377g;
                    if (j4 + a3 >= hVar.f12375e) {
                        long j5 = (j4 * 1000000) / ((long) hVar.f12379i);
                        hVar.f12372b.mo25075a(kVar2, kVar2.f13245c);
                        hVar.f12372b.mo25072a(j5, 1, kVar2.f13245c, 0, (byte[]) null);
                        hVar.f12375e = -1;
                    }
                }
                hVar.f12377g += a3;
            } else {
                hVar.f12378h = 3;
                return -1;
            }
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
