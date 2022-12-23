package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.s */
final class C8194s {

    /* renamed from: a */
    private C8195t f19918a;

    /* renamed from: b */
    private boolean f19919b = false;

    C8194s(C8195t tVar) {
        this.f19918a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f19919b) {
            return "";
        }
        this.f19919b = true;
        return this.f19918a.f19920a;
    }
}
