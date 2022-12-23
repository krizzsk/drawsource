package com.applovin.impl.mediation.p031a;

import com.applovin.impl.mediation.C1740g;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.d */
public class C1586d extends C1587e {

    /* renamed from: c */
    private final AtomicBoolean f2092c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f2093d = new AtomicBoolean();

    private C1586d(C1586d dVar, C1740g gVar) {
        super(dVar.mo13439T(), dVar.mo13429J(), dVar.mo13428I(), gVar, dVar.f2095b);
    }

    public C1586d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        super(map, jSONObject, jSONObject2, (C1740g) null, mVar);
    }

    /* renamed from: a */
    public C1583a mo13355a(C1740g gVar) {
        return new C1586d(this, gVar);
    }

    /* renamed from: a */
    public void mo13417a(MaxNativeAdView maxNativeAdView) {
        this.f2085a.mo13835a(maxNativeAdView);
    }

    public MaxNativeAd getNativeAd() {
        return this.f2085a.mo13838b();
    }

    /* renamed from: u */
    public MaxNativeAdView mo13397u() {
        return this.f2085a.mo13839c();
    }

    /* renamed from: v */
    public String mo13418v() {
        return BundleUtils.getString("template", "", mo13440U());
    }

    /* renamed from: w */
    public boolean mo13419w() {
        return this.f2085a == null;
    }

    /* renamed from: x */
    public AtomicBoolean mo13420x() {
        return this.f2092c;
    }

    /* renamed from: y */
    public AtomicBoolean mo13421y() {
        return this.f2093d;
    }
}
