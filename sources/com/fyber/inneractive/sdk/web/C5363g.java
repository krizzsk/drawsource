package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.g */
public class C5363g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5349d f14168a;

    public C5363g(C5349d dVar) {
        this.f14168a = dVar;
    }

    public void run() {
        try {
            C5349d dVar = this.f14168a;
            if (dVar.f14125G != null) {
                IAlog.m16446a("%sunregistering orientation broadcast receiver", IAlog.m16443a((Object) dVar));
                this.f14168a.f14125G.mo26491a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f14168a.f14125G = null;
    }
}
