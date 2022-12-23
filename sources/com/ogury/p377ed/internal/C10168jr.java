package com.ogury.p377ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;

/* renamed from: com.ogury.ed.internal.jr */
public final class C10168jr {
    /* renamed from: a */
    public static AdSession m29731a(WebView webView, boolean z) {
        AdSessionConfiguration adSessionConfiguration;
        C10263mq.m29882b(webView, "adWebView");
        try {
            C10163jm jmVar = C10163jm.f25525a;
            C10164jn a = C10163jm.m29720a(webView, z);
            if (a == null) {
                adSessionConfiguration = null;
            } else {
                adSessionConfiguration = a.mo65011b();
            }
            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, a == null ? null : a.mo65008a());
            createAdSession.registerAdView(webView);
            return createAdSession;
        } catch (Exception e) {
            C10165jo joVar = C10165jo.f25528a;
            C10165jo.m29725a(e);
            return null;
        }
    }
}
