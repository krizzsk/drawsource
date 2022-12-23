package com.bytedance.sdk.openadsdk.p128b.p129a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a.c */
/* compiled from: EventStartListenerWrapper */
public class C3065c implements C3064b {

    /* renamed from: a */
    C3064b f7166a;

    /* renamed from: a */
    public void mo18581a(JSONObject jSONObject) throws JSONException {
        C3064b bVar = this.f7166a;
        if (bVar != null) {
            bVar.mo18581a(jSONObject);
        }
        jSONObject.put("event_ts", System.currentTimeMillis());
    }
}
