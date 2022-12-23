package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p052d.C1876b;

/* renamed from: com.applovin.impl.adview.f */
class C1531f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f1924a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f1925b = new WebViewRenderProcessClient() {
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C1523d) {
                C1839e currentAd = ((C1523d) webView).getCurrentAd();
                C1531f.this.f1924a.mo14553ac().mo14320a(currentAd).mo14321a(C1876b.f3416D).mo14324a();
                if (C2102v.m5104a()) {
                    C2102v A = C1531f.this.f1924a.mo14509A();
                    A.mo15016e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    C1531f(C1969m mVar) {
        this.f1924a = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebViewRenderProcessClient mo13176a() {
        return this.f1925b;
    }
}
