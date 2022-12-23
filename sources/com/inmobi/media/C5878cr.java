package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.media.C6103g;

/* renamed from: com.inmobi.media.cr */
/* compiled from: ChromeTabManager */
public final class C5878cr implements Application.ActivityLifecycleCallbacks, C6103g.C6106a {

    /* renamed from: a */
    private final C6103g f14849a;

    /* renamed from: b */
    private String f14850b;

    /* renamed from: c */
    private Context f14851c;

    /* renamed from: d */
    private C6004f f14852d;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public C5878cr(String str, Context context, C6004f fVar) {
        this.f14850b = str;
        C6103g gVar = new C6103g();
        this.f14849a = gVar;
        gVar.f15418c = this;
        this.f14851c = context.getApplicationContext();
        this.f14852d = fVar;
        C6183hw.m18312a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: b */
    public final void mo34872b() {
        this.f14849a.mo35292a(this.f14851c);
    }

    /* renamed from: a */
    public final void mo34870a() {
        Uri parse = Uri.parse(this.f14850b);
        C6103g gVar = this.f14849a;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(gVar.f15416a == null ? null : gVar.f15416a.newSession(new CustomTabsCallback() {
            public final void onNavigationEvent(int i, Bundle bundle) {
                super.onNavigationEvent(i, bundle);
                String unused = C6103g.f15415d;
                if (C6103g.this.f15418c != null) {
                    C6103g.this.f15418c.mo34871a(i);
                }
            }
        }));
        builder.enableUrlBarHiding();
        C6103g.m18115a(this.f14851c, builder.build(), parse, this.f14852d);
    }

    /* renamed from: a */
    public final void mo34871a(int i) {
        if (i == 5) {
            this.f14852d.mo35142a();
        } else if (i == 6) {
            this.f14852d.mo35144b();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C6103g gVar = this.f14849a;
        Context context = this.f14851c;
        if (gVar.f15417b != null) {
            context.unbindService(gVar.f15417b);
            gVar.f15416a = null;
            gVar.f15417b = null;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
