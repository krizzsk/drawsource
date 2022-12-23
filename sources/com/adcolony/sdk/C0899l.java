package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0857j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.adcolony.sdk.l */
public final class C0899l extends C0857j {

    /* renamed from: G */
    public static final C0905f f617G = new C0905f((DefaultConstructorMarker) null);

    /* renamed from: H */
    public static boolean f618H;

    /* renamed from: com.adcolony.sdk.l$a */
    private final class C0900a extends C0857j.C0858a {
        public C0900a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0906g().mo10940a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    private final class C0901b extends C0857j.C0859b {
        public C0901b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0906g().mo10940a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    private final class C0902c extends C0857j.C0860c {
        public C0902c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0906g().mo10940a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$d */
    private final class C0903d extends C0857j.C0861d {
        public C0903d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0906g().mo10940a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$e */
    private final class C0904e extends C0857j.C0862e {
        public C0904e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0906g().mo10940a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$f */
    public static final class C0905f {
        private C0905f() {
        }

        public /* synthetic */ C0905f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0899l mo10939a(Context context, C0850h0 h0Var) {
            C0899l lVar = new C0899l(context, h0Var, (DefaultConstructorMarker) null);
            lVar.mo10595i();
            return lVar;
        }
    }

    /* renamed from: com.adcolony.sdk.l$g */
    private final class C0906g {
        public C0906g() {
        }

        /* renamed from: a */
        public final void mo10940a() {
            if (!C0899l.this.getModuleInitialized()) {
                C0828e1 e1Var = new C0828e1();
                for (AdColonyInterstitial adColonyInterstitial : C0723a.m193b().mo10889c().mo10724g()) {
                    C0832f1 f1Var = new C0832f1();
                    C0773c0.m376a(f1Var, "ad_session_id", adColonyInterstitial.mo10437b());
                    C0773c0.m376a(f1Var, "ad_id", adColonyInterstitial.mo10428a());
                    C0773c0.m376a(f1Var, "zone_id", adColonyInterstitial.getZoneID());
                    C0773c0.m376a(f1Var, "ad_request_id", adColonyInterstitial.mo10449g());
                    e1Var.mo10748a(f1Var);
                }
                C0773c0.m374a(C0899l.this.getInfo(), "ads_to_restore", e1Var);
            }
        }
    }

    private C0899l(Context context, C0850h0 h0Var) {
        super(context, 1, h0Var);
    }

    public /* synthetic */ C0899l(Context context, C0850h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, h0Var);
    }

    @JvmStatic
    /* renamed from: b */
    public static final C0899l m800b(Context context, C0850h0 h0Var) {
        return f617G.mo10939a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10566a(C0832f1 f1Var, String str) {
        if (super.mo10566a(f1Var, str)) {
            return true;
        }
        new C0826e0.C0827a().mo10746a("Unable to communicate with controller, disabling AdColony.").mo10747a(C0826e0.f461h);
        AdColony.disable();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo10670c(C0832f1 f1Var) {
        if (f618H) {
            return "android_asset/ADCController.js";
        }
        return super.mo10670c(f1Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0901b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0902c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0903d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0904e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0900a();
    }
}
