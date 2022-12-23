package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.fyber.publisher.a */
public class C7800a extends AdSessionStatePublisher {
    public C7800a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55001a(webView);
    }
}
