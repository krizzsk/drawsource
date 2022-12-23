package com.ogury.p377ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p401io.presage.mraid.browser.listeners.OrientationListener$1;

/* renamed from: com.ogury.ed.internal.ia */
public final class C10113ia {

    /* renamed from: a */
    private final Context f25402a;

    /* renamed from: b */
    private final C10096hp f25403b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f25404c;

    /* renamed from: d */
    private final BroadcastReceiver f25405d = new OrientationListener$1(this);

    public C10113ia(Context context, C10096hp hpVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(hpVar, "multiWebViewCommandExecutor");
        this.f25402a = context;
        this.f25403b = hpVar;
        this.f25404c = context.getResources().getConfiguration().orientation;
        m29464b();
    }

    /* renamed from: b */
    private final void m29464b() {
        this.f25402a.registerReceiver(this.f25405d, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m29466c() {
        this.f25403b.mo64847c();
    }

    /* renamed from: a */
    public final void mo64892a() {
        try {
            this.f25402a.unregisterReceiver(this.f25405d);
        } catch (Exception e) {
            C10057gl.m29202a((Throwable) e);
        }
    }
}
