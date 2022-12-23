package com.iab.omid.library.fyber.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.p243b.C7780d;
import com.iab.omid.library.fyber.p243b.C7781e;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7794d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.publisher.b */
public class C7801b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18846a;

    /* renamed from: b */
    private Long f18847b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18848c;

    /* renamed from: d */
    private final String f18849d;

    public C7801b(Map<String, VerificationScriptResource> map, String str) {
        this.f18848c = map;
        this.f18849d = str;
    }

    /* renamed from: a */
    public void mo54999a() {
        super.mo54999a();
        mo55023j();
    }

    /* renamed from: a */
    public void mo55005a(C7774a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7791b.m21773a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55006a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55013b() {
        super.mo55013b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18851b = C7801b.this.f18846a;

            public void run() {
                this.f18851b.destroy();
            }
        }, Math.max(4000 - (this.f18847b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7794d.m21786a() - this.f18847b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18846a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55023j() {
        WebView webView = new WebView(C7780d.m21716a().mo54971b());
        this.f18846a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55001a(this.f18846a);
        C7781e.m21719a().mo54982a(this.f18846a, this.f18849d);
        for (String next : this.f18848c.keySet()) {
            C7781e.m21719a().mo54975a(this.f18846a, this.f18848c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18847b = Long.valueOf(C7794d.m21786a());
    }
}
