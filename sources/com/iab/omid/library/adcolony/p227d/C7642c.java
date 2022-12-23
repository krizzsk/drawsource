package com.iab.omid.library.adcolony.p227d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.C7617a;

/* renamed from: com.iab.omid.library.adcolony.d.c */
public final class C7642c {
    /* renamed from: a */
    public static void m21094a(String str) {
        if (C7617a.f18424a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21095a(String str, Exception exc) {
        if ((C7617a.f18424a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
