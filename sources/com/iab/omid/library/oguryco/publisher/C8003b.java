package com.iab.omid.library.oguryco.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.p267b.C7982d;
import com.iab.omid.library.oguryco.p267b.C7983e;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7996d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.publisher.b */
public class C8003b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19314a;

    /* renamed from: b */
    private Long f19315b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f19316c;

    /* renamed from: d */
    private final String f19317d;

    public C8003b(Map<String, VerificationScriptResource> map, String str) {
        this.f19316c = map;
        this.f19317d = str;
    }

    /* renamed from: a */
    public void mo55793a() {
        super.mo55793a();
        mo55817j();
    }

    /* renamed from: a */
    public void mo55799a(C7975a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7993b.m22680a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55800a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55807b() {
        super.mo55807b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f19319b = C8003b.this.f19314a;

            public void run() {
                this.f19319b.destroy();
            }
        }, Math.max(4000 - (this.f19315b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7996d.m22692a() - this.f19315b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19314a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55817j() {
        WebView webView = new WebView(C7982d.m22624a().mo55765b());
        this.f19314a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55795a(this.f19314a);
        C7983e.m22627a().mo55776a(this.f19314a, this.f19317d);
        for (String next : this.f19316c.keySet()) {
            C7983e.m22627a().mo55769a(this.f19314a, this.f19316c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19315b = Long.valueOf(C7996d.m22692a());
    }
}
