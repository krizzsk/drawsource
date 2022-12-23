package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0742b1;
import com.adcolony.sdk.C0826e0;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.adcolony.ScriptInjector;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* renamed from: com.adcolony.sdk.c1 */
public class C0774c1 extends C0742b1 implements C0898k0 {

    /* renamed from: A */
    private C0783i f373A;

    /* renamed from: B */
    private boolean f374B = true;

    /* renamed from: C */
    private C0832f1 f375C = C0773c0.m379b();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f376D;

    /* renamed from: E */
    private boolean f377E;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f378v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f379w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Object f380x = new Object();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0828e1 f381y = C0773c0.m365a();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public String f382z = "";

    /* renamed from: com.adcolony.sdk.c1$a */
    private class C0775a {
        public C0775a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C0774c1.this.f382z)) {
                C0774c1.this.m408c(str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C0774c1.this.f382z)) {
                C0774c1.this.f378v = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            if (!Intrinsics.areEqual((Object) str, (Object) C0774c1.this.f382z)) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            String str2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            Object d = C0774c1.this.f380x;
            C0774c1 c1Var = C0774c1.this;
            synchronized (d) {
                if (c1Var.f381y.mo10752b() > 0) {
                    if (c1Var.getEnableMessages()) {
                        str2 = c1Var.f381y.toString();
                    }
                    c1Var.f381y = C0773c0.m365a();
                }
                Unit unit = Unit.INSTANCE;
            }
            return str2;
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C0774c1.this.f382z)) {
                C0774c1.this.m408c(str);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$b */
    private final class C0776b extends C0775a {
        public C0776b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C0774c1.this.f382z)) {
                C0774c1.this.f379w = true;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$c */
    protected class C0777c extends C0742b1.C0744b {
        public C0777c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0786l().mo10701a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0786l().mo10703b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0786l().mo10702a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$d */
    protected class C0778d extends C0742b1.C0745c {
        public C0778d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0786l().mo10701a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0786l().mo10703b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0786l().mo10702a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$e */
    protected class C0779e extends C0742b1.C0746d {
        public C0779e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0784j().mo10699a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0786l().mo10703b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0786l().mo10702a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$f */
    protected class C0780f extends C0742b1.C0747e {
        public C0780f() {
            super(C0774c1.this);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0784j().mo10699a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0786l().mo10703b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C0785k().mo10700a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$g */
    protected class C0781g extends C0742b1.C0748f {
        public C0781g() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0784j().mo10699a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0786l().mo10703b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C0785k().mo10700a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$h */
    public static final class C0782h {
        private C0782h() {
        }

        public /* synthetic */ C0782h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.c1$i */
    private static final class C0783i {

        /* renamed from: a */
        private final WebMessagePort[] f390a;

        public C0783i(WebMessagePort[] webMessagePortArr) {
            this.f390a = webMessagePortArr;
        }

        /* renamed from: a */
        public final WebMessagePort mo10697a() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f390a, 1);
        }

        /* renamed from: b */
        public final WebMessagePort mo10698b() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f390a, 0);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$j */
    private final class C0784j {
        public C0784j() {
        }

        /* renamed from: a */
        public final void mo10699a(String str) {
            new C0786l().mo10701a();
            if (str != null) {
                C0774c1.this.m411d(str);
            } else {
                new C0826e0.C0827a().mo10746a("ADCWebViewModule: initializeEventMessaging failed due to url = null").mo10747a(C0826e0.f460g);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$k */
    private final class C0785k {
        public C0785k() {
        }

        /* renamed from: a */
        public final boolean mo10700a(WebResourceRequest webResourceRequest) {
            int i = 0;
            if (C0774c1.this.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    String a = C0774c1.this.getClickOverride();
                    Uri parse = a == null ? null : Uri.parse(a);
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        C1047z0.m1240a(new Intent("android.intent.action.VIEW", parse));
                        C0832f1 b = C0773c0.m379b();
                        C0774c1 c1Var = C0774c1.this;
                        C0773c0.m376a(b, "url", parse.toString());
                        C0773c0.m376a(b, "ad_session_id", c1Var.getAdSessionId());
                        C0761c parentContainer = C0774c1.this.getParentContainer();
                        if (parentContainer != null) {
                            i = parentContainer.mo10653k();
                        }
                        new C0850h0("WebView.redirect_detected", i, b).mo10838c();
                        C1014x0 A = C0723a.m193b().mo10863A();
                        C0774c1 c1Var2 = C0774c1.this;
                        A.mo11182a(c1Var2.getAdSessionId());
                        A.mo11184c(c1Var2.getAdSessionId());
                    } else {
                        new C0826e0.C0827a().mo10746a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C0774c1.this.mo10594h())).mo10747a(C0826e0.f462i);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.adcolony.sdk.c1$m */
    public static final class C0787m extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ C0774c1 f394a;

        C0787m(C0774c1 c1Var) {
            this.f394a = c1Var;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data;
            if (webMessage != null && (data = webMessage.getData()) != null) {
                C0774c1 c1Var = this.f394a;
                List<String> split = new Regex(CertificateUtil.DELIMITER).split(data, 2);
                if (split.size() == 2 && Intrinsics.areEqual((Object) split.get(0), (Object) c1Var.f382z)) {
                    c1Var.m404b(split.get(1));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$n */
    static final class C0788n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0774c1 f395a;

        C0788n(C0774c1 c1Var) {
            this.f395a = c1Var;
        }

        public final void run() {
            this.f395a.removeJavascriptInterface("NativeLayer");
        }
    }

    /* renamed from: com.adcolony.sdk.c1$o */
    static final class C0789o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0774c1 f396a;

        /* renamed from: b */
        final /* synthetic */ String f397b;

        C0789o(C0774c1 c1Var, String str) {
            this.f396a = c1Var;
            this.f397b = str;
        }

        public final void run() {
            if (this.f396a.getEnableMessages()) {
                C0774c1 c1Var = this.f396a;
                c1Var.mo10565a("NativeLayer.dispatch_messages(ADC3_update(" + this.f397b + "), '" + this.f396a.f382z + "');");
            }
        }
    }

    static {
        new C0782h((DefaultConstructorMarker) null);
    }

    public C0774c1(Context context, int i, C0850h0 h0Var) {
        super(context, i, h0Var);
    }

    /* renamed from: e */
    private final void m412e(C0832f1 f1Var) {
        WebMessagePort webMessagePort;
        if (this.f374B) {
            C0783i iVar = this.f373A;
            if (iVar == null || (webMessagePort = iVar.mo10698b()) == null) {
                webMessagePort = null;
            } else {
                C0828e1 a = C0773c0.m365a();
                a.mo10748a(f1Var);
                webMessagePort.postMessage(new WebMessage(a.toString()));
            }
            if (webMessagePort == null) {
                new C0826e0.C0827a().mo10746a("Sending message before event messaging is initialized").mo10747a(C0826e0.f460g);
            }
        }
    }

    /* access modifiers changed from: private */
    public final String getClickOverride() {
        AdColonyInterstitial interstitial = getInterstitial();
        String c = interstitial == null ? null : interstitial.mo10440c();
        if (c != null) {
            return c;
        }
        AdColonyAdView adView = getAdView();
        if (adView == null) {
            return null;
        }
        return adView.getClickOverride();
    }

    /* renamed from: m */
    private final C0775a m413m() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C0776b();
        }
        return new C0775a();
    }

    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getEnableMessages() {
        return this.f374B;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0832f1 getIab() {
        return this.f375C;
    }

    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getModuleInitialized() {
        return this.f376D;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0778d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0779e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0780f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0781g();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0777c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10595i() {
        addJavascriptInterface(m413m(), "NativeLayer");
        C0723a.m193b().mo10909r().mo10843a((C0898k0) this);
        super.mo10595i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ boolean mo10679n() {
        return this.f377E;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setEnableMessages(boolean z) {
        this.f374B = z;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setIab(C0832f1 f1Var) {
        this.f375C = f1Var;
    }

    /* renamed from: o */
    private final void m414o() {
        String str = "";
        synchronized (this.f380x) {
            if (this.f381y.mo10752b() > 0) {
                if (getEnableMessages()) {
                    str = this.f381y.toString();
                }
                this.f381y = C0773c0.m365a();
            }
            Unit unit = Unit.INSTANCE;
        }
        C1047z0.m1259b((Runnable) new C0789o(this, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ String mo10672d(C0832f1 f1Var) {
        return Intrinsics.stringPlus("file:///", mo10670c(f1Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m411d(String str) {
        if (this.f373A == null) {
            C0783i iVar = new C0783i(createWebMessageChannel());
            WebMessagePort b = iVar.mo10698b();
            if (b != null) {
                b.setWebMessageCallback(new C0787m(this));
            }
            postWebMessage(new WebMessage("", new WebMessagePort[]{iVar.mo10697a()}), Uri.parse(str));
            Unit unit = Unit.INSTANCE;
            this.f373A = iVar;
        }
    }

    /* renamed from: b */
    public void mo10668b() {
        if (C0723a.m195c() && this.f376D && !this.f378v && !this.f379w) {
            m414o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo10670c(C0832f1 f1Var) {
        return C0773c0.m393h(f1Var, "filepath");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10564a(C0850h0 h0Var, int i, C0761c cVar) {
        C0832f1 a = h0Var.mo10834a();
        this.f374B = C0773c0.m382b(a, "enable_messages");
        if (this.f375C.mo10791b()) {
            this.f375C = C0773c0.m391f(a, "iab");
        }
        super.mo10564a(h0Var, i, cVar);
    }

    /* renamed from: c */
    public void mo10671c() {
        if (!getDestroyed()) {
            mo10598l();
            C1047z0.m1259b((Runnable) new C0788n(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m404b(String str) {
        m403b(C0773c0.m380b(str));
    }

    /* renamed from: com.adcolony.sdk.c1$l */
    private final class C0786l {
        public C0786l() {
        }

        /* renamed from: a */
        public final void mo10701a() {
            if (C0774c1.this.getEnableMessages() && !C0774c1.this.getModuleInitialized()) {
                C0774c1.this.f382z = C1047z0.m1235a();
                C0832f1 a = C0773c0.m370a(C0773c0.m379b(), C0774c1.this.getInfo());
                C0773c0.m376a(a, "message_key", C0774c1.this.f382z);
                C0774c1 c1Var = C0774c1.this;
                c1Var.mo10565a("ADC3_init(" + C0774c1.this.getAdcModuleId() + ',' + a + ");");
                C0774c1.this.f376D = true;
            }
        }

        /* renamed from: b */
        public final void mo10703b() {
            C0774c1.this.f376D = false;
        }

        /* renamed from: a */
        public final boolean mo10702a(String str) {
            int i = 0;
            if (!C0774c1.this.getModuleInitialized()) {
                return false;
            }
            String a = C0774c1.this.getClickOverride();
            if (a != null) {
                str = a;
            }
            if (str != null) {
                C1047z0.m1240a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                C0832f1 b = C0773c0.m379b();
                C0774c1 c1Var = C0774c1.this;
                C0773c0.m376a(b, "url", str);
                C0773c0.m376a(b, "ad_session_id", c1Var.getAdSessionId());
                C0761c parentContainer = C0774c1.this.getParentContainer();
                if (parentContainer != null) {
                    i = parentContainer.mo10653k();
                }
                new C0850h0("WebView.redirect_detected", i, b).mo10838c();
                C1014x0 A = C0723a.m193b().mo10863A();
                C0774c1 c1Var2 = C0774c1.this;
                A.mo11182a(c1Var2.getAdSessionId());
                A.mo11184c(c1Var2.getAdSessionId());
                return true;
            }
            new C0826e0.C0827a().mo10746a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C0774c1.this.mo10594h())).mo10747a(C0826e0.f462i);
            return true;
        }
    }

    /* renamed from: b */
    private final void m403b(C0832f1 f1Var) {
        C0723a.m193b().mo10909r().mo10850c(f1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m408c(String str) {
        for (C0832f1 b : C0773c0.m367a(str).mo10756c()) {
            m403b(b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* synthetic */ void mo10669b(Exception exc) {
        new C0826e0.C0827a().mo10746a(exc.getClass().toString()).mo10746a(" during metadata injection w/ metadata = ").mo10746a(C0773c0.m393h(getInfo(), "metadata")).mo10747a(C0826e0.f462i);
    }

    /* renamed from: a */
    public void mo10666a(C0832f1 f1Var) {
        synchronized (this.f380x) {
            if (this.f379w) {
                m412e(f1Var);
                Unit unit = Unit.INSTANCE;
            } else {
                this.f381y.mo10748a(f1Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo10667a() {
        return !this.f378v && !this.f379w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ String mo10665a(String str, String str2) {
        C0939p0 p0Var;
        if (!this.f375C.mo10791b()) {
            AdColonyInterstitial interstitial = getInterstitial();
            C0939p0 p0Var2 = null;
            if (interstitial != null && !Intrinsics.areEqual((Object) C0773c0.m393h(getIab(), "ad_type"), (Object) "video")) {
                interstitial.mo10433a(getIab());
                p0Var = interstitial.mo10446e();
            } else {
                p0Var = null;
            }
            if (p0Var == null) {
                AdColonyAdViewListener adColonyAdViewListener = C0723a.m193b().mo10889c().mo10721e().get(getAdSessionId());
                if (adColonyAdViewListener != null) {
                    adColonyAdViewListener.mo10370a(new C0939p0(getIab(), getAdSessionId()));
                    p0Var2 = adColonyAdViewListener.f144c;
                }
            } else {
                p0Var2 = p0Var;
            }
            if (p0Var2 != null && p0Var2.mo11006d() == 2) {
                boolean z = true;
                this.f377E = true;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        return ScriptInjector.injectScriptContentIntoHtml(C0723a.m193b().mo10907p().mo11162a(str2, false).toString(), str);
                    } catch (IOException e) {
                        mo10669b((Exception) e);
                    }
                }
            }
        }
        return str;
    }
}
