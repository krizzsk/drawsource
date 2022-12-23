package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.aa */
/* compiled from: BaseWebViewClient */
public class C5700aa extends WebViewClient {

    /* renamed from: a */
    private boolean f14318a;

    /* renamed from: b */
    public int f14319b = -1;

    /* renamed from: c */
    public boolean f14320c = false;
    /* access modifiers changed from: package-private */

    /* renamed from: d */
    public AtomicBoolean f14321d = new AtomicBoolean(false);

    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        StringBuilder sb = new StringBuilder("Loading error. Error code: ");
        sb.append(webResourceError.getErrorCode());
        sb.append(" Error msg:");
        sb.append(webResourceError.getDescription());
        sb.append(" Failing url:");
        sb.append(webResourceRequest.getUrl());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            m16733a(webView);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        m16733a(webView);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26 || !(webView instanceof C6301q)) {
            return false;
        }
        C6195ic.m18378a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        webView.destroy();
        return true;
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f14320c) {
            this.f14320c = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34361a(View view) {
        this.f14321d.set(true);
        view.postDelayed(new Runnable() {
            public final void run() {
                C5700aa.this.f14321d.set(false);
            }
        }, 1000);
    }

    /* renamed from: a */
    private void m16733a(WebView webView) {
        int i = this.f14319b;
        if (-1 == i) {
            return;
        }
        if (i > 0) {
            this.f14319b = i - 1;
        } else if (!this.f14318a) {
            new Handler(Looper.getMainLooper()).post(new C6300p(webView));
            this.f14318a = true;
            if (webView instanceof C6301q) {
                ((C6301q) webView).mo35593g();
            }
        }
    }
}
