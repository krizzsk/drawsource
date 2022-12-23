package com.ogury.p376cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.OguryChoiceManager;
import com.ogury.p376cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.InternalCM */
public final class InternalCM {

    /* renamed from: a */
    public static final InternalCM f24161a = new InternalCM();

    private InternalCM() {
    }

    public static final String getVersion() {
        return "3.3.0";
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        aacac aacac = aacac.f24275a;
        aacac.m27779a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        aacac aacac = aacac.f24275a;
        aacac.m27779a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m28105d("[Consent] Module started");
        OguryChoiceManager.initialize$default(context, str, (OguryCmConfig) null, 4, (Object) null);
        aabcb aabcb = aabcb.f24269a;
        String token = InternalCore.getToken(context, "consent_token");
        bbabc.m28049a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        aabcb.m27764a(context, str, token);
        aabca aabca = aabca.f24267a;
        aabca.m27762a(oguryEventBuses);
    }
}
