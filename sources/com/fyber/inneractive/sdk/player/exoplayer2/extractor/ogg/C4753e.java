package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.e */
public final class C4753e {

    /* renamed from: h */
    public static final int f12360h = C4991u.m15133a("OggS");

    /* renamed from: a */
    public int f12361a;

    /* renamed from: b */
    public long f12362b;

    /* renamed from: c */
    public int f12363c;

    /* renamed from: d */
    public int f12364d;

    /* renamed from: e */
    public int f12365e;

    /* renamed from: f */
    public final int[] f12366f = new int[255];

    /* renamed from: g */
    public final C4978k f12367g = new C4978k(255);

    /* renamed from: a */
    public void mo25210a() {
        this.f12361a = 0;
        this.f12362b = 0;
        this.f12363c = 0;
        this.f12364d = 0;
        this.f12365e = 0;
    }

    /* renamed from: a */
    public boolean mo25211a(C4672g gVar, boolean z) throws IOException, InterruptedException {
        this.f12367g.mo25539r();
        mo25210a();
        C4657b bVar = (C4657b) gVar;
        long j = bVar.f11669b;
        if (!(j == -1 || j - (bVar.f11670c + ((long) bVar.f11672e)) >= 27) || !bVar.mo25061a(this.f12367g.f13243a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f12367g.mo25534m() != ((long) f12360h)) {
            if (z) {
                return false;
            }
            throw new C4815l("expected OggS capture pattern at begin of page");
        } else if (this.f12367g.mo25533l() == 0) {
            this.f12361a = this.f12367g.mo25533l();
            C4978k kVar = this.f12367g;
            byte[] bArr = kVar.f13243a;
            int i = kVar.f13244b;
            int i2 = i + 1;
            kVar.f13244b = i2;
            int i3 = i2 + 1;
            kVar.f13244b = i3;
            int i4 = i3 + 1;
            kVar.f13244b = i4;
            int i5 = i4 + 1;
            kVar.f13244b = i5;
            int i6 = i5 + 1;
            kVar.f13244b = i6;
            int i7 = i6 + 1;
            kVar.f13244b = i7;
            int i8 = i7 + 1;
            kVar.f13244b = i8;
            kVar.f13244b = i8 + 1;
            this.f12362b = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
            kVar.mo25526f();
            this.f12367g.mo25526f();
            this.f12367g.mo25526f();
            int l = this.f12367g.mo25533l();
            this.f12363c = l;
            this.f12364d = l + 27;
            this.f12367g.mo25539r();
            bVar.mo25061a(this.f12367g.f13243a, 0, this.f12363c, false);
            for (int i9 = 0; i9 < this.f12363c; i9++) {
                this.f12366f[i9] = this.f12367g.mo25533l();
                this.f12365e += this.f12366f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C4815l("unsupported bit stream revision");
        }
    }
}
