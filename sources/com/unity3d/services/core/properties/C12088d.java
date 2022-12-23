package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.cache.C11983a;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.log.C12065a;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.unity3d.services.core.properties.d */
/* compiled from: SdkProperties */
public class C12088d {

    /* renamed from: a */
    private static String f29475a;

    /* renamed from: b */
    private static C11983a f29476b;

    /* renamed from: c */
    private static long f29477c;

    /* renamed from: d */
    private static long f29478d;

    /* renamed from: e */
    private static Configuration f29479e;

    /* renamed from: f */
    private static final LinkedHashSet<IUnityAdsInitializationListener> f29480f = new LinkedHashSet<>();

    /* renamed from: g */
    private static boolean f29481g = false;

    /* renamed from: h */
    private static boolean f29482h = false;

    /* renamed from: i */
    private static boolean f29483i = false;

    /* renamed from: j */
    private static boolean f29484j = false;

    /* renamed from: k */
    private static final AtomicReference<C12089a> f29485k = new AtomicReference<>(C12089a.NOT_INITIALIZED);

    /* renamed from: com.unity3d.services.core.properties.d$a */
    /* compiled from: SdkProperties */
    public enum C12089a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    /* renamed from: a */
    public static void m32918a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        m32921a(C12089a.INITIALIZED_FAILED);
        for (IUnityAdsInitializationListener onInitializationFailed : m32934g()) {
            onInitializationFailed.onInitializationFailed(unityAdsInitializationError, str);
        }
        m32948u();
    }

    /* renamed from: b */
    public static void m32926b(boolean z) {
        f29481g = z;
    }

    /* renamed from: c */
    public static String m32928c() {
        return "UnityAdsCache-";
    }

    /* renamed from: c */
    public static void m32929c(boolean z) {
        f29482h = z;
    }

    /* renamed from: d */
    public static void m32931d(boolean z) {
        f29483i = z;
    }

    /* renamed from: e */
    public static C12089a m32932e() {
        return f29485k.get();
    }

    /* renamed from: f */
    public static boolean m32933f() {
        return f29484j;
    }

    /* renamed from: g */
    public static IUnityAdsInitializationListener[] m32934g() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f29480f;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    /* renamed from: h */
    public static long m32935h() {
        return f29477c;
    }

    /* renamed from: i */
    public static long m32936i() {
        return f29478d;
    }

    /* renamed from: j */
    public static Configuration m32937j() {
        return f29479e;
    }

    /* renamed from: k */
    public static String m32938k() {
        return m32913a().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    /* renamed from: l */
    public static String m32939l() {
        return "UnityAdsStorage-";
    }

    /* renamed from: m */
    public static String m32940m() {
        return m32913a().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    /* renamed from: n */
    public static int m32941n() {
        return BuildConfig.VERSION_CODE;
    }

    /* renamed from: o */
    public static String m32942o() {
        return "4.3.0";
    }

    /* renamed from: p */
    private static String m32943p() {
        return m32942o();
    }

    /* renamed from: q */
    public static boolean m32944q() {
        return f29481g;
    }

    /* renamed from: r */
    public static boolean m32945r() {
        return f29482h;
    }

    /* renamed from: s */
    public static boolean m32946s() {
        return f29483i;
    }

    /* renamed from: t */
    public static void m32947t() {
        m32921a(C12089a.INITIALIZED_SUCCESSFULLY);
        for (IUnityAdsInitializationListener onInitializationComplete : m32934g()) {
            onInitializationComplete.onInitializationComplete();
        }
        m32948u();
    }

    /* renamed from: u */
    public static void m32948u() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f29480f;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    /* renamed from: b */
    public static String m32924b(Context context) {
        if (context == null) {
            return "configv2";
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString("com.unity3d.ads.configversion", "configv2");
            }
            return "configv2";
        } catch (PackageManager.NameNotFoundException unused) {
            C12065a.m32851e("Failed to retrieve application info for current package");
            return "configv2";
        }
    }

    /* renamed from: d */
    public static String m32930d() {
        if (f29475a == null) {
            f29475a = m32915a("release");
        }
        return f29475a;
    }

    /* renamed from: a */
    public static void m32921a(C12089a aVar) {
        f29485k.set(aVar);
    }

    /* renamed from: a */
    public static String m32915a(String str) {
        String str2 = "https://" + m32924b(C12084a.m32908e()) + ".unityads.unity3d.com/webview/";
        if (m32927b(C12014b.m32742y())) {
            str2 = "https://" + m32924b(C12084a.m32908e()) + ".unityads.unitychina.cn/webview/";
        }
        return str2 + m32943p() + "/" + str + "/config.json";
    }

    /* renamed from: b */
    public static C11983a m32923b() {
        return f29476b;
    }

    /* renamed from: b */
    public static void m32925b(long j) {
        f29478d = j;
    }

    /* renamed from: b */
    public static boolean m32927b(String str) {
        return str.equalsIgnoreCase("CN") || str.equalsIgnoreCase("CHN");
    }

    /* renamed from: a */
    public static void m32920a(Configuration configuration) {
        f29479e = configuration;
    }

    /* renamed from: a */
    public static File m32913a() {
        return m32914a(C12084a.m32908e());
    }

    /* renamed from: a */
    public static File m32914a(Context context) {
        if (f29476b == null) {
            m32919a(new C11983a("UnityAdsCache"));
        }
        return f29476b.mo71024a(context);
    }

    /* renamed from: a */
    public static void m32919a(C11983a aVar) {
        f29476b = aVar;
    }

    /* renamed from: a */
    public static void m32916a(long j) {
        f29477c = j;
    }

    /* renamed from: a */
    public static void m32922a(boolean z) {
        f29484j = z;
        if (z) {
            C12065a.m32840a(8);
        } else {
            C12065a.m32840a(4);
        }
    }

    /* renamed from: a */
    public static void m32917a(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener != null) {
            LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f29480f;
            synchronized (linkedHashSet) {
                linkedHashSet.add(iUnityAdsInitializationListener);
            }
        }
    }
}
