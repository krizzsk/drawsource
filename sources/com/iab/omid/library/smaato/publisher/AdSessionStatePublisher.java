package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.adsession.media.MediaEvents;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import p012c.C0693d;
import p012c.C0694e;
import p397e.C12464a;
import p397e.C12465b;
import p397e.C12468d;
import p400h.C12481b;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C12481b f19381a = new C12481b((WebView) null);

    /* renamed from: b */
    private AdEvents f19382b;

    /* renamed from: c */
    private MediaEvents f19383c;

    /* renamed from: d */
    private C8023a f19384d;

    /* renamed from: e */
    private long f19385e;

    /* renamed from: com.iab.omid.library.smaato.publisher.AdSessionStatePublisher$a */
    enum C8023a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55932a();
    }

    /* renamed from: a */
    public void mo55932a() {
        this.f19385e = C12468d.m33304a();
        this.f19384d = C8023a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void mo55933a(float f) {
        C0694e.m57a().mo10287a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55934a(WebView webView) {
        this.f19381a = new C12481b(webView);
    }

    /* renamed from: a */
    public void mo55935a(AdEvents adEvents) {
        this.f19382b = adEvents;
    }

    /* renamed from: a */
    public void mo55936a(AdSessionConfiguration adSessionConfiguration) {
        C0694e.m57a().mo10295a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55937a(ErrorType errorType, String str) {
        C0694e.m57a().mo10288a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55938a(C8021a aVar, AdSessionContext adSessionContext) {
        mo55939a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55939a(C8021a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C12465b.m33291a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C12465b.m33291a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C12465b.m33291a(jSONObject2, "deviceInfo", C12464a.m33283d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C12465b.m33291a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C12465b.m33291a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C12465b.m33291a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C12465b.m33291a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C12465b.m33291a(jSONObject4, "libraryVersion", "1.3.34-Smaato");
        C12465b.m33291a(jSONObject4, "appId", C0693d.m54b().mo10284a().getApplicationContext().getPackageName());
        C12465b.m33291a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C12465b.m33291a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C12465b.m33291a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C12465b.m33291a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C0694e.m57a().mo10292a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55940a(MediaEvents mediaEvents) {
        this.f19383c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55941a(String str) {
        C0694e.m57a().mo10291a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55942a(String str, long j) {
        C8023a aVar;
        if (j >= this.f19385e && this.f19384d != (aVar = C8023a.AD_STATE_NOTVISIBLE)) {
            this.f19384d = aVar;
            C0694e.m57a().mo10289a(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55943a(String str, JSONObject jSONObject) {
        C0694e.m57a().mo10291a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55944a(JSONObject jSONObject) {
        C0694e.m57a().mo10299b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55945a(boolean z) {
        if (mo55950e()) {
            C0694e.m57a().mo10298b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55946b() {
        this.f19381a.clear();
    }

    /* renamed from: b */
    public void mo55947b(String str, long j) {
        if (j >= this.f19385e) {
            this.f19384d = C8023a.AD_STATE_VISIBLE;
            C0694e.m57a().mo10289a(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55948c() {
        return this.f19382b;
    }

    /* renamed from: d */
    public MediaEvents mo55949d() {
        return this.f19383c;
    }

    /* renamed from: e */
    public boolean mo55950e() {
        return this.f19381a.get() != null;
    }

    /* renamed from: f */
    public void mo55951f() {
        C0694e.m57a().mo10286a(getWebView());
    }

    /* renamed from: g */
    public void mo55952g() {
        C0694e.m57a().mo10297b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19381a.get();
    }

    /* renamed from: h */
    public void mo55954h() {
        C0694e.m57a().mo10300c(getWebView());
    }

    /* renamed from: i */
    public void mo55955i() {
    }
}
