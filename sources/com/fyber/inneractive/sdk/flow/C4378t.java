package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5326w0;

/* renamed from: com.fyber.inneractive.sdk.flow.t */
public class C4378t implements C5326w0.C5328b {

    /* renamed from: a */
    public final /* synthetic */ C4375s f10769a;

    public C4378t(C4375s sVar) {
        this.f10769a = sVar;
    }

    /* renamed from: a */
    public void mo24200a(C5326w0 w0Var) {
        Runnable runnable = this.f10769a.f10758n;
        if (runnable != null) {
            C5299n.f14024b.post(runnable);
        }
        C4375s sVar = this.f10769a;
        C5326w0 w0Var2 = sVar.f10759o;
        if (w0Var2 != null) {
            w0Var2.f14065e = null;
            sVar.f10759o = null;
        }
    }
}
