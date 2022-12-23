package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.i */
public final class C4941i extends InputStream {

    /* renamed from: a */
    public final C4938g f13120a;

    /* renamed from: b */
    public final C4942j f13121b;

    /* renamed from: c */
    public final byte[] f13122c;

    /* renamed from: d */
    public boolean f13123d = false;

    /* renamed from: e */
    public boolean f13124e = false;

    /* renamed from: f */
    public long f13125f;

    public C4941i(C4938g gVar, C4942j jVar) {
        this.f13120a = gVar;
        this.f13121b = jVar;
        this.f13122c = new byte[1];
    }

    public void close() throws IOException {
        if (!this.f13124e) {
            this.f13120a.close();
            this.f13124e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f13122c) == -1) {
            return -1;
        }
        return this.f13122c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C4965a.m15051b(!this.f13124e);
        if (!this.f13123d) {
            this.f13120a.mo24756a(this.f13121b);
            this.f13123d = true;
        }
        int a = this.f13120a.mo24755a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f13125f += (long) a;
        return a;
    }
}
