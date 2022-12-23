package com.bytedance.sdk.openadsdk.core;

import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;

/* renamed from: com.bytedance.sdk.openadsdk.core.q */
/* compiled from: SSWebSettings */
public class C3575q {
    /* renamed from: a */
    public static void m11308a(WebView webView) {
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th) {
                C2905l.m8110b(th.toString());
            }
        }
    }
}
