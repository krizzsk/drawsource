package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.core.internal.C9717ai;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.f */
/* compiled from: CrashReportDao.kt */
public final class C9750f {

    /* renamed from: a */
    private final SharedPreferences f24640a;

    static {
        new C9751a((byte) 0);
    }

    public C9750f(Context context) {
        C9717ai.m28145b(context, "context");
        this.f24640a = context.getSharedPreferences("crash_report", 0);
    }

    /* renamed from: com.ogury.core.internal.crash.f$a */
    /* compiled from: CrashReportDao.kt */
    public static final class C9751a {
        private C9751a() {
        }

        public /* synthetic */ C9751a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64101a(String str, String str2) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(str2, "uploadUrl");
        this.f24640a.edit().putString(m28190e(str), str2).apply();
    }

    /* renamed from: a */
    public final String mo64099a(String str) {
        C9717ai.m28145b(str, "sdkKey");
        String string = this.f24640a.getString(m28190e(str), "");
        return string == null ? "" : string;
    }

    /* renamed from: e */
    private static String m28190e(String str) {
        return "url_" + str;
    }

    /* renamed from: a */
    public final void mo64102a(String str, boolean z) {
        C9717ai.m28145b(str, "sdkKey");
        this.f24640a.edit().putBoolean(m28191f(str), z).apply();
    }

    /* renamed from: b */
    public final boolean mo64104b(String str) {
        C9717ai.m28145b(str, "sdkKey");
        return this.f24640a.getBoolean(m28191f(str), false);
    }

    /* renamed from: f */
    private static String m28191f(String str) {
        return "sdk_state_" + str;
    }

    /* renamed from: b */
    public final void mo64103b(String str, String str2) {
        C9717ai.m28145b(str, "packageName");
        C9717ai.m28145b(str2, "sdkKey");
        this.f24640a.edit().putString(m28192g(str), str2).apply();
    }

    /* renamed from: c */
    public final String mo64105c(String str) {
        C9717ai.m28145b(str, "packageName");
        return this.f24640a.getString(m28192g(str), (String) null);
    }

    /* renamed from: g */
    private static String m28192g(String str) {
        return "package_" + str;
    }

    /* renamed from: d */
    public final void mo64106d(String str) {
        C9717ai.m28145b(str, "packageName");
        Set<String> a = mo64100a();
        if (a == null) {
            a = new LinkedHashSet<>();
        }
        if (!a.contains(str)) {
            a.add(str);
            this.f24640a.edit().putStringSet("sdk_packages", a).apply();
        }
    }

    /* renamed from: a */
    public final Set<String> mo64100a() {
        return this.f24640a.getStringSet("sdk_packages", (Set) null);
    }
}
