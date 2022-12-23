package com.iab.omid.library.vungle.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.p273b.C8045d;
import com.iab.omid.library.vungle.p273b.C8046e;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.p275d.C8059d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.publisher.b */
public class C8066b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19495a;

    /* renamed from: b */
    private Long f19496b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f19497c;

    /* renamed from: d */
    private final String f19498d;

    public C8066b(Map<String, VerificationScriptResource> map, String str) {
        this.f19497c = map;
        this.f19498d = str;
    }

    /* renamed from: a */
    public void mo56111a() {
        super.mo56111a();
        mo56135j();
    }

    /* renamed from: a */
    public void mo56117a(C8039a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C8056b.m23001a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo56118a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo56125b() {
        super.mo56125b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f19500b = C8066b.this.f19495a;

            public void run() {
                this.f19500b.destroy();
            }
        }, Math.max(4000 - (this.f19496b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C8059d.m23013a() - this.f19496b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19495a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56135j() {
        WebView webView = new WebView(C8045d.m22945a().mo56083b());
        this.f19495a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo56113a(this.f19495a);
        C8046e.m22948a().mo56094a(this.f19495a, this.f19498d);
        for (String next : this.f19497c.keySet()) {
            C8046e.m22948a().mo56087a(this.f19495a, this.f19497c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19496b = Long.valueOf(C8059d.m23013a());
    }
}
