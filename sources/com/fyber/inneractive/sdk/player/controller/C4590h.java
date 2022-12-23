package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.h */
public class C4590h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f11399a;

    /* renamed from: b */
    public final /* synthetic */ C4582g f11400b;

    public C4590h(C4582g gVar, boolean z) {
        this.f11400b = gVar;
        this.f11399a = z;
    }

    public void run() {
        C4582g gVar = this.f11400b;
        if (!gVar.f11384g) {
            try {
                List<C4582g.C4588f> list = gVar.f11379b;
                if (list != null) {
                    for (C4582g.C4588f e : list) {
                        e.mo24723e(this.f11399a);
                    }
                }
            } catch (Exception unused) {
                if (IAlog.f13936a <= 3) {
                    C4582g gVar2 = this.f11400b;
                    gVar2.getClass();
                    IAlog.m16446a("%sonPlayerError callback threw an exception!", IAlog.m16443a((Object) gVar2));
                }
            }
        }
    }
}
