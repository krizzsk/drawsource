package com.saygames.saypromo.p378a;

import android.app.Activity;
import com.saygames.saypromo.SayPromoAd;
import com.saygames.saypromo.SayPromoAdLoadCallback;
import com.saygames.saypromo.SayPromoAdShowCallback;

/* renamed from: com.saygames.saypromo.a.V4 */
public final class C10525V4 implements SayPromoAd {

    /* renamed from: a */
    final /* synthetic */ C10697r5 f26004a;

    C10525V4(C10704s5 s5Var) {
        this.f26004a = s5Var;
    }

    public final void destroy() {
        ((C10704s5) this.f26004a).mo65538a(new C10555a());
    }

    public final void load(SayPromoAdLoadCallback sayPromoAdLoadCallback) {
        C10485P5.m30222a(sayPromoAdLoadCallback, "callback");
        ((C10704s5) this.f26004a).mo65538a(new C10563b(sayPromoAdLoadCallback));
    }

    public final void show(Activity activity, SayPromoAdShowCallback sayPromoAdShowCallback) {
        C10485P5.m30222a(activity, "activity");
        C10485P5.m30222a(sayPromoAdShowCallback, "callback");
        C10683q a = C10691r.m30564a(activity);
        ((C10704s5) this.f26004a).mo65538a(new C10571c(a, sayPromoAdShowCallback));
    }
}
