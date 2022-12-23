package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4696d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y */
public final class C4962y<T> implements C4957x.C4960c {

    /* renamed from: a */
    public final C4942j f13200a;

    /* renamed from: b */
    public final C4938g f13201b;

    /* renamed from: c */
    public final C4963a<? extends T> f13202c;

    /* renamed from: d */
    public volatile T f13203d;

    /* renamed from: e */
    public volatile boolean f13204e;

    /* renamed from: f */
    public volatile long f13205f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y$a */
    public interface C4963a<T> {
    }

    public C4962y(C4938g gVar, Uri uri, int i, C4963a<? extends T> aVar) {
        this.f13201b = gVar;
        this.f13200a = new C4942j(uri, 1);
        this.f13202c = aVar;
    }

    /* renamed from: a */
    public final boolean mo25110a() {
        return this.f13204e;
    }

    /* renamed from: b */
    public final void mo25111b() {
        this.f13204e = true;
    }

    public final void load() throws IOException, InterruptedException {
        C4941i iVar = new C4941i(this.f13201b, this.f13200a);
        try {
            if (!iVar.f13123d) {
                iVar.f13120a.mo24756a(iVar.f13121b);
                iVar.f13123d = true;
            }
            this.f13203d = ((C4696d) this.f13202c).mo25152a(this.f13201b.mo24757a(), (InputStream) iVar);
        } finally {
            this.f13205f = iVar.f13125f;
            C4991u.m15138a((Closeable) iVar);
        }
    }
}
