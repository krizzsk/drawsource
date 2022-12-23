package com.applovin.impl.sdk.p053e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.C1507b;
import com.applovin.impl.adview.C1523d;
import com.applovin.impl.adview.C1529e;
import com.applovin.impl.mediation.C1785h;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.q */
public class C1925q extends C1887a implements C1785h.C1786a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1834a f3583a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAdLoadListener f3584c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1523d f3585d;

    /* renamed from: com.applovin.impl.sdk.e.q$a */
    private class C1927a extends C1529e {
        private C1927a(C1969m mVar) {
            super((C1507b) null, mVar);
        }

        /* renamed from: a */
        private boolean m4328a(String str, C1867b<String> bVar) {
            for (String equalsIgnoreCase : C1925q.this.f3496b.mo14567b(bVar)) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo13165a(WebView webView, String str, boolean z) {
            if (C2102v.m5104a()) {
                C1925q qVar = C1925q.this;
                qVar.mo14367b("Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof C1523d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!m4328a(scheme, C1867b.f3231ca)) {
                return true;
            }
            if (m4328a(host, C1867b.f3232cb)) {
                if (C2102v.m5104a()) {
                    C1925q.this.mo14365a("Ad load succeeded");
                }
                if (C1925q.this.f3584c == null) {
                    return true;
                }
                C1925q.this.f3584c.adReceived(C1925q.this.f3583a);
            } else if (m4328a(host, C1867b.f3233cc)) {
                if (C2102v.m5104a()) {
                    C1925q.this.mo14365a("Ad load failed");
                }
                if (C1925q.this.f3584c == null) {
                    return true;
                }
                C1925q.this.f3584c.failedToReceiveAd(204);
            } else if (!C2102v.m5104a()) {
                return true;
            } else {
                C1925q.this.mo14370d("Unrecognized webview event");
                return true;
            }
            AppLovinAdLoadListener unused = C1925q.this.f3584c = null;
            return true;
        }
    }

    public C1925q(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskProcessJavaScriptTagAd", mVar);
        this.f3583a = new C1834a(jSONObject, jSONObject2, bVar, mVar);
        this.f3584c = appLovinAdLoadListener;
        mVar.mo14516H().mo13941a((C1785h.C1786a) this);
    }

    /* renamed from: a */
    public void mo13943a(C1583a aVar) {
        if (aVar.mo13365f().equalsIgnoreCase(this.f3583a.mo14174N())) {
            this.f3496b.mo14516H().mo13942b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f3584c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f3583a);
                this.f3584c = null;
            }
        }
    }

    public void run() {
        if (C2102v.m5104a()) {
            mo14365a("Rendering AppLovin ad #" + this.f3583a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    C1523d unused = C1925q.this.f3585d = new C1523d(new C1927a(C1925q.this.f3496b), C1925q.this.f3496b, C1925q.this.mo14372f());
                    C1925q.this.f3585d.loadDataWithBaseURL(C1925q.this.f3583a.mo14225aw(), C1925q.this.f3583a.mo12844b(), "text/html", (String) null, "");
                } catch (Throwable th) {
                    C1925q.this.f3496b.mo14516H().mo13942b(C1925q.this);
                    if (C2102v.m5104a()) {
                        C1925q.this.mo14366a("Failed to initialize WebView", th);
                    }
                    if (C1925q.this.f3584c != null) {
                        C1925q.this.f3584c.failedToReceiveAd(-1);
                        AppLovinAdLoadListener unused2 = C1925q.this.f3584c = null;
                    }
                }
            }
        });
    }
}
