package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a */
public abstract class C4862a implements C4957x.C4960c {

    /* renamed from: a */
    public final C4942j f12900a;

    /* renamed from: b */
    public final int f12901b;

    /* renamed from: c */
    public final C4811i f12902c;

    /* renamed from: d */
    public final int f12903d;

    /* renamed from: e */
    public final Object f12904e;

    /* renamed from: f */
    public final long f12905f;

    /* renamed from: g */
    public final long f12906g;

    /* renamed from: h */
    public final C4938g f12907h;

    public C4862a(C4938g gVar, C4942j jVar, int i, C4811i iVar, int i2, Object obj, long j, long j2) {
        this.f12907h = (C4938g) C4965a.m15047a(gVar);
        this.f12900a = (C4942j) C4965a.m15047a(jVar);
        this.f12901b = i;
        this.f12902c = iVar;
        this.f12903d = i2;
        this.f12904e = obj;
        this.f12905f = j;
        this.f12906g = j2;
    }

    /* renamed from: c */
    public abstract long mo25112c();
}
