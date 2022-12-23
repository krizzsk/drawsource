package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.gm */
public final class C10058gm {

    /* renamed from: a */
    public static final C10058gm f25283a = new C10058gm();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<Activity> f25284b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static boolean f25285c;

    private C10058gm() {
    }

    /* renamed from: a */
    public static Activity m29204a() {
        return (Activity) f25284b.get();
    }

    /* renamed from: a */
    public final synchronized void mo64777a(Context context) {
        C10263mq.m29882b(context, "context");
        if (!f25285c) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                f25285c = true;
                application.registerActivityLifecycleCallbacks(new C10059a());
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.gm$a */
    public static final class C10059a extends C9920cx {
        C10059a() {
        }

        public final void onActivityResumed(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            C10058gm gmVar = C10058gm.f25283a;
            C10058gm.f25284b = new WeakReference(activity);
        }
    }
}
