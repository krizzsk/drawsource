package com.iab.omid.library.amazon.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.p231b.C7679d;
import com.iab.omid.library.amazon.p231b.C7680e;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.p233d.C7693d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.publisher.b */
public class C7700b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18612a;

    /* renamed from: b */
    private Long f18613b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18614c;

    /* renamed from: d */
    private final String f18615d;

    public C7700b(Map<String, VerificationScriptResource> map, String str) {
        this.f18614c = map;
        this.f18615d = str;
    }

    /* renamed from: a */
    public void mo54601a() {
        super.mo54601a();
        mo54625j();
    }

    /* renamed from: a */
    public void mo54607a(C7673a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7690b.m21313a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54608a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54615b() {
        super.mo54615b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18617b = C7700b.this.f18612a;

            public void run() {
                this.f18617b.destroy();
            }
        }, Math.max(4000 - (this.f18613b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7693d.m21326a() - this.f18613b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18612a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54625j() {
        WebView webView = new WebView(C7679d.m21256a().mo54573b());
        this.f18612a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54603a(this.f18612a);
        C7680e.m21259a().mo54584a(this.f18612a, this.f18615d);
        for (String next : this.f18614c.keySet()) {
            C7680e.m21259a().mo54577a(this.f18612a, this.f18614c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18613b = Long.valueOf(C7693d.m21326a());
    }
}
