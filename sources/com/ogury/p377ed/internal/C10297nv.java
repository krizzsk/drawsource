package com.ogury.p377ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.nv */
class C10297nv extends C10296nu {

    /* renamed from: com.ogury.ed.internal.nv$a */
    public static final class C10298a implements C10270mx, Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ C10291np f25621a;

        public C10298a(C10291np npVar) {
            this.f25621a = npVar;
        }

        public final Iterator<T> iterator() {
            return this.f25621a.mo65159a();
        }
    }

    /* renamed from: a */
    public static final <T> Iterable<T> m29924a(C10291np<? extends T> npVar) {
        C10263mq.m29882b(npVar, "$this$asIterable");
        return new C10298a(npVar);
    }
}
