package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.factories.c */
public final class C4342c {

    /* renamed from: a */
    public final Set<C4343a> f10658a = new HashSet();

    /* renamed from: com.fyber.inneractive.sdk.factories.c$a */
    public interface C4343a {
        /* renamed from: a */
        boolean mo24315a(InneractiveAdSpot inneractiveAdSpot);

        /* renamed from: b */
        C4397c mo24316b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.c$b */
    public static class C4344b {

        /* renamed from: a */
        public static C4342c f10659a = new C4342c();
    }

    /* renamed from: a */
    public C4397c mo24486a(InneractiveAdSpot inneractiveAdSpot) {
        for (C4343a next : this.f10658a) {
            if (next.mo24315a(inneractiveAdSpot)) {
                return next.mo24316b(inneractiveAdSpot);
            }
        }
        return null;
    }
}
