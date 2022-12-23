package com.ogury.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.sdk.internal.k */
/* compiled from: SharedPreferencesCreator.kt */
public final class C10361k {

    /* renamed from: a */
    private final Context f25696a;

    public C10361k(Context context) {
        C10363m.m30060b(context, "context");
        this.f25696a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo65212a(String str) {
        C10363m.m30060b(str, "name");
        SharedPreferences sharedPreferences = this.f25696a.getSharedPreferences(str, 0);
        C10363m.m30058a((Object) sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
