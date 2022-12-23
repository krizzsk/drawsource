package com.tapjoy.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.db */
public final class C11349db {

    /* renamed from: a */
    private final boolean f27105a = false;

    /* renamed from: b */
    private final Float f27106b = null;

    /* renamed from: c */
    private final boolean f27107c = false;

    /* renamed from: d */
    private final C11348da f27108d;

    public C11349db(C11348da daVar) {
        this.f27108d = daVar;
    }

    /* renamed from: a */
    public final JSONObject mo69792a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f27105a);
            if (this.f27105a) {
                jSONObject.put("skipOffset", this.f27106b);
            }
            jSONObject.put("autoPlay", this.f27107c);
            jSONObject.put("position", this.f27108d);
        } catch (JSONException e) {
            C11367dp.m31089a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
