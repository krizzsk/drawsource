package com.inmobi.media;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: com.inmobi.media.ab */
/* compiled from: EmbeddedBrowserViewClient */
public final class C5702ab extends C5700aa {
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        String uri = webResourceRequest.getUrl().toString();
        if (webView != null) {
            return m16737a(webView, uri);
        }
        return false;
    }

    /* renamed from: a */
    private static void m16736a(String str) {
        if (C6193ia.m18371a(Uri.parse(str))) {
            try {
                Thread.sleep(1000);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m16735a(C6327y yVar) {
        C6322t userLeftApplicationListener;
        ViewParent parent = yVar.getParent();
        if ((parent instanceof C6323u) && (userLeftApplicationListener = ((C6323u) parent).getUserLeftApplicationListener()) != null) {
            userLeftApplicationListener.mo34435a_();
        }
    }

    /* renamed from: b */
    private static void m16738b(C6327y yVar) {
        ViewParent parent = yVar.getParent();
        if (parent instanceof C6323u) {
            ((C6323u) parent).mo35696a();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return false;
        }
        return m16737a(webView, str);
    }

    /* renamed from: a */
    private boolean m16737a(WebView webView, String str) {
        boolean z = true;
        if (this.f14321d.get()) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        C6175hq.m18296a();
        if (!C6175hq.m18298a(webView.getContext(), str)) {
            if (C6193ia.m18371a(parse)) {
                return false;
            }
            C6176hr.m18300a();
            if (!C6176hr.m18301a(webView.getContext(), str)) {
                m16736a(str);
                z = false;
            }
        }
        if (z) {
            mo34361a((View) webView);
            boolean z2 = webView instanceof C6327y;
            if (z2) {
                m16735a((C6327y) webView);
            }
            if (!C6193ia.m18372a(str)) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else if (z2) {
                    m16738b((C6327y) webView);
                }
            }
        }
        return z;
    }
}
