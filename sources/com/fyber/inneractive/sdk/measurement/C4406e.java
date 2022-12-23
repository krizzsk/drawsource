package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.measurement.e */
public class C4406e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4407f f10805a;

    public C4406e(C4407f fVar) {
        this.f10805a = fVar;
    }

    public void run() {
        IAlog.m16446a("clearing webview", new Object[0]);
        WebView webView = this.f10805a.f10810e;
        if (webView != null) {
            webView.destroy();
            this.f10805a.f10810e = null;
        }
    }
}
