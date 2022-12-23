package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.smaato.publisher.a */
public class C8024a extends AdSessionStatePublisher {
    public C8024a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55934a(webView);
    }
}
