package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.services.core.lifecycle.c */
/* compiled from: LifecycleCache */
public class C12061c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private C12063e f29425a = C12063e.RESUMED;

    /* renamed from: b */
    private boolean f29426b = true;

    /* renamed from: c */
    private Set<C12060b> f29427c = new HashSet();

    /* renamed from: a */
    public boolean mo71190a() {
        return this.f29426b;
    }

    /* renamed from: b */
    public synchronized void mo71191b() {
        C12063e eVar = this.f29426b ? C12063e.RESUMED : C12063e.PAUSED;
        for (C12060b a : this.f29427c) {
            a.mo71188a(eVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f29425a = C12063e.CREATED;
    }

    public void onActivityDestroyed(Activity activity) {
        this.f29425a = C12063e.DESTROYED;
    }

    public void onActivityPaused(Activity activity) {
        this.f29425a = C12063e.PAUSED;
        this.f29426b = false;
        mo71191b();
    }

    public void onActivityResumed(Activity activity) {
        this.f29425a = C12063e.RESUMED;
        this.f29426b = true;
        mo71191b();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f29425a = C12063e.SAVE_INSTANCE_STATE;
    }

    public void onActivityStarted(Activity activity) {
        this.f29425a = C12063e.STARTED;
    }

    public void onActivityStopped(Activity activity) {
        this.f29425a = C12063e.STOPPED;
    }

    /* renamed from: a */
    public synchronized void mo71189a(C12060b bVar) {
        this.f29427c.add(bVar);
    }

    /* renamed from: b */
    public synchronized void mo71192b(C12060b bVar) {
        this.f29427c.remove(bVar);
    }
}
