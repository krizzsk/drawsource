package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1418d;
import com.applovin.impl.p028a.C1422h;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2020i;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.d */
public class C1523d extends C1534h {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WebView f1907c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2102v f1908a;

    /* renamed from: b */
    private final C1969m f1909b;

    /* renamed from: d */
    private C1879d f1910d;

    /* renamed from: e */
    private C1839e f1911e;

    /* renamed from: f */
    private boolean f1912f;

    public C1523d(C1529e eVar, C1969m mVar, Context context) {
        this(eVar, mVar, context, false);
    }

    C1523d(C1529e eVar, C1969m mVar, Context context, boolean z) {
        super(context);
        if (mVar != null) {
            this.f1909b = mVar;
            this.f1908a = mVar.mo14509A();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(eVar);
            setWebChromeClient(new C1522c(eVar != null ? eVar.mo13164a() : null, mVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (C2049g.m4947i() && ((Boolean) mVar.mo14534a(C1867b.f3319eK)).booleanValue()) {
                setWebViewRenderProcessClient(new C1531f(mVar).mo13176a());
            }
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    if (!C2102v.m5104a()) {
                        return true;
                    }
                    C1523d.this.f1908a.mo15012b("AdWebView", "Received a LongClick event.");
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    private String m2829a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2831a(final C2020i iVar, final C1969m mVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                String a = C2020i.this.mo14701a();
                C1523d.m2835c();
                if (C1523d.f1907c == null) {
                    appLovinPostbackListener.onPostbackFailure(a, -1);
                    return;
                }
                if (C2020i.this.mo14706c() != null) {
                    a = StringUtils.appendQueryParameters(a, C2020i.this.mo14706c(), ((Boolean) mVar.mo14534a(C1867b.f3288df)).booleanValue());
                }
                String str = "al_firePostback('" + a + "');";
                if (C2049g.m4941c()) {
                    C1523d.f1907c.evaluateJavascript(str, (ValueCallback) null);
                } else {
                    C1523d.f1907c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a);
            }
        });
    }

    /* renamed from: a */
    private void m2832a(String str, String str2, String str3, C1969m mVar) {
        String a = m2829a(str3, str);
        if (StringUtils.isValidString(a)) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1908a;
                vVar.mo15012b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a);
            }
            loadDataWithBaseURL(str2, a, "text/html", (String) null, "");
            return;
        }
        String a2 = m2829a((String) mVar.mo14534a(C1867b.f3339eg), str);
        if (StringUtils.isValidString(a2)) {
            if (C2102v.m5104a()) {
                C2102v vVar2 = this.f1908a;
                vVar2.mo15012b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            }
            loadDataWithBaseURL(str2, a2, "text/html", (String) null, "");
            return;
        }
        if (C2102v.m5104a()) {
            C2102v vVar3 = this.f1908a;
            vVar3.mo15012b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    /* renamed from: b */
    private void m2834b(C1839e eVar) {
        Boolean n;
        Integer a;
        loadUrl("about:blank");
        int az = this.f1911e.mo14228az();
        if (az >= 0) {
            setLayerType(az, (Paint) null);
        }
        if (C2049g.m4940b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.mo14224av());
        }
        if (C2049g.m4941c() && eVar.mo14226ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        C1567v ay = eVar.mo14227ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = ay.mo13247b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean c = ay.mo13248c();
            if (c != null) {
                settings.setAllowFileAccess(c.booleanValue());
            }
            Boolean d = ay.mo13249d();
            if (d != null) {
                settings.setLoadWithOverviewMode(d.booleanValue());
            }
            Boolean e = ay.mo13250e();
            if (e != null) {
                settings.setUseWideViewPort(e.booleanValue());
            }
            Boolean f = ay.mo13251f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g = ay.mo13252g();
            if (g != null) {
                settings.setBuiltInZoomControls(g.booleanValue());
            }
            Boolean h = ay.mo13253h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean i = ay.mo13254i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = ay.mo13255j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = ay.mo13256k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = ay.mo13257l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = ay.mo13258m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (C2049g.m4942d() && (a = ay.mo13246a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (C2049g.m4943e() && (n = ay.mo13259n()) != null) {
                settings.setOffscreenPreRaster(n.booleanValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m2835c() {
        if (f1907c == null) {
            WebView tryToCreateWebView = Utils.tryToCreateWebView(C1969m.m4458M(), "postbacks");
            f1907c = tryToCreateWebView;
            if (tryToCreateWebView != null) {
                tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
                f1907c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
                f1907c.setWebViewClient(new WebViewClient() {
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (webView != C1523d.f1907c) {
                            return true;
                        }
                        C1523d.f1907c.destroy();
                        WebView unused = C1523d.f1907c = null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                C1523d.m2835c();
                            }
                        });
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo13149a(C1839e eVar) {
        C2102v vVar;
        String str;
        C2102v vVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        C1969m mVar;
        if (!this.f1912f) {
            this.f1911e = eVar;
            try {
                m2834b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof C1834a) {
                    C1834a aVar = (C1834a) eVar;
                    String b = aVar.mo12844b();
                    if (aVar.isOpenMeasurementEnabled()) {
                        b = this.f1909b.mo14562al().mo14083a(b);
                    }
                    loadDataWithBaseURL(eVar.mo14225aw(), b, "text/html", (String) null, "");
                    if (C2102v.m5104a()) {
                        vVar = this.f1908a;
                        str = "AppLovinAd rendered";
                    } else {
                        return;
                    }
                } else if (eVar instanceof C1411a) {
                    C1411a aVar2 = (C1411a) eVar;
                    C1418d aM = aVar2.mo12836aM();
                    if (aM != null) {
                        C1422h b2 = aM.mo12891b();
                        Uri b3 = b2.mo12914b();
                        String uri = b3 != null ? b3.toString() : "";
                        String c = b2.mo12915c();
                        String aO = aVar2.mo12838aO();
                        if (!StringUtils.isValidString(uri)) {
                            if (!StringUtils.isValidString(c)) {
                                if (C2102v.m5104a()) {
                                    vVar2 = this.f1908a;
                                    str2 = "Unable to load companion ad. No resources provided.";
                                    vVar2.mo15016e("AdWebView", str2);
                                    return;
                                }
                                return;
                            }
                        }
                        if (b2.mo12911a() == C1422h.C1423a.STATIC) {
                            if (C2102v.m5104a()) {
                                this.f1908a.mo15012b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            loadDataWithBaseURL(eVar.mo14225aw(), m2829a((String) this.f1909b.mo14534a(C1867b.f3338ef), uri), "text/html", (String) null, "");
                            return;
                        }
                        if (b2.mo12911a() == C1422h.C1423a.HTML) {
                            if (StringUtils.isValidString(c)) {
                                String a = m2829a(aO, c);
                                str3 = StringUtils.isValidString(a) ? a : c;
                                if (C2102v.m5104a()) {
                                    C2102v vVar3 = this.f1908a;
                                    vVar3.mo15012b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                }
                                aw = eVar.mo14225aw();
                                str4 = "text/html";
                                str5 = null;
                                str6 = "";
                            } else if (StringUtils.isValidString(uri)) {
                                if (C2102v.m5104a()) {
                                    this.f1908a.mo15012b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                aw2 = eVar.mo14225aw();
                                mVar = this.f1909b;
                                m2832a(uri, aw2, aO, mVar);
                                return;
                            } else {
                                return;
                            }
                        } else if (b2.mo12911a() == C1422h.C1423a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (C2102v.m5104a()) {
                                    this.f1908a.mo15012b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                aw2 = eVar.mo14225aw();
                                mVar = this.f1909b;
                                m2832a(uri, aw2, aO, mVar);
                                return;
                            } else if (StringUtils.isValidString(c)) {
                                String a2 = m2829a(aO, c);
                                str3 = StringUtils.isValidString(a2) ? a2 : c;
                                if (C2102v.m5104a()) {
                                    C2102v vVar4 = this.f1908a;
                                    vVar4.mo15012b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                }
                                aw = eVar.mo14225aw();
                                str4 = "text/html";
                                str5 = null;
                                str6 = "";
                            } else {
                                return;
                            }
                        } else if (C2102v.m5104a()) {
                            vVar2 = this.f1908a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                            vVar2.mo15016e("AdWebView", str2);
                            return;
                        } else {
                            return;
                        }
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (C2102v.m5104a()) {
                        vVar = this.f1908a;
                        str = "No companion ad provided.";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                vVar.mo15012b("AdWebView", str);
            } catch (Throwable th) {
                String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else if (C2102v.m5104a()) {
            C2102v.m5110i("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    /* renamed from: a */
    public void mo13150a(String str) {
        mo13151a(str, (Runnable) null);
    }

    /* renamed from: a */
    public void mo13151a(String str, Runnable runnable) {
        try {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1908a;
                vVar.mo15012b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f1908a.mo15013b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f1912f = true;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public C1839e getCurrentAd() {
        return this.f1911e;
    }

    public C1879d getStatsManagerHelper() {
        return this.f1910d;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setStatsManagerHelper(C1879d dVar) {
        this.f1910d = dVar;
    }
}
