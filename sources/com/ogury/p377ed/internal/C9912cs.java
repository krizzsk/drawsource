package com.ogury.p377ed.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.ed.internal.cs */
public final class C9912cs implements C9913ct {

    /* renamed from: a */
    private final Handler f24956a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo64443a(Runnable runnable) {
        C10263mq.m29882b(runnable, "runnable");
        this.f24956a.post(runnable);
    }
}
