package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.mbsignalcommon.windvane.C8884d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.b */
/* compiled from: BaseWebViewClient */
public class C8857b extends WebViewClient {

    /* renamed from: a */
    private C8856a f21827a;

    /* renamed from: b */
    private C8884d f21828b;

    /* renamed from: a */
    public final void mo58584a(C8856a aVar) {
        this.f21827a = aVar;
    }

    /* renamed from: b */
    public final C8856a mo58586b() {
        return this.f21827a;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C8856a aVar = this.f21827a;
        if (aVar != null && aVar.mo58583a(str)) {
            return true;
        }
        C8884d dVar = this.f21828b;
        if (dVar != null) {
            dVar.mo58282b(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C8884d dVar = this.f21828b;
        if (dVar != null) {
            dVar.mo58277a(webView, i, str, str2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C8884d dVar = this.f21828b;
        if (dVar != null) {
            dVar.mo58278a(webView, sslErrorHandler, sslError);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C8884d dVar = this.f21828b;
        if (dVar != null) {
            dVar.mo58279a(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo58585a(C8884d dVar) {
        this.f21828b = dVar;
    }
}
