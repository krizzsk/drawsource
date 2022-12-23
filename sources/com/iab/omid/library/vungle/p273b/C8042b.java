package com.iab.omid.library.vungle.p273b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C8039a;

/* renamed from: com.iab.omid.library.vungle.b.b */
public class C8042b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C8042b f19450a = new C8042b();

    /* renamed from: b */
    private boolean f19451b;

    /* renamed from: c */
    private boolean f19452c;

    /* renamed from: d */
    private C8043a f19453d;

    /* renamed from: com.iab.omid.library.vungle.b.b$a */
    public interface C8043a {
        /* renamed from: a */
        void mo56077a(boolean z);
    }

    private C8042b() {
    }

    /* renamed from: a */
    public static C8042b m22932a() {
        return f19450a;
    }

    /* renamed from: a */
    private void m22933a(boolean z) {
        if (this.f19452c != z) {
            this.f19452c = z;
            if (this.f19451b) {
                m22934e();
                C8043a aVar = this.f19453d;
                if (aVar != null) {
                    aVar.mo56077a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m22934e() {
        boolean z = !this.f19452c;
        for (C8039a adSessionStatePublisher : C8041a.m22925a().mo56060b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56124a(z);
        }
    }

    /* renamed from: a */
    public void mo56065a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo56066a(C8043a aVar) {
        this.f19453d = aVar;
    }

    /* renamed from: b */
    public void mo56067b() {
        this.f19451b = true;
        this.f19452c = false;
        m22934e();
    }

    /* renamed from: c */
    public void mo56068c() {
        this.f19451b = false;
        this.f19452c = false;
        this.f19453d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo56069d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m22933a(false);
    }

    public void onActivityStopped(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo56069d().importance != 100;
            boolean z3 = true;
            for (C8039a next : C8041a.m22925a().mo56062c()) {
                if (next.mo56029e() && (d = next.mo56028d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m22933a(z);
        }
    }
}
