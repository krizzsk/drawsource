package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.C11807a;
import com.unity3d.services.ads.C11808a;

public final class UnityAds {

    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    /* renamed from: com.unity3d.ads.UnityAds$a */
    static class C11700a implements IUnityAdsLoadListener {
        C11700a() {
        }

        public void onUnityAdsAdLoaded(String str) {
        }

        public void onUnityAdsFailedToLoad(String str, UnityAdsLoadError unityAdsLoadError, String str2) {
        }
    }

    public static boolean getDebugMode() {
        return C11808a.m32249a();
    }

    public static String getToken() {
        return C11808a.m32250b();
    }

    public static String getVersion() {
        return C11808a.m32251c();
    }

    public static void initialize(Context context, String str) {
        C11808a.m32243a(context, str, false, (IUnityAdsInitializationListener) null);
    }

    public static boolean isInitialized() {
        return C11807a.m32239c();
    }

    public static boolean isSupported() {
        return C11808a.m32253e();
    }

    @Deprecated
    public static void load(String str) {
        load(str, new C11700a());
    }

    public static void setDebugMode(boolean z) {
        C11808a.m32248a(z);
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        C11808a.m32241a(activity, str, (IUnityAdsShowListener) null);
    }

    public static void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        C11808a.m32245a(iUnityAdsTokenListener);
    }

    public static void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C11808a.m32243a(context, str, false, iUnityAdsInitializationListener);
    }

    public static void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        C11808a.m32247a(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        C11808a.m32241a(activity, str, iUnityAdsShowListener);
    }

    public static void initialize(Context context, String str, boolean z) {
        C11808a.m32243a(context, str, z, (IUnityAdsInitializationListener) null);
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        C11808a.m32247a(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    @Deprecated
    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        C11808a.m32242a(activity, str, unityAdsShowOptions, (IUnityAdsShowListener) null);
    }

    public static void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C11808a.m32243a(context, str, z, iUnityAdsInitializationListener);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        C11808a.m32242a(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
