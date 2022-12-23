package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.C2042a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a */
public class C1798a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List<C2042a> f2867a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference<Activity> f2868b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<Activity> f2869c = new WeakReference<>((Object) null);

    public C1798a(Context context) {
        if (C2102v.m5104a()) {
            C2102v.m5107f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f2868b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f2869c = this.f2868b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity mo14045a() {
        return (Activity) this.f2868b.get();
    }

    /* renamed from: a */
    public void mo14046a(C2042a aVar) {
        this.f2867a.add(aVar);
    }

    /* renamed from: b */
    public Activity mo14047b() {
        return (Activity) this.f2869c.get();
    }

    /* renamed from: b */
    public void mo14048b(C2042a aVar) {
        this.f2867a.remove(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (C2042a onActivityCreated : new ArrayList(this.f2867a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (C2042a onActivityDestroyed : new ArrayList(this.f2867a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f2869c = new WeakReference<>((Object) null);
        for (C2042a onActivityPaused : new ArrayList(this.f2867a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f2868b = weakReference;
        this.f2869c = weakReference;
        for (C2042a onActivityResumed : new ArrayList(this.f2867a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (C2042a onActivitySaveInstanceState : new ArrayList(this.f2867a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (C2042a onActivityStarted : new ArrayList(this.f2867a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (C2042a onActivityStopped : new ArrayList(this.f2867a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
