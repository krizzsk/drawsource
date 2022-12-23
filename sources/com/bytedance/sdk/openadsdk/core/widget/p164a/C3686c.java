package com.bytedance.sdk.openadsdk.core.widget.p164a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p178l.C3881j;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.c */
/* compiled from: TTWebChromeClient */
public class C3686c extends WebChromeClient {

    /* renamed from: a */
    private static final String f9531a = WebChromeClient.class.getSimpleName();

    /* renamed from: b */
    private final C3666w f9532b;

    /* renamed from: c */
    private C3104n f9533c;

    public C3686c(C3666w wVar, C3104n nVar) {
        this.f9532b = wVar;
        this.f9533c = nVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m12041a(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !m12041a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m12041a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"bytedance".equals(parse.getScheme().toLowerCase())) {
                return false;
            }
            C3881j.m12667a(parse, this.f9532b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C3104n nVar = this.f9533c;
        if (nVar != null) {
            nVar.mo18691a(webView, i);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
