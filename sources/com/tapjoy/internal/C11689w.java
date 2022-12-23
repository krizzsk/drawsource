package com.tapjoy.internal;

import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.w */
public final class C11689w {
    /* renamed from: a */
    public static void m32060a(String str, String str2) {
        m32058a(6, str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m32061a(String str, String str2, Object... objArr) {
        m32059a(6, str, str2, objArr);
    }

    /* renamed from: a */
    public static void m32059a(int i, String str, String str2, Object... objArr) {
        C11662jp a = C11663jq.m31996a(str2, objArr);
        m32058a(i, str, a.f28108b, a.f28109c);
    }

    /* renamed from: a */
    public static void m32058a(int i, String str, @Nullable String str2, @Nullable Throwable th) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th != null) {
            Log.println(i, str, Log.getStackTraceString(th));
        }
    }
}
