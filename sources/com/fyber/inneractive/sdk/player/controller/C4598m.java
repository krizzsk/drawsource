package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.player.p190ui.C5042i;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.m */
public class C4598m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C4594k f11435a;

    public C4598m(C4594k kVar) {
        this.f11435a = kVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.equals(this.f11435a.f11412d.getContext())) {
            C5042i iVar = this.f11435a.f11412d;
            iVar.f13444h = true;
            if (iVar.f13452F != null) {
                IAlog.m16446a("Autoclick paused", new Object[0]);
                iVar.f13452F.mo26408a();
            }
            this.f11435a.f11412d.mo25652b();
        }
    }

    public void onActivityResumed(Activity activity) {
        if (activity.equals(this.f11435a.f11412d.getContext())) {
            C5042i iVar = this.f11435a.f11412d;
            iVar.f13444h = false;
            if (iVar.f13452F != null) {
                IAlog.m16446a("Autoclick resumed", new Object[0]);
                iVar.f13452F.mo26410b();
            }
            this.f11435a.f11412d.mo25652b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
