package com.ogury.p377ed.internal;

import android.os.Build;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.io.File;

/* renamed from: com.ogury.ed.internal.gr */
public final class C10064gr {
    /* renamed from: a */
    public static final void m29214a(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        webView.getSettings().setAppCacheEnabled(true);
        File cacheDir = webView.getContext().getCacheDir();
        String absolutePath = cacheDir == null ? null : cacheDir.getAbsolutePath();
        if (absolutePath != null) {
            webView.getSettings().setAppCachePath(absolutePath);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
    }

    /* renamed from: b */
    public static final void m29217b(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setScrollContainer(false);
    }

    /* renamed from: c */
    public static final void m29218c(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    /* renamed from: d */
    public static final void m29219d(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.setWebChromeClient(new C10065a());
    }

    /* renamed from: com.ogury.ed.internal.gr$a */
    public static final class C10065a extends WebChromeClient {
        C10065a() {
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C10263mq.m29882b(webView, "view");
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            CharSequence extra = hitTestResult == null ? null : hitTestResult.getExtra();
            if (!(extra == null || C10312oc.m29949a(extra))) {
                webView.loadUrl(webView.getHitTestResult().getExtra());
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m29215a(WebView webView, C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(webView, "<this>");
        C10263mq.m29882b(ljVar, "callback");
        if (webView.getHeight() > 0 || webView.getWidth() > 0) {
            ljVar.mo64355a();
        } else {
            webView.post(new Runnable() {
                public final void run() {
                    C10064gr.m29216a(C10227lj.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29216a(C10227lj ljVar) {
        C10263mq.m29882b(ljVar, "$callback");
        ljVar.mo64355a();
    }

    /* renamed from: e */
    public static final boolean m29220e(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 19) {
            return webView.isAttachedToWindow();
        }
        return webView.getParent() != null;
    }

    /* renamed from: f */
    public static final void m29221f(WebView webView) {
        C10263mq.m29882b(webView, "<this>");
        if (!m29220e(webView)) {
            webView.destroy();
        }
    }
}
