package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.d */
public class C4866d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f12912a;

    /* renamed from: b */
    public final /* synthetic */ long f12913b;

    /* renamed from: c */
    public final /* synthetic */ long f12914c;

    /* renamed from: d */
    public final /* synthetic */ IOException f12915d;

    /* renamed from: e */
    public final /* synthetic */ C4868f.C4869a f12916e;

    public C4866d(C4868f.C4869a aVar, C4942j jVar, int i, int i2, C4811i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f12916e = aVar;
        this.f12912a = obj;
        this.f12913b = j;
        this.f12914c = j2;
        this.f12915d = iOException;
    }

    public void run() {
        C4868f.C4869a aVar = this.f12916e;
        C4868f fVar = aVar.f12921b;
        C4868f.C4869a.m14832a(aVar, this.f12913b);
        C4868f.C4869a.m14832a(this.f12916e, this.f12914c);
        IAlog.m16446a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", ((C4604r) fVar).mo24906b(), this.f12915d);
    }
}
