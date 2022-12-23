package com.iab.omid.library.mmadbridge.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.p261b.C7931d;
import com.iab.omid.library.mmadbridge.p261b.C7932e;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7945d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.publisher.b */
public class C7952b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19190a;

    /* renamed from: b */
    private Long f19191b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f19192c;

    /* renamed from: d */
    private final String f19193d;

    public C7952b(Map<String, VerificationScriptResource> map, String str) {
        this.f19192c = map;
        this.f19193d = str;
    }

    /* renamed from: a */
    public void mo55578a() {
        super.mo55578a();
        mo55602j();
    }

    /* renamed from: a */
    public void mo55584a(C7925a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7942b.m22448a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55585a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55592b() {
        super.mo55592b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f19195b = C7952b.this.f19190a;

            public void run() {
                this.f19195b.destroy();
            }
        }, Math.max(4000 - (this.f19191b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7945d.m22461a() - this.f19191b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19190a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55602j() {
        WebView webView = new WebView(C7931d.m22391a().mo55550b());
        this.f19190a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55580a(this.f19190a);
        C7932e.m22394a().mo55561a(this.f19190a, this.f19193d);
        for (String next : this.f19192c.keySet()) {
            C7932e.m22394a().mo55554a(this.f19190a, this.f19192c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19191b = Long.valueOf(C7945d.m22461a());
    }
}
