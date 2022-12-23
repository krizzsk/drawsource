package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1418d;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1876b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.applovin.impl.adview.e */
public class C1529e extends WebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f1919a;

    /* renamed from: b */
    private final C2102v f1920b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1507b f1921c;

    public C1529e(C1507b bVar, C1969m mVar) {
        this.f1919a = mVar;
        this.f1920b = mVar.mo14509A();
        this.f1921c = bVar;
    }

    /* renamed from: a */
    private void m2840a(PointF pointF) {
        this.f1921c.mo13098a(pointF);
    }

    /* renamed from: a */
    private void m2841a(Uri uri, C1523d dVar) {
        String str;
        C2102v vVar;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (C2102v.m5104a()) {
                    C2102v vVar2 = this.f1920b;
                    vVar2.mo15012b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f1919a);
                C2053j.m5012c(this.f1921c.mo13117g(), (AppLovinAd) this.f1921c.mo13126p(), this.f1921c.mo13128r());
                return;
            } else if (TapjoyConstants.LOG_LEVEL_INTERNAL.equalsIgnoreCase(queryParameter2)) {
                if (C2102v.m5104a()) {
                    C2102v vVar3 = this.f1920b;
                    vVar3.mo15012b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (C2102v.m5104a()) {
                    C2102v vVar4 = this.f1920b;
                    vVar4.mo15012b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f1919a.mo14556af().mo14046a(new C2042a() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, (AppLovinWebViewActivity.EventListener) null);
                            C2053j.m4978a(C1529e.this.f1921c.mo13117g(), (AppLovinAd) C1529e.this.f1921c.mo13126p(), C1529e.this.f1921c.mo13128r());
                        }
                    }

                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            C2053j.m5007b(C1529e.this.f1921c.mo13117g(), (AppLovinAd) C1529e.this.f1921c.mo13126p(), C1529e.this.f1921c.mo13128r());
                            C1529e.this.f1919a.mo14556af().mo14048b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f1919a.mo14520L(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1919a.mo14597z());
                intent.setFlags(268435456);
                this.f1919a.mo14520L().startActivity(intent);
                return;
            } else if (C2102v.m5104a()) {
                vVar = this.f1920b;
                str = "Could not find load type in original uri";
            } else {
                return;
            }
        } else if (C2102v.m5104a()) {
            vVar = this.f1920b;
            str = "Could not find url to load from query in original uri";
        } else {
            return;
        }
        vVar.mo15016e("AdWebView", str);
    }

    /* renamed from: a */
    private void m2842a(Uri uri, C1839e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.f1919a.mo14528U().mo14764a(C2017h.m4735o().mo14798c(appendQueryParameter).mo14793a(false).mo14800c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).mo14794a());
        } else if (C2102v.m5104a()) {
            C2102v vVar = this.f1920b;
            vVar.mo15016e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* renamed from: a */
    private void m2843a(C1411a aVar, C1523d dVar) {
        C1418d aM = aVar.mo12836aM();
        if (aM != null) {
            C1427l.m2496a(aM.mo12892c(), this.f1921c.mo13127q());
            m2844a(dVar, aM.mo12890a());
        }
    }

    /* renamed from: a */
    private void m2844a(C1523d dVar, Uri uri) {
        C1839e currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.f1921c.mo13128r();
        if (r != null && currentAd != null) {
            C1879d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.mo14327b();
            }
            if (currentAd instanceof C1411a) {
                ((C1411a) currentAd).mo12863o().mo14101o();
            }
            this.f1921c.mo13103a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
        } else if (C2102v.m5104a()) {
            C2102v vVar = this.f1920b;
            vVar.mo15016e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    /* renamed from: b */
    private void m2846b() {
        this.f1921c.mo13122l();
    }

    /* renamed from: c */
    private void m2847c() {
        this.f1921c.mo13121k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1507b mo13164a() {
        return this.f1921c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0252, code lost:
        if (r6.mo12837aN() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0152, code lost:
        if (r6.mo12837aN() != false) goto L_0x0125;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13165a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            com.applovin.impl.adview.b r0 = r10.f1921c
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            java.lang.String r2 = "AdWebView"
            if (r0 == 0) goto L_0x0029
            com.applovin.impl.sdk.v r0 = r10.f1920b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Processing click on ad URL \""
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo15014c(r2, r3)
        L_0x0029:
            if (r12 == 0) goto L_0x0257
            boolean r0 = r11 instanceof com.applovin.impl.adview.C1523d
            if (r0 == 0) goto L_0x0257
            android.net.Uri r0 = android.net.Uri.parse(r12)
            com.applovin.impl.adview.d r11 = (com.applovin.impl.adview.C1523d) r11
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = r0.getHost()
            java.lang.String r5 = r0.getPath()
            com.applovin.impl.adview.b r6 = r10.f1921c
            com.applovin.impl.sdk.ad.e r6 = r6.mo13126p()
            if (r6 != 0) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "Unable to process click, ad not found!"
            r11.mo15016e(r2, r12)
        L_0x0056:
            return r1
        L_0x0057:
            android.graphics.PointF r7 = r11.getLastClickLocation()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r1
            boolean r8 = r6.mo14170J()
            r9 = 0
            if (r8 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0070
            r13 = r1
            goto L_0x0079
        L_0x0070:
            boolean r8 = r6.mo14171K()
            if (r8 == 0) goto L_0x0079
            if (r7 != 0) goto L_0x0079
            r13 = r9
        L_0x0079:
            java.lang.String r8 = "applovin"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0217
            java.lang.String r8 = "com.applovin.sdk"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0217
            java.lang.String r13 = "/adservice/close_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00b9
            com.applovin.impl.sdk.m r11 = r10.f1919a
            com.applovin.sdk.AppLovinSdkSettings r11 = r11.mo14586p()
            java.util.Map r11 = r11.getExtraParameters()
            java.lang.String r13 = "enable_close_url_ad_value"
            java.lang.Object r11 = r11.get(r13)
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r13 == 0) goto L_0x00b4
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            if (r11 == 0) goto L_0x00b4
            java.lang.String r11 = "close_url"
            r6.setMaxAdValue(r11, r12)
        L_0x00b4:
            r10.m2846b()
            goto L_0x0257
        L_0x00b9:
            java.lang.String r13 = "/adservice/expand_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00da
            boolean r12 = r6.mo14169I()
            if (r12 == 0) goto L_0x00d1
            if (r7 != 0) goto L_0x00d1
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "Skipping expand command without user interaction"
        L_0x00cd:
            r11.mo15016e(r2, r12)
            return r9
        L_0x00d1:
            android.graphics.PointF r11 = r11.getAndClearLastClickLocation()
            r10.m2840a((android.graphics.PointF) r11)
            goto L_0x0257
        L_0x00da:
            java.lang.String r13 = "/adservice/contract_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00e7
            r10.m2847c()
            goto L_0x0257
        L_0x00e7:
            java.lang.String r13 = "/adservice/no_op"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00f0
            return r1
        L_0x00f0:
            java.lang.String r13 = "/adservice/load_url"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x010a
            boolean r12 = r6.mo14169I()
            if (r12 == 0) goto L_0x0105
            if (r7 != 0) goto L_0x0105
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "Skipping URL load command without user interaction"
            goto L_0x00cd
        L_0x0105:
            r10.m2841a((android.net.Uri) r0, (com.applovin.impl.adview.C1523d) r11)
            goto L_0x0257
        L_0x010a:
            java.lang.String r13 = "/adservice/track_click_now"
            boolean r3 = r13.equals(r5)
            if (r3 == 0) goto L_0x0133
            boolean r12 = r6.mo14169I()
            if (r12 == 0) goto L_0x011f
            if (r7 != 0) goto L_0x011f
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "Skipping click tracking command without user interaction"
            goto L_0x00cd
        L_0x011f:
            boolean r12 = r6 instanceof com.applovin.impl.p028a.C1411a
            if (r12 == 0) goto L_0x012a
            com.applovin.impl.a.a r6 = (com.applovin.impl.p028a.C1411a) r6
        L_0x0125:
            r10.m2843a((com.applovin.impl.p028a.C1411a) r6, (com.applovin.impl.adview.C1523d) r11)
            goto L_0x0257
        L_0x012a:
            android.net.Uri r12 = android.net.Uri.parse(r13)
            r10.m2844a((com.applovin.impl.adview.C1523d) r11, (android.net.Uri) r12)
            goto L_0x0257
        L_0x0133:
            java.lang.String r13 = "/adservice/deeplink"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x015a
            boolean r12 = r6.mo14169I()
            if (r12 == 0) goto L_0x0148
            if (r7 != 0) goto L_0x0148
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "Skipping deep link plus command without user interaction"
            goto L_0x00cd
        L_0x0148:
            boolean r12 = r6 instanceof com.applovin.impl.p028a.C1411a
            if (r12 == 0) goto L_0x0155
            com.applovin.impl.a.a r6 = (com.applovin.impl.p028a.C1411a) r6
            boolean r12 = r6.mo12837aN()
            if (r12 == 0) goto L_0x0155
        L_0x0154:
            goto L_0x0125
        L_0x0155:
            r10.m2844a((com.applovin.impl.adview.C1523d) r11, (android.net.Uri) r0)
            goto L_0x0257
        L_0x015a:
            java.lang.String r11 = "/adservice/postback"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0167
            r10.m2842a((android.net.Uri) r0, (com.applovin.impl.sdk.p049ad.C1839e) r6)
            goto L_0x0257
        L_0x0167:
            com.applovin.impl.adview.b r11 = r10.f1921c
            com.applovin.impl.adview.g r11 = r11.mo13118h()
            if (r11 == 0) goto L_0x01e4
            java.lang.String r11 = "/video_began"
            boolean r11 = r11.equals(r5)
            r12 = 0
            if (r11 == 0) goto L_0x018e
            java.lang.String r11 = "duration"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r12)
            com.applovin.impl.adview.b r13 = r10.f1921c
            com.applovin.impl.adview.g r13 = r13.mo13118h()
            r13.mo13084a(r11)
            goto L_0x0257
        L_0x018e:
            java.lang.String r11 = "/video_completed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01a1
            com.applovin.impl.adview.b r11 = r10.f1921c
            com.applovin.impl.adview.g r11 = r11.mo13118h()
            r11.mo13085a_()
            goto L_0x0257
        L_0x01a1:
            java.lang.String r11 = "/video_progress"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01be
            java.lang.String r11 = "percent_viewed"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r12)
            com.applovin.impl.adview.b r13 = r10.f1921c
            com.applovin.impl.adview.g r13 = r13.mo13118h()
            r13.mo13086b(r11)
            goto L_0x0257
        L_0x01be:
            java.lang.String r11 = "/video_waiting"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01d1
            com.applovin.impl.adview.b r11 = r10.f1921c
            com.applovin.impl.adview.g r11 = r11.mo13118h()
            r11.mo13087b_()
            goto L_0x0257
        L_0x01d1:
            java.lang.String r11 = "/video_resumed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.adview.b r11 = r10.f1921c
            com.applovin.impl.adview.g r11 = r11.mo13118h()
            r11.mo13031c()
            goto L_0x0257
        L_0x01e4:
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown URL: "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.mo15015d(r2, r12)
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Path: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.mo15015d(r2, r12)
            goto L_0x0257
        L_0x0217:
            if (r13 == 0) goto L_0x0256
            java.util.List r12 = r6.mo14192aA()
            java.util.List r13 = r6.mo14193aB()
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x022d
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x023a
        L_0x022d:
            boolean r12 = r13.isEmpty()
            if (r12 != 0) goto L_0x0248
            boolean r12 = r13.contains(r4)
            if (r12 == 0) goto L_0x023a
            goto L_0x0248
        L_0x023a:
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.sdk.v r11 = r10.f1920b
            java.lang.String r12 = "URL is not whitelisted - bypassing click"
            r11.mo15016e(r2, r12)
            goto L_0x0257
        L_0x0248:
            boolean r12 = r6 instanceof com.applovin.impl.p028a.C1411a
            if (r12 == 0) goto L_0x0155
            com.applovin.impl.a.a r6 = (com.applovin.impl.p028a.C1411a) r6
            boolean r12 = r6.mo12837aN()
            if (r12 == 0) goto L_0x0155
            goto L_0x0154
        L_0x0256:
            return r9
        L_0x0257:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1529e.mo13165a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1920b;
            vVar.mo15014c("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1507b bVar = this.f1921c;
        if (bVar != null) {
            bVar.mo13099a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1507b bVar = this.f1921c;
        if (bVar != null) {
            C1839e p = bVar.mo13126p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (p != null) {
                this.f1919a.mo14553ac().mo14320a(p).mo14323a(C1876b.f3443z, str3).mo14324a();
            }
            if (C2102v.m5104a()) {
                this.f1920b.mo15016e("AdWebView", str3 + " for ad: " + p);
            }
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1507b bVar = this.f1921c;
        if (bVar != null) {
            C1839e p = bVar.mo13126p();
            this.f1919a.mo14553ac().mo14320a(p).mo14321a(C1876b.f3413A).mo14324a();
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1920b;
                vVar.mo15016e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
            }
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1507b bVar = this.f1921c;
        if (bVar != null) {
            C1839e p = bVar.mo13126p();
            String str = "Received SSL error: " + sslError;
            this.f1919a.mo14553ac().mo14320a(p).mo14323a(C1876b.f3415C, str).mo14324a();
            if (C2102v.m5104a()) {
                this.f1920b.mo15016e("AdWebView", str + " for ad: " + p);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f1921c == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (C2102v.m5104a()) {
            C2102v.m5110i("AdWebView", "Render process gone for ad: " + this.f1921c.mo13126p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        }
        C1839e p = this.f1921c.mo13126p();
        if (p != null) {
            this.f1919a.mo14553ac().mo14320a(p).mo14321a(C1876b.f3414B).mo14324a();
        }
        if (!((Boolean) this.f1919a.mo14534a(C1867b.f3314eF)).booleanValue()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f1919a.mo14534a(C1867b.f3316eH)).booleanValue()) {
            String valueOf = p != null ? String.valueOf(p.getAdIdNumber()) : "null";
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
        } else if (webView == null || !webView.equals(this.f1921c.mo13129s())) {
            return true;
        } else {
            this.f1921c.mo13116f();
            AppLovinAdSize b = this.f1921c.mo13111b();
            if (!Utils.isBML(b)) {
                return true;
            }
            this.f1921c.mo13110a(b);
            this.f1921c.mo13115e();
            return true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f1919a.mo14534a(C1867b.f3157bE)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return mo13165a(webView, url.toString(), hasGesture);
        }
        if (!C2102v.m5104a()) {
            return false;
        }
        this.f1920b.mo15016e("AdWebView", "No url found for request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return mo13165a(webView, str, true);
    }
}
