package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.util.ArrayList;

/* renamed from: com.unity3d.services.core.lifecycle.f */
/* compiled from: LifecycleListener */
public class C12064f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private ArrayList<String> f29440a;

    public C12064f(ArrayList<String> arrayList) {
        this.f29440a = arrayList;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f29440a.contains("onActivityCreated") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.CREATED, activity.getClass().getName());
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f29440a.contains("onActivityDestroyed") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.DESTROYED, activity.getClass().getName());
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.f29440a.contains("onActivityPaused") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.PAUSED, activity.getClass().getName());
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.f29440a.contains("onActivityResumed") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.RESUMED, activity.getClass().getName());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.f29440a.contains("onActivitySaveInstanceState") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.SAVE_INSTANCE_STATE, activity.getClass().getName());
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.f29440a.contains("onActivityStarted") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.STARTED, activity.getClass().getName());
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f29440a.contains("onActivityStopped") && C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.LIFECYCLE, (Enum) C12063e.STOPPED, activity.getClass().getName());
        }
    }
}
