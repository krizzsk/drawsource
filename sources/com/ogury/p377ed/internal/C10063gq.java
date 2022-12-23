package com.ogury.p377ed.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.ogury.ed.internal.gq */
public abstract class C10063gq extends WebViewClient {
    /* renamed from: a */
    public WebResourceResponse mo64778a(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        return null;
    }

    /* renamed from: b */
    public boolean mo64780b(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        return mo64778a(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C10263mq.m29879a((Object) uri, "request.url.toString()");
        return mo64778a(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C10263mq.m29879a((Object) uri, "request.url.toString()");
        return mo64780b(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        return mo64780b(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        mo64779a(i, str, str2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(webResourceRequest, "request");
        C10263mq.m29882b(webResourceError, "error");
        mo64779a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    /* renamed from: a */
    public void mo64779a(int i, String str, String str2) {
        String str3 = "onReceivedError: " + i + " description: " + str + " failingUrl: " + str2;
        C10046ga gaVar = C10046ga.f25280a;
        C10046ga.m29181a(str3);
    }
}
