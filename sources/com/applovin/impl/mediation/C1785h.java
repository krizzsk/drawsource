package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p031a.C1583a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.h */
public class C1785h {

    /* renamed from: a */
    private final List<C1786a> f2800a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.mediation.h$a */
    public interface C1786a {
        /* renamed from: a */
        void mo13943a(C1583a aVar);
    }

    /* renamed from: a */
    public void mo13940a(C1583a aVar) {
        Iterator it = new ArrayList(this.f2800a).iterator();
        while (it.hasNext()) {
            ((C1786a) it.next()).mo13943a(aVar);
        }
    }

    /* renamed from: a */
    public void mo13941a(C1786a aVar) {
        this.f2800a.add(aVar);
    }

    /* renamed from: b */
    public void mo13942b(C1786a aVar) {
        this.f2800a.remove(aVar);
    }
}
