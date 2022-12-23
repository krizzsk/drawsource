package com.mbridge.msdk.mbsignalcommon.p339b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8884d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.b */
/* compiled from: DefaultWebViewListener */
public class C8853b implements C8884d {
    /* renamed from: a */
    public final void mo58280a(WebView webView, String str, Bitmap bitmap) {
        C8672v.m24874a("WindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo58282b(WebView webView, String str) {
        C8672v.m24874a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo58277a(WebView webView, int i, String str, String str2) {
        C8672v.m24874a("WindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C8672v.m24874a("WindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo58279a(WebView webView, String str) {
        C8672v.m24874a("WindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo58281b(WebView webView, int i) {
        C8672v.m24874a("WindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo58276a(WebView webView, int i) {
        C8672v.m24874a("WindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public void mo58283c(WebView webView, int i) {
        C8672v.m24874a("WindVaneWebView", "loadingResourceStatus");
    }
}
