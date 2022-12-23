package com.bytedance.sdk.component.p118e.p122d;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.e.d.d */
/* compiled from: NLogger */
public class C2869d {

    /* renamed from: a */
    private static boolean f6453a = false;

    /* renamed from: b */
    private static int f6454b = 4;

    /* renamed from: a */
    public static boolean m8003a() {
        return f6453a;
    }

    /* renamed from: a */
    public static void m8001a(String str) {
        m8002a("NetLog", str);
    }

    /* renamed from: a */
    public static void m8002a(String str, String str2) {
        if (f6453a && str2 != null && f6454b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8004b(String str, String str2) {
        if (f6453a && str2 != null && f6454b <= 4) {
            Log.i(str, str2);
        }
    }
}
