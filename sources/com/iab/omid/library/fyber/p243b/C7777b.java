package com.iab.omid.library.fyber.p243b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C7774a;

/* renamed from: com.iab.omid.library.fyber.b.b */
public class C7777b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7777b f18801a = new C7777b();

    /* renamed from: b */
    private boolean f18802b;

    /* renamed from: c */
    private boolean f18803c;

    /* renamed from: d */
    private C7778a f18804d;

    /* renamed from: com.iab.omid.library.fyber.b.b$a */
    public interface C7778a {
        /* renamed from: a */
        void mo54965a(boolean z);
    }

    private C7777b() {
    }

    /* renamed from: a */
    public static C7777b m21703a() {
        return f18801a;
    }

    /* renamed from: a */
    private void m21704a(boolean z) {
        if (this.f18803c != z) {
            this.f18803c = z;
            if (this.f18802b) {
                m21705e();
                C7778a aVar = this.f18804d;
                if (aVar != null) {
                    aVar.mo54965a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21705e() {
        boolean z = !this.f18803c;
        for (C7774a adSessionStatePublisher : C7776a.m21696a().mo54948b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55012a(z);
        }
    }

    /* renamed from: a */
    public void mo54953a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54954a(C7778a aVar) {
        this.f18804d = aVar;
    }

    /* renamed from: b */
    public void mo54955b() {
        this.f18802b = true;
        this.f18803c = false;
        m21705e();
    }

    /* renamed from: c */
    public void mo54956c() {
        this.f18802b = false;
        this.f18803c = false;
        this.f18804d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54957d() {
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
        m21704a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54957d().importance != 100;
            boolean z3 = true;
            for (C7774a next : C7776a.m21696a().mo54950c()) {
                if (next.mo54917f() && (e = next.mo54916e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21704a(z);
        }
    }
}
