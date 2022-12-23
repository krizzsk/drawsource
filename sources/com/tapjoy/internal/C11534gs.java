package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gs */
public final class C11534gs {
    /* renamed from: a */
    public static String m31571a(@Nullable String str) {
        return str == null ? "" : str;
    }

    @Nullable
    /* renamed from: b */
    public static String m31572b(@Nullable String str) {
        if (m31573c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m31573c(@Nullable String str) {
        return str == null || str.length() == 0;
    }
}
