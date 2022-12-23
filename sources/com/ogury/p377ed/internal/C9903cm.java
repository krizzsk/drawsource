package com.ogury.p377ed.internal;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cm */
public final class C9903cm {
    /* renamed from: a */
    public static final C9981eb m28599a(List<C9981eb> list, String str) {
        C10263mq.m29882b(list, "<this>");
        C10263mq.m29882b(str, "nextAdId");
        if (list.isEmpty()) {
            return null;
        }
        if ((str.length() == 0) || C10263mq.m29881a((Object) str, (Object) "null")) {
            return list.remove(0);
        }
        return m28601b(list, str);
    }

    /* renamed from: com.ogury.ed.internal.cm$a */
    static final class C9904a extends C10264mr implements C10228lk<C9981eb, Boolean> {

        /* renamed from: a */
        public static final C9904a f24946a = new C9904a();

        C9904a() {
            super(1);
        }

        /* renamed from: a */
        private static Boolean m28602a(C9981eb ebVar) {
            C10263mq.m29882b(ebVar, "it");
            return Boolean.valueOf(ebVar.mo64543u());
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            return m28602a((C9981eb) obj);
        }
    }

    /* renamed from: a */
    public static final void m28600a(List<C9981eb> list) {
        C10263mq.m29882b(list, "<this>");
        C10190km.m29762a(list, C9904a.f24946a);
    }

    /* renamed from: b */
    private static final C9981eb m28601b(List<C9981eb> list, String str) {
        Iterator<C9981eb> it = list.iterator();
        while (it.hasNext()) {
            C9981eb next = it.next();
            if (C10263mq.m29881a((Object) next.mo64503b(), (Object) str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }
}
