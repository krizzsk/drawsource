package com.bytedance.sdk.openadsdk.component.p139f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.openadsdk.component.C3178a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import java.io.File;

/* renamed from: com.bytedance.sdk.openadsdk.component.f.a */
/* compiled from: TTAppOpenUtils */
public class C3214a {

    /* renamed from: a */
    private static String f7565a;

    /* renamed from: a */
    public static File m9309a(String str, int i) {
        return m9308a(C3513m.m10963a(), C3178a.m9178a(C3513m.m10963a()).mo18827a(String.valueOf(i)), str);
    }

    /* renamed from: a */
    public static String m9310a() {
        if (TextUtils.isEmpty(f7565a)) {
            f7565a = C2397b.m5665a().getCacheDir() + File.separator + "proxy_cache";
        }
        return f7565a;
    }

    /* renamed from: b */
    public static File m9314b(String str, int i) {
        return m9308a(C3513m.m10963a(), C3178a.m9178a(C3513m.m10963a()).mo18843h(i), str);
    }

    /* renamed from: a */
    public static String m9311a(Context context, int i) {
        return C2894f.m8080a(context, C3948b.m12959c(), C3178a.m9178a(C3513m.m10963a()).mo18827a(String.valueOf(i))).getAbsolutePath();
    }

    /* renamed from: a */
    public static File m9308a(Context context, String str, String str2) {
        return C2894f.m8081a(context, C3948b.m12959c(), str, str2);
    }

    /* renamed from: a */
    public static void m9313a(File file) {
        if (file != null) {
            try {
                C2894f.m8085b(file);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m9312a(Context context) {
        try {
            C3178a.m9178a(context).mo18828a();
        } catch (Throwable unused) {
        }
    }
}
