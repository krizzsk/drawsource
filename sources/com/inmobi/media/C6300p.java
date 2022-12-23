package com.inmobi.media;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.p */
/* compiled from: NetworkBlocker */
public final class C6300p implements Runnable {

    /* renamed from: a */
    private WeakReference<WebView> f15886a;

    public C6300p(WebView webView) {
        this.f15886a = new WeakReference<>(webView);
    }

    public final void run() {
        WebView webView = (WebView) this.f15886a.get();
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(true);
        }
    }
}
