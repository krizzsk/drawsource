package com.ogury.p377ed.internal;

import android.app.Application;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ad */
public final class C9806ad implements C9840au {

    /* renamed from: a */
    private final C10239lv<C9981eb, List<C9981eb>, C10182ke> f24718a;

    public C9806ad(C10239lv<? super C9981eb, ? super List<C9981eb>, C10182ke> lvVar) {
        C10263mq.m29882b(lvVar, "showNextAd");
        this.f24718a = lvVar;
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
        this.f24718a.mo64398a(a, list);
        return true;
    }
}
