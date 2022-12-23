package com.iab.omid.library.applovin.p239d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C7717a;

/* renamed from: com.iab.omid.library.applovin.d.c */
public final class C7742c {
    /* renamed from: a */
    public static void m21554a(String str) {
        if (C7717a.f18658a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21555a(String str, Exception exc) {
        if ((C7717a.f18658a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
