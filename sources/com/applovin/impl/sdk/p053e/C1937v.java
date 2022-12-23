package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.v */
public class C1937v extends C1938w {

    /* renamed from: a */
    private final C1839e f3607a;

    public C1937v(C1839e eVar, C1969m mVar) {
        super("TaskReportAppLovinReward", mVar);
        this.f3607a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13596a() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13597a(int i) {
        super.mo13597a(i);
        if (C2102v.m5104a()) {
            mo14370d("Failed to report reward for ad: " + this.f3607a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13598a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f3607a.getAdZone().mo14154a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f3607a.mo14208ae());
        String clCode = this.f3607a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1864c mo13599b() {
        return this.f3607a.mo14198aG();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13600b(JSONObject jSONObject) {
        if (C2102v.m5104a()) {
            mo14365a("Reported reward successfully for ad: " + this.f3607a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13601c() {
        if (C2102v.m5104a()) {
            mo14370d("No reward result was found for ad: " + this.f3607a);
        }
    }
}
