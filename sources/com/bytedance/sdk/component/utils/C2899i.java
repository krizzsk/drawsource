package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.utils.i */
/* compiled from: LanguageUtils */
public class C2899i {

    /* renamed from: a */
    private static Context f6513a;

    /* renamed from: a */
    public static void m8095a(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration b = m8096b(context, str, str2);
            if (Build.VERSION.SDK_INT >= 17) {
                f6513a = context.createConfigurationContext(b);
            }
        } catch (Throwable th) {
            C2905l.m8110b(th.getMessage());
        }
        C2914t.m8152a(f6513a);
    }

    /* renamed from: b */
    private static Configuration m8096b(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(new Locale(str, str2));
        }
        return configuration;
    }
}
