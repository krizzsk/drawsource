package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ii */
/* compiled from: AppInfo */
public class C6205ii {

    /* renamed from: e */
    private static final String f15653e = C6205ii.class.getSimpleName();

    /* renamed from: a */
    public String f15654a;

    /* renamed from: b */
    public String f15655b;

    /* renamed from: c */
    public Map<String, String> f15656c;

    /* renamed from: d */
    public byte f15657d;

    /* renamed from: f */
    private String f15658f;

    /* renamed from: g */
    private String f15659g;

    /* renamed from: com.inmobi.media.ii$a */
    /* compiled from: AppInfo */
    static class C6206a {

        /* renamed from: a */
        static final C6205ii f15660a = new C6205ii((byte) 0);
    }

    /* synthetic */ C6205ii(byte b) {
        this();
    }

    private C6205ii() {
        this.f15656c = new HashMap();
        Context c = C6183hw.m18324c();
        try {
            PackageManager packageManager = c.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c.getPackageName(), 128);
            if (applicationInfo != null) {
                this.f15654a = applicationInfo.packageName;
                this.f15658f = applicationInfo.loadLabel(packageManager).toString();
                this.f15655b = packageManager.getInstallerPackageName(this.f15654a);
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(c.getPackageName(), 128);
            String str = null;
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (str == null || "".equals(str)) {
                    if (Build.VERSION.SDK_INT < 28) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(packageInfo.versionCode);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(packageInfo.getLongVersionCode());
                        str = sb2.toString();
                    }
                }
            }
            if (str != null && !"".equals(str)) {
                this.f15659g = str;
            }
        } catch (Exception unused) {
        }
        this.f15657d = m18419b();
        this.f15656c.put("u-appbid", this.f15654a);
        this.f15656c.put("u-appdnm", this.f15658f);
        this.f15656c.put("u-appver", this.f15659g);
        this.f15656c.put("u-appsecure", Byte.toString(this.f15657d));
    }

    /* renamed from: a */
    public static C6205ii m18418a() {
        return C6206a.f15660a;
    }

    /* renamed from: b */
    private static byte m18419b() {
        try {
            if (Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return 0;
            }
            return 1;
        } catch (Exception unused) {
            return 2;
        }
    }
}
