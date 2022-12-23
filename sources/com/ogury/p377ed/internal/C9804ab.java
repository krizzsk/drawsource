package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.ab */
public final class C9804ab {

    /* renamed from: a */
    private C10044g f24715a;

    /* renamed from: b */
    private final Context f24716b;

    /* renamed from: c */
    private final C10008ez f24717c;

    public /* synthetic */ C9804ab(C10044g gVar, Context context) {
        this(gVar, context, new C10008ez(context));
    }

    private C9804ab(C10044g gVar, Context context, C10008ez ezVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ezVar, "androidDevice");
        this.f24715a = gVar;
        this.f24716b = context;
        this.f24717c = ezVar;
    }

    /* renamed from: a */
    public final void mo64284a(C10044g gVar) {
        C10263mq.m29882b(gVar, "<set-?>");
        this.f24715a = gVar;
    }

    /* renamed from: a */
    private final int m28259a(int i, boolean z) {
        if (!z) {
            return i;
        }
        if (this.f24717c.mo64628p()) {
            return -1;
        }
        return this.f24717c.mo64624l();
    }

    /* renamed from: a */
    public final void mo64283a(C9905cn cnVar, boolean z, boolean z2) {
        C10263mq.m29882b(cnVar, "adSize");
        C10146iz izVar = new C10146iz(false, m28259a(cnVar.mo64441a(), z), cnVar.mo64442b(), 0, 0);
        izVar.mo64954e(17);
        if (z2) {
            this.f24715a.setLeft(0);
            this.f24715a.setTop(0);
            this.f24715a.setInitialSize(izVar);
            return;
        }
        this.f24715a.setInitialSizeWithoutResizing(izVar);
    }
}
