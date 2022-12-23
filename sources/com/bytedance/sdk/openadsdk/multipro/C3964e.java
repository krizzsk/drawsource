package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.C3513m;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.e */
/* compiled from: TTPathConst */
public class C3964e {

    /* renamed from: a */
    public static String f10074a = "com.bytedance.openadsdk";

    /* renamed from: b */
    public static String f10075b = ("content://" + f10074a + ".TTMultiProvider");

    static {
        m13064a();
    }

    /* renamed from: a */
    public static void m13064a() {
        if (C3513m.m10963a() != null) {
            f10074a = C3513m.m10963a().getPackageName();
            f10075b = "content://" + f10074a + ".TTMultiProvider";
        }
    }
}
