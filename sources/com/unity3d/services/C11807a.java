package com.unity3d.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;

/* renamed from: com.unity3d.services.a */
/* compiled from: UnityServices */
public class C11807a {
    /* renamed from: a */
    public static void m32235a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C12065a.m32839a();
        if (C12088d.m32932e() != C12088d.C12089a.NOT_INITIALIZED) {
            String str2 = "";
            String f = C12084a.m32909f();
            if (f != null && !f.equals(str)) {
                str2 = str2 + m32234a("Game ID", C12084a.m32909f(), str);
            }
            boolean s = C12088d.m32946s();
            if (s != z) {
                str2 = str2 + m32234a("Test Mode", Boolean.valueOf(s), Boolean.valueOf(z));
            }
            if (!TextUtils.isEmpty(str2)) {
                String str3 = "Unity Ads SDK failed to initialize due to already being initialized with different parameters" + str2;
                C12065a.m32851e(str3);
                if (iUnityAdsInitializationListener != null) {
                    iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, str3);
                    return;
                }
                return;
            }
        }
        C12088d.m32917a(iUnityAdsInitializationListener);
        if (C12088d.m32932e() == C12088d.C12089a.INITIALIZED_SUCCESSFULLY) {
            C12088d.m32947t();
        } else if (C12088d.m32932e() == C12088d.C12089a.INITIALIZED_FAILED) {
            C12088d.m32918a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
        } else {
            C12088d.C12089a e = C12088d.m32932e();
            C12088d.C12089a aVar = C12088d.C12089a.INITIALIZING;
            if (e != aVar) {
                C12088d.m32921a(aVar);
                C12084a.m32904a(str);
                C12088d.m32931d(z);
                if (!m32240d()) {
                    C12065a.m32848c("Error while initializing Unity Services: device is not supported");
                    C12088d.m32918a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to device is not supported");
                    return;
                }
                C12088d.m32916a(C12014b.m32733p());
                C12088d.m32925b(System.currentTimeMillis());
                if (str == null || str.length() == 0) {
                    C12065a.m32848c("Error while initializing Unity Services: empty game ID, halting Unity Ads init");
                    C12088d.m32918a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to empty game ID");
                } else if (context == null) {
                    C12065a.m32848c("Error while initializing Unity Services: null context, halting Unity Ads init");
                    C12088d.m32918a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to null context");
                } else {
                    if (context instanceof Application) {
                        C12084a.m32902a((Application) context);
                    } else if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.getApplication() != null) {
                            C12084a.m32902a(activity.getApplication());
                        } else {
                            C12065a.m32848c("Error while initializing Unity Services: cannot retrieve application from context, halting Unity Ads init");
                            C12088d.m32918a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application from context");
                            return;
                        }
                    } else {
                        C12065a.m32848c("Error while initializing Unity Services: invalid context, halting Unity Ads init");
                        C12088d.m32918a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
                        return;
                    }
                    if (z) {
                        C12065a.m32850d("Initializing Unity Services " + C12088d.m32942o() + " (" + C12088d.m32941n() + ") with game id " + str + " in test mode");
                    } else {
                        C12065a.m32850d("Initializing Unity Services " + C12088d.m32942o() + " (" + C12088d.m32941n() + ") with game id " + str + " in production mode");
                    }
                    C12088d.m32922a(C12088d.m32933f());
                    if (context.getApplicationContext() != null) {
                        C12084a.m32903a(context.getApplicationContext());
                        if (!EnvironmentCheck.isEnvironmentOk()) {
                            C12065a.m32848c("Error during Unity Services environment check, halting Unity Services init");
                            C12088d.m32918a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                            return;
                        }
                        C12065a.m32850d("Unity Services environment check OK");
                        InitializeThread.initialize(new Configuration());
                        return;
                    }
                    C12065a.m32848c("Error while initializing Unity Services: cannot retrieve application context, halting Unity Ads init");
                    C12088d.m32918a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application context");
                }
            }
        }
    }

    /* renamed from: b */
    public static String m32238b() {
        return C12088d.m32942o();
    }

    /* renamed from: c */
    public static boolean m32239c() {
        return C12088d.m32944q();
    }

    /* renamed from: d */
    public static boolean m32240d() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* renamed from: a */
    public static void m32236a(boolean z) {
        C12088d.m32922a(z);
    }

    /* renamed from: a */
    public static boolean m32237a() {
        return C12088d.m32933f();
    }

    /* renamed from: a */
    private static String m32234a(String str, Object obj, Object obj2) {
        String str2 = "null";
        String obj3 = obj == null ? str2 : obj.toString();
        if (obj2 != null) {
            str2 = obj2.toString();
        }
        return "\n - " + str + " Current: " + obj3 + " | Received: " + str2;
    }
}
