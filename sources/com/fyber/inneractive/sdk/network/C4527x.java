package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.x */
public class C4527x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4474b0 f11193a;

    /* renamed from: b */
    public final /* synthetic */ C4523w f11194b;

    public C4527x(C4523w wVar, C4474b0 b0Var) {
        this.f11194b = wVar;
        this.f11193a = b0Var;
    }

    public void run() {
        IAlog.m16446a("retrying network request", new Object[0]);
        this.f11194b.mo24706c(this.f11193a);
    }
}
