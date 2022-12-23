package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.show.C11885c;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Show {
    @WebViewExposed
    public static void sendShowClickEvent(String str, String str2, C12160l lVar) {
        C11885c.m32405b().onUnityAdsShowClick(str2);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowCompleteEvent(String str, String str2, String str3, C12160l lVar) {
        C11885c.m32405b().onUnityAdsShowComplete(str2, UnityAds.UnityAdsShowCompletionState.valueOf(str3));
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowConsentEvent(String str, String str2, C12160l lVar) {
        C11885c.m32405b().mo70835b(str2);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowFailedEvent(String str, String str2, String str3, String str4, C12160l lVar) {
        C11885c.m32405b().onUnityAdsShowFailure(str2, UnityAds.UnityAdsShowError.valueOf(str3), str4);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowStartEvent(String str, String str2, C12160l lVar) {
        C11885c.m32405b().onUnityAdsShowStart(str2);
        lVar.mo71347a(new Object[0]);
    }
}
