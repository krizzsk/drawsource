package com.iab.omid.library.amazon.p231b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C7673a;

/* renamed from: com.iab.omid.library.amazon.b.b */
public class C7676b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7676b f18567a = new C7676b();

    /* renamed from: b */
    private boolean f18568b;

    /* renamed from: c */
    private boolean f18569c;

    /* renamed from: d */
    private C7677a f18570d;

    /* renamed from: com.iab.omid.library.amazon.b.b$a */
    public interface C7677a {
        /* renamed from: a */
        void mo54567a(boolean z);
    }

    private C7676b() {
    }

    /* renamed from: a */
    public static C7676b m21243a() {
        return f18567a;
    }

    /* renamed from: a */
    private void m21244a(boolean z) {
        if (this.f18569c != z) {
            this.f18569c = z;
            if (this.f18568b) {
                m21245e();
                C7677a aVar = this.f18570d;
                if (aVar != null) {
                    aVar.mo54567a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21245e() {
        boolean z = !this.f18569c;
        for (C7673a adSessionStatePublisher : C7675a.m21236a().mo54550b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54614a(z);
        }
    }

    /* renamed from: a */
    public void mo54555a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54556a(C7677a aVar) {
        this.f18570d = aVar;
    }

    /* renamed from: b */
    public void mo54557b() {
        this.f18568b = true;
        this.f18569c = false;
        m21245e();
    }

    /* renamed from: c */
    public void mo54558c() {
        this.f18568b = false;
        this.f18569c = false;
        this.f18570d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54559d() {
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
        m21244a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54559d().importance != 100;
            boolean z3 = true;
            for (C7673a next : C7675a.m21236a().mo54552c()) {
                if (next.mo54519f() && (e = next.mo54518e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21244a(z);
        }
    }
}
