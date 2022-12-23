package com.iab.omid.library.smaato.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p012c.C0693d;
import p012c.C0694e;
import p397e.C12465b;
import p397e.C12468d;

/* renamed from: com.iab.omid.library.smaato.publisher.b */
public class C8025b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f19390f;

    /* renamed from: g */
    private Long f19391g = null;

    /* renamed from: h */
    private final Map<String, VerificationScriptResource> f19392h;

    /* renamed from: i */
    private final String f19393i;

    /* renamed from: com.iab.omid.library.smaato.publisher.b$a */
    class C8026a implements Runnable {

        /* renamed from: a */
        private final WebView f19394a;

        C8026a() {
            this.f19394a = C8025b.this.f19390f;
        }

        public void run() {
            this.f19394a.destroy();
        }
    }

    public C8025b(Map<String, VerificationScriptResource> map, String str) {
        this.f19392h = map;
        this.f19393i = str;
    }

    /* renamed from: a */
    public void mo55938a(C8021a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C12465b.m33291a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55939a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55946b() {
        super.mo55946b();
        new Handler().postDelayed(new C8026a(), Math.max(4000 - (this.f19391g == null ? 4000 : TimeUnit.MILLISECONDS.convert(C12468d.m33304a() - this.f19391g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19390f = null;
    }

    /* renamed from: i */
    public void mo55955i() {
        super.mo55955i();
        mo55956j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55956j() {
        WebView webView = new WebView(C0693d.m54b().mo10284a());
        this.f19390f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55934a(this.f19390f);
        C0694e.m57a().mo10301c(this.f19390f, this.f19393i);
        for (String next : this.f19392h.keySet()) {
            C0694e.m57a().mo10290a(this.f19390f, this.f19392h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19391g = Long.valueOf(C12468d.m33304a());
    }
}
