package com.mbridge.msdk.mbsignalcommon.p339b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8882b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.a */
/* compiled from: DefaultRVWebViewListener */
public class C8852a implements C8882b {
    /* renamed from: a */
    public void mo58562a(Object obj) {
        C8672v.m24874a("RVWindVaneWebView", "getEndScreenInfo");
    }

    /* renamed from: a */
    public void mo58561a(WebView webView, String str, String str2, int i, int i2) {
        C8672v.m24874a("RVWindVaneWebView", "loadAds");
    }

    /* renamed from: a */
    public void mo58563a(Object obj, String str) {
        C8672v.m24874a("RVWindVaneWebView", "operateComponent");
    }

    /* renamed from: a */
    public final void mo58280a(WebView webView, String str, Bitmap bitmap) {
        C8672v.m24874a("RVWindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo58282b(WebView webView, String str) {
        C8672v.m24874a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo58277a(WebView webView, int i, String str, String str2) {
        C8672v.m24874a("RVWindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C8672v.m24874a("RVWindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo58279a(WebView webView, String str) {
        C8672v.m24874a("RVWindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo58281b(WebView webView, int i) {
        C8672v.m24874a("RVWindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo58276a(WebView webView, int i) {
        C8672v.m24874a("RVWindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public final void mo58283c(WebView webView, int i) {
        C8672v.m24874a("RVWindVaneWebView", "loadingResourceStatus");
    }
}
