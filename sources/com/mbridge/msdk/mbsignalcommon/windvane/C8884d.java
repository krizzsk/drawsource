package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.d */
/* compiled from: IWebViewListener */
public interface C8884d {
    /* renamed from: a */
    void mo58276a(WebView webView, int i);

    /* renamed from: a */
    void mo58277a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo58279a(WebView webView, String str);

    /* renamed from: a */
    void mo58280a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    void mo58281b(WebView webView, int i);

    /* renamed from: b */
    boolean mo58282b(WebView webView, String str);

    /* renamed from: c */
    void mo58283c(WebView webView, int i);
}
