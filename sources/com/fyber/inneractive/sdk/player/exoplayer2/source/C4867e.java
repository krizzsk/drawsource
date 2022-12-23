package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.e */
public class C4867e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f12917a;

    /* renamed from: b */
    public final /* synthetic */ long f12918b;

    /* renamed from: c */
    public final /* synthetic */ C4868f.C4869a f12919c;

    public C4867e(C4868f.C4869a aVar, int i, C4811i iVar, int i2, Object obj, long j) {
        this.f12919c = aVar;
        this.f12917a = obj;
        this.f12918b = j;
    }

    public void run() {
        C4868f.C4869a aVar = this.f12919c;
        C4868f fVar = aVar.f12921b;
        C4868f.C4869a.m14832a(aVar, this.f12918b);
        IAlog.m16446a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", ((C4604r) fVar).mo24906b());
    }
}
