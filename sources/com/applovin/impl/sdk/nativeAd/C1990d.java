package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.d */
public class C1990d extends C1887a {

    /* renamed from: a */
    private final JSONObject f3774a;

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f3775c;

    public C1990d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1969m mVar) {
        super("TaskProcessNativeAdResponse", mVar);
        this.f3774a = jSONObject;
        this.f3775c = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f3774a, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C2102v.m5104a()) {
                mo14365a("Processing ad...");
            }
            this.f3496b.mo14526S().mo14428a((C1887a) new C1991e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f3774a, this.f3775c, this.f3496b));
            return;
        }
        if (C2102v.m5104a()) {
            mo14368c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f3774a, this.f3496b);
        this.f3775c.onNativeAdLoadFailed(204);
    }
}
