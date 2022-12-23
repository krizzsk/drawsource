package com.iab.omid.library.amazon.p233d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.amazon.C7667a;

/* renamed from: com.iab.omid.library.amazon.d.c */
public final class C7692c {
    /* renamed from: a */
    public static void m21324a(String str) {
        if (C7667a.f18541a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m21325a(String str, Exception exc) {
        if ((C7667a.f18541a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
