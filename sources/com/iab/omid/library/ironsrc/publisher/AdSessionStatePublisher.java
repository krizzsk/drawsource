package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.p255b.C7881d;
import com.iab.omid.library.ironsrc.p255b.C7882e;
import com.iab.omid.library.ironsrc.p257d.C7891a;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7895d;
import com.iab.omid.library.ironsrc.p258e.C7899b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7899b f19067a = new C7899b((WebView) null);

    /* renamed from: b */
    private AdEvents f19068b;

    /* renamed from: c */
    private MediaEvents f19069c;

    /* renamed from: d */
    private C7900a f19070d;

    /* renamed from: e */
    private long f19071e;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum C7900a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55403i();
    }

    /* renamed from: a */
    public void mo55380a() {
    }

    /* renamed from: a */
    public void mo55381a(float f) {
        C7882e.m22169a().mo55354a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55382a(WebView webView) {
        this.f19067a = new C7899b(webView);
    }

    /* renamed from: a */
    public void mo55383a(AdEvents adEvents) {
        this.f19068b = adEvents;
    }

    /* renamed from: a */
    public void mo55384a(AdSessionConfiguration adSessionConfiguration) {
        C7882e.m22169a().mo55361a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55385a(ErrorType errorType, String str) {
        C7882e.m22169a().mo55355a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55386a(C7875a aVar, AdSessionContext adSessionContext) {
        mo55387a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55387a(C7875a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7892b.m22221a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7892b.m22221a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7892b.m22221a(jSONObject2, "deviceInfo", C7891a.m22214d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7892b.m22221a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7892b.m22221a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7892b.m22221a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7892b.m22221a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7892b.m22221a(jSONObject4, "libraryVersion", "1.3.12-Ironsrc");
        C7892b.m22221a(jSONObject4, "appId", C7881d.m22166a().mo55352b().getApplicationContext().getPackageName());
        C7892b.m22221a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7892b.m22221a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7892b.m22221a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7892b.m22221a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7882e.m22169a().mo55358a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55388a(MediaEvents mediaEvents) {
        this.f19069c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55389a(String str) {
        C7882e.m22169a().mo55357a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55390a(String str, long j) {
        if (j >= this.f19071e) {
            this.f19070d = C7900a.AD_STATE_VISIBLE;
            C7882e.m22169a().mo55365b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55391a(String str, JSONObject jSONObject) {
        C7882e.m22169a().mo55357a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55392a(JSONObject jSONObject) {
        C7882e.m22169a().mo55366b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55393a(boolean z) {
        if (mo55398e()) {
            C7882e.m22169a().mo55368c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55394b() {
        this.f19067a.clear();
    }

    /* renamed from: b */
    public void mo55395b(String str, long j) {
        if (j >= this.f19071e && this.f19070d != C7900a.AD_STATE_NOTVISIBLE) {
            this.f19070d = C7900a.AD_STATE_NOTVISIBLE;
            C7882e.m22169a().mo55365b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55396c() {
        return this.f19068b;
    }

    /* renamed from: d */
    public MediaEvents mo55397d() {
        return this.f19069c;
    }

    /* renamed from: e */
    public boolean mo55398e() {
        return this.f19067a.get() != null;
    }

    /* renamed from: f */
    public void mo55399f() {
        C7882e.m22169a().mo55353a(getWebView());
    }

    /* renamed from: g */
    public void mo55400g() {
        C7882e.m22169a().mo55364b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19067a.get();
    }

    /* renamed from: h */
    public void mo55402h() {
        C7882e.m22169a().mo55367c(getWebView());
    }

    /* renamed from: i */
    public void mo55403i() {
        this.f19071e = C7895d.m22233a();
        this.f19070d = C7900a.AD_STATE_IDLE;
    }
}
