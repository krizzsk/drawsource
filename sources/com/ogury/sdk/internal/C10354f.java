package com.ogury.sdk.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.InternalCore;
import com.ogury.sdk.OguryConfiguration;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.f */
/* compiled from: MonitoringInfoHelper.kt */
public final class C10354f {

    /* renamed from: a */
    private final OguryConfiguration f25689a;

    public C10354f(OguryConfiguration oguryConfiguration) {
        C10363m.m30060b(oguryConfiguration, "oguryConfiguration");
        this.f25689a = oguryConfiguration;
    }

    /* renamed from: a */
    public final String mo65203a() {
        return this.f25689a.getAssetKey();
    }

    /* renamed from: b */
    public static String m30045b() {
        String frameworkName = InternalCore.getFrameworkName();
        C10363m.m30058a((Object) frameworkName, "InternalCore.getFrameworkName()");
        return frameworkName;
    }

    /* renamed from: c */
    public final String mo65204c() {
        String packageName = this.f25689a.getContext().getPackageName();
        C10363m.m30058a((Object) packageName, "oguryConfiguration.context.packageName");
        return packageName;
    }

    /* renamed from: d */
    public final String mo65205d() throws PackageManager.NameNotFoundException {
        Context context = this.f25689a.getContext();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    /* renamed from: e */
    public final Map<String, String> mo65206e() {
        return this.f25689a.getMonitoringInfoList();
    }
}
