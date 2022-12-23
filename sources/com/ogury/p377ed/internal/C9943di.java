package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.p377ed.internal.C9944dj;

/* renamed from: com.ogury.ed.internal.di */
public final class C9943di {

    /* renamed from: a */
    public static final C9943di f25015a = new C9943di();

    /* renamed from: b */
    private static C9944dj f25016b;

    private C9943di() {
    }

    /* renamed from: a */
    public static void m28716a(Context context) {
        C10263mq.m29882b(context, "context");
        if (f25016b == null) {
            C9944dj.C9945a aVar = C9944dj.f25017a;
            f25016b = C9944dj.C9945a.m28726a(context);
        }
    }

    /* renamed from: a */
    public static void m28717a(C9942dh dhVar) {
        C10263mq.m29882b(dhVar, "event");
        C9944dj djVar = f25016b;
        if (djVar != null) {
            djVar.mo64470a(dhVar);
        }
    }
}
