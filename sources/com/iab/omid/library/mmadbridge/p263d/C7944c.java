package com.iab.omid.library.mmadbridge.p263d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.mmadbridge.C7919a;

/* renamed from: com.iab.omid.library.mmadbridge.d.c */
public final class C7944c {
    /* renamed from: a */
    public static void m22459a(String str) {
        if (C7919a.f19119a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22460a(String str, Exception exc) {
        if ((C7919a.f19119a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
