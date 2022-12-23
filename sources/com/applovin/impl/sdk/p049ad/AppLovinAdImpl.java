package com.applovin.impl.sdk.p049ad;

import android.os.Bundle;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.AppLovinAdImpl */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* renamed from: a */
    private C1838d f2943a;

    /* renamed from: b */
    private Bundle f2944b = new Bundle();

    /* renamed from: c */
    private C1845f f2945c;
    protected final C1835b source;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, C1969m mVar) {
        super(jSONObject, jSONObject2, mVar);
        this.source = bVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd b;
        if ((obj instanceof C1845f) && (b = ((C1845f) obj).mo14245b()) != null) {
            obj = b;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject(Utils.KEY_AD_VALUES, new JSONObject()), str, str2);
    }

    public C1838d getAdZone() {
        C1838d dVar = this.f2943a;
        if (dVar != null) {
            if (dVar.mo14156c() != null && this.f2943a.mo14157d() != null) {
                return this.f2943a;
            }
            if (getSize() == null && getType() == null) {
                return this.f2943a;
            }
        }
        C1838d a = C1838d.m3902a(getSize(), getType(), getStringFromFullResponse("zone_id", (String) null));
        this.f2943a = a;
        return a;
    }

    public C1845f getDummyAd() {
        return this.f2945c;
    }

    public Bundle getMAXAdValues() {
        return this.f2944b;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", (String) null));
    }

    public C1835b getSource() {
        return this.source;
    }

    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", (String) null));
    }

    public String getZoneId() {
        if (getAdZone().mo14158e()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", (String) null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", false);
    }

    public boolean hasVideoUrl() {
        if (!C2102v.m5104a()) {
            return false;
        }
        this.sdk.mo14509A().mo15016e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", false) : hasVideoUrl();
    }

    public void setDummyAd(C1845f fVar) {
        this.f2945c = fVar;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f2944b);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", false);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", source=" + getSource() + ", zoneId=\"" + getZoneId() + "\"" + '}';
    }
}
