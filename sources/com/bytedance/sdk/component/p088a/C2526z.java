package com.bytedance.sdk.component.p088a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.a.z */
/* compiled from: WebViewBridge */
public class C2526z extends C2484a {

    /* renamed from: j */
    static final /* synthetic */ boolean f5333j = (!C2526z.class.desiredAssertionStatus());

    /* renamed from: h */
    protected String f5334h;

    /* renamed from: i */
    protected WebView f5335i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Context mo16460a(C2499j jVar) {
        if (jVar.f5265e != null) {
            return jVar.f5265e;
        }
        if (jVar.f5261a != null) {
            return jVar.f5261a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16461a() {
        return this.f5335i.getUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16467b(C2499j jVar) {
        this.f5335i = jVar.f5261a;
        this.f5334h = jVar.f5263c;
        if (Build.VERSION.SDK_INT >= 17 && !jVar.f5274n) {
            mo16541c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16541c() {
        if (f5333j || this.f5335i != null) {
            this.f5335i.addJavascriptInterface(this, this.f5334h);
            return;
        }
        throw new AssertionError();
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16466b() {
        super.mo16466b();
        mo16542d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16542d() {
        this.f5335i.removeJavascriptInterface(this.f5334h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16465a(String str, C2509q qVar) {
        if (qVar == null || TextUtils.isEmpty(qVar.f5285h)) {
            super.mo16465a(str, qVar);
            return;
        }
        String str2 = qVar.f5285h;
        m6329a(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(String.format("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16464a(String str) {
        m6329a(str, "javascript:" + this.f5334h + "._handleMessageFromToutiao(" + str + ")");
    }

    /* renamed from: a */
    private void m6329a(String str, final String str2) {
        if (!this.f5228f && !TextUtils.isEmpty(str2)) {
            C25271 r3 = new Runnable() {
                public void run() {
                    if (!C2526z.this.f5228f) {
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                C2498i.m6251a("Invoking Jsb using evaluateJavascript: " + str2);
                                C2526z.this.f5335i.evaluateJavascript(str2, (ValueCallback) null);
                                return;
                            }
                            C2498i.m6251a("Invoking Jsb using loadUrl: " + str2);
                            C2526z.this.f5335i.loadUrl(str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C2498i.m6251a("Received call on sub-thread, posting to main thread: " + str2);
                this.f5226d.post(r3);
                return;
            }
            r3.run();
        }
    }
}
