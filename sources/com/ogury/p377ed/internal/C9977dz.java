package com.ogury.p377ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.dz */
public final class C9977dz extends C9962dr {

    /* renamed from: a */
    private final C9961dq f25078a;

    public /* synthetic */ C9977dz(Context context, C9961dq dqVar) {
        this(context, new C10012fa(context), new C10040fx(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9977dz(Context context, C10012fa faVar, C10040fx fxVar, C9961dq dqVar) {
        super(context, faVar, fxVar);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        C10263mq.m29882b(dqVar, "configurableRequestFieldPermission");
        this.f25078a = dqVar;
    }

    /* renamed from: a */
    public final String mo64475a() {
        if (!this.f25078a.mo64478b()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo64480c().mo64731a().getId();
        C10263mq.m29879a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
