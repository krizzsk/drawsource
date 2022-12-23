package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1836c;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C2102v logger;
    private final C1969m sdk;

    public AppLovinNativeAdService(C1969m mVar) {
        this.sdk = mVar;
        this.logger = mVar.mo14509A();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        StringBuilder sb;
        String str2;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            if (C2102v.m5104a()) {
                C2102v.m5110i(TAG, "Invalid ad token specified");
            }
            C2053j.m4981a(appLovinNativeAdLoadListener, -8);
            return;
        }
        C1836c cVar = new C1836c(trim, this.sdk);
        if (cVar.mo14147b() == C1836c.C1837a.REGULAR) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                vVar.mo15012b(TAG, "Loading next ad for token: " + cVar);
            }
            this.sdk.mo14526S().mo14429a((C1887a) new C1988b(cVar, appLovinNativeAdLoadListener, this.sdk), C1918o.C1920a.MAIN);
            return;
        }
        if (cVar.mo14147b() == C1836c.C1837a.AD_RESPONSE_JSON) {
            JSONObject d = cVar.mo14149d();
            if (d != null) {
                C2050h.m4966f(d, this.sdk);
                C2050h.m4962d(d, this.sdk);
                C2050h.m4961c(d, this.sdk);
                C2050h.m4964e(d, this.sdk);
                if (JsonUtils.getJSONArray(d, CampaignUnit.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (C2102v.m5104a()) {
                        C2102v vVar2 = this.logger;
                        vVar2.mo15012b(TAG, "Rendering ad for token: " + cVar);
                    }
                    this.sdk.mo14526S().mo14429a((C1887a) new C1990d(d, appLovinNativeAdLoadListener, this.sdk), C1918o.C1920a.MAIN);
                    return;
                }
                if (C2102v.m5104a()) {
                    C2102v vVar3 = this.logger;
                    vVar3.mo15016e(TAG, "No ad returned from the server for token: " + cVar);
                }
                C2053j.m4981a(appLovinNativeAdLoadListener, 204);
                return;
            }
            if (C2102v.m5104a()) {
                sb = new StringBuilder();
                str2 = "Unable to retrieve ad response JSON from token: ";
            }
            C2053j.m4981a(appLovinNativeAdLoadListener, -8);
        }
        if (C2102v.m5104a()) {
            sb = new StringBuilder();
            str2 = "Invalid ad token specified: ";
        }
        C2053j.m4981a(appLovinNativeAdLoadListener, -8);
        sb.append(str2);
        sb.append(cVar);
        C2102v.m5110i(TAG, sb.toString());
        C2053j.m4981a(appLovinNativeAdLoadListener, -8);
    }
}
