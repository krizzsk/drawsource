package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ogury.p377ed.internal.C9816aj;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cf */
public final class C9893cf {

    /* renamed from: a */
    public static final C9893cf f24926a = new C9893cf();

    /* renamed from: b */
    private static final C9865bn f24927b = new C9865bn();

    /* renamed from: c */
    private static C10029fn f24928c = C10029fn.f25239a;

    private C9893cf() {
    }

    /* renamed from: a */
    public static void m28571a(Activity activity, C9891cd cdVar, C9901ck ckVar) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(cdVar, "publisherActivityFilter");
        C10263mq.m29882b(ckVar, "publisherFragmentFilter");
        Application application = activity.getApplication();
        C10263mq.m29879a((Object) application, "application");
        C10044g gVar = new C10044g(application);
        C9882bw a = new C9883bx(cdVar, ckVar, C9902cl.f24945a, f24928c).mo64417a(activity, gVar, new C9816aj.C9817a(application, gVar, C9838as.f24816a, false).mo64354p());
        if (!(a instanceof C9870br)) {
            C10046ga gaVar = C10046ga.f25280a;
            C10046ga.m29182b("Cannot log whitelisted activities when using fragment filter");
            return;
        }
        m28572a(activity, ((C9870br) a).mo64392a());
    }

    /* renamed from: a */
    private static void m28572a(Context context, C9869bq bqVar) {
        List<Activity> a = C9865bn.m28485a(context);
        C10046ga gaVar = C10046ga.f25280a;
        C10046ga.m29182b("Displaying whitelisted activities");
        boolean z = true;
        for (Activity next : a) {
            if (bqVar.mo64391b(next)) {
                z = false;
                C10046ga gaVar2 = C10046ga.f25280a;
                C10046ga.m29182b(C10263mq.m29874a("Whitelisted: ", (Object) next.getClass().getName()));
            }
        }
        if (z) {
            C10046ga gaVar3 = C10046ga.f25280a;
            C10046ga.m29182b("No activity is whitelisted");
        }
    }
}
