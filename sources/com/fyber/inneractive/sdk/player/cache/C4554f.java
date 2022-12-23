package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.player.cache.C4541c;
import com.fyber.inneractive.sdk.player.cache.C4556h;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.cache.f */
public class C4554f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4556h f11289a;

    public C4554f(C4556h hVar) {
        this.f11289a = hVar;
    }

    public void run() {
        try {
            C4556h hVar = this.f11289a;
            C4541c.C4548f b = hVar.f11292b.mo24733b(hVar.mo24764a());
            C4556h hVar2 = this.f11289a;
            hVar2.f11293c = b;
            if (b == null) {
                C4541c.C4544c a = hVar2.f11292b.mo24730a(hVar2.mo24764a());
                if (a == null) {
                    boolean unused = this.f11289a.f11304n = true;
                }
                if (a != null) {
                    C4556h hVar3 = this.f11289a;
                    IAlog.m16449d("%s | start | got an editor for %s", hVar3.f11291a, hVar3.mo24764a());
                    a.mo24746a();
                }
            }
        } catch (IOException e) {
            C4556h hVar4 = this.f11289a;
            IAlog.m16445a(String.format("%s | Exception raised starting a new caching process for %s", new Object[]{hVar4.f11291a, hVar4.mo24764a()}), e, new Object[0]);
            C4516r.m13797a("Exception raised starting a new caching process", e.getMessage(), (InneractiveAdRequest) null, (C5233e) null);
        }
        C4556h hVar5 = this.f11289a;
        if (hVar5.f11293c != null || hVar5.f11304n) {
            C4556h.m13868b(hVar5, true);
            return;
        }
        C4556h.C4561e eVar = hVar5.f11298h;
        if (eVar != null) {
            eVar.start();
        }
    }
}
