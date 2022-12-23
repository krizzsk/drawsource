package com.ogury.sdk.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.g */
/* compiled from: MonitoringInfoJsonSerializer.kt */
public final class C10355g {

    /* renamed from: a */
    private C10347a f25690a;

    public C10355g(C10347a aVar) {
        C10363m.m30060b(aVar, "jsonObjectCreator");
        this.f25690a = aVar;
    }

    /* renamed from: a */
    public final String mo65207a(C10348b bVar) throws JSONException {
        C10363m.m30060b(bVar, "monitoringInfo");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : bVar.mo65195b()) {
            jSONObject.put((String) next.getKey(), (String) next.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        C10363m.m30058a((Object) jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
