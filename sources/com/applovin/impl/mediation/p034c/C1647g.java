package com.applovin.impl.mediation.p034c;

import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p053e.C1889ab;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.g */
public class C1647g extends C1889ab {

    /* renamed from: a */
    private final C1585c f2296a;

    public C1647g(C1585c cVar, C1969m mVar) {
        super("TaskValidateMaxReward", mVar);
        this.f2296a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13596a() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13597a(int i) {
        super.mo13597a(i);
        this.f2296a.mo13411a(C1864c.m4068a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13602a(C1864c cVar) {
        this.f2296a.mo13411a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13598a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f2296a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f2296a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f2296a.mo13445Z());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.f2296a.getFormat().getLabel());
        String D = this.f2296a.mo13406D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f2296a.mo13405C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13603b() {
        return this.f2296a.mo13407E();
    }
}
