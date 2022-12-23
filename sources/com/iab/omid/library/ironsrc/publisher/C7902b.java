package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.p255b.C7881d;
import com.iab.omid.library.ironsrc.p255b.C7882e;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7895d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
public class C7902b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19076a;

    /* renamed from: b */
    private Long f19077b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f19078c;

    /* renamed from: d */
    private final String f19079d;

    public C7902b(Map<String, VerificationScriptResource> map, String str) {
        this.f19078c = map;
        this.f19079d = str;
    }

    /* renamed from: a */
    public void mo55380a() {
        super.mo55380a();
        mo55404j();
    }

    /* renamed from: a */
    public void mo55386a(C7875a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7892b.m22221a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55387a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55394b() {
        super.mo55394b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f19081b = C7902b.this.f19076a;

            public void run() {
                this.f19081b.destroy();
            }
        }, Math.max(4000 - (this.f19077b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7895d.m22233a() - this.f19077b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19076a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55404j() {
        WebView webView = new WebView(C7881d.m22166a().mo55352b());
        this.f19076a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55382a(this.f19076a);
        C7882e.m22169a().mo55363a(this.f19076a, this.f19079d);
        for (String next : this.f19078c.keySet()) {
            C7882e.m22169a().mo55356a(this.f19076a, this.f19078c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19077b = Long.valueOf(C7895d.m22233a());
    }
}
