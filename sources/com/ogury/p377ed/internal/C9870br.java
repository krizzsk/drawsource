package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.br */
public final class C9870br implements C9882bw {

    /* renamed from: a */
    private final Activity f24872a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9876bu f24873b;

    /* renamed from: c */
    private final C9869bq f24874c;

    /* renamed from: d */
    private final C10058gm f24875d;

    /* renamed from: e */
    private final Application f24876e;

    /* renamed from: f */
    private Application.ActivityLifecycleCallbacks f24877f;

    private C9870br(Activity activity, C9876bu buVar, C9869bq bqVar, C10058gm gmVar) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(buVar, "adLayoutController");
        C10263mq.m29882b(bqVar, "overlayActivityFilter");
        C10263mq.m29882b(gmVar, "topActivityMonitor");
        this.f24872a = activity;
        this.f24873b = buVar;
        this.f24874c = bqVar;
        this.f24875d = gmVar;
        this.f24876e = activity.getApplication();
    }

    /* renamed from: a */
    public final C9869bq mo64392a() {
        return this.f24874c;
    }

    public /* synthetic */ C9870br(Activity activity, C9876bu buVar, C9869bq bqVar) {
        this(activity, buVar, bqVar, C10058gm.f25283a);
    }

    /* renamed from: com.ogury.ed.internal.br$a */
    public static final class C9871a extends C9920cx {

        /* renamed from: a */
        final /* synthetic */ C9870br f24878a;

        C9871a(C9870br brVar) {
            this.f24878a = brVar;
        }

        public final void onActivityPaused(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            if (!(activity instanceof C9929dd)) {
                this.f24878a.f24873b.mo64400a();
            }
        }

        public final void onActivityResumed(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            if (!(activity instanceof C9929dd)) {
                this.f24878a.m28503a(activity);
            }
        }
    }

    /* renamed from: b */
    public final void mo64393b() {
        Application.ActivityLifecycleCallbacks aVar = new C9871a(this);
        this.f24877f = aVar;
        this.f24876e.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: c */
    public final void mo64394c() {
        Activity a = C10058gm.m29204a();
        if (a == null) {
            a = this.f24872a;
        }
        m28503a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28503a(Activity activity) {
        if (this.f24874c.mo64391b(activity)) {
            this.f24873b.mo64401a(activity);
        }
    }

    /* renamed from: d */
    public final void mo64395d() {
        this.f24876e.unregisterActivityLifecycleCallbacks(this.f24877f);
    }
}
