package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.p225b.C7629d;
import com.iab.omid.library.adcolony.p225b.C7630e;
import com.iab.omid.library.adcolony.p227d.C7639a;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7643d;
import com.iab.omid.library.adcolony.p228e.C7647b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7647b f18486a = new C7647b((WebView) null);

    /* renamed from: b */
    private AdEvents f18487b;

    /* renamed from: c */
    private MediaEvents f18488c;

    /* renamed from: d */
    private C7648a f18489d;

    /* renamed from: e */
    private long f18490e;

    /* renamed from: com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher$a */
    enum C7648a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54425i();
    }

    /* renamed from: a */
    public void mo54402a() {
    }

    /* renamed from: a */
    public void mo54403a(float f) {
        C7630e.m21029a().mo54376a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54404a(WebView webView) {
        this.f18486a = new C7647b(webView);
    }

    /* renamed from: a */
    public void mo54405a(AdEvents adEvents) {
        this.f18487b = adEvents;
    }

    /* renamed from: a */
    public void mo54406a(AdSessionConfiguration adSessionConfiguration) {
        C7630e.m21029a().mo54383a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54407a(ErrorType errorType, String str) {
        C7630e.m21029a().mo54377a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54408a(C7623a aVar, AdSessionContext adSessionContext) {
        mo54409a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54409a(C7623a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7640b.m21083a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7640b.m21083a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7640b.m21083a(jSONObject2, "deviceInfo", C7639a.m21075d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7640b.m21083a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7640b.m21083a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7640b.m21083a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7640b.m21083a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7640b.m21083a(jSONObject4, "libraryVersion", "1.3.30-Adcolony");
        C7640b.m21083a(jSONObject4, "appId", C7629d.m21026a().mo54374b().getApplicationContext().getPackageName());
        C7640b.m21083a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7640b.m21083a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7640b.m21083a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7640b.m21083a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7630e.m21029a().mo54380a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54410a(MediaEvents mediaEvents) {
        this.f18488c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54411a(String str) {
        C7630e.m21029a().mo54379a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54412a(String str, long j) {
        if (j >= this.f18490e) {
            this.f18489d = C7648a.AD_STATE_VISIBLE;
            C7630e.m21029a().mo54387b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54413a(String str, JSONObject jSONObject) {
        C7630e.m21029a().mo54379a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54414a(JSONObject jSONObject) {
        C7630e.m21029a().mo54388b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54415a(boolean z) {
        if (mo54420e()) {
            C7630e.m21029a().mo54390c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54416b() {
        this.f18486a.clear();
    }

    /* renamed from: b */
    public void mo54417b(String str, long j) {
        C7648a aVar;
        if (j >= this.f18490e && this.f18489d != (aVar = C7648a.AD_STATE_NOTVISIBLE)) {
            this.f18489d = aVar;
            C7630e.m21029a().mo54387b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54418c() {
        return this.f18487b;
    }

    /* renamed from: d */
    public MediaEvents mo54419d() {
        return this.f18488c;
    }

    /* renamed from: e */
    public boolean mo54420e() {
        return this.f18486a.get() != null;
    }

    /* renamed from: f */
    public void mo54421f() {
        C7630e.m21029a().mo54375a(getWebView());
    }

    /* renamed from: g */
    public void mo54422g() {
        C7630e.m21029a().mo54386b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18486a.get();
    }

    /* renamed from: h */
    public void mo54424h() {
        C7630e.m21029a().mo54389c(getWebView());
    }

    /* renamed from: i */
    public void mo54425i() {
        this.f18490e = C7643d.m21096a();
        this.f18489d = C7648a.AD_STATE_IDLE;
    }
}
