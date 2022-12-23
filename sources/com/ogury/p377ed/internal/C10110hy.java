package com.ogury.p377ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p401io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1;

/* renamed from: com.ogury.ed.internal.hy */
public final class C10110hy {

    /* renamed from: a */
    private final Context f25390a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10096hp f25391b;

    /* renamed from: c */
    private final BroadcastReceiver f25392c = new CloseSystemDialogsListener$1(this);

    public C10110hy(Context context, C10096hp hpVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(hpVar, "multiWebViewCommandExecutor");
        this.f25390a = context;
        this.f25391b = hpVar;
        m29443b();
    }

    /* renamed from: b */
    private final void m29443b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f25390a.registerReceiver(this.f25392c, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m29445c() {
        this.f25391b.mo64846b();
    }

    /* renamed from: a */
    public final void mo64887a() {
        try {
            this.f25390a.unregisterReceiver(this.f25392c);
        } catch (Throwable th) {
            C10057gl.m29202a(th);
        }
    }
}
