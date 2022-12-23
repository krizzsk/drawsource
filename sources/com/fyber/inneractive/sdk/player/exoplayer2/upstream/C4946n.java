package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.n */
public final class C4946n implements C4938g.C4939a {

    /* renamed from: a */
    public final Context f13153a;

    /* renamed from: b */
    public final C4912a0<? super C4938g> f13154b;

    /* renamed from: c */
    public final C4938g.C4939a f13155c;

    public C4946n(Context context, C4912a0<? super C4938g> a0Var, C4938g.C4939a aVar) {
        this.f13153a = context.getApplicationContext();
        this.f13154b = a0Var;
        this.f13155c = aVar;
    }

    /* renamed from: a */
    public C4938g mo24761a() {
        return new C4945m(this.f13153a, this.f13154b, this.f13155c.mo24761a());
    }
}
