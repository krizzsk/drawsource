package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.cache.session.g */
public class C4197g implements Comparator<C4191e> {
    public C4197g(C4198h hVar) {
    }

    public int compare(Object obj, Object obj2) {
        C4191e eVar = (C4191e) obj;
        C4191e eVar2 = (C4191e) obj2;
        if (eVar == null || eVar2 == null) {
            return 0;
        }
        return eVar2.f10305d - eVar.f10305d > 0 ? 1 : -1;
    }
}
