package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.cache.session.a */
public class C4185a extends HashMap<C4193b, C4198h> {

    /* renamed from: a */
    public final /* synthetic */ int f10290a;

    public C4185a(C4189d dVar, int i) {
        this.f10290a = i;
        for (C4193b bVar : C4193b.values()) {
            if (bVar != C4193b.NONE) {
                put(bVar, new C4198h(this.f10290a));
            }
        }
    }
}
