package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.c */
public class C4861c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f12896a;

    /* renamed from: b */
    public final /* synthetic */ long f12897b;

    /* renamed from: c */
    public final /* synthetic */ long f12898c;

    /* renamed from: d */
    public final /* synthetic */ C4868f.C4869a f12899d;

    public C4861c(C4868f.C4869a aVar, C4942j jVar, int i, int i2, C4811i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f12899d = aVar;
        this.f12896a = obj;
        this.f12897b = j;
        this.f12898c = j2;
    }

    public void run() {
        C4868f.C4869a aVar = this.f12899d;
        C4868f fVar = aVar.f12921b;
        C4868f.C4869a.m14832a(aVar, this.f12897b);
        C4868f.C4869a.m14832a(this.f12899d, this.f12898c);
        IAlog.m16446a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", ((C4604r) fVar).mo24906b());
    }
}
