package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c */
public final class C4768c implements C4665f {

    /* renamed from: e */
    public static final int f12423e = C4991u.m15133a("ID3");

    /* renamed from: a */
    public final long f12424a;

    /* renamed from: b */
    public final C4978k f12425b = new C4978k(200);

    /* renamed from: c */
    public C4769d f12426c;

    /* renamed from: d */
    public boolean f12427d;

    public C4768c(long j) {
        this.f12424a = j;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        C4657b bVar;
        C4978k kVar = new C4978k(10);
        byte[] bArr = kVar.f13243a;
        C4977j jVar = new C4977j(bArr, bArr.length);
        int i = 0;
        while (true) {
            bVar = (C4657b) gVar;
            bVar.mo25061a(kVar.f13243a, 0, 10, false);
            kVar.mo25525e(0);
            if (kVar.mo25535n() != f12423e) {
                break;
            }
            kVar.mo25527f(3);
            int k = kVar.mo25532k();
            i += k + 10;
            bVar.mo25060a(k, false);
        }
        bVar.f11672e = 0;
        bVar.mo25060a(i, false);
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (true) {
            bVar.mo25061a(kVar.f13243a, 0, 2, false);
            kVar.mo25525e(0);
            if ((kVar.mo25538q() & 65526) != 65520) {
                bVar.f11672e = 0;
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                bVar.mo25060a(i4, false);
                i2 = 0;
                i3 = 0;
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                bVar.mo25061a(kVar.f13243a, 0, 4, false);
                jVar.mo25510b(14);
                int a = jVar.mo25508a(13);
                if (a <= 6) {
                    return false;
                }
                bVar.mo25060a(a - 6, false);
                i3 += a;
            }
        }
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        C4769d dVar = new C4769d(true, (String) null);
        this.f12426c = dVar;
        dVar.mo25220a(hVar, new C4795v.C4799d(Integer.MIN_VALUE, 0, 1));
        hVar.mo25100c();
        hVar.mo25099a(new C4709m.C4710a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12427d = false;
        this.f12426c.mo25224c();
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        int a = ((C4657b) gVar).mo25057a(this.f12425b.f13243a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.f12425b.mo25525e(0);
        this.f12425b.mo25523d(a);
        if (!this.f12427d) {
            this.f12426c.f12443o = this.f12424a;
            this.f12427d = true;
        }
        this.f12426c.mo25221a(this.f12425b);
        return 0;
    }
}
