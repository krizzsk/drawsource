package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.C11869c;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String str, String str2, String str3, String str4, C12160l lVar) {
        C11869c.m32376b().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String str, String str2, C12160l lVar) {
        C11869c.m32376b().onUnityAdsAdLoaded(str2);
        lVar.mo71347a(new Object[0]);
    }
}
