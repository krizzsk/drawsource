package com.ogury.p377ed.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.hn */
public final class C10092hn {
    /* renamed from: a */
    public static final void m29337a(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            webView.getSettings().setMixedContentMode(2);
        }
        if (Build.VERSION.SDK_INT <= 19) {
            webView.getSettings().setDatabasePath(webView.getContext().getDir("webviewdatabase", 0).getPath());
        }
        if (Build.VERSION.SDK_INT <= 18) {
            webView.getSettings().setSavePassword(true);
        }
        webView.getSettings().setLoadsImagesAutomatically(true);
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setSupportZoom(true);
        Context context = webView.getContext();
        C10263mq.m29879a((Object) context, "this.context");
        webView.setDownloadListener(new C10111hz(context));
    }

    /* renamed from: b */
    public static final String m29338b(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        Object tag = webView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        return str == null ? "" : str;
    }
}
