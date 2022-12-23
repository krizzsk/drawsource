package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.z */
public final class C4964z implements C4938g {

    /* renamed from: a */
    public final C4938g f13206a;

    /* renamed from: b */
    public final C4936f f13207b;

    public C4964z(C4938g gVar, C4936f fVar) {
        this.f13206a = (C4938g) C4965a.m15047a(gVar);
        this.f13207b = (C4936f) C4965a.m15047a(fVar);
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws IOException {
        long a = this.f13206a.mo24756a(jVar);
        if (jVar.f13130e == -1 && a != -1) {
            jVar = new C4942j(jVar.f13126a, (byte[]) null, jVar.f13128c, jVar.f13129d, a, jVar.f13131f, jVar.f13132g);
        }
        this.f13207b.mo25449a(jVar);
        return a;
    }

    public void close() throws IOException {
        try {
            this.f13206a.close();
        } finally {
            this.f13207b.close();
        }
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f13206a.mo24755a(bArr, i, i2);
        if (a > 0) {
            this.f13207b.mo25450a(bArr, i, a);
        }
        return a;
    }

    /* renamed from: a */
    public Uri mo24757a() {
        return this.f13206a.mo24757a();
    }
}
