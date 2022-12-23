package com.bytedance.sdk.component.adexpress.p094c;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.component.adexpress.c.b */
/* compiled from: ScreenUtils */
public class C2572b {

    /* renamed from: a */
    private static boolean f5473a;

    /* renamed from: a */
    public static int m6623a(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    /* renamed from: a */
    public static float m6622a(Context context, float f) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        return (f * m6629d(context)) + 0.5f;
    }

    /* renamed from: b */
    public static int m6626b(Context context, float f) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        float d = m6629d(context);
        if (d <= 0.0f) {
            d = 1.0f;
        }
        return (int) ((f / d) + 0.5f);
    }

    /* renamed from: c */
    public static float m6627c(Context context, float f) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        return f * m6629d(context);
    }

    /* renamed from: d */
    private static float m6629d(Context context) {
        try {
            if (f5473a) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((float) ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue()) / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m6624a(Context context) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m6625b(Context context) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: c */
    public static int m6628c(Context context) {
        if (context == null) {
            context = C2529a.m6339a().mo16550c().mo16558b();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }
}
