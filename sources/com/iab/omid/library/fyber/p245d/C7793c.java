package com.iab.omid.library.fyber.p245d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.fyber.C7768a;

/* renamed from: com.iab.omid.library.fyber.d.c */
public final class C7793c {
    /* renamed from: a */
    public static void m21784a(String str) {
        if (C7768a.f18775a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21785a(String str, Exception exc) {
        if ((C7768a.f18775a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
