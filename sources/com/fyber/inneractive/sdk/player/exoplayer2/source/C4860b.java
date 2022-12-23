package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.b */
public class C4860b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f12892a;

    /* renamed from: b */
    public final /* synthetic */ long f12893b;

    /* renamed from: c */
    public final /* synthetic */ long f12894c;

    /* renamed from: d */
    public final /* synthetic */ C4868f.C4869a f12895d;

    public C4860b(C4868f.C4869a aVar, C4942j jVar, int i, int i2, C4811i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f12895d = aVar;
        this.f12892a = obj;
        this.f12893b = j;
        this.f12894c = j2;
    }

    public void run() {
        C4868f.C4869a aVar = this.f12895d;
        C4868f fVar = aVar.f12921b;
        C4868f.C4869a.m14832a(aVar, this.f12893b);
        C4868f.C4869a.m14832a(this.f12895d, this.f12894c);
        IAlog.m16446a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", ((C4604r) fVar).mo24906b());
    }
}
