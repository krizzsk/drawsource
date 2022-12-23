package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.cache.C4177a;

/* renamed from: com.fyber.inneractive.sdk.util.m */
public class C5296m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4177a f14022a;

    public C5296m(C4177a aVar) {
        this.f14022a = aVar;
    }

    public void run() {
        C4177a aVar;
        try {
            if (C5292l.f14015a != null && (aVar = this.f14022a) != null) {
                C5292l.f14015a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.mo24169b()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
