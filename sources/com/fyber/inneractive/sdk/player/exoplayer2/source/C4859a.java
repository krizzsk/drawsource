package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.a */
public class C4859a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f12888a;

    /* renamed from: b */
    public final /* synthetic */ long f12889b;

    /* renamed from: c */
    public final /* synthetic */ long f12890c;

    /* renamed from: d */
    public final /* synthetic */ C4868f.C4869a f12891d;

    public C4859a(C4868f.C4869a aVar, C4942j jVar, int i, int i2, C4811i iVar, int i3, Object obj, long j, long j2, long j3) {
        this.f12891d = aVar;
        this.f12888a = obj;
        this.f12889b = j;
        this.f12890c = j2;
    }

    public void run() {
        C4868f.C4869a aVar = this.f12891d;
        C4868f fVar = aVar.f12921b;
        C4868f.C4869a.m14832a(aVar, this.f12889b);
        C4868f.C4869a.m14832a(this.f12891d, this.f12890c);
        IAlog.m16446a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", ((C4604r) fVar).mo24906b());
    }
}
