package com.ogury.p377ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bo */
public final class C9866bo {
    /* renamed from: a */
    public static C9869bq m28486a(Activity activity, C9891cd cdVar, C10022fh fhVar) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(cdVar, "publisherActivityFilter");
        C10263mq.m29882b(fhVar, "overlayActivityConfig");
        C9869bq bqVar = new C9869bq(fhVar, activity.getClass());
        bqVar.mo64388a(activity);
        bqVar.mo64389a(cdVar.mo64429a());
        bqVar.mo64390b((List<? extends Class<? extends Activity>>) cdVar.mo64431b());
        return bqVar;
    }
}
