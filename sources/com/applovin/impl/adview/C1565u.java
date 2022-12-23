package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.u */
public class C1565u extends WebViewClient {

    /* renamed from: a */
    private final C2102v f2001a;

    /* renamed from: b */
    private WeakReference<C1566a> f2002b;

    /* renamed from: com.applovin.impl.adview.u$a */
    public interface C1566a {
        /* renamed from: a */
        void mo13061a(C1564t tVar);

        /* renamed from: b */
        void mo13062b(C1564t tVar);

        /* renamed from: c */
        void mo13063c(C1564t tVar);
    }

    public C1565u(C1969m mVar) {
        this.f2001a = mVar.mo14509A();
    }

    /* renamed from: a */
    private void m2934a(WebView webView, String str) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2001a;
            vVar.mo15014c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof C1564t)) {
            C1564t tVar = (C1564t) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            C1566a aVar = (C1566a) this.f2002b.get();
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.mo13061a(tVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.mo13062b(tVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.mo13063c(tVar);
                } else if (C2102v.m5104a()) {
                    C2102v vVar2 = this.f2001a;
                    vVar2.mo15015d("WebViewButtonClient", "Unknown URL: " + str);
                    C2102v vVar3 = this.f2001a;
                    vVar3.mo15015d("WebViewButtonClient", "Path: " + path);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13244a(WeakReference<C1566a> weakReference) {
        this.f2002b = weakReference;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m2934a(webView, str);
        return true;
    }
}
