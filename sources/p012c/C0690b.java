package p012c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.smaato.adsession.C8021a;

/* renamed from: c.b */
public class C0690b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static C0690b f55d = new C0690b();

    /* renamed from: a */
    private boolean f56a;

    /* renamed from: b */
    private boolean f57b;

    /* renamed from: c */
    private C0691a f58c;

    /* renamed from: c.b$a */
    public interface C0691a {
        /* renamed from: a */
        void mo10279a(boolean z);
    }

    private C0690b() {
    }

    /* renamed from: a */
    public static C0690b m41a() {
        return f55d;
    }

    /* renamed from: a */
    private void m42a(boolean z) {
        if (this.f57b != z) {
            this.f57b = z;
            if (this.f56a) {
                m43c();
                C0691a aVar = this.f58c;
                if (aVar != null) {
                    aVar.mo10279a(!z);
                }
            }
        }
    }

    /* renamed from: c */
    private void m43c() {
        boolean z = !this.f57b;
        for (C8021a adSessionStatePublisher : C0689a.m34c().mo10263b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55945a(z);
        }
    }

    /* renamed from: a */
    public void mo10267a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo10268a(C0691a aVar) {
        this.f58c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo mo10269b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: d */
    public void mo10270d() {
        this.f56a = true;
        this.f57b = false;
        m43c();
    }

    /* renamed from: e */
    public void mo10271e() {
        this.f56a = false;
        this.f57b = false;
        this.f58c = null;
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
        m42a(false);
    }

    public void onActivityStopped(Activity activity) {
        View c;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo10269b().importance != 100;
            boolean z3 = true;
            for (C8021a next : C0689a.m34c().mo10261a()) {
                if (next.mo55904f() && (c = next.mo55901c()) != null && c.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m42a(z);
        }
    }
}
