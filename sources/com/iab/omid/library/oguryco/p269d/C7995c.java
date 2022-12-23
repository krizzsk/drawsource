package com.iab.omid.library.oguryco.p269d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.oguryco.C7969a;

/* renamed from: com.iab.omid.library.oguryco.d.c */
public final class C7995c {
    /* renamed from: a */
    public static void m22690a(String str) {
        if (C7969a.f19236a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22691a(String str, Exception exc) {
        if ((C7969a.f19236a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
