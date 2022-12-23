package com.ogury.p376cm.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.internal.aaaca;

/* renamed from: com.ogury.cm.internal.aabcb */
public final class aabcb {

    /* renamed from: a */
    public static final aabcb f24269a = new aabcb();

    /* renamed from: b */
    private static aaabb f24270b;

    /* renamed from: c */
    private static aaaca f24271c;

    /* renamed from: com.ogury.cm.internal.aabcb$aaaaa */
    public static final class aaaaa implements aaaca.aaaaa {
        aaaaa() {
        }

        /* renamed from: a */
        public final void mo63802a(int i, String str) {
            bbabc.m28052b(str, "consentString");
            OguryIntegrationLogger.m28105d("[Consent][external] TCF consent data detected");
            aabcb aabcb = aabcb.f24269a;
            aabcb.m27765a(new aabab(i, str, aabba.AUTOMATIC));
        }
    }

    private aabcb() {
    }

    /* renamed from: a */
    public static void m27764a(Context context, String str, String str2) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(str2, "consentToken");
        OguryIntegrationLogger.m28105d("[Consent][External] Setting up...");
        if (!((f24270b == null || f24271c == null) ? false : true)) {
            f24270b = new aaabb(context, str, str2);
            OguryIntegrationLogger.m28105d("[Consent][External][setup] Completed!");
            aaaca aaaca = new aaaca(new aaacb(context));
            f24271c = aaaca;
            aaaca.mo63801a(new aaaaa());
            return;
        }
        OguryIntegrationLogger.m28105d("[Consent][External][setup] Already set up!");
    }

    /* renamed from: a */
    public static void m27765a(aaacc aaacc) {
        bbabc.m28052b(aaacc, "externalConsentData");
        OguryIntegrationLogger.m28105d("[Consent][external] Passing external consent data...");
        aaabb aaabb = f24270b;
        if (aaabb != null) {
            if (aaabb == null) {
                bbabc.m28048a();
            }
            aaabb.mo63799a(aaacc);
            return;
        }
        OguryIntegrationLogger.m28106e("Failed to pass external consent data (bad internal initialization)");
    }
}
