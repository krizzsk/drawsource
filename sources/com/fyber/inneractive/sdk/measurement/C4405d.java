package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4179c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4485f0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.d */
public class C4405d extends C4401a {

    /* renamed from: b */
    public String f10803b;

    /* renamed from: c */
    public Partner f10804c;

    /* renamed from: a */
    public static void m13561a(C4405d dVar, Context context) {
        dVar.getClass();
        C4485f0 f0Var = new C4485f0(new C4404c(dVar), context, new C4179c(String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/%s.js", new Object[]{Omid.getVersion()}), "omid-latest.js"));
        IAConfigManager.f10324J.f10354t.f11186a.offer(f0Var);
        f0Var.mo24642a(C4501m0.QUEUED);
    }
}
