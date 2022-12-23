package com.ogury.p377ed.internal;

import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gx */
public final class C10073gx implements C9840au {

    /* renamed from: a */
    private final InterstitialActivity.C12487a f25304a;

    public /* synthetic */ C10073gx() {
        this(InterstitialActivity.f29814a);
    }

    private C10073gx(InterstitialActivity.C12487a aVar) {
        C10263mq.m29882b(aVar, "interstitialStartCommand");
        this.f25304a = aVar;
    }

    /* renamed from: a */
    public final boolean mo64285a(Application application, List<C9981eb> list, String str) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        C10263mq.m29882b(str, "nextAdId");
        C9981eb a = C9903cm.m28599a(list, str);
        if (a == null) {
            return false;
        }
        this.f25304a.mo64361a((Context) application, a, list);
        return true;
    }
}
