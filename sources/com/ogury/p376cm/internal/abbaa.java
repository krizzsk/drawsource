package com.ogury.p376cm.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ogury.cm.internal.abbaa */
public final class abbaa implements abacc {

    /* renamed from: a */
    private final Handler f24315a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo63835a(bbaaa<babcc> bbaaa) {
        bbabc.m28052b(bbaaa, "action");
        this.f24315a.post(new abbab(bbaaa));
    }
}
