package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.p237b.C7729d;
import com.iab.omid.library.applovin.p237b.C7730e;
import com.iab.omid.library.applovin.p239d.C7739a;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7743d;
import com.iab.omid.library.applovin.p240e.C7747b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7747b f18720a = new C7747b((WebView) null);

    /* renamed from: b */
    private AdEvents f18721b;

    /* renamed from: c */
    private MediaEvents f18722c;

    /* renamed from: d */
    private C7748a f18723d;

    /* renamed from: e */
    private long f18724e;

    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    enum C7748a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54823i();
    }

    /* renamed from: a */
    public void mo54800a() {
    }

    /* renamed from: a */
    public void mo54801a(float f) {
        C7730e.m21489a().mo54774a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54802a(WebView webView) {
        this.f18720a = new C7747b(webView);
    }

    /* renamed from: a */
    public void mo54803a(AdEvents adEvents) {
        this.f18721b = adEvents;
    }

    /* renamed from: a */
    public void mo54804a(AdSessionConfiguration adSessionConfiguration) {
        C7730e.m21489a().mo54781a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54805a(ErrorType errorType, String str) {
        C7730e.m21489a().mo54775a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54806a(C7723a aVar, AdSessionContext adSessionContext) {
        mo54807a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54807a(C7723a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7740b.m21543a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7740b.m21543a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7740b.m21543a(jSONObject2, "deviceInfo", C7739a.m21535d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7740b.m21543a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7740b.m21543a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7740b.m21543a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7740b.m21543a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7740b.m21543a(jSONObject4, "libraryVersion", "1.3.30-Applovin");
        C7740b.m21543a(jSONObject4, "appId", C7729d.m21486a().mo54772b().getApplicationContext().getPackageName());
        C7740b.m21543a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7740b.m21543a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7740b.m21543a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7740b.m21543a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7730e.m21489a().mo54778a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54808a(MediaEvents mediaEvents) {
        this.f18722c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54809a(String str) {
        C7730e.m21489a().mo54777a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54810a(String str, long j) {
        if (j >= this.f18724e) {
            this.f18723d = C7748a.AD_STATE_VISIBLE;
            C7730e.m21489a().mo54785b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54811a(String str, JSONObject jSONObject) {
        C7730e.m21489a().mo54777a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54812a(JSONObject jSONObject) {
        C7730e.m21489a().mo54786b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54813a(boolean z) {
        if (mo54818e()) {
            C7730e.m21489a().mo54788c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54814b() {
        this.f18720a.clear();
    }

    /* renamed from: b */
    public void mo54815b(String str, long j) {
        if (j >= this.f18724e && this.f18723d != C7748a.AD_STATE_NOTVISIBLE) {
            this.f18723d = C7748a.AD_STATE_NOTVISIBLE;
            C7730e.m21489a().mo54785b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54816c() {
        return this.f18721b;
    }

    /* renamed from: d */
    public MediaEvents mo54817d() {
        return this.f18722c;
    }

    /* renamed from: e */
    public boolean mo54818e() {
        return this.f18720a.get() != null;
    }

    /* renamed from: f */
    public void mo54819f() {
        C7730e.m21489a().mo54773a(getWebView());
    }

    /* renamed from: g */
    public void mo54820g() {
        C7730e.m21489a().mo54784b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18720a.get();
    }

    /* renamed from: h */
    public void mo54822h() {
        C7730e.m21489a().mo54787c(getWebView());
    }

    /* renamed from: i */
    public void mo54823i() {
        this.f18724e = C7743d.m21556a();
        this.f18723d = C7748a.AD_STATE_IDLE;
    }
}
