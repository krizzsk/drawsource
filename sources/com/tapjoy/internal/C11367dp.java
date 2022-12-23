package com.tapjoy.internal;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.tapjoy.internal.dp */
public final class C11367dp {
    /* renamed from: a */
    public static void m31088a(String str) {
        if (C11326cf.f27015a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m31089a(String str, Exception exc) {
        if (C11326cf.f27015a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }
}
