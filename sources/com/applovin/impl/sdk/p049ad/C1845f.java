package com.applovin.impl.sdk.p049ad;

import com.applovin.impl.sdk.C1969m;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.f */
public final class C1845f extends AppLovinAdImpl {

    /* renamed from: a */
    private AppLovinAd f3000a;

    /* renamed from: b */
    private final C1838d f3001b;

    public C1845f(C1838d dVar, C1969m mVar) {
        super(new JSONObject(), new JSONObject(), C1835b.UNKNOWN, mVar);
        this.f3001b = dVar;
    }

    /* renamed from: c */
    private AppLovinAd m4020c() {
        return (AppLovinAd) this.sdk.mo14533Z().mo14278c(this.f3001b);
    }

    /* renamed from: d */
    private String m4021d() {
        C1838d adZone = getAdZone();
        if (adZone == null || adZone.mo14158e()) {
            return null;
        }
        return adZone.mo14154a();
    }

    /* renamed from: a */
    public AppLovinAd mo14243a() {
        return this.f3000a;
    }

    /* renamed from: a */
    public void mo14244a(AppLovinAd appLovinAd) {
        this.f3000a = appLovinAd;
    }

    /* renamed from: b */
    public AppLovinAd mo14245b() {
        AppLovinAd appLovinAd = this.f3000a;
        return appLovinAd != null ? appLovinAd : m4020c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b = mo14245b();
        return b != null ? b.equals(obj) : super.equals(obj);
    }

    public long getAdIdNumber() {
        AppLovinAd b = mo14245b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0;
    }

    public C1838d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo14245b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f3001b;
    }

    public long getCreatedAtMillis() {
        AppLovinAd b = mo14245b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getCreatedAtMillis();
        }
        return 0;
    }

    public String getOpenMeasurementContentUrl() {
        return null;
    }

    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    public JSONObject getOriginalFullResponse() {
        AppLovinAd b = mo14245b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getOriginalFullResponse();
        }
        return null;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().mo14156c();
    }

    public C1835b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo14245b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : C1835b.UNKNOWN;
    }

    public AppLovinAdType getType() {
        return getAdZone().mo14157d();
    }

    public String getZoneId() {
        if (this.f3001b.mo14158e()) {
            return null;
        }
        return this.f3001b.mo14154a();
    }

    public int hashCode() {
        AppLovinAd b = mo14245b();
        return b != null ? b.hashCode() : super.hashCode();
    }

    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public boolean isVideoAd() {
        AppLovinAd b = mo14245b();
        return b != null && b.isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + m4021d() + '\'' + '}';
    }
}
