package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.amazon.publisher.a */
public class C7699a extends AdSessionStatePublisher {
    public C7699a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54603a(webView);
    }
}
