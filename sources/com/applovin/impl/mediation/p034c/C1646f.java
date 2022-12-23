package com.applovin.impl.mediation.p034c;

import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p053e.C1938w;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.f */
public class C1646f extends C1938w {

    /* renamed from: a */
    private final C1585c f2295a;

    public C1646f(C1585c cVar, C1969m mVar) {
        super("TaskReportMaxReward", mVar);
        this.f2295a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13596a() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13597a(int i) {
        super.mo13597a(i);
        if (C2102v.m5104a()) {
            mo14365a("Failed to report reward for mediated ad: " + this.f2295a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13598a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f2295a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f2295a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f2295a.mo13445Z());
        String D = this.f2295a.mo13406D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f2295a.mo13405C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1864c mo13599b() {
        return this.f2295a.mo13409G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13600b(JSONObject jSONObject) {
        mo14365a("Reported reward successfully for mediated ad: " + this.f2295a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13601c() {
        if (C2102v.m5104a()) {
            mo14370d("No reward result was found for mediated ad: " + this.f2295a);
        }
    }
}
