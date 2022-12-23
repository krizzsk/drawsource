package com.bytedance.sdk.component.adexpress.p095d;

import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2531c;
import com.bytedance.sdk.component.p088a.C2526z;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.d.e */
/* compiled from: WebViewPool */
public class C2580e {

    /* renamed from: d */
    private static final byte[] f5501d = new byte[0];

    /* renamed from: e */
    private static int f5502e = 10;

    /* renamed from: g */
    private static volatile C2580e f5503g;

    /* renamed from: a */
    private List<SSWebView> f5504a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, C2578c> f5505b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C2579d> f5506c = new HashMap();

    /* renamed from: f */
    private final AtomicBoolean f5507f = new AtomicBoolean(false);

    private C2580e() {
        C2531c c = C2529a.m6339a().mo16550c();
        if (c != null) {
            f5502e = c.mo16566j();
        }
    }

    /* renamed from: a */
    public static C2580e m6660a() {
        if (f5503g == null) {
            synchronized (C2580e.class) {
                if (f5503g == null) {
                    f5503g = new C2580e();
                }
            }
        }
        return f5503g;
    }

    /* renamed from: b */
    public SSWebView mo16783b() {
        SSWebView remove;
        if (mo16787d() <= 0 || (remove = this.f5504a.remove(0)) == null) {
            return null;
        }
        C2905l.m8111b("WebViewPool", "get WebView from pool; current available count: " + mo16787d());
        return remove;
    }

    /* renamed from: a */
    public void mo16781a(SSWebView sSWebView) {
        if (sSWebView != null) {
            m6661e(sSWebView);
            sSWebView.mo17841b("SDK_INJECT_GLOBAL");
            mo16788d(sSWebView);
            mo16784b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo16784b(SSWebView sSWebView) {
        if (sSWebView != null) {
            if (this.f5504a.size() >= f5502e) {
                C2905l.m8111b("WebViewPool", "WebView pool is full，destroy webview");
                sSWebView.mo17862l();
            } else if (!this.f5504a.contains(sSWebView)) {
                this.f5504a.add(sSWebView);
                C2905l.m8111b("WebViewPool", "recycle WebView，current available count: " + mo16787d());
            }
        }
    }

    /* renamed from: c */
    public boolean mo16786c(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        C2905l.m8111b("WebViewPool", "WebView render fail and abandon");
        sSWebView.mo17862l();
        return true;
    }

    /* renamed from: c */
    public void mo16785c() {
        for (SSWebView next : this.f5504a) {
            if (next != null) {
                next.mo17862l();
            }
        }
        this.f5504a.clear();
    }

    /* renamed from: d */
    public int mo16787d() {
        return this.f5504a.size();
    }

    /* renamed from: e */
    public int mo16789e() {
        return this.f5504a.size();
    }

    /* renamed from: e */
    private void m6661e(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.mo17842c();
        sSWebView.setWebChromeClient((WebChromeClient) null);
        sSWebView.setWebViewClient((WebViewClient) null);
        sSWebView.setDownloadListener((DownloadListener) null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setUserAgentString("android_client");
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    /* renamed from: a */
    public void mo16782a(SSWebView sSWebView, C2577b bVar) {
        if (sSWebView != null && bVar != null) {
            C2578c cVar = this.f5505b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo16763a(bVar);
            } else {
                cVar = new C2578c(bVar);
                this.f5505b.put(Integer.valueOf(sSWebView.hashCode()), cVar);
            }
            sSWebView.mo17834a((Object) cVar, "SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: d */
    public void mo16788d(SSWebView sSWebView) {
        if (sSWebView != null) {
            C2578c cVar = this.f5505b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo16763a((C2577b) null);
            }
            sSWebView.mo17841b("SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: a */
    public void mo16779a(WebView webView, C2526z zVar, String str) {
        if (webView != null && zVar != null && !TextUtils.isEmpty(str)) {
            C2579d dVar = this.f5506c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo16777a(zVar);
            } else {
                dVar = new C2579d(zVar);
                this.f5506c.put(Integer.valueOf(webView.hashCode()), dVar);
            }
            webView.addJavascriptInterface(dVar, str);
        }
    }

    /* renamed from: a */
    public void mo16780a(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            C2579d dVar = this.f5506c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo16777a((C2526z) null);
            }
            webView.removeJavascriptInterface(str);
        }
    }
}
