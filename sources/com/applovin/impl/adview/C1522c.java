package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;

/* renamed from: com.applovin.impl.adview.c */
class C1522c extends WebChromeClient {

    /* renamed from: a */
    private final C2102v f1905a;

    /* renamed from: b */
    private final C1507b f1906b;

    public C1522c(C1507b bVar, C1969m mVar) {
        this.f1905a = mVar.mo14509A();
        this.f1906b = bVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1905a;
            vVar.mo15015d("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (!C2102v.m5104a()) {
            return true;
        }
        this.f1905a.mo15012b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2102v.m5104a()) {
            return true;
        }
        C2102v vVar = this.f1905a;
        vVar.mo15015d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2102v.m5104a()) {
            return true;
        }
        C2102v vVar = this.f1905a;
        vVar.mo15015d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2102v.m5104a()) {
            return true;
        }
        C2102v vVar = this.f1905a;
        vVar.mo15015d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        C1507b bVar;
        if (i == 100 && (bVar = this.f1906b) != null) {
            bVar.mo13099a(webView);
        }
    }
}
