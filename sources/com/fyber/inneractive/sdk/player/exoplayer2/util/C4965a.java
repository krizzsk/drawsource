package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.a */
public final class C4965a {
    /* renamed from: a */
    public static void m15049a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m15051b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m15050a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m15052b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m15046a(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static <T> T m15047a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: a */
    public static String m15048a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }
}
