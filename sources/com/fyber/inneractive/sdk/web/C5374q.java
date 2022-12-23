package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.q */
public class C5374q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5375r f14183a;

    public C5374q(C5375r rVar) {
        this.f14183a = rVar;
    }

    public void run() {
        try {
            this.f14183a.f14186a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
