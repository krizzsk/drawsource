package com.ogury.p377ed.internal;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ci */
public final class C9897ci {

    /* renamed from: a */
    private final C9894cg f24932a;

    public C9897ci(C9894cg cgVar) {
        C10263mq.m29882b(cgVar, "filterSettings");
        this.f24932a = cgVar;
    }

    /* renamed from: a */
    public final boolean mo64435a(List<? extends Object> list) {
        C10263mq.m29882b(list, "fragments");
        Iterable<Object> iterable = list;
        for (Object a : iterable) {
            if (m28580a(a)) {
                return false;
            }
        }
        for (Object b : iterable) {
            if (m28581b(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m28580a(Object obj) {
        String a = C9890cc.m28565a(obj);
        Iterable<String> b = this.f24932a.mo64434b();
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String a2 : b) {
            if (C10263mq.m29881a((Object) a2, (Object) a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m28581b(Object obj) {
        String a = C9890cc.m28565a(obj);
        Iterable<String> a2 = this.f24932a.mo64433a();
        if ((a2 instanceof Collection) && ((Collection) a2).isEmpty()) {
            return false;
        }
        for (String b : a2) {
            if (C10312oc.m29953b(a, b)) {
                return true;
            }
        }
        return false;
    }
}
