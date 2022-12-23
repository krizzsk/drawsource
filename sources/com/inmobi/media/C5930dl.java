package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.dl */
/* compiled from: PicassoWrapper */
public class C5930dl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15015a = C5930dl.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile Picasso f15016b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f15017c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static List<WeakReference<Context>> f15018d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Application.ActivityLifecycleCallbacks f15019e = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityDestroyed(Activity activity) {
            synchronized (C5930dl.f15017c) {
                if (C5930dl.f15016b != null && C5930dl.m17620c(activity)) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(C5930dl.f15019e);
                    C5930dl.f15018d.remove(activity);
                    if (C5930dl.f15018d.isEmpty()) {
                        String unused = C5930dl.f15015a;
                        Picasso unused2 = C5930dl.f15016b;
                        C5930dl.f15016b.shutdown();
                        Picasso unused3 = C5930dl.f15016b = null;
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public static Picasso m17614a(Context context) {
        synchronized (f15017c) {
            if (!m17620c(context)) {
                f15018d.add(new WeakReference(context));
            }
            if (f15016b == null) {
                f15016b = new Picasso.Builder(context).build();
                C6183hw.m18312a(context, f15019e);
            }
        }
        return f15016b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m17620c(Context context) {
        for (int i = 0; i < f15018d.size(); i++) {
            Context context2 = (Context) f15018d.get(i).get();
            if (context2 != null && context2.equals(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m17616a(InvocationHandler invocationHandler) {
        try {
            Class<?> cls = Class.forName("com.squareup.picasso.Callback");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
