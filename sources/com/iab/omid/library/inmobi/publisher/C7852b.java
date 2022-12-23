package com.iab.omid.library.inmobi.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.p249b.C7831d;
import com.iab.omid.library.inmobi.p249b.C7832e;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7845d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.publisher.b */
public class C7852b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18962a;

    /* renamed from: b */
    private Long f18963b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18964c;

    /* renamed from: d */
    private final String f18965d;

    public C7852b(Map<String, VerificationScriptResource> map, String str) {
        this.f18964c = map;
        this.f18965d = str;
    }

    /* renamed from: a */
    public void mo55194a() {
        super.mo55194a();
        mo55218j();
    }

    /* renamed from: a */
    public void mo55200a(C7825a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7842b.m22000a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55201a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55208b() {
        super.mo55208b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18967b = C7852b.this.f18962a;

            public void run() {
                this.f18967b.destroy();
            }
        }, Math.max(4000 - (this.f18963b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7845d.m22012a() - this.f18963b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18962a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55218j() {
        WebView webView = new WebView(C7831d.m21944a().mo55166b());
        this.f18962a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55196a(this.f18962a);
        C7832e.m21947a().mo55177a(this.f18962a, this.f18965d);
        for (String next : this.f18964c.keySet()) {
            C7832e.m21947a().mo55170a(this.f18962a, this.f18964c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18963b = Long.valueOf(C7845d.m22012a());
    }
}
