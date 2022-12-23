package com.saygames.saypromo.p378a;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.saygames.saypromo.a.Z0 */
public final class C10549Z0 implements C10542Y0 {

    /* renamed from: a */
    private final String f26051a;

    /* renamed from: b */
    private final String f26052b;

    C10549Z0(Context context) {
        PackageInfo packageInfo;
        this.f26051a = context.getPackageName();
        String str = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        this.f26052b = packageInfo != null ? packageInfo.versionName : str;
    }

    /* renamed from: a */
    public final String mo65406a() {
        return this.f26051a;
    }

    /* renamed from: b */
    public final String mo65407b() {
        return this.f26052b;
    }
}
