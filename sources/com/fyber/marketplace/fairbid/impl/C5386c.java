package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.c */
public class C5386c {

    /* renamed from: a */
    public String f14240a;

    /* renamed from: b */
    public final C5229a f14241b;

    /* renamed from: c */
    public final Map<String, String> f14242c;

    public C5386c(JSONObject jSONObject, C5229a aVar, Map<String, String> map) {
        try {
            this.f14240a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (JSONException e) {
            IAlog.m16445a("Failed extracting markup", e, new Object[0]);
        }
        this.f14241b = aVar;
        this.f14242c = map;
    }
}
