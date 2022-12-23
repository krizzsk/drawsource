package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.cache.C4556h;
import com.fyber.inneractive.sdk.player.controller.C4577d;
import com.fyber.inneractive.sdk.player.controller.C4604r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4880l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.k */
public class C4879k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IOException f12976a;

    /* renamed from: b */
    public final /* synthetic */ C4872i f12977b;

    public C4879k(C4872i iVar, IOException iOException) {
        this.f12977b = iVar;
        this.f12976a = iOException;
    }

    public void run() {
        C4880l.C4881a aVar = this.f12977b.f12935e;
        IOException iOException = this.f12976a;
        C4604r rVar = (C4604r) aVar;
        if (rVar.f11438a != null && (iOException.getCause() instanceof C4556h.C4562f) && ((C4577d) rVar.f11438a.get()).f11353B) {
            ((C4577d) rVar.f11438a.get()).mo24812a(((C4577d) rVar.f11438a.get()).f11356E, ((C4577d) rVar.f11438a.get()).f11355D, false);
        }
    }
}
