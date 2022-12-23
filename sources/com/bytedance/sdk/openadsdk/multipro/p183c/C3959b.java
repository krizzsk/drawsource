package com.bytedance.sdk.openadsdk.multipro.p183c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p148d.C3395a;
import com.bytedance.sdk.openadsdk.multipro.C3908a;
import com.bytedance.sdk.openadsdk.multipro.C3964e;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.b */
/* compiled from: FrequentCallProviderImpl */
public class C3959b implements C3908a {
    /* renamed from: a */
    public int mo20772a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo20773a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo20774a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo20775a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo20776a() {
        return "t_frequent";
    }

    /* renamed from: b */
    public void mo20778b() {
    }

    /* renamed from: e */
    private static IListenerManager m13004e() {
        try {
            if (C3513m.m10963a() != null) {
                return C3909a.m12908a(C3513m.m10963a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m13001a(String str) {
        if (C3513m.m10963a() == null) {
            return false;
        }
        try {
            IListenerManager e = m13004e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m13005f() + "checkFrequency" + "?rit=" + String.valueOf(str))));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m13002c() {
        if (C3513m.m10963a() == null) {
            return false;
        }
        try {
            IListenerManager e = m13004e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m13005f() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static String m13003d() {
        if (C3513m.m10963a() == null) {
            return null;
        }
        try {
            IListenerManager e = m13004e();
            if (e != null) {
                return e.getType(Uri.parse(m13005f() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: f */
    private static String m13005f() {
        return C3964e.f10075b + "/" + "t_frequent" + "/";
    }

    /* renamed from: a */
    public String mo20777a(Uri uri) {
        C2905l.m8111b("FrequentCallProviderImpl", "get type uri: " + String.valueOf(uri));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return C3395a.m10104a().mo19376a(uri.getQueryParameter("rit")) ? "true" : "false";
        } else if ("isSilent".equals(str)) {
            return C3395a.m10104a().mo19377b() ? "true" : "false";
        } else {
            if ("maxRit".equals(str)) {
                return C3395a.m10104a().mo19378c();
            }
            return null;
        }
    }
}
