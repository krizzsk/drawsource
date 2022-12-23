package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.inmobi.media.C6149gv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.r */
/* compiled from: RenderViewClient */
final class C6320r extends C5700aa {

    /* renamed from: e */
    private static final String f15992e = C6320r.class.getSimpleName();

    /* renamed from: a */
    short f15993a = -1;

    /* renamed from: f */
    private List<String> f15994f = new ArrayList();

    /* renamed from: g */
    private boolean f15995g = false;

    /* renamed from: h */
    private AtomicBoolean f15996h = new AtomicBoolean(false);

    C6320r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35691a() {
        this.f15994f.clear();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m18915a(webView, webResourceRequest.getUrl().toString());
        }
        return false;
    }

    /* renamed from: a */
    private boolean m18915a(WebView webView, String str) {
        if (!(webView instanceof C6301q)) {
            return false;
        }
        if (this.f15996h.get()) {
            return true;
        }
        C6301q qVar = (C6301q) webView;
        if (qVar.f15949i) {
            webView.loadUrl(str);
            return true;
        } else if (qVar.mo35628i() || qVar.f15943c || "about:blank".equals(str)) {
            qVar.getPlacementType();
            if (1 != qVar.getPlacementType()) {
                return m18916a(qVar, str);
            }
            if (!qVar.f15943c || !C6193ia.m18372a(str)) {
                return m18916a(qVar, str);
            }
            return false;
        } else {
            qVar.mo35584c("redirect");
            return true;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C6301q) {
            C6301q qVar = (C6301q) webView;
            this.f15995g = false;
            if (qVar.getMarkupType().equals("htmlUrl")) {
                qVar.mo35588d(qVar.getMraidJsString());
                this.f15995g = true;
            }
            qVar.setAndUpdateViewState("Loading");
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof C6301q) {
            C6301q qVar = (C6301q) webView;
            if (this.f15994f.contains(str) && !this.f15995g) {
                this.f15995g = true;
                qVar.mo35588d(qVar.getMraidJsString());
            }
            if ("Loading".equals(qVar.getViewState())) {
                qVar.getListener().mo34464e(qVar);
                qVar.mo35588d("window.imaiview.broadcastEvent('ready');");
                qVar.mo35588d("window.mraidview.broadcastEvent('ready');");
                if (qVar.getImpressionType() == 2) {
                    qVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    qVar.layout(0, 0, qVar.getMeasuredWidth(), qVar.getMeasuredHeight());
                    qVar.setDrawingCacheEnabled(true);
                    qVar.buildDrawingCache();
                }
                qVar.setAndUpdateViewState(qVar.getOriginalRenderView() == null ? "Default" : "Expanded");
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str.matches("(.*)phpserver/db(.*)")) {
            Intent intent = new Intent(C6149gv.C6150a.NETWORK_REQUEST_RESPONSE.toString());
            intent.putExtra("url", str);
            C6149gv.m18209a(intent);
        }
        if (webView instanceof C6301q) {
            C6301q qVar = (C6301q) webView;
            String url = qVar.getUrl();
            if (str != null && url != null && str.contains("/mraid.js") && !"about:blank".equals(url) && !url.startsWith("file:")) {
                if (!this.f15994f.contains(url)) {
                    this.f15994f.add(url);
                }
                if (!this.f15995g) {
                    this.f15995g = true;
                    qVar.mo35588d(qVar.getMraidJsString());
                }
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m18915a(webView, str);
    }

    /* renamed from: a */
    private boolean m18916a(C6301q qVar, String str) {
        if (!qVar.f15943c) {
            qVar.mo35629l();
        }
        boolean a = qVar.getLandingPageHandler().mo35514a((String) null, (String) null, str);
        if (qVar.f15943c && a) {
            mo34361a((View) qVar);
            if (!C6193ia.m18372a(str)) {
                if (qVar.canGoBack()) {
                    qVar.goBack();
                } else {
                    Activity fullScreenActivity = qVar.getFullScreenActivity();
                    if (fullScreenActivity != null) {
                        fullScreenActivity.finish();
                    }
                }
            }
        }
        return a;
    }
}
