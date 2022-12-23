package com.bytedance.sdk.component.p088a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.y */
/* compiled from: SerializeHelper */
class C2525y {

    /* renamed from: a */
    private static boolean f5332a;

    /* renamed from: a */
    static String m6325a() {
        return "";
    }

    /* renamed from: a */
    static String m6327a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":");
        sb.append(th instanceof C2513s ? ((C2513s) th).f5300a : 0);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static String m6326a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f5332a ? str.substring(1, str.length() - 1) : "";
        String str2 = "{\"code\":1,\"__data\":" + str;
        if (!substring.isEmpty()) {
            return str2 + "," + substring + "}";
        }
        return str2 + "}";
    }

    /* renamed from: a */
    static void m6328a(boolean z) {
        f5332a = z;
    }
}
