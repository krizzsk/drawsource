package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.inmobi.publisher.a */
public class C7851a extends AdSessionStatePublisher {
    public C7851a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55196a(webView);
    }
}
