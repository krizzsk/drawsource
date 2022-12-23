package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.oguryco.publisher.a */
public class C8002a extends AdSessionStatePublisher {
    public C8002a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55795a(webView);
    }
}
