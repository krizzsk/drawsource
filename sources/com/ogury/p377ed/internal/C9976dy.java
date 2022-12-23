package com.ogury.p377ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dy */
public class C9976dy extends C9962dr {

    /* renamed from: a */
    private final C10008ez f25077a;

    /* renamed from: a */
    public final String mo64475a() {
        return "00000000-0000-0000-0000-000000000000";
    }

    public /* synthetic */ C9976dy(Context context) {
        this(context, new C10012fa(context), new C10040fx(context), new C10008ez(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9976dy(Context context, C10012fa faVar, C10040fx fxVar, C10008ez ezVar) {
        super(context, faVar, fxVar);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        C10263mq.m29882b(ezVar, "androidDevice");
        this.f25077a = ezVar;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("Api-Key", "[" + mo64479b().mo64638b() + ']');
        loadHeaders.put("Sdk-Version", "[4.2.0]");
        loadHeaders.put("Timezone", C10008ez.m28974f());
        loadHeaders.put("Connectivity", this.f25077a.mo64622j());
        loadHeaders.put("Sdk-Version-Type", CampaignUnit.JSON_KEY_ADS);
        loadHeaders.put("Sdk-Type", String.valueOf(mo64480c().mo64732b()));
        return loadHeaders;
    }
}
