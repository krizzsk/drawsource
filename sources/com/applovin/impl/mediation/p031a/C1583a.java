package com.applovin.impl.mediation.p031a;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.mediation.C1740g;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a */
public abstract class C1583a extends C1588f implements MaxAd {

    /* renamed from: a */
    protected C1740g f2085a;

    /* renamed from: c */
    private final AtomicBoolean f2086c = new AtomicBoolean();

    /* renamed from: d */
    private MaxAdWaterfallInfo f2087d;

    /* renamed from: e */
    private String f2088e;

    protected C1583a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1740g gVar, C1969m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
        this.f2085a = gVar;
    }

    /* renamed from: a */
    public static C1583a m3000a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, (String) null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new C1584b(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new C1586d(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new C1585c(map, jSONObject, jSONObject2, mVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* renamed from: u */
    private long mo13397u() {
        return mo13455b("load_started_time_ms", 0);
    }

    /* renamed from: a */
    public abstract C1583a mo13355a(C1740g gVar);

    /* renamed from: a */
    public String mo13356a() {
        return this.f2088e;
    }

    /* renamed from: a */
    public void mo13357a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !mo13459b(CampaignEx.JSON_KEY_CREATIVE_ID)) {
                mo13463c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
            }
            if (bundle.containsKey("ad_width") && !mo13459b("ad_width") && bundle.containsKey("ad_height") && !mo13459b("ad_height")) {
                int i = BundleUtils.getInt("ad_width", bundle);
                int i2 = BundleUtils.getInt("ad_height", bundle);
                mo13461c("ad_width", i);
                mo13461c("ad_height", i2);
            }
        }
    }

    /* renamed from: a */
    public void mo13358a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f2087d = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void mo13359a(String str) {
        this.f2088e = str;
    }

    /* renamed from: a */
    public void mo13360a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject b = mo13361b();
            JsonUtils.putAll(b, jSONObject);
            mo13453a(Utils.KEY_AD_VALUES, (Object) b);
        }
    }

    /* renamed from: b */
    public JSONObject mo13361b() {
        return mo13452a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    /* renamed from: c */
    public JSONObject mo13362c() {
        return mo13452a("revenue_parameters", new JSONObject());
    }

    /* renamed from: d */
    public String mo13363d() {
        return JsonUtils.getString(mo13362c(), "revenue_event", "");
    }

    /* renamed from: e */
    public boolean mo13364e() {
        C1740g gVar = this.f2085a;
        return gVar != null && gVar.mo13842f() && this.f2085a.mo13843g();
    }

    /* renamed from: f */
    public String mo13365f() {
        return mo13450a("event_id", "");
    }

    /* renamed from: g */
    public C1740g mo13366g() {
        return this.f2085a;
    }

    public String getAdReviewCreativeId() {
        return this.f2095b.mo14510B().mo14358a(mo13365f());
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        JSONObject b = mo13361b();
        if (b.has(str)) {
            return JsonUtils.getString(b, str, str2);
        }
        Bundle U = mo13440U();
        return U.containsKey(str) ? U.getString(str) : mo13457b(str, str2);
    }

    public String getCreativeId() {
        return mo13457b(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    public String getDspId() {
        return mo13457b("dsp_id", (String) null);
    }

    public String getDspName() {
        return mo13457b("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(mo13457b(FirebaseAnalytics.Param.AD_FORMAT, mo13450a(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        return null;
    }

    public String getNetworkName() {
        return mo13457b("network_name", "");
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(mo13385l());
    }

    public double getRevenue() {
        return JsonUtils.getDouble(mo13452a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_REVENUE, -1.0d);
    }

    public String getRevenuePrecision() {
        return JsonUtils.getString(mo13452a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    public AppLovinSdkUtils.Size getSize() {
        int b = mo13454b("ad_width", -3);
        int b2 = mo13454b("ad_height", -3);
        return (b == -3 || b2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(b, b2);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.f2087d;
    }

    /* renamed from: h */
    public Bundle mo13381h() {
        JSONObject jSONObject;
        if (mo13459b("credentials")) {
            jSONObject = mo13452a("credentials", new JSONObject());
        } else {
            jSONObject = mo13452a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, mo13385l());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    /* renamed from: i */
    public String mo13382i() {
        return mo13457b("bid_response", (String) null);
    }

    /* renamed from: j */
    public long mo13383j() {
        return mo13455b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1, mo13440U()));
    }

    /* renamed from: k */
    public boolean mo13384k() {
        return mo13456b("is_js_tag_ad", (Boolean) false).booleanValue();
    }

    /* renamed from: l */
    public String mo13385l() {
        return mo13457b("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: m */
    public String mo13386m() {
        return mo13450a("waterfall_name", "");
    }

    /* renamed from: n */
    public String mo13387n() {
        return mo13450a("waterfall_test_name", "");
    }

    /* renamed from: o */
    public long mo13388o() {
        if (mo13397u() > 0) {
            return mo13390q() - mo13397u();
        }
        return -1;
    }

    /* renamed from: p */
    public void mo13389p() {
        mo13462c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: q */
    public long mo13390q() {
        return mo13455b("load_completed_time_ms", 0);
    }

    /* renamed from: r */
    public void mo13391r() {
        mo13462c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: s */
    public AtomicBoolean mo13392s() {
        return this.f2086c;
    }

    /* renamed from: t */
    public void mo13393t() {
        this.f2085a = null;
        this.f2087d = null;
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + mo13385l() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
