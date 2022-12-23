package com.bytedance.sdk.openadsdk.p178l;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;

/* renamed from: com.bytedance.sdk.openadsdk.l.g */
/* compiled from: ExternalSpUtils */
public class C3876g {
    /* renamed from: a */
    public static void m12652a(String str) {
        m12653a("any_door_id", str);
    }

    /* renamed from: a */
    public static String m12651a() {
        return m12654b("any_door_id", (String) null);
    }

    /* renamed from: a */
    private static void m12653a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C3948b.m12959c()) {
                    C3961a.m13024a(str, str2);
                } else {
                    C3895u.m12724a("", C3513m.m10963a()).mo20752a(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static String m12654b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13035b((String) null, str, str2);
            }
            return C3895u.m12724a("", C3513m.m10963a()).mo20759b(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
