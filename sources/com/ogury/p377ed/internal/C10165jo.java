package com.ogury.p377ed.internal;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.ogury.ed.internal.jo */
public final class C10165jo {

    /* renamed from: a */
    public static final C10165jo f25528a = new C10165jo();

    /* renamed from: b */
    private static boolean f25529b;

    private C10165jo() {
    }

    /* renamed from: a */
    public static void m29725a(Throwable th) {
        C10263mq.m29882b(th, "error");
        if (f25529b) {
            Log.e(CampaignEx.KEY_OMID, "caught_error", th);
        }
    }
}
