package com.ogury.p377ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dp */
public final class C9960dp {

    /* renamed from: a */
    private final Context f25041a;

    /* renamed from: b */
    private final C10008ez f25042b;

    /* renamed from: c */
    private final C10012fa f25043c;

    /* renamed from: d */
    private final C10040fx f25044d;

    private C9960dp(Context context, C10008ez ezVar, C10012fa faVar, C10040fx fxVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        this.f25041a = context;
        this.f25042b = ezVar;
        this.f25043c = faVar;
        this.f25044d = fxVar;
    }

    public /* synthetic */ C9960dp(Context context) {
        this(context, new C10008ez(context), new C10012fa(context), new C10040fx(context));
    }

    /* renamed from: a */
    public final JSONObject mo64476a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", this.f25042b.mo64622j());
        jSONObject.put("at", this.f25042b.mo64619g());
        jSONObject.put("build", 30105);
        jSONObject.put("version", "4.2.0");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f25043c.mo64638b());
        jSONObject.put("apps_publishers", jSONArray);
        return jSONObject;
    }
}
