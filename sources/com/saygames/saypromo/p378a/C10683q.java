package com.saygames.saypromo.p378a;

import android.app.Activity;
import android.content.Intent;
import com.saygames.saypromo.activity.SayPromoAdActivityLandscape;
import com.saygames.saypromo.activity.SayPromoAdActivityLandscapeReverse;
import com.saygames.saypromo.activity.SayPromoAdActivityPortrait;
import com.saygames.saypromo.activity.SayPromoAdActivityPortraitReverse;

/* renamed from: com.saygames.saypromo.a.q */
public final class C10683q implements C10675p {

    /* renamed from: a */
    final /* synthetic */ Activity f26312a;

    C10683q(Activity activity) {
        this.f26312a = activity;
    }

    /* renamed from: a */
    public final void mo65532a() {
        int rotation = this.f26312a.getWindowManager().getDefaultDisplay().getRotation();
        this.f26312a.startActivity(new Intent(this.f26312a, rotation != 1 ? rotation != 2 ? rotation != 3 ? SayPromoAdActivityPortrait.class : SayPromoAdActivityLandscapeReverse.class : SayPromoAdActivityPortraitReverse.class : SayPromoAdActivityLandscape.class));
    }
}
