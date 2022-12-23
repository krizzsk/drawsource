package com.iab.omid.library.ironsrc.p257d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C7869a;

/* renamed from: com.iab.omid.library.ironsrc.d.c */
public final class C7894c {
    /* renamed from: a */
    public static void m22231a(String str) {
        if (C7869a.f19005a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22232a(String str, Exception exc) {
        if ((C7869a.f19005a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
