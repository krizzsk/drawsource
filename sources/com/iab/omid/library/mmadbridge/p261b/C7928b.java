package com.iab.omid.library.mmadbridge.p261b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7925a;

/* renamed from: com.iab.omid.library.mmadbridge.b.b */
public class C7928b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7928b f19145a = new C7928b();

    /* renamed from: b */
    private boolean f19146b;

    /* renamed from: c */
    private boolean f19147c;

    /* renamed from: d */
    private C7929a f19148d;

    /* renamed from: com.iab.omid.library.mmadbridge.b.b$a */
    public interface C7929a {
        /* renamed from: a */
        void mo55544a(boolean z);
    }

    private C7928b() {
    }

    /* renamed from: a */
    public static C7928b m22378a() {
        return f19145a;
    }

    /* renamed from: a */
    private void m22379a(boolean z) {
        if (this.f19147c != z) {
            this.f19147c = z;
            if (this.f19146b) {
                m22380e();
                C7929a aVar = this.f19148d;
                if (aVar != null) {
                    aVar.mo55544a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m22380e() {
        boolean z = !this.f19147c;
        for (C7925a adSessionStatePublisher : C7927a.m22371a().mo55527b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55591a(z);
        }
    }

    /* renamed from: a */
    public void mo55532a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55533a(C7929a aVar) {
        this.f19148d = aVar;
    }

    /* renamed from: b */
    public void mo55534b() {
        this.f19146b = true;
        this.f19147c = false;
        m22380e();
    }

    /* renamed from: c */
    public void mo55535c() {
        this.f19146b = false;
        this.f19147c = false;
        this.f19148d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55536d() {
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
        m22379a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo55536d().importance != 100;
            boolean z3 = true;
            for (C7925a next : C7927a.m22371a().mo55529c()) {
                if (next.mo55496f() && (e = next.mo55495e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m22379a(z);
        }
    }
}
