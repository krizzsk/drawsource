package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.p273b.C8045d;
import com.iab.omid.library.vungle.p273b.C8046e;
import com.iab.omid.library.vungle.p275d.C8055a;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.p275d.C8059d;
import com.iab.omid.library.vungle.p276e.C8063b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8063b f19486a = new C8063b((WebView) null);

    /* renamed from: b */
    private AdEvents f19487b;

    /* renamed from: c */
    private MediaEvents f19488c;

    /* renamed from: d */
    private C8064a f19489d;

    /* renamed from: e */
    private long f19490e;

    /* renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    enum C8064a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo56134i();
    }

    /* renamed from: a */
    public void mo56111a() {
    }

    /* renamed from: a */
    public void mo56112a(float f) {
        C8046e.m22948a().mo56085a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56113a(WebView webView) {
        this.f19486a = new C8063b(webView);
    }

    /* renamed from: a */
    public void mo56114a(AdEvents adEvents) {
        this.f19487b = adEvents;
    }

    /* renamed from: a */
    public void mo56115a(AdSessionConfiguration adSessionConfiguration) {
        C8046e.m22948a().mo56092a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo56116a(ErrorType errorType, String str) {
        C8046e.m22948a().mo56086a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo56117a(C8039a aVar, AdSessionContext adSessionContext) {
        mo56118a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56118a(C8039a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C8056b.m23001a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C8056b.m23001a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C8056b.m23001a(jSONObject2, "deviceInfo", C8055a.m22994d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8056b.m23001a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C8056b.m23001a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C8056b.m23001a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C8056b.m23001a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C8056b.m23001a(jSONObject4, "libraryVersion", "1.3.21-Vungle");
        C8056b.m23001a(jSONObject4, "appId", C8045d.m22945a().mo56083b().getApplicationContext().getPackageName());
        C8056b.m23001a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C8056b.m23001a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C8056b.m23001a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C8056b.m23001a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C8046e.m22948a().mo56089a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo56119a(MediaEvents mediaEvents) {
        this.f19488c = mediaEvents;
    }

    /* renamed from: a */
    public void mo56120a(String str) {
        C8046e.m22948a().mo56088a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo56121a(String str, long j) {
        if (j >= this.f19490e) {
            this.f19489d = C8064a.AD_STATE_VISIBLE;
            C8046e.m22948a().mo56096b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo56122a(String str, JSONObject jSONObject) {
        C8046e.m22948a().mo56088a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo56123a(JSONObject jSONObject) {
        C8046e.m22948a().mo56097b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo56124a(boolean z) {
        if (mo56129e()) {
            C8046e.m22948a().mo56099c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo56125b() {
        this.f19486a.clear();
    }

    /* renamed from: b */
    public void mo56126b(String str, long j) {
        if (j >= this.f19490e && this.f19489d != C8064a.AD_STATE_NOTVISIBLE) {
            this.f19489d = C8064a.AD_STATE_NOTVISIBLE;
            C8046e.m22948a().mo56096b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo56127c() {
        return this.f19487b;
    }

    /* renamed from: d */
    public MediaEvents mo56128d() {
        return this.f19488c;
    }

    /* renamed from: e */
    public boolean mo56129e() {
        return this.f19486a.get() != null;
    }

    /* renamed from: f */
    public void mo56130f() {
        C8046e.m22948a().mo56084a(getWebView());
    }

    /* renamed from: g */
    public void mo56131g() {
        C8046e.m22948a().mo56095b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19486a.get();
    }

    /* renamed from: h */
    public void mo56133h() {
        C8046e.m22948a().mo56098c(getWebView());
    }

    /* renamed from: i */
    public void mo56134i() {
        this.f19490e = C8059d.m23013a();
        this.f19489d = C8064a.AD_STATE_IDLE;
    }
}
