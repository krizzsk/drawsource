package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.factories.b */
public final class C4339b {

    /* renamed from: a */
    public final HashMap<C5229a, C4341b> f10656a = new HashMap<>();

    /* renamed from: com.fyber.inneractive.sdk.factories.b$a */
    public static class C4340a {

        /* renamed from: a */
        public static C4339b f10657a = new C4339b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b */
    public interface C4341b {
        /* renamed from: a */
        C4394a mo24313a();

        /* renamed from: b */
        C5230b mo24314b();
    }

    /* renamed from: a */
    public C5230b mo24484a(C5229a aVar) {
        C4341b bVar = this.f10656a.get(aVar);
        if (bVar != null) {
            return bVar.mo24314b();
        }
        return null;
    }

    /* renamed from: a */
    public void mo24485a(C5229a aVar, C4341b bVar) {
        if (this.f10656a.containsKey(aVar)) {
            IAlog.m16450e("Handler already exists for ad type %s! : %s", aVar, this.f10656a.get(aVar));
            return;
        }
        this.f10656a.put(aVar, bVar);
    }
}
