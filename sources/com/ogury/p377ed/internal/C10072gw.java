package com.ogury.p377ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gw */
public final class C10072gw implements C10330t {

    /* renamed from: a */
    public static final C10072gw f25302a = new C10072gw();

    /* renamed from: b */
    private static InterstitialActivity.C12487a f25303b = InterstitialActivity.f29814a;

    private C10072gw() {
    }

    /* renamed from: a */
    public final void mo64416a(Context context, List<C9981eb> list) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        if (!list.isEmpty()) {
            f25303b.mo64361a(context, list.remove(0), list);
        }
    }
}
