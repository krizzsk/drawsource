package com.tapjoy.internal;

import android.webkit.WebView;

/* renamed from: com.tapjoy.internal.dv */
public final class C11374dv extends C11372du {
    public C11374dv(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo69815a(webView);
    }
}
