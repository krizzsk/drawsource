package com.tapjoy.internal;

import android.text.TextUtils;

/* renamed from: com.tapjoy.internal.dq */
public final class C11368dq {
    /* renamed from: a */
    public static void m31091a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m31092a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m31090a(C11344cx cxVar) {
        if (cxVar.f27081e) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: b */
    public static void m31093b(C11344cx cxVar) {
        if (cxVar.f27080d) {
            m31090a(cxVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: c */
    public static void m31094c(C11344cx cxVar) {
        if (!(C11341cu.NATIVE == cxVar.f27077a.f27022a)) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
