package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.applovin.publisher.a */
public class C7749a extends AdSessionStatePublisher {
    public C7749a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54802a(webView);
    }
}
