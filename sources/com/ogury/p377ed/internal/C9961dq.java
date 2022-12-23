package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.dq */
public final class C9961dq {

    /* renamed from: a */
    private final Context f25045a;

    /* renamed from: b */
    private final C10029fn f25046b;

    /* renamed from: c */
    private final C9928dc f25047c;

    private C9961dq(Context context, C10029fn fnVar, C9928dc dcVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(dcVar, "extraAdConfiguration");
        this.f25045a = context;
        this.f25046b = fnVar;
        this.f25047c = dcVar;
    }

    public /* synthetic */ C9961dq(Context context) {
        this(context, C10029fn.f25239a, C9928dc.f24979a);
    }

    /* renamed from: a */
    public final boolean mo64477a() {
        C10028fm a = C10029fn.m29114a(this.f25045a);
        return m28751a(a == null ? null : Integer.valueOf(a.mo64723q()));
    }

    /* renamed from: b */
    public final boolean mo64478b() {
        C10028fm a = C10029fn.m29114a(this.f25045a);
        return m28751a(a == null ? null : Integer.valueOf(a.mo64724r()));
    }

    /* renamed from: a */
    private final boolean m28751a(Integer num) {
        int intValue = (num == null ? 0 : num.intValue()) & 1;
        if (C9928dc.m28658a()) {
            C10028fm a = C10029fn.m29114a(this.f25045a);
            intValue &= a == null ? 0 : a.mo64725s();
        }
        return intValue == 1;
    }
}
