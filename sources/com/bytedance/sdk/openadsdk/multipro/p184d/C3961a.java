package com.bytedance.sdk.openadsdk.multipro.p184d;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.C3964e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3923g;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.a */
/* compiled from: SPMultiHelper */
public class C3961a {

    /* renamed from: a */
    private static Context f10071a;

    /* renamed from: a */
    public static boolean m13031a() {
        if (f10071a != null && C3513m.m10963a() != null) {
            return true;
        }
        C2905l.m8110b("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    /* renamed from: b */
    private static IListenerManager m13033b() {
        try {
            if (!m13031a()) {
                return null;
            }
            if (!C3948b.m12959c()) {
                return C3923g.m12941a();
            }
            return C3909a.m12908a(C3513m.m10963a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m13022a(Context context) {
        f10071a = context == null ? C3513m.m10963a() : context.getApplicationContext();
    }

    /* renamed from: c */
    private static String m13038c() {
        return C3964e.f10075b + "/" + "t_sp" + "/";
    }

    /* renamed from: b */
    private static String m13034b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    /* renamed from: a */
    public static synchronized void m13025a(String str, String str2, Boolean bool) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + "boolean" + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13024a(String str, String str2) {
        synchronized (C3961a.class) {
            m13029a((String) null, str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m13029a(String str, String str2, String str3) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + "string" + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13027a(String str, String str2, Integer num) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + "int" + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13028a(String str, String str2, Long l) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + Constants.LONG + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13026a(String str, String str2, Float f) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + "float" + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13030a(String str, String str2, Set<String> set) {
        synchronized (C3961a.class) {
            if (m13031a()) {
                try {
                    IListenerManager b = m13033b();
                    if (b != null) {
                        Uri parse = Uri.parse(m13038c() + "string_set" + "/" + str2 + m13034b(str));
                        ContentValues contentValues = new ContentValues();
                        HashSet hashSet = new HashSet();
                        for (String replace : set) {
                            hashSet.add(replace.replace(",", "__COMMA__"));
                        }
                        contentValues.put("value", hashSet.toString());
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static String m13035b(String str, String str2, String str3) {
        if (!m13031a()) {
            return str3;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + "string" + "/" + str2 + m13034b(str)));
                return (type == null || type.equals("null")) ? str3 : type;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static int m13020a(String str, String str2, int i) {
        if (!m13031a()) {
            return i;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + "int" + "/" + str2 + m13034b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Integer.parseInt(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: a */
    public static float m13019a(String str, String str2, float f) {
        if (!m13031a()) {
            return f;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + "float" + "/" + str2 + m13034b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Float.parseFloat(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return f;
    }

    /* renamed from: a */
    public static boolean m13032a(String str, String str2, boolean z) {
        if (!m13031a()) {
            return z;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + "boolean" + "/" + str2 + m13034b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Boolean.parseBoolean(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* renamed from: a */
    public static long m13021a(String str, String str2, long j) {
        if (!m13031a()) {
            return j;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + Constants.LONG + "/" + str2 + m13034b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Long.parseLong(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    /* renamed from: b */
    public static Set<String> m13036b(String str, String str2, Set<String> set) {
        if (!m13031a()) {
            return set;
        }
        try {
            IListenerManager b = m13033b();
            if (b != null) {
                String type = b.getType(Uri.parse(m13038c() + "string_set" + "/" + str2 + m13034b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        if (!type.matches("\\[.*\\]")) {
                            return set;
                        }
                        String[] split = type.substring(1, type.length() - 1).split(", ");
                        HashSet hashSet = new HashSet();
                        for (String replace : split) {
                            hashSet.add(replace.replace("__COMMA__", ", "));
                        }
                        return hashSet;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return set;
    }

    /* renamed from: b */
    public static void m13037b(String str, String str2) {
        if (m13031a()) {
            try {
                IListenerManager b = m13033b();
                if (b != null) {
                    b.delete(Uri.parse(m13038c() + Constants.LONG + "/" + str2 + m13034b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13023a(String str) {
        if (m13031a()) {
            try {
                IListenerManager b = m13033b();
                if (b != null) {
                    b.delete(Uri.parse(m13038c() + "clean" + m13034b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
