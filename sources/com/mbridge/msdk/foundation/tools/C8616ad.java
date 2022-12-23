package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.tools.ad */
/* compiled from: StringUtils */
public final class C8616ad {
    /* renamed from: a */
    public static boolean m24717a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || "null".equals(str);
    }

    /* renamed from: b */
    public static boolean m24718b(String str) {
        return str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str);
    }
}
