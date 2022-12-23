package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0774c1;
import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.adcolony.sdk.j */
public class C0857j extends C0774c1 {

    /* renamed from: F */
    public static final C0863f f527F = new C0863f((DefaultConstructorMarker) null);

    /* renamed from: com.adcolony.sdk.j$a */
    protected class C0858a extends C0774c1.C0777c {
        public C0858a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0864g().mo10862a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$b */
    protected class C0859b extends C0774c1.C0778d {
        public C0859b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0864g().mo10862a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$c */
    protected class C0860c extends C0774c1.C0779e {
        public C0860c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0864g().mo10862a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$d */
    protected class C0861d extends C0774c1.C0780f {
        public C0861d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0864g().mo10862a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$e */
    protected class C0862e extends C0774c1.C0781g {
        public C0862e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0864g().mo10862a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$f */
    public static final class C0863f {
        private C0863f() {
        }

        public /* synthetic */ C0863f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0857j mo10861a(Context context, C0850h0 h0Var) {
            C0857j jVar;
            int e = C0723a.m193b().mo10909r().mo10852e();
            if (Intrinsics.areEqual((Object) C0773c0.m393h(h0Var.mo10834a(), "type"), (Object) "aurora")) {
                jVar = new C0824e(context, e, h0Var);
            } else {
                jVar = new C0857j(context, e, h0Var);
            }
            jVar.mo10595i();
            return jVar;
        }
    }

    /* renamed from: com.adcolony.sdk.j$g */
    private final class C0864g {
        public C0864g() {
        }

        /* renamed from: a */
        public final void mo10862a() {
            C0850h0 a;
            if (!(C0857j.this instanceof C0899l)) {
                C0832f1 b = C0773c0.m379b();
                C0857j jVar = C0857j.this;
                C0773c0.m385b(b, "success", true);
                C0773c0.m383b(b, "id", jVar.getAdc3ModuleId());
                C0850h0 message = C0857j.this.getMessage();
                if (message != null && (a = message.mo10835a(b)) != null) {
                    a.mo10838c();
                }
            }
        }
    }

    protected C0857j(Context context, int i, C0850h0 h0Var) {
        super(context, i, h0Var);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C0857j m658a(Context context, C0850h0 h0Var) {
        return f527F.mo10861a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0859b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0860c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0861d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0862e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0858a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10595i() {
        C0850h0 message = getMessage();
        C0832f1 a = message == null ? null : message.mo10834a();
        if (a == null) {
            a = C0773c0.m379b();
        }
        setMraidFilepath(C0773c0.m393h(a, "mraid_filepath"));
        setBaseUrl(C0773c0.m393h(a, "base_url"));
        setIab(C0773c0.m391f(a, "iab"));
        setInfo(C0773c0.m391f(a, TJAdUnitConstants.String.VIDEO_INFO));
        setAdSessionId(C0773c0.m393h(a, "ad_session_id"));
        setMUrl(mo10672d(a));
        super.mo10595i();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0850h0 h0Var) {
        super.setBounds(h0Var);
        C0832f1 b = C0773c0.m379b();
        C0773c0.m385b(b, "success", true);
        C0773c0.m383b(b, "id", getAdc3ModuleId());
        h0Var.mo10835a(b).mo10838c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C0850h0 h0Var) {
        super.setVisible(h0Var);
        C0832f1 b = C0773c0.m379b();
        C0773c0.m385b(b, "success", true);
        C0773c0.m383b(b, "id", getAdc3ModuleId());
        h0Var.mo10835a(b).mo10838c();
    }
}
