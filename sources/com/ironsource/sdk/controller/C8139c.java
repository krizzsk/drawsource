package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c */
public final class C8139c {

    /* renamed from: a */
    private MutableContextWrapper f19757a;

    /* renamed from: a */
    public final Activity mo56396a() {
        return (Activity) this.f19757a.getBaseContext();
    }

    /* renamed from: a */
    public final synchronized void mo56397a(Activity activity) {
        if (this.f19757a == null) {
            this.f19757a = new MutableContextWrapper(activity);
        }
        this.f19757a.setBaseContext(activity);
    }

    /* renamed from: b */
    public final synchronized void mo56398b() {
        this.f19757a = null;
    }
}
