package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.j */
/* compiled from: IdUtils */
public class C3472j {

    /* renamed from: a */
    private static String f8659a;

    /* renamed from: b */
    private static String f8660b;

    /* renamed from: c */
    private static String f8661c;

    /* renamed from: d */
    private static String f8662d;

    /* renamed from: e */
    private static boolean f8663e;

    /* renamed from: d */
    private static Context m10779d(Context context) {
        return context == null ? C3513m.m10963a() : context;
    }

    /* renamed from: a */
    public static String m10774a(Context context) {
        if (TextUtils.isEmpty(f8659a) && !f8663e) {
            synchronized (C3472j.class) {
                if (!f8663e) {
                    m10780e(context);
                }
            }
        }
        try {
            if (TextUtils.isEmpty(f8659a) && C3948b.m12959c()) {
                f8659a = C3388c.m10078a(m10779d(context)).mo19370b("did", (String) null);
            }
        } catch (Exception unused) {
        }
        return f8659a;
    }

    /* renamed from: b */
    public static String m10777b(Context context) {
        if (f8661c == null && !f8663e) {
            synchronized (C3472j.class) {
                if (!f8663e) {
                    m10780e(context);
                }
            }
        }
        return f8661c;
    }

    /* renamed from: c */
    public static String m10778c(Context context) {
        if (TextUtils.isEmpty(f8662d) && !f8663e) {
            synchronized (C3472j.class) {
                if (!f8663e) {
                    m10780e(context);
                }
            }
        }
        return f8662d;
    }

    /* renamed from: a */
    public static void m10775a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f8659a)) {
            C3388c.m10078a(context).mo19366a("did", str);
            f8659a = str;
        }
        if (!TextUtils.isEmpty(f8659a)) {
            C3579s.m11319a(f8659a);
        }
    }

    /* renamed from: e */
    private static void m10780e(Context context) {
        Context d;
        if (!f8663e && (d = m10779d(context)) != null) {
            f8659a = C3388c.m10078a(d).mo19370b("did", (String) null);
            f8660b = m10776b();
            f8661c = String.valueOf(Build.TIME);
            f8662d = C3388c.m10078a(d).mo19370b("uuid", (String) null);
            f8663e = true;
        }
    }

    /* renamed from: b */
    private static String m10776b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (C3886o.m12684e()) {
                sb.append("MIUI-");
            } else if (C3886o.m12679b()) {
                sb.append("FLYME-");
            } else {
                String n = C3886o.m12693n();
                if (C3886o.m12677a(n)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10773a() {
        Locale locale;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            if (locale != null) {
                str = locale.getLanguage();
            } else {
                str = "";
            }
            if (locale == null || !"zh".equals(str)) {
                return str;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
