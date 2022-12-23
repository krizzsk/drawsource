package com.ironsource.sdk.p280c;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.c.b */
public final class C8118b {

    /* renamed from: a */
    private C8119c f19682a;

    C8118b(C8119c cVar) {
        this.f19682a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f19682a.handleMessageFromAd(str);
    }
}
