package com.ogury.p377ed.internal;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dn */
public final class C9958dn extends C9962dr {

    /* renamed from: a */
    private final C10008ez f25039a;

    /* renamed from: b */
    private final C9961dq f25040b;

    public /* synthetic */ C9958dn(Context context, C9961dq dqVar) {
        this(context, new C10012fa(context), new C10040fx(context), new C10008ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9958dn(Context context, C10012fa faVar, C10040fx fxVar, C10008ez ezVar, C9961dq dqVar) {
        super(context, faVar, fxVar);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(dqVar, "configurableRequestFieldPermission");
        this.f25039a = ezVar;
        this.f25040b = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("WebView-User-Agent", mo64479b().mo64643g());
        loadHeaders.put(ExifInterface.TAG_ORIENTATION, this.f25039a.mo64626n());
        return loadHeaders;
    }

    /* renamed from: a */
    public final String mo64475a() {
        if (!this.f25040b.mo64477a()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo64480c().mo64731a().getId();
        C10263mq.m29879a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
