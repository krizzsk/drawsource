package com.iab.omid.library.inmobi.p251d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.inmobi.C7819a;

/* renamed from: com.iab.omid.library.inmobi.d.c */
public final class C7844c {
    /* renamed from: a */
    public static void m22010a(String str) {
        if (C7819a.f18892a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22011a(String str, Exception exc) {
        if ((C7819a.f18892a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
