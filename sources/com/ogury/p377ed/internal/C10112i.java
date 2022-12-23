package com.ogury.p377ed.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11130Ad;
import java.util.ArrayList;
import java.util.List;
import p401io.presage.common.AdConfig;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.i */
public final class C10112i {

    /* renamed from: a */
    private C10227lj<C10182ke> f25394a;

    /* renamed from: b */
    private int f25395b;

    /* renamed from: c */
    private boolean f25396c = true;

    /* renamed from: d */
    private boolean f25397d = true;

    /* renamed from: e */
    private boolean f25398e = true;

    /* renamed from: f */
    private List<String> f25399f = new ArrayList();

    /* renamed from: g */
    private int f25400g;

    /* renamed from: h */
    private boolean f25401h;

    /* renamed from: a */
    public final void mo64891a(C10227lj<C10182ke> ljVar) {
        this.f25394a = ljVar;
    }

    /* renamed from: a */
    public final void mo64889a(int i) {
        this.f25395b = i;
    }

    /* renamed from: a */
    public final void mo64890a(C10083hf hfVar, C9989ej ejVar, AdConfig adConfig, C10076h hVar, C10228lk<? super RewardItem, C10182ke> lkVar, C10177k kVar) {
        C10263mq.m29882b(hfVar, "event");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        if (C10263mq.m29881a((Object) hfVar.mo64820c(), (Object) "adDisplayed")) {
            m29447a(ejVar, adConfig, hVar);
        } else if (C10263mq.m29881a((Object) hfVar.mo64820c(), (Object) "adImpression")) {
            m29448a(ejVar, adConfig, hfVar.mo64819b(), kVar);
        } else if (C10263mq.m29881a((Object) hfVar.mo64820c(), (Object) "adClosed")) {
            m29456c(ejVar, adConfig, hVar);
        } else if (C10263mq.m29881a((Object) hfVar.mo64820c(), (Object) "closeWhithoutShowNextAd")) {
            m29457d(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C10086hi) {
            m29451a((C10086hi) hfVar, ejVar, adConfig, lkVar);
        } else if (hfVar instanceof C10077ha) {
            m29455b(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C10082he) {
            m29450a((C10082he) hfVar, ejVar, adConfig, hVar);
        }
    }

    /* renamed from: a */
    private final void m29447a(C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        if (this.f25396c) {
            this.f25396c = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo64569b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad successfully shown!");
            OguryIntegrationLogger.m28105d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo64569b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdDisplayed() callback");
            OguryIntegrationLogger.m28105d(sb2.toString());
            String b = ejVar.mo64569b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m29449a(hVar, b, str);
            if (hVar != null) {
                hVar.mo64634f();
            }
        }
    }

    /* renamed from: a */
    private final void m29448a(C9989ej ejVar, AdConfig adConfig, String str, C10177k kVar) {
        if (!this.f25399f.contains(str)) {
            this.f25399f.add(str);
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo64569b());
            sb.append("][show][");
            String str2 = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Impression");
            OguryIntegrationLogger.m28105d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo64569b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdImpression() callback");
            OguryIntegrationLogger.m28105d(sb2.toString());
            String b = ejVar.mo64569b();
            if (adConfig != null) {
                str2 = adConfig.getAdUnitId();
            }
            m29452a(kVar, b, str2);
            if (kVar != null) {
                kVar.mo64492a();
            }
        }
    }

    /* renamed from: b */
    private final void m29455b(C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        if (this.f25397d) {
            this.f25397d = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo64569b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad clicked");
            OguryIntegrationLogger.m28105d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo64569b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClicked() callback");
            OguryIntegrationLogger.m28105d(sb2.toString());
            String b = ejVar.mo64569b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m29449a(hVar, b, str);
            if (hVar != null) {
                hVar.mo64368a();
            }
        }
    }

    /* renamed from: c */
    private final void m29456c(C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        this.f25400g++;
        m29458e(ejVar, adConfig, hVar);
    }

    /* renamed from: d */
    private final void m29457d(C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        this.f25401h = true;
        m29458e(ejVar, adConfig, hVar);
    }

    /* renamed from: e */
    private final void m29458e(C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        if (this.f25398e && m29454a()) {
            this.f25398e = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo64569b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad closed");
            OguryIntegrationLogger.m28105d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo64569b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClosed() callback");
            OguryIntegrationLogger.m28105d(sb2.toString());
            String b = ejVar.mo64569b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m29449a(hVar, b, str);
            if (hVar != null) {
                hVar.mo64635g();
            }
            C10227lj<C10182ke> ljVar = this.f25394a;
            if (ljVar != null) {
                ljVar.mo64355a();
            }
        }
    }

    /* renamed from: a */
    private static void m29451a(C10086hi hiVar, C9989ej ejVar, AdConfig adConfig, C10228lk<? super RewardItem, C10182ke> lkVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo64569b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] Reward: ");
        sb.append(hiVar.mo64821a().getValue());
        sb.append(' ');
        sb.append(hiVar.mo64821a().getName());
        OguryIntegrationLogger.m28105d(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo64569b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdRewarded() callback");
        OguryIntegrationLogger.m28105d(sb2.toString());
        String b = ejVar.mo64569b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m29453a(lkVar, b, str);
        if (lkVar != null) {
            lkVar.mo64242a(hiVar.mo64821a());
        }
    }

    /* renamed from: a */
    private static void m29450a(C10082he heVar, C9989ej ejVar, AdConfig adConfig, C10076h hVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo64569b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]* Failed to show (error code: ");
        sb.append(heVar.mo64818a());
        OguryIntegrationLogger.m28106e(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo64569b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdError() callback");
        OguryIntegrationLogger.m28105d(sb2.toString());
        String b = ejVar.mo64569b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m29449a(hVar, b, str);
        if (hVar != null) {
            hVar.mo64629a(heVar.mo64818a());
        }
    }

    /* renamed from: a */
    private final boolean m29454a() {
        return this.f25400g == this.f25395b || this.f25401h;
    }

    /* renamed from: a */
    private static void m29449a(C10076h hVar, String str, String str2) {
        if (hVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }

    /* renamed from: a */
    private static void m29452a(C10177k kVar, String str, String str2) {
        if (kVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][" + str + "][show][" + str2 + "] No impression listener registered");
        }
    }

    /* renamed from: a */
    private static void m29453a(C10228lk<? super RewardItem, C10182ke> lkVar, String str, String str2) {
        if (lkVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }
}
