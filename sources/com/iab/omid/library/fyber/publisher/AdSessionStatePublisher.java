package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.p243b.C7780d;
import com.iab.omid.library.fyber.p243b.C7781e;
import com.iab.omid.library.fyber.p245d.C7790a;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7794d;
import com.iab.omid.library.fyber.p246e.C7798b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7798b f18837a = new C7798b((WebView) null);

    /* renamed from: b */
    private AdEvents f18838b;

    /* renamed from: c */
    private MediaEvents f18839c;

    /* renamed from: d */
    private C7799a f18840d;

    /* renamed from: e */
    private long f18841e;

    /* renamed from: com.iab.omid.library.fyber.publisher.AdSessionStatePublisher$a */
    enum C7799a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55022i();
    }

    /* renamed from: a */
    public void mo54999a() {
    }

    /* renamed from: a */
    public void mo55000a(float f) {
        C7781e.m21719a().mo54973a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55001a(WebView webView) {
        this.f18837a = new C7798b(webView);
    }

    /* renamed from: a */
    public void mo55002a(AdEvents adEvents) {
        this.f18838b = adEvents;
    }

    /* renamed from: a */
    public void mo55003a(AdSessionConfiguration adSessionConfiguration) {
        C7781e.m21719a().mo54980a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55004a(ErrorType errorType, String str) {
        C7781e.m21719a().mo54974a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55005a(C7774a aVar, AdSessionContext adSessionContext) {
        mo55006a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55006a(C7774a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7791b.m21773a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7791b.m21773a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7791b.m21773a(jSONObject2, "deviceInfo", C7790a.m21765d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7791b.m21773a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7791b.m21773a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7791b.m21773a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7791b.m21773a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7791b.m21773a(jSONObject4, "libraryVersion", "1.3.30-Fyber");
        C7791b.m21773a(jSONObject4, "appId", C7780d.m21716a().mo54971b().getApplicationContext().getPackageName());
        C7791b.m21773a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7791b.m21773a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7791b.m21773a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7791b.m21773a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7781e.m21719a().mo54977a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55007a(MediaEvents mediaEvents) {
        this.f18839c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55008a(String str) {
        C7781e.m21719a().mo54976a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55009a(String str, long j) {
        if (j >= this.f18841e) {
            this.f18840d = C7799a.AD_STATE_VISIBLE;
            C7781e.m21719a().mo54984b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55010a(String str, JSONObject jSONObject) {
        C7781e.m21719a().mo54976a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55011a(JSONObject jSONObject) {
        C7781e.m21719a().mo54985b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55012a(boolean z) {
        if (mo55017e()) {
            C7781e.m21719a().mo54987c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55013b() {
        this.f18837a.clear();
    }

    /* renamed from: b */
    public void mo55014b(String str, long j) {
        if (j >= this.f18841e && this.f18840d != C7799a.AD_STATE_NOTVISIBLE) {
            this.f18840d = C7799a.AD_STATE_NOTVISIBLE;
            C7781e.m21719a().mo54984b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55015c() {
        return this.f18838b;
    }

    /* renamed from: d */
    public MediaEvents mo55016d() {
        return this.f18839c;
    }

    /* renamed from: e */
    public boolean mo55017e() {
        return this.f18837a.get() != null;
    }

    /* renamed from: f */
    public void mo55018f() {
        C7781e.m21719a().mo54972a(getWebView());
    }

    /* renamed from: g */
    public void mo55019g() {
        C7781e.m21719a().mo54983b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18837a.get();
    }

    /* renamed from: h */
    public void mo55021h() {
        C7781e.m21719a().mo54986c(getWebView());
    }

    /* renamed from: i */
    public void mo55022i() {
        this.f18841e = C7794d.m21786a();
        this.f18840d = C7799a.AD_STATE_IDLE;
    }
}
