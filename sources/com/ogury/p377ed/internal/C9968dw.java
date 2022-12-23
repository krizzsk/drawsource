package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.p377ed.internal.C9963ds;

/* renamed from: com.ogury.ed.internal.dw */
public final class C9968dw {

    /* renamed from: a */
    public static final C9968dw f25057a = new C9968dw();

    /* renamed from: b */
    private static C9967dv f25058b;

    private C9968dw() {
    }

    /* renamed from: a */
    public static C9967dv m28771a(Context context) {
        int i;
        C10263mq.m29882b(context, "context");
        if (f25058b == null) {
            Context applicationContext = context.getApplicationContext();
            C9963ds.C9964a aVar = C9963ds.f25051a;
            C10263mq.m29879a((Object) applicationContext, "appContext");
            C9963ds a = C9963ds.C9964a.m28761a(applicationContext, new C9961dq(applicationContext));
            C10029fn fnVar = C10029fn.f25239a;
            C10028fm a2 = C10029fn.m29114a(context);
            Integer valueOf = a2 == null ? null : Integer.valueOf(a2.mo64718l());
            if (valueOf == null) {
                i = C10031fp.m29126a(3);
            } else {
                i = valueOf.intValue();
            }
            f25058b = new C9969dx(a, new C10012fa(applicationContext), new C10008ez(applicationContext), C9928dc.f24979a, new OguryNetworkClient(i, i * 5), new C10040fx(applicationContext));
        }
        C9967dv dvVar = f25058b;
        C10263mq.m29878a((Object) dvVar);
        return dvVar;
    }
}
