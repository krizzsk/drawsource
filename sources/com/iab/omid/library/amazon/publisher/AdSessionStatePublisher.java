package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.media.MediaEvents;
import com.iab.omid.library.amazon.p231b.C7679d;
import com.iab.omid.library.amazon.p231b.C7680e;
import com.iab.omid.library.amazon.p233d.C7689a;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.p233d.C7693d;
import com.iab.omid.library.amazon.p234e.C7697b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7697b f18603a = new C7697b((WebView) null);

    /* renamed from: b */
    private AdEvents f18604b;

    /* renamed from: c */
    private MediaEvents f18605c;

    /* renamed from: d */
    private C7698a f18606d;

    /* renamed from: e */
    private long f18607e;

    /* renamed from: com.iab.omid.library.amazon.publisher.AdSessionStatePublisher$a */
    enum C7698a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54624i();
    }

    /* renamed from: a */
    public void mo54601a() {
    }

    /* renamed from: a */
    public void mo54602a(float f) {
        C7680e.m21259a().mo54575a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54603a(WebView webView) {
        this.f18603a = new C7697b(webView);
    }

    /* renamed from: a */
    public void mo54604a(AdEvents adEvents) {
        this.f18604b = adEvents;
    }

    /* renamed from: a */
    public void mo54605a(AdSessionConfiguration adSessionConfiguration) {
        C7680e.m21259a().mo54582a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54606a(ErrorType errorType, String str) {
        C7680e.m21259a().mo54576a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54607a(C7673a aVar, AdSessionContext adSessionContext) {
        mo54608a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54608a(C7673a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7690b.m21313a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7690b.m21313a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7690b.m21313a(jSONObject2, "deviceInfo", C7689a.m21305d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7690b.m21313a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7690b.m21313a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7690b.m21313a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7690b.m21313a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7690b.m21313a(jSONObject4, "libraryVersion", "1.3.28-Amazon");
        C7690b.m21313a(jSONObject4, "appId", C7679d.m21256a().mo54573b().getApplicationContext().getPackageName());
        C7690b.m21313a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7690b.m21313a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7690b.m21313a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7690b.m21313a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7680e.m21259a().mo54579a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54609a(MediaEvents mediaEvents) {
        this.f18605c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54610a(String str) {
        C7680e.m21259a().mo54578a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54611a(String str, long j) {
        if (j >= this.f18607e) {
            this.f18606d = C7698a.AD_STATE_VISIBLE;
            C7680e.m21259a().mo54586b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54612a(String str, JSONObject jSONObject) {
        C7680e.m21259a().mo54578a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54613a(JSONObject jSONObject) {
        C7680e.m21259a().mo54587b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54614a(boolean z) {
        if (mo54619e()) {
            C7680e.m21259a().mo54589c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54615b() {
        this.f18603a.clear();
    }

    /* renamed from: b */
    public void mo54616b(String str, long j) {
        if (j >= this.f18607e && this.f18606d != C7698a.AD_STATE_NOTVISIBLE) {
            this.f18606d = C7698a.AD_STATE_NOTVISIBLE;
            C7680e.m21259a().mo54586b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54617c() {
        return this.f18604b;
    }

    /* renamed from: d */
    public MediaEvents mo54618d() {
        return this.f18605c;
    }

    /* renamed from: e */
    public boolean mo54619e() {
        return this.f18603a.get() != null;
    }

    /* renamed from: f */
    public void mo54620f() {
        C7680e.m21259a().mo54574a(getWebView());
    }

    /* renamed from: g */
    public void mo54621g() {
        C7680e.m21259a().mo54585b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18603a.get();
    }

    /* renamed from: h */
    public void mo54623h() {
        C7680e.m21259a().mo54588c(getWebView());
    }

    /* renamed from: i */
    public void mo54624i() {
        this.f18607e = C7693d.m21326a();
        this.f18606d = C7698a.AD_STATE_IDLE;
    }
}
