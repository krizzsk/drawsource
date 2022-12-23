package com.mbridge.msdk.foundation.same.net.p312g;

import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.c */
/* compiled from: CommonMBListener */
public abstract class C8549c extends C8536f<JSONObject> {
    /* renamed from: a */
    public abstract void mo16304a(String str);

    /* renamed from: a */
    public abstract void mo16305a(JSONObject jSONObject);

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        if (kVar != null) {
            int optInt = ((JSONObject) kVar.f21015a).optInt("status");
            if (optInt == 1 || optInt == 200) {
                mo16305a(((JSONObject) kVar.f21015a).optJSONObject("data"));
            } else {
                mo16304a(((JSONObject) kVar.f21015a).optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo16304a(C8537a.m24452a(aVar));
    }
}
