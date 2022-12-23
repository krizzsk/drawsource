package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.C11807a;
import com.unity3d.services.ads.operation.load.C11869c;
import com.unity3d.services.ads.operation.load.C11882h;
import com.unity3d.services.ads.operation.show.C11885c;
import com.unity3d.services.ads.operation.show.C11897g;
import com.unity3d.services.ads.token.C11898a;
import com.unity3d.services.ads.token.C11913h;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.request.metrics.C12109b;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.bridge.C12158j;

/* renamed from: com.unity3d.services.ads.a */
/* compiled from: UnityAdsImplementation */
public final class C11808a {

    /* renamed from: a */
    private static Configuration f28649a;

    /* renamed from: b */
    private static C12158j f28650b = new C12158j();

    /* renamed from: a */
    public static void m32243a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C12065a.m32839a();
        C11807a.m32235a(context, str, z, iUnityAdsInitializationListener);
    }

    /* renamed from: b */
    public static String m32250b() {
        return C11913h.m32466c();
    }

    /* renamed from: c */
    public static String m32251c() {
        return C11807a.m32238b();
    }

    /* renamed from: d */
    public static boolean m32252d() {
        return C11807a.m32239c();
    }

    /* renamed from: e */
    public static boolean m32253e() {
        return C11807a.m32240d();
    }

    /* renamed from: a */
    public static void m32241a(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        m32242a(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    /* renamed from: a */
    public static void m32242a(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        if (!m32253e()) {
            m32244a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
        } else if (!m32252d()) {
            m32244a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not initialized");
        } else if (activity == null) {
            m32244a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
        } else {
            Configuration configuration = f28649a;
            if (configuration == null) {
                configuration = new Configuration();
            }
            C12084a.m32901a(activity);
            C11885c.m32405b().mo70810a(C12136a.m33103c(), new C11897g(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration));
        }
    }

    /* renamed from: a */
    private static void m32244a(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        C12120i.m33045a().mo71266a(C12109b.m33004a(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
        }
    }

    /* renamed from: a */
    public static void m32248a(boolean z) {
        C11807a.m32236a(z);
    }

    /* renamed from: a */
    public static boolean m32249a() {
        return C11807a.m32237a();
    }

    /* renamed from: a */
    public static void m32247a(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Configuration configuration = f28649a;
        if (configuration == null) {
            configuration = new Configuration();
        }
        C11869c.m32376b().mo70810a(f28650b, new C11882h(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration));
    }

    /* renamed from: a */
    public static void m32245a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (iUnityAdsTokenListener == null) {
            C12065a.m32850d("Please provide non-null listener to UnityAds.GetToken method");
        } else if (C12084a.m32908e() == null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady((String) null);
        } else {
            C11898a.m32434a().mo70854b(iUnityAdsTokenListener);
        }
    }

    /* renamed from: a */
    public static void m32246a(Configuration configuration) {
        f28649a = configuration;
    }
}
