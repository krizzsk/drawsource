package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.mediation.p031a.C1591h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a */
    private String f2029a;

    /* renamed from: b */
    private Map<String, Object> f2030b;

    /* renamed from: c */
    private Bundle f2031c;

    /* renamed from: d */
    private Bundle f2032d;

    /* renamed from: e */
    private Boolean f2033e;

    /* renamed from: f */
    private Boolean f2034f;

    /* renamed from: g */
    private Boolean f2035g;

    /* renamed from: h */
    private String f2036h;

    /* renamed from: i */
    private boolean f2037i;

    /* renamed from: j */
    private String f2038j;

    /* renamed from: k */
    private String f2039k;

    /* renamed from: l */
    private long f2040l;

    /* renamed from: m */
    private MaxAdFormat f2041m;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2966a(C1583a aVar) {
        MaxAdapterParametersImpl a = m2967a((C1588f) aVar);
        a.f2038j = aVar.mo13385l();
        a.f2039k = aVar.mo13382i();
        a.f2040l = aVar.mo13383j();
        return a;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2967a(C1588f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f2029a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f2033e = fVar.mo13434O();
        maxAdapterParametersImpl.f2034f = fVar.mo13435P();
        maxAdapterParametersImpl.f2035g = fVar.mo13436Q();
        maxAdapterParametersImpl.f2036h = fVar.mo13437R();
        maxAdapterParametersImpl.f2030b = fVar.mo13439T();
        maxAdapterParametersImpl.f2031c = fVar.mo13440U();
        maxAdapterParametersImpl.f2032d = fVar.mo13441V();
        maxAdapterParametersImpl.f2037i = fVar.mo13433N();
        return maxAdapterParametersImpl;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m2968a(C1591h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = m2967a((C1588f) hVar);
        a.f2041m = maxAdFormat;
        return a;
    }

    public MaxAdFormat getAdFormat() {
        return this.f2041m;
    }

    public String getAdUnitId() {
        return this.f2029a;
    }

    public long getBidExpirationMillis() {
        return this.f2040l;
    }

    public String getBidResponse() {
        return this.f2039k;
    }

    public String getConsentString() {
        return this.f2036h;
    }

    public Bundle getCustomParameters() {
        return this.f2032d;
    }

    public Map<String, Object> getLocalExtraParameters() {
        return this.f2030b;
    }

    public Bundle getServerParameters() {
        return this.f2031c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.f2038j;
    }

    public Boolean hasUserConsent() {
        return this.f2033e;
    }

    public Boolean isAgeRestrictedUser() {
        return this.f2034f;
    }

    public Boolean isDoNotSell() {
        return this.f2035g;
    }

    public boolean isTesting() {
        return this.f2037i;
    }
}
