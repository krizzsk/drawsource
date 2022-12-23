package com.ogury.p377ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11130Ad;
import java.util.List;
import p401io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.j */
public final class C10148j {

    /* renamed from: a */
    private final Context f25486a;

    /* renamed from: b */
    private final C10036fu f25487b;

    /* renamed from: c */
    private final C10047gb f25488c;

    /* renamed from: d */
    private final C9989ej f25489d;

    /* renamed from: e */
    private final C10029fn f25490e;

    /* renamed from: f */
    private final PresageSdk f25491f;

    /* renamed from: g */
    private final C10329s f25492g;

    /* renamed from: h */
    private C10028fm f25493h;

    private C10148j(Context context, C10036fu fuVar, C10047gb gbVar, C9989ej ejVar, C10029fn fnVar, PresageSdk presageSdk, C10329s sVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(fuVar, "appBackgroundChecker");
        C10263mq.m29882b(gbVar, "internetChecker");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(presageSdk, "presageSdk");
        C10263mq.m29882b(sVar, "oguryAds");
        this.f25486a = context;
        this.f25487b = fuVar;
        this.f25488c = gbVar;
        this.f25489d = ejVar;
        this.f25490e = fnVar;
        this.f25491f = presageSdk;
        this.f25492g = sVar;
    }

    public /* synthetic */ C10148j(Context context, C10036fu fuVar, C10047gb gbVar, C9989ej ejVar) {
        this(context, fuVar, gbVar, ejVar, C10029fn.f25239a, PresageSdk.f29803a, C10329s.f25652a);
    }

    /* renamed from: a */
    public final boolean mo64960a(C10076h hVar, boolean z, List<C9981eb> list) {
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        if (m29659a()) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (module not set up)");
            m29658a(hVar, 5);
            return false;
        }
        this.f25493h = C10029fn.m29114a(this.f25486a);
        if (!z || list.isEmpty()) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m28105d("[Ads][" + this.f25489d.mo64569b() + "][show] Triggering onAdError() callback");
            if (hVar == null) {
                OguryIntegrationLogger.m28105d("[Ads][" + this.f25489d.mo64569b() + "][show] No ad listener registered");
            }
            if (hVar != null) {
                hVar.mo64633e();
            }
            return false;
        }
        for (Number intValue : C10190km.m29758b(3, 2, 7, 8, 1)) {
            int intValue2 = intValue.intValue();
            if (m29660a(intValue2)) {
                m29661b(intValue2);
                m29658a(hVar, intValue2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m29660a(int i) {
        if (i == 1) {
            return mo64961b();
        }
        if (i == 2) {
            return m29663d();
        }
        if (i == 3) {
            return m29662c();
        }
        if (i == 7) {
            return m29667h();
        }
        if (i == 8) {
            return m29666g();
        }
        OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (error code: " + i + ')');
        throw new IllegalArgumentException(C10263mq.m29874a("Illegal argument ", (Object) Integer.valueOf(i)));
    }

    /* renamed from: b */
    private final void m29661b(int i) {
        if (i == 1) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (No Internet connection)");
        } else if (i == 2) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (Ad serving has been disabled)");
        } else if (i == 3) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (missing configuration)");
        } else if (i == 7) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (Activity in background)");
        } else if (i == 8) {
            OguryIntegrationLogger.m28106e("[Ads][" + this.f25489d.mo64569b() + "][show] Failed to show (Another ad already displayed)");
        }
    }

    /* renamed from: a */
    public static boolean m29659a() {
        return !PresageSdk.m33346b();
    }

    /* renamed from: c */
    private final boolean m29662c() {
        return this.f25493h == null;
    }

    /* renamed from: d */
    private final boolean m29663d() {
        if (!m29662c()) {
            C10028fm fmVar = this.f25493h;
            return fmVar != null && !fmVar.mo64697b();
        }
    }

    /* renamed from: e */
    private final boolean m29664e() {
        return this.f25489d.mo64570c() && C10329s.m29987b();
    }

    /* renamed from: f */
    private final boolean m29665f() {
        return this.f25489d.mo64571d() && C10329s.m29985a();
    }

    /* renamed from: g */
    private final boolean m29666g() {
        return m29664e() || m29665f();
    }

    /* renamed from: b */
    public final boolean mo64961b() {
        return !this.f25488c.mo64776a(this.f25486a);
    }

    /* renamed from: h */
    private boolean m29667h() {
        return C10036fu.m29152a(this.f25486a);
    }

    /* renamed from: a */
    private final void m29658a(C10076h hVar, int i) {
        OguryIntegrationLogger.m28105d("[Ads][" + this.f25489d.mo64569b() + "][show] Triggering onAdError() callback");
        if (hVar == null) {
            OguryIntegrationLogger.m28105d("[Ads][" + this.f25489d.mo64569b() + "][show] No ad listener registered");
        }
        if (hVar != null) {
            hVar.mo64629a(i);
        }
    }
}
