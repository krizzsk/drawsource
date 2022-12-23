package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.m0 */
public final class C5297m0 {

    /* renamed from: com.fyber.inneractive.sdk.util.m0$a */
    public interface C5298a {
        /* renamed from: a */
        JSONObject mo24189a();
    }

    /* renamed from: a */
    public static void m16518a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof C5298a) {
                    jSONObject.putOpt(str, ((C5298a) obj).mo24189a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
