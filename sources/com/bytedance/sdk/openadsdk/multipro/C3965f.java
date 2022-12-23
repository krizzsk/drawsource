package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3910b;
import com.bytedance.sdk.openadsdk.multipro.p183c.C3952a;
import com.bytedance.sdk.openadsdk.multipro.p183c.C3959b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3963c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.f */
/* compiled from: TTProviderManager */
public class C3965f implements C3908a {

    /* renamed from: a */
    private static volatile C3965f f10076a;

    /* renamed from: b */
    private static WeakReference<Context> f10077b;

    /* renamed from: c */
    private static List<C3908a> f10078c;

    /* renamed from: c */
    private boolean m13067c(Uri uri) {
        return true;
    }

    /* renamed from: a */
    public String mo20776a() {
        return "";
    }

    /* renamed from: b */
    public void mo20778b() {
    }

    static {
        List<C3908a> synchronizedList = Collections.synchronizedList(new ArrayList());
        f10078c = synchronizedList;
        synchronizedList.add(new C3963c());
        f10078c.add(new C3910b());
        f10078c.add(new C3959b());
        f10078c.add(new C3952a());
        for (C3908a b : f10078c) {
            b.mo20778b();
        }
    }

    /* renamed from: a */
    public static C3965f m13065a(Context context) {
        if (context != null) {
            f10077b = new WeakReference<>(context.getApplicationContext());
        }
        if (f10076a == null) {
            synchronized (C3965f.class) {
                if (f10076a == null) {
                    f10076a = new C3965f();
                }
            }
        }
        return f10076a;
    }

    private C3965f() {
    }

    /* renamed from: b */
    private C3908a m13066b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!m13067c(uri)) {
            C2905l.m8111b("TTProviderManager", "uri is error1");
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            C2905l.m8111b("TTProviderManager", "uri is error2");
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            C2905l.m8111b("TTProviderManager", "uri is error3");
            return null;
        }
        for (C3908a next : f10078c) {
            if (str.equals(next.mo20776a())) {
                return next;
            }
        }
        C2905l.m8111b("TTProviderManager", "uri is error4");
        return null;
    }

    /* renamed from: a */
    public Cursor mo20774a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            C3908a b = m13066b(uri);
            if (b != null) {
                return b.mo20774a(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th) {
            C2905l.m8106a("TTProviderManager", "==provider query error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public String mo20777a(Uri uri) {
        try {
            C3908a b = m13066b(uri);
            if (b != null) {
                return b.mo20777a(uri);
            }
            return null;
        } catch (Throwable th) {
            C2905l.m8106a("TTProviderManager", "==provider getType error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public Uri mo20775a(Uri uri, ContentValues contentValues) {
        try {
            C3908a b = m13066b(uri);
            if (b != null) {
                return b.mo20775a(uri, contentValues);
            }
            return null;
        } catch (Throwable th) {
            C2905l.m8106a("TTProviderManager", "==provider insert error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public int mo20773a(Uri uri, String str, String[] strArr) {
        try {
            C3908a b = m13066b(uri);
            if (b != null) {
                return b.mo20773a(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C2905l.m8106a("TTProviderManager", "==provider delete error==", th);
            return 0;
        }
    }

    /* renamed from: a */
    public int mo20772a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            C3908a b = m13066b(uri);
            if (b != null) {
                return b.mo20772a(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C2905l.m8106a("TTProviderManager", "==provider update error==", th);
            return 0;
        }
    }
}
