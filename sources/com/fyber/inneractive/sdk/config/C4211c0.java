package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.C5297m0;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.c0 */
public class C4211c0 implements C5297m0.C5298a {

    /* renamed from: a */
    public Integer f10390a = 50;

    /* renamed from: b */
    public Integer f10391b = 50;

    /* renamed from: c */
    public Set<Vendor> f10392c = null;

    /* renamed from: a */
    public JSONObject mo24189a() {
        JSONObject jSONObject = new JSONObject();
        C5297m0.m16518a(jSONObject, "pausePct", this.f10390a);
        C5297m0.m16518a(jSONObject, "playPct", this.f10391b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f10392c;
        if (set != null) {
            for (Vendor next : set) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C5297m0.m16518a(jSONObject, Verification.VENDOR, jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Integer mo24203b() {
        return this.f10391b;
    }

    /* renamed from: c */
    public Set<Vendor> mo24204c() {
        return this.f10392c;
    }
}
