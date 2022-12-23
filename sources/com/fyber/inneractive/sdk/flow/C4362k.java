package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.k */
public class C4362k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4363l f10718a;

    public C4362k(C4363l lVar) {
        this.f10718a = lVar;
    }

    public void run() {
        C4363l lVar = this.f10718a;
        lVar.getClass();
        IAlog.m16446a("%sRe-enabling clicks, grace period has passed", IAlog.m16443a((Object) lVar));
        boolean unused = this.f10718a.f10727i = true;
        this.f10718a.f10728j = null;
    }
}
