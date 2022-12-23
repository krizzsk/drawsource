package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.p249b.C7831d;
import com.iab.omid.library.inmobi.p249b.C7832e;
import com.iab.omid.library.inmobi.p251d.C7841a;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7845d;
import com.iab.omid.library.inmobi.p252e.C7849b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7849b f18953a = new C7849b((WebView) null);

    /* renamed from: b */
    private AdEvents f18954b;

    /* renamed from: c */
    private MediaEvents f18955c;

    /* renamed from: d */
    private C7850a f18956d;

    /* renamed from: e */
    private long f18957e;

    /* renamed from: com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher$a */
    enum C7850a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55217i();
    }

    /* renamed from: a */
    public void mo55194a() {
    }

    /* renamed from: a */
    public void mo55195a(float f) {
        C7832e.m21947a().mo55168a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55196a(WebView webView) {
        this.f18953a = new C7849b(webView);
    }

    /* renamed from: a */
    public void mo55197a(AdEvents adEvents) {
        this.f18954b = adEvents;
    }

    /* renamed from: a */
    public void mo55198a(AdSessionConfiguration adSessionConfiguration) {
        C7832e.m21947a().mo55175a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55199a(ErrorType errorType, String str) {
        C7832e.m21947a().mo55169a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55200a(C7825a aVar, AdSessionContext adSessionContext) {
        mo55201a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55201a(C7825a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7842b.m22000a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7842b.m22000a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7842b.m22000a(jSONObject2, "deviceInfo", C7841a.m21993d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7842b.m22000a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7842b.m22000a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7842b.m22000a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7842b.m22000a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7842b.m22000a(jSONObject4, "libraryVersion", "1.3.17-Inmobi");
        C7842b.m22000a(jSONObject4, "appId", C7831d.m21944a().mo55166b().getApplicationContext().getPackageName());
        C7842b.m22000a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7842b.m22000a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7842b.m22000a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7842b.m22000a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7832e.m21947a().mo55172a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55202a(MediaEvents mediaEvents) {
        this.f18955c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55203a(String str) {
        C7832e.m21947a().mo55171a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55204a(String str, long j) {
        if (j >= this.f18957e) {
            this.f18956d = C7850a.AD_STATE_VISIBLE;
            C7832e.m21947a().mo55179b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55205a(String str, JSONObject jSONObject) {
        C7832e.m21947a().mo55171a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55206a(JSONObject jSONObject) {
        C7832e.m21947a().mo55180b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55207a(boolean z) {
        if (mo55212e()) {
            C7832e.m21947a().mo55182c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55208b() {
        this.f18953a.clear();
    }

    /* renamed from: b */
    public void mo55209b(String str, long j) {
        if (j >= this.f18957e && this.f18956d != C7850a.AD_STATE_NOTVISIBLE) {
            this.f18956d = C7850a.AD_STATE_NOTVISIBLE;
            C7832e.m21947a().mo55179b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55210c() {
        return this.f18954b;
    }

    /* renamed from: d */
    public MediaEvents mo55211d() {
        return this.f18955c;
    }

    /* renamed from: e */
    public boolean mo55212e() {
        return this.f18953a.get() != null;
    }

    /* renamed from: f */
    public void mo55213f() {
        C7832e.m21947a().mo55167a(getWebView());
    }

    /* renamed from: g */
    public void mo55214g() {
        C7832e.m21947a().mo55178b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18953a.get();
    }

    /* renamed from: h */
    public void mo55216h() {
        C7832e.m21947a().mo55181c(getWebView());
    }

    /* renamed from: i */
    public void mo55217i() {
        this.f18957e = C7845d.m22012a();
        this.f18956d = C7850a.AD_STATE_IDLE;
    }
}
