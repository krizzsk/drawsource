package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdEvents;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.adsession.ErrorType;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.adsession.media.MediaEvents;
import com.iab.omid.library.oguryco.p267b.C7982d;
import com.iab.omid.library.oguryco.p267b.C7983e;
import com.iab.omid.library.oguryco.p269d.C7992a;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7996d;
import com.iab.omid.library.oguryco.p270e.C8000b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8000b f19305a = new C8000b((WebView) null);

    /* renamed from: b */
    private AdEvents f19306b;

    /* renamed from: c */
    private MediaEvents f19307c;

    /* renamed from: d */
    private C8001a f19308d;

    /* renamed from: e */
    private long f19309e;

    /* renamed from: com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher$a */
    enum C8001a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55816i();
    }

    /* renamed from: a */
    public void mo55793a() {
    }

    /* renamed from: a */
    public void mo55794a(float f) {
        C7983e.m22627a().mo55767a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55795a(WebView webView) {
        this.f19305a = new C8000b(webView);
    }

    /* renamed from: a */
    public void mo55796a(AdEvents adEvents) {
        this.f19306b = adEvents;
    }

    /* renamed from: a */
    public void mo55797a(AdSessionConfiguration adSessionConfiguration) {
        C7983e.m22627a().mo55774a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55798a(ErrorType errorType, String str) {
        C7983e.m22627a().mo55768a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55799a(C7975a aVar, AdSessionContext adSessionContext) {
        mo55800a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55800a(C7975a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7993b.m22680a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7993b.m22680a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7993b.m22680a(jSONObject2, "deviceInfo", C7992a.m22673d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7993b.m22680a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7993b.m22680a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7993b.m22680a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7993b.m22680a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7993b.m22680a(jSONObject4, "libraryVersion", "1.3.1-Oguryco");
        C7993b.m22680a(jSONObject4, "appId", C7982d.m22624a().mo55765b().getApplicationContext().getPackageName());
        C7993b.m22680a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7993b.m22680a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7993b.m22680a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7993b.m22680a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7983e.m22627a().mo55771a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55801a(MediaEvents mediaEvents) {
        this.f19307c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55802a(String str) {
        C7983e.m22627a().mo55770a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55803a(String str, long j) {
        if (j >= this.f19309e) {
            this.f19308d = C8001a.AD_STATE_VISIBLE;
            C7983e.m22627a().mo55778b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55804a(String str, JSONObject jSONObject) {
        C7983e.m22627a().mo55770a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55805a(JSONObject jSONObject) {
        C7983e.m22627a().mo55779b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55806a(boolean z) {
        if (mo55811e()) {
            C7983e.m22627a().mo55781c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55807b() {
        this.f19305a.clear();
    }

    /* renamed from: b */
    public void mo55808b(String str, long j) {
        if (j >= this.f19309e && this.f19308d != C8001a.AD_STATE_NOTVISIBLE) {
            this.f19308d = C8001a.AD_STATE_NOTVISIBLE;
            C7983e.m22627a().mo55778b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55809c() {
        return this.f19306b;
    }

    /* renamed from: d */
    public MediaEvents mo55810d() {
        return this.f19307c;
    }

    /* renamed from: e */
    public boolean mo55811e() {
        return this.f19305a.get() != null;
    }

    /* renamed from: f */
    public void mo55812f() {
        C7983e.m22627a().mo55766a(getWebView());
    }

    /* renamed from: g */
    public void mo55813g() {
        C7983e.m22627a().mo55777b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19305a.get();
    }

    /* renamed from: h */
    public void mo55815h() {
        C7983e.m22627a().mo55780c(getWebView());
    }

    /* renamed from: i */
    public void mo55816i() {
        this.f19309e = C7996d.m22692a();
        this.f19308d = C8001a.AD_STATE_IDLE;
    }
}
