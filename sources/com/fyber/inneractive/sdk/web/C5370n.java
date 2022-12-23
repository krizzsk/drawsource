package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.trusted.sharing.ShareTarget;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5261d;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.web.n */
public class C5370n extends WebViewClient {

    /* renamed from: a */
    public final boolean f14174a;

    /* renamed from: b */
    public final int f14175b;

    /* renamed from: c */
    public final int f14176c;

    /* renamed from: d */
    public final int f14177d;

    /* renamed from: e */
    public C5346b f14178e;

    public C5370n(C5346b bVar, boolean z, int i, int i2, int i3) {
        this.f14178e = bVar;
        this.f14174a = z;
        this.f14175b = i;
        this.f14176c = i2;
        this.f14177d = i3;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m16449d("Resources to load: %s", str);
        int i = IAlog.f13936a;
        IAlog.m16444a(1, (Exception) null, "%s %s", "RESOURCES", str);
        C5346b bVar = this.f14178e;
        if (bVar != null) {
            C5338a aVar = (C5338a) bVar;
            aVar.getClass();
            if (!TextUtils.isEmpty(str) && str.startsWith("http://") && !C5310r.m16527a()) {
                IAlog.m16446a("%s Found a portential unsecure resource url: %s", IAlog.m16443a((Object) aVar), str);
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.m16449d("onPageFinished - url: %s", str);
        C5346b bVar = this.f14178e;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.m16449d("onPageStarted - url: %s", str);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.m16446a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.m16446a("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        C5338a aVar = (C5338a) this.f14178e;
        L l = aVar.f14084g;
        if (l != null) {
            l.mo24887a();
        }
        aVar.mo26429a(true);
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f14174a && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.m16449d("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            C5375r rVar = C5375r.f14185c;
            int i = this.f14175b;
            int i2 = this.f14176c;
            int i3 = this.f14177d;
            rVar.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), ShareTarget.METHOD_GET)) {
                C5376s sVar = (C5376s) rVar.f14186a.get(new C5377t(webResourceRequest));
                if (sVar != null) {
                    webResourceResponse = sVar.mo26518b();
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer b = C5261d.f13955b.mo26367b();
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                C5375r.m16634a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            C5376s sVar2 = null;
                            while (i3 > 0) {
                                try {
                                    sVar2 = C5375r.m16633a(httpURLConnection, b);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (sVar2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (sVar2 != null) {
                                try {
                                    if (sVar2.mo26517a()) {
                                        rVar.f14186a.put(new C5377t(webResourceRequest), sVar2);
                                    }
                                    webResourceResponse = sVar2.mo26518b();
                                    httpURLConnection.disconnect();
                                    C5261d.f13955b.f13956a.offer(b);
                                } catch (Throwable unused6) {
                                }
                            }
                            httpURLConnection.disconnect();
                            C5261d.f13955b.f13956a.offer(b);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.m16449d("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        C5346b bVar = this.f14178e;
        return bVar != null && ((IAmraidWebViewController) bVar).mo26342a(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m16449d("%sError: code = %d text = %s WebView = %s", IAlog.m16443a((Object) this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
        C5346b bVar = this.f14178e;
        if (bVar != null) {
            bVar.getClass();
        }
    }
}
