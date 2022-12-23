package com.iab.omid.library.applovin.p237b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C7723a;

/* renamed from: com.iab.omid.library.applovin.b.b */
public class C7726b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7726b f18684a = new C7726b();

    /* renamed from: b */
    private boolean f18685b;

    /* renamed from: c */
    private boolean f18686c;

    /* renamed from: d */
    private C7727a f18687d;

    /* renamed from: com.iab.omid.library.applovin.b.b$a */
    public interface C7727a {
        /* renamed from: a */
        void mo54766a(boolean z);
    }

    private C7726b() {
    }

    /* renamed from: a */
    public static C7726b m21473a() {
        return f18684a;
    }

    /* renamed from: a */
    private void m21474a(boolean z) {
        if (this.f18686c != z) {
            this.f18686c = z;
            if (this.f18685b) {
                m21475e();
                C7727a aVar = this.f18687d;
                if (aVar != null) {
                    aVar.mo54766a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21475e() {
        boolean z = !this.f18686c;
        for (C7723a adSessionStatePublisher : C7725a.m21466a().mo54749b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54813a(z);
        }
    }

    /* renamed from: a */
    public void mo54754a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54755a(C7727a aVar) {
        this.f18687d = aVar;
    }

    /* renamed from: b */
    public void mo54756b() {
        this.f18685b = true;
        this.f18686c = false;
        m21475e();
    }

    /* renamed from: c */
    public void mo54757c() {
        this.f18685b = false;
        this.f18686c = false;
        this.f18687d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54758d() {
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
        m21474a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54758d().importance != 100;
            boolean z3 = true;
            for (C7723a next : C7725a.m21466a().mo54751c()) {
                if (next.mo54718f() && (e = next.mo54717e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21474a(z);
        }
    }
}
