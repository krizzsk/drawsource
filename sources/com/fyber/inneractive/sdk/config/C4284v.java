package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.C5297m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.v */
public class C4284v implements C5297m0.C5298a {

    /* renamed from: a */
    public Set<Track> f10540a = null;

    /* renamed from: a */
    public JSONObject mo24189a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f10540a;
        if (set != null) {
            for (Track put : set) {
                jSONArray.put(put);
            }
        }
        C5297m0.m16518a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
