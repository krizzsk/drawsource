package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.utils.k */
/* compiled from: LoadUrlUtils */
public class C2901k {

    /* renamed from: a */
    private static final C2903a f6514a;

    /* renamed from: com.bytedance.sdk.component.utils.k$a */
    /* compiled from: LoadUrlUtils */
    private static class C2903a {
        private C2903a() {
        }

        /* renamed from: a */
        public void mo17815a(WebView webView, String str) {
            if (webView != null) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.k$b */
    /* compiled from: LoadUrlUtils */
    private static class C2904b extends C2903a {
        private C2904b() {
            super();
        }

        /* renamed from: a */
        public void mo17815a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, (ValueCallback) null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        webView.loadUrl(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f6514a = new C2904b();
        } else {
            f6514a = new C2903a();
        }
    }

    /* renamed from: a */
    public static void m8099a(WebView webView, String str) {
        f6514a.mo17815a(webView, str);
    }
}
