package com.fyber.inneractive.sdk.web;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.m */
public class C5369m extends WebChromeClient {
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.m16449d("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        int i = IAlog.f13936a;
        int i2 = IAlog.f13936a;
        if (i >= 1) {
            IAlog.m16444a(1, (Exception) null, consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m16449d("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m16449d("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m16449d("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.m16449d("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }
}
