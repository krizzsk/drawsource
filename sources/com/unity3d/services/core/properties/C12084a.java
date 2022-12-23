package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.services.core.log.C12065a;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.unity3d.services.core.properties.a */
/* compiled from: ClientProperties */
public class C12084a {

    /* renamed from: a */
    private static final X500Principal f29469a = new X500Principal("CN=Android Debug,O=Android,C=US");

    /* renamed from: b */
    private static WeakReference<Activity> f29470b;

    /* renamed from: c */
    private static Context f29471c;

    /* renamed from: d */
    private static Application f29472d;

    /* renamed from: e */
    private static String f29473e;

    /* renamed from: a */
    public static Activity m32900a() {
        return (Activity) f29470b.get();
    }

    /* renamed from: b */
    public static String m32905b() {
        return f29471c.getPackageName();
    }

    /* renamed from: c */
    public static String m32906c() {
        String packageName = m32908e().getPackageName();
        PackageManager packageManager = m32908e().getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                return "FakeVersionName";
            }
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C12065a.m32842a("Error getting package info", (Exception) e);
            return null;
        }
    }

    /* renamed from: d */
    public static Application m32907d() {
        return f29472d;
    }

    /* renamed from: e */
    public static Context m32908e() {
        return f29471c;
    }

    /* renamed from: f */
    public static String m32909f() {
        return f29473e;
    }

    /* renamed from: g */
    public static boolean m32910g() {
        boolean z;
        if (m32908e() == null) {
            return false;
        }
        PackageManager packageManager = m32908e().getPackageManager();
        String packageName = m32908e().getPackageName();
        boolean z2 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                z = true;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            C12065a.m32842a("Could not find name", (Exception) e);
            z = false;
        }
        if (z2) {
            try {
                for (Signature byteArray : packageManager.getPackageInfo(packageName, 64).signatures) {
                    z = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray.toByteArray()))).getSubjectX500Principal().equals(f29469a);
                    if (z) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                C12065a.m32842a("Could not find name", (Exception) e2);
            } catch (CertificateException e3) {
                C12065a.m32842a("Certificate exception", (Exception) e3);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m32901a(Activity activity) {
        f29470b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static void m32903a(Context context) {
        f29471c = context;
    }

    /* renamed from: a */
    public static void m32902a(Application application) {
        f29472d = application;
    }

    /* renamed from: a */
    public static void m32904a(String str) {
        f29473e = str;
    }
}
