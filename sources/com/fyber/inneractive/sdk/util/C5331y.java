package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.y */
public class C5331y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5332z f14069a;

    public C5331y(C5332z zVar) {
        this.f14069a = zVar;
    }

    public void run() {
        this.f14069a.getClass();
        IAlog.m16446a("%sSampling timeout reached! unregistering location request listeners", "Location Manager: ");
        C5332z zVar = this.f14069a;
        zVar.mo26420a(zVar.f14075f);
        C5332z zVar2 = this.f14069a;
        zVar2.mo26420a(zVar2.f14074e);
        C5332z zVar3 = this.f14069a;
        zVar3.f14075f = null;
        zVar3.f14074e = null;
    }
}
