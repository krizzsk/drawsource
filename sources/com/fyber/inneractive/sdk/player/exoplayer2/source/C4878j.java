package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4872i;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.j */
public class C4878j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4872i.C4876d f12974a;

    /* renamed from: b */
    public final /* synthetic */ C4872i f12975b;

    public C4878j(C4872i iVar, C4872i.C4876d dVar) {
        this.f12975b = iVar;
        this.f12974a = dVar;
    }

    public void run() {
        C4872i.C4876d dVar = this.f12974a;
        C4665f fVar = dVar.f12971c;
        if (fVar != null) {
            fVar.mo25092b();
            dVar.f12971c = null;
        }
        int size = this.f12975b.f12945o.size();
        for (int i = 0; i < size; i++) {
            this.f12975b.f12945o.valueAt(i).mo25078b();
        }
    }
}
