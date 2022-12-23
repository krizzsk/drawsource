package com.bytedance.sdk.component.utils;

import android.util.Log;
import com.bytedance.sdk.component.C2483a;

/* renamed from: com.bytedance.sdk.component.utils.l */
/* compiled from: Logger */
public class C2905l {

    /* renamed from: a */
    private static boolean f6515a = false;

    /* renamed from: b */
    private static int f6516b = 4;

    /* renamed from: c */
    private static C2483a f6517c;

    /* renamed from: a */
    public static void m8103a(int i) {
        f6516b = i;
    }

    /* renamed from: a */
    public static boolean m8108a() {
        return f6516b <= 3;
    }

    /* renamed from: b */
    public static void m8109b() {
        f6515a = true;
        m8103a(3);
    }

    /* renamed from: c */
    public static boolean m8116c() {
        return f6515a;
    }

    /* renamed from: a */
    public static void m8105a(String str, String str2) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16453a(str, str2);
        }
        if (f6515a && str2 != null && f6516b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: a */
    public static void m8104a(String str) {
        if (f6515a) {
            m8111b("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m8111b(String str, String str2) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16455b(str, str2);
        }
        if (f6515a && str2 != null && f6516b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m8106a(String str, String str2, Throwable th) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16455b(str, str2 + Log.getStackTraceString(th));
        }
        if (f6515a) {
            if (!(str2 == null && th == null) && f6516b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: c */
    public static void m8114c(String str, String str2) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16457c(str, str2);
        }
        if (f6515a && str2 != null && f6516b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m8107a(String str, Object... objArr) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16457c(str, m8102a(objArr));
        }
        if (f6515a && objArr != null && f6516b <= 4) {
            Log.v(str, m8102a(objArr));
        }
    }

    /* renamed from: d */
    public static void m8117d(String str, String str2) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16458d(str, str2);
        }
        if (f6515a && str2 != null && f6516b <= 5) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8112b(String str, String str2, Throwable th) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16454a(str, str2, th);
        }
        if (f6515a) {
            if (!(str2 == null && th == null) && f6516b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m8113b(String str, Object... objArr) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16458d(str, m8102a(objArr));
        }
        if (f6515a && objArr != null && f6516b <= 5) {
            Log.v(str, m8102a(objArr));
        }
    }

    /* renamed from: b */
    public static void m8110b(String str) {
        if (f6515a) {
            m8118e("Logger", str);
        }
    }

    /* renamed from: e */
    public static void m8118e(String str, String str2) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16459e(str, str2);
        }
        if (f6515a && str2 != null && f6516b <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m8115c(String str, String str2, Throwable th) {
        C2483a aVar = f6517c;
        if (aVar != null) {
            aVar.mo16456b(str, str2, th);
        }
        if (f6515a) {
            if (!(str2 == null && th == null) && f6516b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    private static String m8102a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
