package com.iab.omid.library.vungle.p275d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.C8033a;

/* renamed from: com.iab.omid.library.vungle.d.c */
public final class C8058c {
    /* renamed from: a */
    public static void m23011a(String str) {
        if (C8033a.f19425a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m23012a(String str, Exception exc) {
        if ((C8033a.f19425a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
