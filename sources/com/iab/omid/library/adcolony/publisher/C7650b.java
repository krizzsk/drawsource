package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.p225b.C7629d;
import com.iab.omid.library.adcolony.p225b.C7630e;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7643d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
public class C7650b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18495a;

    /* renamed from: b */
    private Long f18496b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18497c;

    /* renamed from: d */
    private final String f18498d;

    public C7650b(Map<String, VerificationScriptResource> map, String str) {
        this.f18497c = map;
        this.f18498d = str;
    }

    /* renamed from: a */
    public void mo54402a() {
        super.mo54402a();
        mo54426j();
    }

    /* renamed from: a */
    public void mo54408a(C7623a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7640b.m21083a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54409a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54416b() {
        super.mo54416b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18500b;

            {
                this.f18500b = C7650b.this.f18495a;
            }

            public void run() {
                this.f18500b.destroy();
            }
        }, Math.max(4000 - (this.f18496b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7643d.m21096a() - this.f18496b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18495a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54426j() {
        WebView webView = new WebView(C7629d.m21026a().mo54374b());
        this.f18495a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54404a(this.f18495a);
        C7630e.m21029a().mo54385a(this.f18495a, this.f18498d);
        for (String next : this.f18497c.keySet()) {
            C7630e.m21029a().mo54378a(this.f18495a, this.f18497c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18496b = Long.valueOf(C7643d.m21096a());
    }
}
