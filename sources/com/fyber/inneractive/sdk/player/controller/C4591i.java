package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.i */
public class C4591i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4582g f11401a;

    public C4591i(C4582g gVar) {
        this.f11401a = gVar;
    }

    public void run() {
        try {
            List<C4582g.C4588f> list = this.f11401a.f11379b;
            if (list != null) {
                for (C4582g.C4588f e : list) {
                    e.mo24841e();
                }
            }
        } catch (Exception e2) {
            if (IAlog.f13936a <= 3) {
                C4582g gVar = this.f11401a;
                gVar.getClass();
                IAlog.m16446a("%sonDrawnToSurface callback threw an exception!", IAlog.m16443a((Object) gVar));
                e2.printStackTrace();
            }
        }
    }
}
