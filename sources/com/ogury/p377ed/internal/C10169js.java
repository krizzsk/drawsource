package com.ogury.p377ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.js */
public final class C10169js {

    /* renamed from: a */
    private final C10166jp f25533a;

    /* renamed from: b */
    private C10167jq f25534b;

    public /* synthetic */ C10169js() {
        this(C10166jp.f25530a);
    }

    private C10169js(C10166jp jpVar) {
        C10263mq.m29882b(jpVar, "omidSdk");
        this.f25533a = jpVar;
    }

    /* renamed from: a */
    public final void mo65015a(boolean z, WebView webView) {
        C10263mq.m29882b(webView, "webView");
        if (C10166jp.m29727a()) {
            C10167jq b = C10166jp.m29728b();
            this.f25534b = b;
            if (b != null) {
                b.mo65013a(webView, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo65014a() {
        C10167jq jqVar;
        if (C10166jp.m29727a() && (jqVar = this.f25534b) != null) {
            jqVar.mo65012a();
        }
    }
}
