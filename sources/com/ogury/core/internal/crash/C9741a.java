package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.C9717ai;

/* renamed from: com.ogury.core.internal.crash.a */
/* compiled from: AppInfo.kt */
public final class C9741a {

    /* renamed from: a */
    public static final C9742a f24618a = new C9742a((byte) 0);

    /* renamed from: b */
    private final String f24619b;

    /* renamed from: c */
    private final String f24620c;

    /* renamed from: com.ogury.core.internal.crash.a$a */
    /* compiled from: AppInfo.kt */
    public static final class C9742a {
        private C9742a() {
        }

        public /* synthetic */ C9742a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C9741a m28171a(Context context) {
            PackageInfo packageInfo;
            String str;
            C9717ai.m28145b(context, "context");
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Exception e) {
                C9754i iVar = C9754i.f24647a;
                C9754i.m28207a(e);
                packageInfo = null;
            }
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                str = "";
            }
            String packageName = context.getPackageName();
            C9717ai.m28143a((Object) packageName, "context.packageName");
            return new C9741a(str, packageName);
        }
    }

    public C9741a(String str, String str2) {
        C9717ai.m28145b(str, "version");
        C9717ai.m28145b(str2, "packageName");
        this.f24619b = str;
        this.f24620c = str2;
    }

    /* renamed from: a */
    public final String mo64083a() {
        return this.f24619b;
    }

    /* renamed from: b */
    public final String mo64084b() {
        return this.f24620c;
    }
}
