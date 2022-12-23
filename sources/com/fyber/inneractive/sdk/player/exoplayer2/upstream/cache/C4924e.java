package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4936f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4922d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e */
public final class C4924e implements C4938g.C4939a {

    /* renamed from: a */
    public final C4916a f13077a;

    /* renamed from: b */
    public final C4938g.C4939a f13078b;

    /* renamed from: c */
    public final C4938g.C4939a f13079c;

    /* renamed from: d */
    public final C4936f.C4937a f13080d;

    public C4924e(C4916a aVar, C4938g.C4939a aVar2, C4938g.C4939a aVar3, C4936f.C4937a aVar4, int i, C4922d.C4923a aVar5) {
        this.f13077a = aVar;
        this.f13078b = aVar2;
        this.f13079c = aVar3;
        this.f13080d = aVar4;
    }

    /* renamed from: a */
    public C4938g mo24761a() {
        C4919b bVar;
        C4916a aVar = this.f13077a;
        C4938g a = this.f13078b.mo24761a();
        C4938g a2 = this.f13079c.mo24761a();
        C4936f.C4937a aVar2 = this.f13080d;
        if (aVar2 != null) {
            C4921c cVar = (C4921c) aVar2;
            bVar = new C4919b(cVar.f13056a, cVar.f13057b, 20480);
        } else {
            bVar = null;
        }
        return new C4922d(aVar, a, a2, bVar, 2, (C4922d.C4923a) null);
    }
}
