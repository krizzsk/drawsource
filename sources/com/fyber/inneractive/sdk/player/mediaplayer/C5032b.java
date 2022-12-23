package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.b */
public class C5032b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13414a;

    /* renamed from: b */
    public final /* synthetic */ C5018a f13415b;

    public C5032b(C5018a aVar, int i) {
        this.f13415b = aVar;
        this.f13414a = i;
    }

    public void run() {
        C5018a aVar = this.f13415b;
        int i = this.f13414a;
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.seekTo(i);
        IAlog.m16449d(c + "timelog: " + "seekTo" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
