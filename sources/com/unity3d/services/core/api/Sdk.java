package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(C12160l lVar) {
        C12065a.m32845b("Unity Ads init: WebView called download");
        lVar.mo71347a(Integer.valueOf(InitializeThread.downloadLatestWebView().getValue()));
    }

    @WebViewExposed
    public static void getDebugMode(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12088d.m32933f()));
    }

    @WebViewExposed
    public static void initComplete(C12160l lVar) {
        C12065a.m32845b("Web Application initialized");
        C12088d.m32926b(true);
        C12136a.m33103c().mo71308a(true);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String str, Integer num, C12160l lVar) {
        C12136a.m33103c().mo71315b(str);
        C12136a.m33103c().mo71305a(num.intValue());
        C12136a.m33103c().mo71308a(false);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void loadComplete(C12160l lVar) {
        C12065a.m32845b("Web Application loaded");
        boolean z = true;
        C12136a.m33103c().mo71316b(true);
        Object[] objArr = new Object[18];
        objArr[0] = C12084a.m32909f();
        objArr[1] = Boolean.valueOf(C12088d.m32946s());
        objArr[2] = C12084a.m32905b();
        objArr[3] = C12084a.m32906c();
        objArr[4] = Integer.valueOf(C12088d.m32941n());
        objArr[5] = C12088d.m32942o();
        objArr[6] = Boolean.valueOf(C12084a.m32910g());
        objArr[7] = C12088d.m32930d();
        objArr[8] = C12136a.m33103c().mo71312b().getWebViewUrl();
        objArr[9] = C12136a.m33103c().mo71312b().getWebViewHash();
        objArr[10] = C12136a.m33103c().mo71312b().getWebViewVersion();
        objArr[11] = Long.valueOf(C12088d.m32935h());
        objArr[12] = Boolean.valueOf(C12088d.m32945r());
        objArr[13] = Boolean.TRUE;
        if (C12088d.m32937j() == null) {
            z = false;
        }
        objArr[14] = Boolean.valueOf(z);
        objArr[15] = Long.valueOf(C12014b.m32733p());
        objArr[16] = C12136a.m33103c().mo71312b().getStateId();
        objArr[17] = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        lVar.mo71347a(objArr);
    }

    @WebViewExposed
    public static void logDebug(String str, C12160l lVar) {
        C12065a.m32845b(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String str, C12160l lVar) {
        C12065a.m32848c(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String str, C12160l lVar) {
        C12065a.m32850d(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String str, C12160l lVar) {
        C12065a.m32851e(str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(C12160l lVar) {
        C12088d.m32929c(true);
        InitializeThread.initialize(C12136a.m33103c().mo71312b());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean bool, C12160l lVar) {
        C12088d.m32922a(bool.booleanValue());
        lVar.mo71347a(new Object[0]);
    }
}
