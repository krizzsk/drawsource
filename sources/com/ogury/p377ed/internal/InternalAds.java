package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import p401io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.InternalAds */
public final class InternalAds {

    /* renamed from: a */
    public static final InternalAds f24712a = new InternalAds();

    private InternalAds() {
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(str, "assetKey");
        C10263mq.m29882b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m28105d("[Ads] Module started");
        C9922cz czVar = C9922cz.f24969a;
        C9922cz.m28645a(oguryEventBuses);
        PresageSdk presageSdk = PresageSdk.f29803a;
        PresageSdk.m33344a(new C9921cy(context, str));
    }

    public static final String getVersion() {
        return PresageSdk.getAdsSdkVersion();
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        C9928dc dcVar = C9928dc.f24979a;
        C9928dc.m28656a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        C9928dc dcVar = C9928dc.f24979a;
        C9928dc.m28656a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }
}
