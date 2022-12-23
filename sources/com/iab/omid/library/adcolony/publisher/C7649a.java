package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
public class C7649a extends AdSessionStatePublisher {
    public C7649a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54404a(webView);
    }
}
