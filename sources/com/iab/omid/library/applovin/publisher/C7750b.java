package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.p237b.C7729d;
import com.iab.omid.library.applovin.p237b.C7730e;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7743d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.publisher.b */
public class C7750b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18729a;

    /* renamed from: b */
    private Long f18730b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18731c;

    /* renamed from: d */
    private final String f18732d;

    public C7750b(Map<String, VerificationScriptResource> map, String str) {
        this.f18731c = map;
        this.f18732d = str;
    }

    /* renamed from: a */
    public void mo54800a() {
        super.mo54800a();
        mo54824j();
    }

    /* renamed from: a */
    public void mo54806a(C7723a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7740b.m21543a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54807a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54814b() {
        super.mo54814b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18734b = C7750b.this.f18729a;

            public void run() {
                this.f18734b.destroy();
            }
        }, Math.max(4000 - (this.f18730b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7743d.m21556a() - this.f18730b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18729a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54824j() {
        WebView webView = new WebView(C7729d.m21486a().mo54772b());
        this.f18729a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54802a(this.f18729a);
        C7730e.m21489a().mo54783a(this.f18729a, this.f18732d);
        for (String next : this.f18731c.keySet()) {
            C7730e.m21489a().mo54776a(this.f18729a, this.f18731c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18730b = Long.valueOf(C7743d.m21556a());
    }
}
