package com.ogury.p377ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;

/* renamed from: com.ogury.ed.internal.jq */
public final class C10167jq {

    /* renamed from: a */
    private AdSession f25531a;

    /* renamed from: b */
    private C10168jr f25532b = new C10168jr();

    /* renamed from: a */
    public final void mo65013a(WebView webView, boolean z) {
        C10263mq.m29882b(webView, "adWebView");
        AdSession a = C10168jr.m29731a(webView, z);
        this.f25531a = a;
        if (a != null) {
            a.start();
        }
    }

    /* renamed from: a */
    public final void mo65012a() {
        AdSession adSession = this.f25531a;
        if (adSession != null) {
            adSession.finish();
        }
    }
}
