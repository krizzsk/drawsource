package com.ogury.p377ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.CreativeType;
import com.iab.omid.library.oguryco.adsession.ImpressionType;
import com.iab.omid.library.oguryco.adsession.Owner;
import com.iab.omid.library.oguryco.adsession.Partner;

/* renamed from: com.ogury.ed.internal.jm */
public final class C10163jm {

    /* renamed from: a */
    public static final C10163jm f25525a = new C10163jm();

    private C10163jm() {
    }

    /* renamed from: a */
    public static C10164jn m29720a(WebView webView, boolean z) {
        C10263mq.m29882b(webView, "adWebView");
        C10164jn jnVar = new C10164jn();
        Partner a = m29719a();
        if (a == null) {
            return null;
        }
        jnVar.mo65010a(m29718a(a, webView));
        jnVar.mo65009a(m29717a(z));
        return jnVar;
    }

    /* renamed from: a */
    private static Partner m29719a() {
        try {
            return Partner.createPartner("Ogury", "4.2.0");
        } catch (IllegalArgumentException e) {
            C10165jo joVar = C10165jo.f25528a;
            C10165jo.m29725a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionContext m29718a(Partner partner, WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, webView, "", (String) null);
        } catch (IllegalArgumentException e) {
            C10165jo joVar = C10165jo.f25528a;
            C10165jo.m29725a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionConfiguration m29717a(boolean z) {
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        Owner owner2 = Owner.NONE;
        if (z) {
            owner2 = Owner.JAVASCRIPT;
        }
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, false);
        } catch (IllegalArgumentException e) {
            C10165jo joVar = C10165jo.f25528a;
            C10165jo.m29725a(e);
            return null;
        }
    }
}
