package com.iab.omid.library.adcolony.p225b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7623a;

/* renamed from: com.iab.omid.library.adcolony.b.b */
public class C7626b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7626b f18450a = new C7626b();

    /* renamed from: b */
    private boolean f18451b;

    /* renamed from: c */
    private boolean f18452c;

    /* renamed from: d */
    private C7627a f18453d;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    public interface C7627a {
        /* renamed from: a */
        void mo54368a(boolean z);
    }

    private C7626b() {
    }

    /* renamed from: a */
    public static C7626b m21013a() {
        return f18450a;
    }

    /* renamed from: a */
    private void m21014a(boolean z) {
        if (this.f18452c != z) {
            this.f18452c = z;
            if (this.f18451b) {
                m21015e();
                C7627a aVar = this.f18453d;
                if (aVar != null) {
                    aVar.mo54368a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21015e() {
        boolean z = !this.f18452c;
        for (C7623a adSessionStatePublisher : C7625a.m21006a().mo54351b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54415a(z);
        }
    }

    /* renamed from: a */
    public void mo54356a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54357a(C7627a aVar) {
        this.f18453d = aVar;
    }

    /* renamed from: b */
    public void mo54358b() {
        this.f18451b = true;
        this.f18452c = false;
        m21015e();
    }

    /* renamed from: c */
    public void mo54359c() {
        this.f18451b = false;
        this.f18452c = false;
        this.f18453d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54360d() {
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
        m21014a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54360d().importance != 100;
            boolean z3 = true;
            for (C7623a next : C7625a.m21006a().mo54353c()) {
                if (next.mo54320f() && (e = next.mo54319e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21014a(z);
        }
    }
}
