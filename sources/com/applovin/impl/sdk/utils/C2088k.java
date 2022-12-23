package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;

/* renamed from: com.applovin.impl.sdk.utils.k */
public class C2088k {

    /* renamed from: a */
    private final StringBuilder f4090a = new StringBuilder();

    /* renamed from: a */
    public C2088k mo14935a() {
        this.f4090a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C2088k mo14936a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            mo14942a(str, bundle.get(str));
        }
        return this;
    }

    /* renamed from: a */
    public C2088k mo14937a(AppLovinAdView appLovinAdView) {
        return mo14942a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).mo14942a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).mo14942a("Visibility", C2095q.m5079b(appLovinAdView.getVisibility()));
    }

    /* renamed from: a */
    public C2088k mo14938a(C1583a aVar) {
        String str = "None";
        C2088k a = mo14942a("Network", aVar.mo13432M()).mo14942a("Format", aVar.getFormat().getLabel()).mo14942a("Ad Unit ID", aVar.getAdUnitId()).mo14942a("Placement", aVar.getPlacement()).mo14942a("Network Placement", aVar.mo13385l()).mo14942a("Serve ID", aVar.mo13365f()).mo14942a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : str).mo14942a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : str);
        if (StringUtils.isValidString(aVar.getDspId())) {
            str = aVar.getDspId();
        }
        return a.mo14942a("DSP ID", str).mo14942a("Server Parameters", aVar.mo13440U());
    }

    /* renamed from: a */
    public C2088k mo14939a(C1839e eVar) {
        boolean z = eVar instanceof C1411a;
        mo14942a("Format", eVar.getAdZone().mo14155b() != null ? eVar.getAdZone().mo14155b().getLabel() : null).mo14942a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).mo14942a("Zone ID", eVar.getAdZone().mo14154a()).mo14942a("Source", eVar.getSource()).mo14942a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            mo14942a("DSP Name", dspName);
        }
        if (z) {
            mo14942a("VAST DSP", ((C1411a) eVar).mo12860l());
        }
        return this;
    }

    /* renamed from: a */
    public C2088k mo14940a(C1969m mVar) {
        return mo14942a("Muted", Boolean.valueOf(mVar.mo14586p().isMuted())).mo14942a("ExoPlayer eligible", Boolean.valueOf(Utils.checkExoPlayerEligibility(mVar)));
    }

    /* renamed from: a */
    public C2088k mo14941a(String str) {
        StringBuilder sb = this.f4090a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C2088k mo14942a(String str, Object obj) {
        return mo14943a(str, obj, "");
    }

    /* renamed from: a */
    public C2088k mo14943a(String str, Object obj, String str2) {
        StringBuilder sb = this.f4090a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* renamed from: b */
    public C2088k mo14944b(C1839e eVar) {
        mo14942a("Target", eVar.mo14232p()).mo14942a("close_style", eVar.mo14237u()).mo14943a("close_delay_graphic", Long.valueOf(eVar.mo14235s()), "s");
        if (eVar instanceof C1834a) {
            C1834a aVar = (C1834a) eVar;
            mo14942a("HTML", aVar.mo12844b().substring(0, Math.min(aVar.mo12844b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            mo14943a("close_delay", Long.valueOf(eVar.mo14233q()), "s").mo14942a("skip_style", eVar.mo14239w()).mo14942a("Streaming", Boolean.valueOf(eVar.mo12849f())).mo14942a("Video Location", eVar.mo12846d()).mo14942a("video_button_properties", eVar.mo14164C());
        }
        return this;
    }

    /* renamed from: b */
    public C2088k mo14945b(String str) {
        this.f4090a.append(str);
        return this;
    }

    public String toString() {
        return this.f4090a.toString();
    }
}
