package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.player.cache.C4549d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;

/* renamed from: com.fyber.inneractive.sdk.player.cache.e */
public class C4553e implements C4938g.C4939a {

    /* renamed from: a */
    public final C4549d.C4552c f11285a;

    /* renamed from: b */
    public C4549d.C4551b f11286b;

    /* renamed from: c */
    public final int f11287c;

    /* renamed from: d */
    public final C4251s f11288d;

    public C4553e(C4549d.C4551b bVar, C4549d.C4552c cVar, int i, C4251s sVar) {
        this.f11286b = bVar;
        this.f11287c = i;
        this.f11285a = cVar;
        this.f11288d = sVar;
    }

    /* renamed from: a */
    public C4938g mo24761a() {
        C4549d dVar = new C4549d();
        dVar.f11277h = this.f11286b;
        dVar.f11279j = this.f11287c;
        dVar.f11280k = this.f11288d;
        dVar.f11278i = this.f11285a;
        return dVar;
    }
}
