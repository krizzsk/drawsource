package com.ogury.p377ed.internal;

import android.app.Application;
import com.ogury.p377ed.internal.C9816aj;
import p401io.presage.interstitial.p402ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gu */
public final class C10068gu {

    /* renamed from: a */
    public static final C10068gu f25290a = new C10068gu();

    private C10068gu() {
    }

    /* renamed from: a */
    public static C9816aj m29233a(InterstitialActivity interstitialActivity, C10044g gVar, C9834ao aoVar) {
        C10263mq.m29882b(interstitialActivity, "activity");
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(aoVar, "expandToInterstitialViewCommand");
        Application application = interstitialActivity.getApplication();
        C10263mq.m29879a((Object) application, "activity.application");
        return new C9816aj.C9817a(application, gVar, aoVar, true).mo64354p();
    }
}
