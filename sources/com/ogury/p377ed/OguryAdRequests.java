package com.ogury.p377ed;

import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C9928dc;

/* renamed from: com.ogury.ed.OguryAdRequests */
public final class OguryAdRequests {
    public static final String AD_CONTENT_THRESHOLD_G = "G";
    public static final String AD_CONTENT_THRESHOLD_MA = "MA";
    public static final String AD_CONTENT_THRESHOLD_PG = "PG";
    public static final String AD_CONTENT_THRESHOLD_T = "T";
    public static final String AD_CONTENT_THRESHOLD_UNSPECIFIED = "";
    public static final OguryAdRequests INSTANCE = new OguryAdRequests();

    private OguryAdRequests() {
    }

    public static final void setAdContentThreshold(String str) {
        C10263mq.m29882b(str, "adConsentThreshold");
        C9928dc dcVar = C9928dc.f24979a;
        C9928dc.m28657a("AD_CONTENT_THRESHOLD", str);
    }

    public static final String getAdContentThreshold() {
        C9928dc dcVar = C9928dc.f24979a;
        return C9928dc.m28660b("AD_CONTENT_THRESHOLD", "");
    }
}
