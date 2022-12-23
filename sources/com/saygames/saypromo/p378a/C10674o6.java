package com.saygames.saypromo.p378a;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.saygames.saypromo.a.o6 */
public final class C10674o6 extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C10690q6 f26298a;

    C10674o6(C10690q6 q6Var) {
        this.f26298a = q6Var;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            C10626i6 a = this.f26298a.f26317a.mo65490a(str2);
            C10666n6 a2 = this.f26298a.f26319c;
            if (a2 != null) {
                ((C10541Y) a2).mo65399a(a);
            }
        } catch (Throwable th) {
            C10690q6.m30558a(this.f26298a, "onJsAlert", th);
        }
        jsResult.confirm();
        return true;
    }
}
