package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.p261b.C7931d;
import com.iab.omid.library.mmadbridge.p261b.C7932e;
import com.iab.omid.library.mmadbridge.p263d.C7941a;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7945d;
import com.iab.omid.library.mmadbridge.p264e.C7949b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7949b f19181a = new C7949b((WebView) null);

    /* renamed from: b */
    private AdEvents f19182b;

    /* renamed from: c */
    private MediaEvents f19183c;

    /* renamed from: d */
    private C7950a f19184d;

    /* renamed from: e */
    private long f19185e;

    /* renamed from: com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher$a */
    enum C7950a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55601i();
    }

    /* renamed from: a */
    public void mo55578a() {
    }

    /* renamed from: a */
    public void mo55579a(float f) {
        C7932e.m22394a().mo55552a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55580a(WebView webView) {
        this.f19181a = new C7949b(webView);
    }

    /* renamed from: a */
    public void mo55581a(AdEvents adEvents) {
        this.f19182b = adEvents;
    }

    /* renamed from: a */
    public void mo55582a(AdSessionConfiguration adSessionConfiguration) {
        C7932e.m22394a().mo55559a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55583a(ErrorType errorType, String str) {
        C7932e.m22394a().mo55553a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55584a(C7925a aVar, AdSessionContext adSessionContext) {
        mo55585a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55585a(C7925a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7942b.m22448a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7942b.m22448a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7942b.m22448a(jSONObject2, "deviceInfo", C7941a.m22440d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7942b.m22448a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7942b.m22448a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7942b.m22448a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7942b.m22448a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7942b.m22448a(jSONObject4, "libraryVersion", "1.3.29-Mmadbridge");
        C7942b.m22448a(jSONObject4, "appId", C7931d.m22391a().mo55550b().getApplicationContext().getPackageName());
        C7942b.m22448a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7942b.m22448a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7942b.m22448a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7942b.m22448a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7932e.m22394a().mo55556a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55586a(MediaEvents mediaEvents) {
        this.f19183c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55587a(String str) {
        C7932e.m22394a().mo55555a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55588a(String str, long j) {
        if (j >= this.f19185e) {
            this.f19184d = C7950a.AD_STATE_VISIBLE;
            C7932e.m22394a().mo55563b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55589a(String str, JSONObject jSONObject) {
        C7932e.m22394a().mo55555a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55590a(JSONObject jSONObject) {
        C7932e.m22394a().mo55564b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55591a(boolean z) {
        if (mo55596e()) {
            C7932e.m22394a().mo55566c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55592b() {
        this.f19181a.clear();
    }

    /* renamed from: b */
    public void mo55593b(String str, long j) {
        if (j >= this.f19185e && this.f19184d != C7950a.AD_STATE_NOTVISIBLE) {
            this.f19184d = C7950a.AD_STATE_NOTVISIBLE;
            C7932e.m22394a().mo55563b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55594c() {
        return this.f19182b;
    }

    /* renamed from: d */
    public MediaEvents mo55595d() {
        return this.f19183c;
    }

    /* renamed from: e */
    public boolean mo55596e() {
        return this.f19181a.get() != null;
    }

    /* renamed from: f */
    public void mo55597f() {
        C7932e.m22394a().mo55551a(getWebView());
    }

    /* renamed from: g */
    public void mo55598g() {
        C7932e.m22394a().mo55562b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19181a.get();
    }

    /* renamed from: h */
    public void mo55600h() {
        C7932e.m22394a().mo55565c(getWebView());
    }

    /* renamed from: i */
    public void mo55601i() {
        this.f19185e = C7945d.m22461a();
        this.f19184d = C7950a.AD_STATE_IDLE;
    }
}
