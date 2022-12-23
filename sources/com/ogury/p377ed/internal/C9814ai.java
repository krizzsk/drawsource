package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.ai */
public final class C9814ai {

    /* renamed from: a */
    private final Application f24741a;

    /* renamed from: b */
    private Application.ActivityLifecycleCallbacks f24742b;

    public C9814ai(Application application) {
        C10263mq.m29882b(application, "application");
        this.f24741a = application;
    }

    /* renamed from: com.ogury.ed.internal.ai$a */
    public static final class C9815a extends C9920cx {

        /* renamed from: a */
        final /* synthetic */ C10044g f24743a;

        /* renamed from: b */
        final /* synthetic */ C9814ai f24744b;

        C9815a(C10044g gVar, C9814ai aiVar) {
            this.f24743a = gVar;
            this.f24744b = aiVar;
        }

        public final void onActivityPaused(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            this.f24743a.mo64735a();
        }

        public final void onActivityResumed(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            this.f24744b.mo64298a();
            C10044g gVar = this.f24743a;
            activity.addContentView(gVar, gVar.getLayoutParams());
        }
    }

    /* renamed from: a */
    public final void mo64299a(C10044g gVar) {
        C10263mq.m29882b(gVar, "adLayout");
        Application.ActivityLifecycleCallbacks aVar = new C9815a(gVar, this);
        this.f24742b = aVar;
        this.f24741a.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: a */
    public final void mo64298a() {
        this.f24741a.unregisterActivityLifecycleCallbacks(this.f24742b);
    }
}
