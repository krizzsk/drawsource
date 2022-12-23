package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.sdk.component.utils.t */
/* compiled from: ResourceHelp */
public final class C2914t {

    /* renamed from: a */
    private static String f6524a;

    /* renamed from: b */
    private static Resources f6525b;

    /* renamed from: c */
    private static Context f6526c;

    /* renamed from: a */
    public static void m8153a(String str) {
        f6524a = str;
    }

    /* renamed from: b */
    private static String m8155b(Context context) {
        if (f6524a == null) {
            f6524a = context.getPackageName();
        }
        return f6524a;
    }

    /* renamed from: a */
    private static int m8150a(Context context, String str, String str2) {
        if (f6525b == null) {
            f6525b = context.getResources();
        }
        return f6525b.getIdentifier(str, str2, m8155b(context));
    }

    /* renamed from: a */
    public static String m8151a(Context context, String str) {
        Context context2 = f6526c;
        if (context2 == null) {
            return context.getResources().getString(m8154b(context, str));
        }
        return context2.getResources().getString(m8154b(f6526c, str));
    }

    /* renamed from: a */
    public static void m8152a(Context context) {
        f6526c = context;
    }

    /* renamed from: b */
    public static int m8154b(Context context, String str) {
        return m8150a(context, str, "string");
    }

    /* renamed from: c */
    public static Drawable m8156c(Context context, String str) {
        return context.getResources().getDrawable(m8157d(context, str));
    }

    /* renamed from: d */
    public static int m8157d(Context context, String str) {
        return m8150a(context, str, "drawable");
    }

    /* renamed from: e */
    public static int m8158e(Context context, String str) {
        return m8150a(context, str, "id");
    }

    /* renamed from: f */
    public static int m8159f(Context context, String str) {
        return m8150a(context, str, "layout");
    }

    /* renamed from: g */
    public static int m8160g(Context context, String str) {
        return m8150a(context, str, "style");
    }

    /* renamed from: h */
    public static int m8161h(Context context, String str) {
        return m8150a(context, str, "attr");
    }

    /* renamed from: i */
    public static int m8162i(Context context, String str) {
        return m8150a(context, str, "dimen");
    }

    /* renamed from: j */
    public static int m8163j(Context context, String str) {
        return context.getResources().getColor(m8164k(context, str));
    }

    /* renamed from: k */
    public static int m8164k(Context context, String str) {
        return m8150a(context, str, "color");
    }

    /* renamed from: l */
    public static int m8165l(Context context, String str) {
        return m8150a(context, str, "anim");
    }

    /* renamed from: m */
    public static int m8166m(Context context, String str) {
        return m8150a(context, str, "integer");
    }

    /* renamed from: n */
    public static int m8167n(Context context, String str) {
        return context.getResources().getInteger(m8166m(context, str));
    }
}
