package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a */
    private String f17300a;

    /* renamed from: b */
    private String f17301b;

    /* renamed from: c */
    private JSONObject f17302c;

    /* renamed from: d */
    private JSONObject f17303d;

    /* renamed from: e */
    private JSONObject f17304e;

    /* renamed from: f */
    private JSONObject f17305f;

    /* renamed from: g */
    private String f17306g;

    /* renamed from: h */
    private String f17307h;

    /* renamed from: i */
    private boolean f17308i;

    /* renamed from: j */
    private String f17309j;

    /* renamed from: k */
    private int f17310k;

    /* renamed from: l */
    private int f17311l;

    /* renamed from: m */
    private int f17312m;

    /* renamed from: n */
    private String f17313n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f17300a = networkSettings.getProviderName();
        this.f17309j = networkSettings.getProviderName();
        this.f17301b = networkSettings.getProviderTypeForReflection();
        this.f17303d = networkSettings.getRewardedVideoSettings();
        this.f17304e = networkSettings.getInterstitialSettings();
        this.f17305f = networkSettings.getBannerSettings();
        this.f17302c = networkSettings.getApplicationSettings();
        this.f17310k = networkSettings.getRewardedVideoPriority();
        this.f17311l = networkSettings.getInterstitialPriority();
        this.f17312m = networkSettings.getBannerPriority();
        this.f17313n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f17300a = str;
        this.f17309j = str;
        this.f17301b = str;
        this.f17313n = str;
        this.f17303d = new JSONObject();
        this.f17304e = new JSONObject();
        this.f17305f = new JSONObject();
        this.f17302c = new JSONObject();
        this.f17310k = -1;
        this.f17311l = -1;
        this.f17312m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f17300a = str;
        this.f17309j = str;
        this.f17301b = str2;
        this.f17313n = str3;
        this.f17303d = jSONObject2;
        this.f17304e = jSONObject3;
        this.f17305f = jSONObject4;
        this.f17302c = jSONObject;
        this.f17310k = -1;
        this.f17311l = -1;
        this.f17312m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f17307h;
    }

    public JSONObject getApplicationSettings() {
        return this.f17302c;
    }

    public int getBannerPriority() {
        return this.f17312m;
    }

    public JSONObject getBannerSettings() {
        return this.f17305f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f17302c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f17302c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f17303d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f17304e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f17305f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f17302c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f17311l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f17304e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f17313n;
    }

    public String getProviderInstanceName() {
        return this.f17309j;
    }

    public String getProviderName() {
        return this.f17300a;
    }

    public String getProviderTypeForReflection() {
        return this.f17301b;
    }

    public int getRewardedVideoPriority() {
        return this.f17310k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f17303d;
    }

    public String getSubProviderId() {
        return this.f17306g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f17308i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f17307h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f17302c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f17312m = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f17305f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f17305f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f17311l = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f17304e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f17304e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f17308i = z;
    }

    public void setRewardedVideoPriority(int i) {
        this.f17310k = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f17303d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f17303d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f17306g = str;
    }
}
