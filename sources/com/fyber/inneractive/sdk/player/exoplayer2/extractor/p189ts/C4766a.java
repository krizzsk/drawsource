package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4620a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import okio.Utf8;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a */
public final class C4766a implements C4665f {

    /* renamed from: e */
    public static final int f12406e = C4991u.m15133a("ID3");

    /* renamed from: a */
    public final long f12407a;

    /* renamed from: b */
    public final C4978k f12408b = new C4978k(2786);

    /* renamed from: c */
    public C4767b f12409c;

    /* renamed from: d */
    public boolean f12410d;

    public C4766a(long j) {
        this.f12407a = j;
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        C4657b bVar;
        int i;
        C4978k kVar = new C4978k(10);
        int i2 = 0;
        while (true) {
            bVar = (C4657b) gVar;
            bVar.mo25061a(kVar.f13243a, 0, 10, false);
            kVar.mo25525e(0);
            if (kVar.mo25535n() != f12406e) {
                break;
            }
            kVar.mo25527f(3);
            int k = kVar.mo25532k();
            i2 += k + 10;
            bVar.mo25060a(k, false);
        }
        bVar.f11672e = 0;
        bVar.mo25060a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            bVar.mo25061a(kVar.f13243a, 0, 5, false);
            kVar.mo25525e(0);
            if (kVar.mo25538q() != 2935) {
                bVar.f11672e = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                bVar.mo25060a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = kVar.f13243a;
                if (bArr.length < 5) {
                    i = -1;
                } else {
                    i = C4620a.m14129a((bArr[4] & 192) >> 6, bArr[4] & Utf8.REPLACEMENT_BYTE);
                }
                if (i == -1) {
                    return false;
                }
                bVar.mo25060a(i - 5, false);
            }
        }
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        C4767b bVar = new C4767b((String) null);
        this.f12409c = bVar;
        bVar.f12414d = "0";
        bVar.f12415e = hVar.mo25098a(0, 1);
        hVar.mo25100c();
        hVar.mo25099a(new C4709m.C4710a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12410d = false;
        this.f12409c.mo25218a();
    }

    /* renamed from: a */
    public int mo25088a(C4672g gVar, C4708l lVar) throws IOException, InterruptedException {
        int a = ((C4657b) gVar).mo25057a(this.f12408b.f13243a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f12408b.mo25525e(0);
        this.f12408b.mo25523d(a);
        if (!this.f12410d) {
            this.f12409c.f12422l = this.f12407a;
            this.f12410d = true;
        }
        this.f12409c.mo25221a(this.f12408b);
        return 0;
    }
}
