package com.ogury.p377ed.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11130Ad;
import p401io.presage.common.AdConfig;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.bm */
public final class C9864bm {

    /* renamed from: a */
    private final Context f24853a;

    /* renamed from: b */
    private final AdConfig f24854b;

    /* renamed from: c */
    private final C9989ej f24855c;

    /* renamed from: d */
    private final C10244m f24856d;

    /* renamed from: e */
    private C10204l f24857e;

    /* renamed from: f */
    private C10076h f24858f;

    /* renamed from: g */
    private C10177k f24859g;

    /* renamed from: h */
    private String f24860h;

    /* renamed from: i */
    private String f24861i;

    /* renamed from: j */
    private C10228lk<? super RewardItem, C10182ke> f24862j;

    private C9864bm(Context context, AdConfig adConfig, C9989ej ejVar, C10244m mVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(mVar, "adsSourceFactory");
        this.f24853a = context;
        this.f24854b = adConfig;
        this.f24855c = ejVar;
        this.f24856d = mVar;
        this.f24860h = "";
    }

    public /* synthetic */ C9864bm(Context context, AdConfig adConfig, C9989ej ejVar) {
        this(context, adConfig, ejVar, new C10244m(context, adConfig, ejVar));
    }

    /* renamed from: a */
    public final void mo64381a(C10228lk<? super RewardItem, C10182ke> lkVar) {
        this.f24862j = lkVar;
    }

    /* renamed from: a */
    public final void mo64378a() {
        C10204l lVar;
        C10204l lVar2 = this.f24857e;
        boolean z = true;
        if (lVar2 == null || !lVar2.mo65099c()) {
            z = false;
        }
        if (z && (lVar = this.f24857e) != null) {
            lVar.mo65101e();
        }
        C10204l c = m28473c();
        this.f24857e = c;
        String str = this.f24861i;
        if (str != null) {
            if (c != null) {
                c.mo65098b(str);
            }
        } else if (c != null) {
            c.mo65100d();
        }
    }

    /* renamed from: c */
    private final C10204l m28473c() {
        C10204l a = this.f24856d.mo65124a();
        a.mo65091a(this.f24858f);
        a.mo65093a(this.f24862j);
        a.mo65092a(this.f24859g);
        a.mo65095a(this.f24860h);
        return a;
    }

    /* renamed from: a */
    public final void mo64379a(C10076h hVar) {
        OguryIntegrationLogger.m28105d("[Ads][" + this.f24855c.mo64569b() + "] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][" + this.f24855c.mo64569b() + "] Ad listener is null");
        }
        this.f24858f = hVar;
        C10204l lVar = this.f24857e;
        if (lVar != null) {
            lVar.mo65091a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo64380a(C10177k kVar) {
        this.f24859g = kVar;
        C10204l lVar = this.f24857e;
        if (lVar != null) {
            lVar.mo65092a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo64382a(C10330t tVar) {
        C10263mq.m29882b(tVar, "showAction");
        if (this.f24857e == null) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f24855c.mo64569b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m28105d("[Ads][" + this.f24855c.mo64569b() + "][show] Triggering onAdError() callback");
            if (this.f24858f == null) {
                OguryIntegrationLogger.m28105d("[Ads][" + this.f24855c.mo64569b() + "][show] No ad listener registered");
            }
            C10076h hVar = this.f24858f;
            if (hVar != null) {
                hVar.mo64633e();
            }
        }
        C10204l lVar = this.f24857e;
        if (lVar != null) {
            lVar.mo65094a(tVar);
        }
    }

    /* renamed from: b */
    public final boolean mo64385b() {
        C10204l lVar = this.f24857e;
        if (lVar == null) {
            return false;
        }
        return lVar.mo65096a();
    }

    /* renamed from: a */
    public final void mo64383a(String str) {
        C10263mq.m29882b(str, DataKeys.USER_ID);
        this.f24860h = str;
    }

    /* renamed from: b */
    public final void mo64384b(String str) {
        C10263mq.m29882b(str, "campaignId");
        C10035ft.m29150a(this.f24854b, str);
    }

    /* renamed from: c */
    public final void mo64386c(String str) {
        C10263mq.m29882b(str, "creativeId");
        C10035ft.m29151b(this.f24854b, str);
    }

    /* renamed from: d */
    public final void mo64387d(String str) {
        C10263mq.m29882b(str, "adMarkup");
        this.f24861i = str;
    }
}
