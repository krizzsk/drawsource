package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.p377ed.internal.C10025fk;

/* renamed from: com.ogury.ed.internal.fn */
public final class C10029fn {

    /* renamed from: a */
    public static final C10029fn f25239a = new C10029fn();

    /* renamed from: b */
    private static C10028fm f25240b;

    private C10029fn() {
    }

    /* renamed from: a */
    public static C10028fm m29113a() {
        return f25240b;
    }

    /* renamed from: a */
    public static void m29115a(C10028fm fmVar) {
        C10263mq.m29882b(fmVar, "newProfig");
        f25240b = fmVar;
    }

    /* renamed from: a */
    public static C10028fm m29114a(Context context) {
        C10263mq.m29882b(context, "context");
        if (f25240b == null) {
            C10025fk.C10026a aVar = C10025fk.f25214a;
            String d = C10025fk.C10026a.m29075a(context).mo64679d();
            C10030fo foVar = C10030fo.f25241a;
            f25240b = C10030fo.m29117a(d);
        }
        return f25240b;
    }

    /* renamed from: b */
    public static void m29116b(Context context) throws C9997eq {
        C10263mq.m29882b(context, "context");
        C10015fc.f25180a.mo64648a(context).mo64647b();
    }
}
