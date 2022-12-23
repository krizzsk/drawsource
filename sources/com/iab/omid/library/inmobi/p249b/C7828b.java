package com.iab.omid.library.inmobi.p249b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.C7825a;

/* renamed from: com.iab.omid.library.inmobi.b.b */
public class C7828b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7828b f18917a = new C7828b();

    /* renamed from: b */
    private boolean f18918b;

    /* renamed from: c */
    private boolean f18919c;

    /* renamed from: d */
    private C7829a f18920d;

    /* renamed from: com.iab.omid.library.inmobi.b.b$a */
    public interface C7829a {
        /* renamed from: a */
        void mo55160a(boolean z);
    }

    private C7828b() {
    }

    /* renamed from: a */
    public static C7828b m21931a() {
        return f18917a;
    }

    /* renamed from: a */
    private void m21932a(boolean z) {
        if (this.f18919c != z) {
            this.f18919c = z;
            if (this.f18918b) {
                m21933e();
                C7829a aVar = this.f18920d;
                if (aVar != null) {
                    aVar.mo55160a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21933e() {
        boolean z = !this.f18919c;
        for (C7825a adSessionStatePublisher : C7827a.m21924a().mo55143b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55207a(z);
        }
    }

    /* renamed from: a */
    public void mo55148a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55149a(C7829a aVar) {
        this.f18920d = aVar;
    }

    /* renamed from: b */
    public void mo55150b() {
        this.f18918b = true;
        this.f18919c = false;
        m21933e();
    }

    /* renamed from: c */
    public void mo55151c() {
        this.f18918b = false;
        this.f18919c = false;
        this.f18920d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55152d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo55152d().importance != 100;
            boolean z3 = true;
            for (C7825a next : C7827a.m21924a().mo55145c()) {
                if (next.mo55112e() && (d = next.mo55111d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21932a(z);
        }
    }

    public void onActivityResumed(Activity activity) {
        m21932a(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
