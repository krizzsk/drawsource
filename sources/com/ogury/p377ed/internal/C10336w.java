package com.ogury.p377ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.List;
import p401io.presage.common.AdConfig;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.w */
public final class C10336w {

    /* renamed from: a */
    private final Context f25666a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FrameLayout f25667b;

    /* renamed from: c */
    private final C10335v f25668c;

    /* renamed from: d */
    private final C10340x f25669d;

    /* renamed from: e */
    private C10341y f25670e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10331u f25671f;

    /* renamed from: g */
    private C10204l f25672g;

    /* renamed from: h */
    private C10177k f25673h;

    /* renamed from: i */
    private C10204l f25674i;

    /* renamed from: j */
    private C10331u f25675j;

    /* renamed from: k */
    private C9905cn f25676k;

    private C10336w(Context context, FrameLayout frameLayout, C10335v vVar, C10340x xVar, C10341y yVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(frameLayout, TtmlNode.RUBY_CONTAINER);
        C10263mq.m29882b(vVar, "adControllerFactory");
        C10263mq.m29882b(xVar, "adsSourceFactory");
        C10263mq.m29882b(yVar, "bannerCallback");
        this.f25666a = context;
        this.f25667b = frameLayout;
        this.f25668c = vVar;
        this.f25669d = xVar;
        this.f25670e = yVar;
        yVar.mo65180a((C10227lj<C10182ke>) new C10227lj<C10182ke>(this) {
            /* renamed from: h */
            private void m30017h() {
                ((C10336w) this.f25588a).m30010e();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo64355a() {
                m30017h();
                return C10182ke.f25542a;
            }
        });
    }

    public /* synthetic */ C10336w(Context context, FrameLayout frameLayout) {
        this(context, frameLayout, new C10335v(InterstitialActivity.f29814a), new C10340x(context), new C10341y());
    }

    /* renamed from: a */
    public final void mo65173a(C10076h hVar) {
        OguryIntegrationLogger.m28105d("[Ads][Banner View] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][Banner View] Ad listener is null");
        }
        this.f25670e.mo65179a(hVar);
        this.f25670e.mo65180a((C10227lj<C10182ke>) new C10338a(this));
    }

    /* renamed from: com.ogury.ed.internal.w$a */
    /* synthetic */ class C10338a extends C10262mp implements C10227lj<C10182ke> {
        C10338a(Object obj) {
            super(0, obj, C10336w.class, "onAdLoaded", "onAdLoaded()V");
        }

        /* renamed from: h */
        private void m30019h() {
            ((C10336w) this.f25588a).m30010e();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m30019h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: a */
    public final void mo65174a(C10177k kVar) {
        this.f25673h = kVar;
    }

    /* renamed from: a */
    public final void mo65175a(AdConfig adConfig, C9989ej ejVar, C9905cn cnVar) {
        C10263mq.m29882b(adConfig, "adConfig");
        C10263mq.m29882b(cnVar, "adSize");
        if (ejVar == null) {
            OguryIntegrationLogger.m28106e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid banner ad size)");
            throw new IllegalArgumentException("Ad size must be set before loading an ad".toString());
        } else if (ejVar.mo64572e()) {
            boolean z = false;
            if (adConfig.getAdUnitId().length() > 0) {
                this.f25676k = cnVar;
                C10204l lVar = this.f25672g;
                if (lVar != null && lVar.mo65099c()) {
                    z = true;
                }
                if (z) {
                    C10331u uVar = this.f25671f;
                    if (uVar != null) {
                        uVar.mo65170b();
                    }
                    C10204l lVar2 = this.f25672g;
                    if (lVar2 != null) {
                        lVar2.mo65101e();
                    }
                } else {
                    this.f25674i = this.f25672g;
                    this.f25675j = this.f25671f;
                }
                C10335v vVar = this.f25668c;
                Context applicationContext = this.f25666a.getApplicationContext();
                if (applicationContext != null) {
                    this.f25671f = vVar.mo65171a((Application) applicationContext);
                    C10204l a = this.f25669d.mo65178a(adConfig, ejVar);
                    this.f25672g = a;
                    if (a != null) {
                        a.mo65091a((C10076h) this.f25670e);
                    }
                    C10204l lVar3 = this.f25672g;
                    if (lVar3 != null) {
                        lVar3.mo65092a(this.f25673h);
                    }
                    C10204l lVar4 = this.f25672g;
                    if (lVar4 != null) {
                        lVar4.mo65100d();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            OguryIntegrationLogger.m28106e("[Ads][" + ejVar.mo64569b() + "][load] Failed to load (invalid ad unit ID: \"" + adConfig.getAdUnitId() + "\")");
            throw new IllegalArgumentException("Ad unit must be set before loading an ad".toString());
        } else {
            OguryIntegrationLogger.m28106e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid ad type: " + ejVar.mo64569b() + ')');
            throw new IllegalArgumentException(("AdType " + ejVar + " is not a banner type").toString());
        }
    }

    /* renamed from: d */
    private final void m30009d() {
        if (this.f25672g == null) {
            this.f25670e.mo64633e();
        }
        C10204l lVar = this.f25672g;
        if (lVar != null) {
            lVar.mo65094a((C10330t) new C10339b(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.w$b */
    public static final class C10339b implements C10330t {

        /* renamed from: a */
        final /* synthetic */ C10336w f25677a;

        C10339b(C10336w wVar) {
            this.f25677a = wVar;
        }

        /* renamed from: a */
        public final void mo64416a(Context context, List<C9981eb> list) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
            C10331u b = this.f25677a.f25671f;
            if (b != null) {
                b.mo65167a(this.f25677a.f25667b, list);
            }
        }
    }

    /* renamed from: a */
    public final void mo65172a() {
        C10331u uVar;
        C9905cn cnVar = this.f25676k;
        if (cnVar != null && (uVar = this.f25671f) != null) {
            uVar.mo65168a(cnVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m30010e() {
        C10204l lVar = this.f25674i;
        if (lVar != null) {
            lVar.mo65101e();
        }
        C10331u uVar = this.f25675j;
        if (uVar != null) {
            uVar.mo65170b();
        }
        m30009d();
    }

    /* renamed from: b */
    public final void mo65176b() {
        C10331u uVar = this.f25671f;
        if (uVar != null) {
            uVar.mo65170b();
        }
        C10204l lVar = this.f25672g;
        if (lVar != null) {
            lVar.mo65101e();
        }
        this.f25671f = null;
        this.f25672g = null;
        this.f25670e.mo65180a((C10227lj<C10182ke>) null);
        this.f25670e.mo65179a((C10076h) null);
    }

    /* renamed from: c */
    public final boolean mo65177c() {
        C10331u uVar = this.f25671f;
        if (uVar == null) {
            return false;
        }
        return uVar.mo65169a();
    }
}
