package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.mmadbridge.publisher.a */
public class C7951a extends AdSessionStatePublisher {
    public C7951a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55580a(webView);
    }
}
