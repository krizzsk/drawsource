package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.player.controller.C4602q;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.i */
public class C5221i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5218h f13813a;

    public C5221i(C5218h hVar) {
        this.f13813a = hVar;
    }

    public void run() {
        C5218h hVar = this.f13813a;
        if (hVar.f13808t != null) {
            boolean unused = hVar.getClass();
            C5218h hVar2 = this.f13813a;
            hVar2.getClass();
            IAlog.m16446a("%sIdle state reached!", IAlog.m16443a((Object) hVar2));
            C4602q qVar = this.f13813a.f13801m;
            if (qVar != null) {
                qVar.mo24851b(true);
            }
            this.f13813a.f13808t = null;
        }
    }
}
