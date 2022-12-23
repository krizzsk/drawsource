package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b */
/* compiled from: MultiGlobalInfo */
public class C3948b {

    /* renamed from: a */
    public static boolean f10054a;

    /* renamed from: b */
    public static boolean f10055b;

    /* renamed from: a */
    public static void m12957a() {
        C3961a.m13025a("sp_multi_info", "is_support_multi_process", (Boolean) true);
        f10054a = true;
        f10055b = true;
    }

    /* renamed from: b */
    public static void m12958b() {
        f10054a = false;
        f10055b = true;
    }

    /* renamed from: c */
    public static boolean m12959c() {
        if (!f10055b) {
            f10054a = C3961a.m13032a("sp_multi_info", "is_support_multi_process", false);
            f10055b = true;
        }
        return f10054a;
    }
}
