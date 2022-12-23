package com.ogury.p377ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.du */
public final class C9966du extends C9976dy {

    /* renamed from: a */
    private final C9961dq f25056a;

    public /* synthetic */ C9966du(Context context, C9961dq dqVar) {
        this(context, new C10012fa(context), new C10040fx(context), new C10008ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9966du(Context context, C10012fa faVar, C10040fx fxVar, C10008ez ezVar, C9961dq dqVar) {
        super(context, faVar, fxVar, ezVar);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(dqVar, "configurableRequestFieldPermission");
        this.f25056a = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        String id = this.f25056a.mo64478b() ? mo64480c().mo64731a().getId() : "00000000-0000-0000-0000-000000000000";
        C10263mq.m29879a((Object) id, "if (configurableRequestF…er.NO_DEVICE_ID\n        }");
        loadHeaders.put("User", id);
        return loadHeaders;
    }
}
