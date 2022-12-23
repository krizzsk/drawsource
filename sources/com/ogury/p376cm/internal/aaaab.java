package com.ogury.p376cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f24189a = new aaaab();

    /* renamed from: b */
    private static aaaaa f24190b;

    private aaaab() {
    }

    /* renamed from: a */
    public static aaaaa m27685a(OguryCmConfig oguryCmConfig) {
        bbabc.m28052b(oguryCmConfig, "oguryCmConfig");
        if (f24190b != null) {
            return f24190b;
        }
        if (oguryCmConfig.getCcpafVersion() != 1) {
            OguryIntegrationLogger.m28106e("[Consent][setup] Failed to set up versions (CCPA version " + oguryCmConfig.getCcpafVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad CCPAF version used! Please use one of the declared ones in OguryChoiceManager class.");
        } else if (oguryCmConfig.getTcfVersion() == 2) {
            return new aaaaa(new aaaba(), (babac) null, 2, (bbabb) null);
        } else {
            OguryIntegrationLogger.m28106e("[Consent][setup] Failed to set up versions (TCF version " + oguryCmConfig.getTcfVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad TCF version used! Please use one of the declared ones in OguryChoiceManager class.");
        }
    }
}
