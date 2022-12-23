package com.ogury.p377ed.internal;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.network.HeadersLoader;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dr */
public abstract class C9962dr implements HeadersLoader {

    /* renamed from: a */
    private final Context f25048a;

    /* renamed from: b */
    private final C10012fa f25049b;

    /* renamed from: c */
    private final C10040fx f25050c;

    /* renamed from: a */
    public abstract String mo64475a();

    public C9962dr(Context context, C10012fa faVar, C10040fx fxVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        this.f25048a = context;
        this.f25049b = faVar;
        this.f25050c = fxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C10012fa mo64479b() {
        return this.f25049b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10040fx mo64480c() {
        return this.f25050c;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
        linkedHashMap.put("Content-Encoding", "gzip");
        linkedHashMap.put("Device-OS", "android");
        linkedHashMap.put("User-Agent", this.f25049b.mo64641e());
        linkedHashMap.put("Package-Name", this.f25049b.mo64642f());
        linkedHashMap.put("User", mo64475a());
        linkedHashMap.put("Instance-Token", this.f25050c.mo64734d());
        return linkedHashMap;
    }
}
