package com.tapjoy.internal;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dw */
public final class C11375dw extends C11372du {

    /* renamed from: e */
    WebView f27151e;

    /* renamed from: f */
    private Long f27152f = null;

    /* renamed from: g */
    private final Map<String, C11343cw> f27153g;

    /* renamed from: h */
    private final String f27154h;

    public C11375dw(Map<String, C11343cw> map, String str) {
        this.f27153g = map;
        this.f27154h = str;
    }

    /* renamed from: a */
    public final void mo69813a() {
        super.mo69813a();
        WebView webView = new WebView(C11355dg.m31056a().f27122a);
        this.f27151e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo69815a(this.f27151e);
        C11356dh.m31057a();
        C11356dh.m31060a(this.f27151e, this.f27154h);
        for (String next : this.f27153g.keySet()) {
            String externalForm = this.f27153g.get(next).f27074b.toExternalForm();
            C11356dh.m31057a();
            WebView webView2 = this.f27151e;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                C11356dh.m31060a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next));
            }
        }
        this.f27152f = Long.valueOf(System.nanoTime());
    }

    /* renamed from: a */
    public final void mo69816a(C11344cx cxVar, C11335co coVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C11343cw> unmodifiableMap = Collections.unmodifiableMap(coVar.f27030d);
        for (String next : unmodifiableMap.keySet()) {
            C11365do.m31083a(jSONObject, next, unmodifiableMap.get(next));
        }
        mo69817a(cxVar, coVar, jSONObject);
    }

    /* renamed from: b */
    public final void mo69821b() {
        super.mo69821b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f27156b = C11375dw.this.f27151e;

            public final void run() {
                this.f27156b.destroy();
            }
        }, Math.max(4000 - (this.f27152f == null ? 4000 : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f27152f.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f27151e = null;
    }
}
