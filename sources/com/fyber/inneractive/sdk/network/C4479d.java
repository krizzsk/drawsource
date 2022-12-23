package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.fyber.inneractive.sdk.network.C4476c;

/* renamed from: com.fyber.inneractive.sdk.network.d */
public class C4479d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C4476c f11015a;

    public C4479d(C4476c cVar) {
        this.f11015a = cVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C4476c cVar = this.f11015a;
        Handler handler = cVar.f11001d;
        if (handler != null) {
            handler.post(new C4476c.C4477a(20150330, 3500));
        }
    }

    public void onActivityResumed(Activity activity) {
        Handler handler = this.f11015a.f11001d;
        if (handler != null) {
            handler.removeMessages(20150330);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
