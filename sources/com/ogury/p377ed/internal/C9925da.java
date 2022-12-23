package com.ogury.p377ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.OguryCrashReport;

/* renamed from: com.ogury.ed.internal.da */
public final class C9925da {

    /* renamed from: a */
    public static final C9925da f24975a = new C9925da();

    private C9925da() {
    }

    /* renamed from: a */
    public static void m28653a(Throwable th) {
        C10263mq.m29882b(th, "t");
        try {
            OguryCrashReport.logException(CampaignUnit.JSON_KEY_ADS, th);
        } catch (Throwable unused) {
        }
    }
}
