package com.tapjoy.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.de */
public final class C11352de implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static C11352de f27113d = new C11352de();

    /* renamed from: a */
    public boolean f27114a;

    /* renamed from: b */
    public boolean f27115b;

    /* renamed from: c */
    public C11353a f27116c;

    /* renamed from: com.tapjoy.internal.de$a */
    public interface C11353a {
        /* renamed from: a */
        void mo69802a(boolean z);
    }

    private C11352de() {
    }

    /* renamed from: a */
    public static C11352de m31052a() {
        return f27113d;
    }

    /* renamed from: a */
    private void m31053a(boolean z) {
        if (this.f27115b != z) {
            this.f27115b = z;
            if (this.f27114a) {
                mo69794b();
                C11353a aVar = this.f27116c;
                if (aVar != null) {
                    aVar.mo69802a(!z);
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        m31053a(false);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        View c;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z = true;
            boolean z2 = runningAppProcessInfo.importance != 100;
            boolean z3 = true;
            for (T t : Collections.unmodifiableCollection(C11351dd.m31050a().f27112b)) {
                if (t.mo69789d() && (c = t.mo69788c()) != null && c.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m31053a(z);
        }
    }

    /* renamed from: b */
    public final void mo69794b() {
        boolean z = !this.f27115b;
        for (T t : Collections.unmodifiableCollection(C11351dd.m31050a().f27111a)) {
            t.f27079c.mo69820a(z);
        }
    }
}
