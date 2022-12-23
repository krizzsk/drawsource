package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.adcolony.sdk.C0826e0;
import com.facebook.share.internal.ShareInternalUtility;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* renamed from: com.adcolony.sdk.b1 */
public class C0742b1 extends WebView {

    /* renamed from: u */
    public static final C0749g f292u = new C0749g((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f293a;

    /* renamed from: b */
    private final C0850h0 f294b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f295c;

    /* renamed from: d */
    private String f296d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f297e = "";

    /* renamed from: f */
    private String f298f = "";

    /* renamed from: g */
    private String f299g = "";

    /* renamed from: h */
    private String f300h = "";

    /* renamed from: i */
    private String f301i = "";

    /* renamed from: j */
    private C0832f1 f302j = C0773c0.m379b();

    /* renamed from: k */
    private boolean f303k;

    /* renamed from: l */
    private C0761c f304l;

    /* renamed from: m */
    private int f305m;

    /* renamed from: n */
    private int f306n;

    /* renamed from: o */
    private int f307o;

    /* renamed from: p */
    private int f308p;

    /* renamed from: q */
    private int f309q;

    /* renamed from: r */
    private int f310r;

    /* renamed from: s */
    private int f311s;

    /* renamed from: t */
    private int f312t;

    /* renamed from: com.adcolony.sdk.b1$a */
    private final class C0743a extends WebChromeClient {
        public C0743a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
            if (r3 != false) goto L_0x0064;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0056 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 != 0) goto L_0x0005
                r1 = r0
                goto L_0x0009
            L_0x0005:
                android.webkit.ConsoleMessage$MessageLevel r1 = r9.messageLevel()
            L_0x0009:
                if (r9 != 0) goto L_0x000d
                r9 = r0
                goto L_0x0011
            L_0x000d:
                java.lang.String r9 = r9.message()
            L_0x0011:
                r2 = 2
                r3 = 0
                r4 = 1
                if (r9 != 0) goto L_0x0017
                goto L_0x0021
            L_0x0017:
                java.lang.String r5 = "Viewport target-densitydpi is not supported."
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0021
                r5 = r4
                goto L_0x0022
            L_0x0021:
                r5 = r3
            L_0x0022:
                if (r5 != 0) goto L_0x0037
                if (r9 != 0) goto L_0x0027
                goto L_0x0031
            L_0x0027:
                java.lang.String r5 = "Viewport argument key \"shrink-to-fit\" not recognized and ignored"
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0031
                r5 = r4
                goto L_0x0032
            L_0x0031:
                r5 = r3
            L_0x0032:
                if (r5 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r5 = r3
                goto L_0x0038
            L_0x0037:
                r5 = r4
            L_0x0038:
                android.webkit.ConsoleMessage$MessageLevel r6 = android.webkit.ConsoleMessage.MessageLevel.ERROR
                if (r1 != r6) goto L_0x003e
                r6 = r4
                goto L_0x003f
            L_0x003e:
                r6 = r3
            L_0x003f:
                android.webkit.ConsoleMessage$MessageLevel r7 = android.webkit.ConsoleMessage.MessageLevel.WARNING
                if (r1 != r7) goto L_0x0045
                r1 = r4
                goto L_0x0046
            L_0x0045:
                r1 = r3
            L_0x0046:
                if (r9 != 0) goto L_0x0049
                goto L_0x0053
            L_0x0049:
                java.lang.String r7 = "ADC3_update is not defined"
                boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r7 != r4) goto L_0x0053
                r7 = r4
                goto L_0x0054
            L_0x0053:
                r7 = r3
            L_0x0054:
                if (r7 != 0) goto L_0x0064
                if (r9 != 0) goto L_0x0059
                goto L_0x0062
            L_0x0059:
                java.lang.String r7 = "NativeLayer.dispatch_messages is not a function"
                boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r2 != r4) goto L_0x0062
                r3 = r4
            L_0x0062:
                if (r3 == 0) goto L_0x007d
            L_0x0064:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C0742b1.this
                com.adcolony.sdk.h0 r3 = r2.getMessage()
                if (r3 != 0) goto L_0x006d
                goto L_0x0071
            L_0x006d:
                com.adcolony.sdk.f1 r0 = r3.mo10834a()
            L_0x0071:
                if (r0 != 0) goto L_0x0078
                com.adcolony.sdk.f1 r0 = new com.adcolony.sdk.f1
                r0.<init>()
            L_0x0078:
                java.lang.String r3 = "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device."
                r2.mo10566a((com.adcolony.sdk.C0832f1) r0, (java.lang.String) r3)
            L_0x007d:
                if (r5 != 0) goto L_0x00c0
                if (r1 != 0) goto L_0x0083
                if (r6 == 0) goto L_0x00c0
            L_0x0083:
                com.adcolony.sdk.b1 r0 = com.adcolony.sdk.C0742b1.this
                com.adcolony.sdk.AdColonyInterstitial r0 = r0.getInterstitial()
                if (r0 != 0) goto L_0x008c
                goto L_0x0092
            L_0x008c:
                java.lang.String r0 = r0.mo10428a()
                if (r0 != 0) goto L_0x0094
            L_0x0092:
                java.lang.String r0 = "unknown"
            L_0x0094:
                com.adcolony.sdk.e0$a r1 = new com.adcolony.sdk.e0$a
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onConsoleMessage: "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r9 = " with ad id: "
                r2.append(r9)
                r2.append(r0)
                java.lang.String r9 = r2.toString()
                com.adcolony.sdk.e0$a r9 = r1.mo10746a((java.lang.String) r9)
                if (r6 == 0) goto L_0x00bb
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0826e0.f462i
                goto L_0x00bd
            L_0x00bb:
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0826e0.f460g
            L_0x00bd:
                r9.mo10747a((com.adcolony.sdk.C0826e0) r0)
            L_0x00c0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0742b1.C0743a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$b */
    protected class C0744b extends WebViewClient {
        public C0744b() {
        }

        public void onPageFinished(WebView webView, String str) {
            Unit unit;
            C0832f1 b = C0773c0.m379b();
            C0773c0.m383b(b, "id", C0742b1.this.f295c);
            C0773c0.m376a(b, "url", str);
            C0761c parentContainer = C0742b1.this.getParentContainer();
            if (parentContainer == null) {
                unit = null;
            } else {
                C0773c0.m376a(b, "ad_session_id", C0742b1.this.getAdSessionId());
                C0773c0.m383b(b, "container_id", parentContainer.mo10634c());
                new C0850h0("WebView.on_load", parentContainer.mo10653k(), b).mo10838c();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                new C0850h0("WebView.on_load", C0742b1.this.getWebViewModuleId(), b).mo10838c();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C0742b1.this.m283a(i, str, str2);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z = true;
            if (str == null || !StringsKt.endsWith$default(str, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C0742b1.this.f297e;
            Charset charset = C0849h.f506a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$c */
    protected class C0745c extends C0744b {
        public C0745c() {
            super();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            boolean z = true;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null || !StringsKt.endsWith$default(uri, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C0742b1.this.f297e;
            Charset charset = C0849h.f506a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$d */
    protected class C0746d extends C0745c {
        public C0746d() {
            super();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r3 = r3.getUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            /*
                r1 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C0742b1.this
                int r0 = r4.getErrorCode()
                java.lang.CharSequence r4 = r4.getDescription()
                java.lang.String r4 = r4.toString()
                if (r3 != 0) goto L_0x0014
                goto L_0x001a
            L_0x0014:
                android.net.Uri r3 = r3.getUrl()
                if (r3 != 0) goto L_0x001c
            L_0x001a:
                r3 = 0
                goto L_0x0020
            L_0x001c:
                java.lang.String r3 = r3.toString()
            L_0x0020:
                r2.m283a((int) r0, (java.lang.String) r4, (java.lang.String) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0742b1.C0746d.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$e */
    protected class C0747e extends C0746d {
        public C0747e(C0742b1 b1Var) {
            super();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$f */
    protected class C0748f extends C0747e {
        public C0748f() {
            super(C0742b1.this);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                C0742b1.this.mo10566a(C0773c0.m379b(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$g */
    public static final class C0749g {
        private C0749g() {
        }

        public /* synthetic */ C0749g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0742b1 mo10615a(Context context, C0850h0 h0Var, int i, C0761c cVar) {
            C0742b1 b1Var;
            int e = C0723a.m193b().mo10909r().mo10852e();
            C0832f1 a = h0Var.mo10834a();
            if (C0773c0.m382b(a, "use_mraid_module")) {
                b1Var = new C0907l0(context, e, h0Var, C0723a.m193b().mo10909r().mo10852e());
            } else if (C0773c0.m382b(a, "enable_messages")) {
                b1Var = new C0774c1(context, e, h0Var);
            } else {
                b1Var = new C0742b1(context, e, h0Var);
            }
            b1Var.mo10564a(h0Var, i, cVar);
            b1Var.mo10595i();
            return b1Var;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$h */
    public static final class C0750h implements C0865j0 {

        /* renamed from: a */
        final /* synthetic */ C0742b1 f318a;

        /* renamed from: com.adcolony.sdk.b1$h$a */
        static final class C0751a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0742b1 f319a;

            /* renamed from: b */
            final /* synthetic */ C0850h0 f320b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0751a(C0742b1 b1Var, C0850h0 h0Var) {
                super(0);
                this.f319a = b1Var;
                this.f320b = h0Var;
            }

            /* renamed from: a */
            public final void mo10616a() {
                this.f319a.mo10565a(C0773c0.m393h(this.f320b.mo10834a(), "custom_js"));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10616a();
                return Unit.INSTANCE;
            }
        }

        C0750h(C0742b1 b1Var) {
            this.f318a = b1Var;
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            this.f318a.m287a(h0Var, (Function0<Unit>) new C0751a(this.f318a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$i */
    public static final class C0752i implements C0865j0 {

        /* renamed from: a */
        final /* synthetic */ C0742b1 f321a;

        /* renamed from: com.adcolony.sdk.b1$i$a */
        static final class C0753a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0742b1 f322a;

            /* renamed from: b */
            final /* synthetic */ C0850h0 f323b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0753a(C0742b1 b1Var, C0850h0 h0Var) {
                super(0);
                this.f322a = b1Var;
                this.f323b = h0Var;
            }

            /* renamed from: a */
            public final void mo10618a() {
                this.f322a.setVisible(this.f323b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10618a();
                return Unit.INSTANCE;
            }
        }

        C0752i(C0742b1 b1Var) {
            this.f321a = b1Var;
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            this.f321a.m287a(h0Var, (Function0<Unit>) new C0753a(this.f321a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$j */
    public static final class C0754j implements C0865j0 {

        /* renamed from: a */
        final /* synthetic */ C0742b1 f324a;

        /* renamed from: com.adcolony.sdk.b1$j$a */
        static final class C0755a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0742b1 f325a;

            /* renamed from: b */
            final /* synthetic */ C0850h0 f326b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0755a(C0742b1 b1Var, C0850h0 h0Var) {
                super(0);
                this.f325a = b1Var;
                this.f326b = h0Var;
            }

            /* renamed from: a */
            public final void mo10619a() {
                this.f325a.setBounds(this.f326b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10619a();
                return Unit.INSTANCE;
            }
        }

        C0754j(C0742b1 b1Var) {
            this.f324a = b1Var;
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            this.f324a.m287a(h0Var, (Function0<Unit>) new C0755a(this.f324a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$k */
    public static final class C0756k implements C0865j0 {

        /* renamed from: a */
        final /* synthetic */ C0742b1 f327a;

        /* renamed from: com.adcolony.sdk.b1$k$a */
        static final class C0757a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0742b1 f328a;

            /* renamed from: b */
            final /* synthetic */ C0850h0 f329b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0757a(C0742b1 b1Var, C0850h0 h0Var) {
                super(0);
                this.f328a = b1Var;
                this.f329b = h0Var;
            }

            /* renamed from: a */
            public final void mo10620a() {
                this.f328a.setTransparent(C0773c0.m382b(this.f329b.mo10834a(), TJAdUnitConstants.String.TRANSPARENT));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10620a();
                return Unit.INSTANCE;
            }
        }

        C0756k(C0742b1 b1Var) {
            this.f327a = b1Var;
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            this.f327a.m287a(h0Var, (Function0<Unit>) new C0757a(this.f327a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$l */
    static final class C0758l implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ Function0 f330a;

        C0758l(Function0 function0) {
            this.f330a = function0;
        }

        public final /* synthetic */ void run() {
            this.f330a.invoke();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$m */
    static final class C0759m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0742b1 f331a;

        /* renamed from: com.adcolony.sdk.b1$m$a */
        public static final class C0760a extends WebViewClient {

            /* renamed from: a */
            final /* synthetic */ C0742b1 f332a;

            C0760a(C0742b1 b1Var) {
                this.f332a = b1Var;
            }

            public void onPageFinished(WebView webView, String str) {
                this.f332a.destroy();
            }
        }

        C0759m(C0742b1 b1Var) {
            this.f331a = b1Var;
        }

        public final void run() {
            this.f331a.setWebChromeClient((WebChromeClient) null);
            this.f331a.setWebViewClient(new C0760a(this.f331a));
            this.f331a.clearCache(true);
            this.f331a.removeAllViews();
            this.f331a.loadUrl("about:blank");
        }
    }

    protected C0742b1(Context context, int i, C0850h0 h0Var) {
        super(context);
        this.f293a = i;
        this.f294b = h0Var;
    }

    @JvmStatic
    /* renamed from: a */
    public static final C0742b1 m281a(Context context, C0850h0 h0Var, int i, C0761c cVar) {
        return f292u.mo10615a(context, h0Var, i, cVar);
    }

    /* renamed from: d */
    private final void m290d() {
        ArrayList<String> j;
        ArrayList<C0865j0> i;
        C0761c cVar = this.f304l;
        if (!(cVar == null || (i = cVar.mo10649i()) == null)) {
            i.add(C0723a.m187a("WebView.execute_js", (C0865j0) new C0750h(this), true));
            i.add(C0723a.m187a("WebView.set_visible", (C0865j0) new C0752i(this), true));
            i.add(C0723a.m187a("WebView.set_bounds", (C0865j0) new C0754j(this), true));
            i.add(C0723a.m187a("WebView.set_transparent", (C0865j0) new C0756k(this), true));
        }
        C0761c cVar2 = this.f304l;
        if (cVar2 != null && (j = cVar2.mo10651j()) != null) {
            j.add("WebView.execute_js");
            j.add("WebView.set_visible");
            j.add("WebView.set_bounds");
            j.add("WebView.set_transparent");
        }
    }

    /* renamed from: g */
    private final WebViewClient m291g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return getWebViewClientApi26();
        }
        if (i >= 24) {
            return getWebViewClientApi24();
        }
        if (i >= 23) {
            return getWebViewClientApi23();
        }
        if (i >= 21) {
            return getWebViewClientApi21();
        }
        return getWebViewClientDefault();
    }

    /* access modifiers changed from: private */
    public final void setTransparent(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo10568e() {
        m290d();
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f307o, this.f308p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        C0761c cVar = this.f304l;
        if (cVar != null) {
            cVar.addView(this, layoutParams);
        }
    }

    /* renamed from: f */
    public final void mo10569f() {
        C0723a.m193b().mo10889c().mo10710a(this, this.f300h, this.f304l);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getAdSessionId() {
        return this.f300h;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyAdView getAdView() {
        return C0723a.m193b().mo10889c().mo10720d().get(this.f300h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getBaseUrl() {
        return this.f299g;
    }

    public final int getCurrentHeight() {
        return this.f308p;
    }

    public final int getCurrentWidth() {
        return this.f307o;
    }

    public final int getCurrentX() {
        return this.f305m;
    }

    public final int getCurrentY() {
        return this.f306n;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getDestroyed() {
        return this.f303k;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0832f1 getInfo() {
        return this.f302j;
    }

    public final int getInitialHeight() {
        return this.f312t;
    }

    public final int getInitialWidth() {
        return this.f311s;
    }

    public final int getInitialX() {
        return this.f309q;
    }

    public final int getInitialY() {
        return this.f310r;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyInterstitial getInterstitial() {
        return C0723a.m193b().mo10889c().mo10723f().get(this.f300h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMUrl() {
        return this.f298f;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0850h0 getMessage() {
        return this.f294b;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMraidFilepath() {
        return this.f301i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0761c getParentContainer() {
        return this.f304l;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0745c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0746d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0747e(this);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0748f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0744b();
    }

    public final int getWebViewModuleId() {
        return this.f293a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ String mo10594h() {
        AdColonyInterstitial interstitial = getInterstitial();
        if (interstitial != null) {
            String str = interstitial.mo10428a() + " : " + interstitial.getZoneID();
            return str == null ? "unknown" : str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10595i() {
        boolean z = true;
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        setWebChromeClient(new C0743a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        setWebViewClient(m291g());
        mo10596j();
        if (!(this instanceof C0857j)) {
            mo10568e();
        }
        if (this.f296d.length() <= 0) {
            z = false;
        }
        if (z) {
            mo10565a(this.f296d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public /* synthetic */ void mo10596j() {
        if (!StringsKt.startsWith$default(this.f298f, "http", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f298f, ShareInternalUtility.STAGING_PARAM, false, 2, (Object) null)) {
            loadDataWithBaseURL(this.f299g, this.f298f, "text/html", (String) null, (String) null);
        } else if (StringsKt.contains$default((CharSequence) this.f298f, (CharSequence) ".html", false, 2, (Object) null) || !StringsKt.startsWith$default(this.f298f, ShareInternalUtility.STAGING_PARAM, false, 2, (Object) null)) {
            loadUrl(this.f298f);
        } else {
            String str = this.f298f;
            loadDataWithBaseURL(str, "<html><script src=\"" + this.f298f + "\"></script></html>", "text/html", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10597k() {
        if (this.f301i.length() > 0) {
            try {
                this.f297e = C0723a.m193b().mo10907p().mo11162a(this.f301i, false).toString();
                Regex regex = new Regex("bridge.os_name\\s*=\\s*\"\"\\s*;");
                this.f297e = regex.replaceFirst(this.f297e, "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f302j + ";\n");
            } catch (IOException e) {
                m288a((Exception) e);
            } catch (IllegalArgumentException e2) {
                m288a((Exception) e2);
            } catch (IndexOutOfBoundsException e3) {
                m288a((Exception) e3);
            }
        }
    }

    /* renamed from: l */
    public final void mo10598l() {
        if (!this.f303k) {
            this.f303k = true;
            C1047z0.m1259b((Runnable) new C0759m(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AdColonyAdView adView = getAdView();
            if (adView != null && !adView.mo10332c()) {
                C0832f1 b = C0773c0.m379b();
                C0773c0.m376a(b, "ad_session_id", getAdSessionId());
                new C0850h0("WebView.on_first_click", 1, b).mo10838c();
                adView.setUserInteraction(true);
            }
            AdColonyInterstitial interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.mo10439b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setAdSessionId(String str) {
        this.f300h = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setBaseUrl(String str) {
        this.f299g = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f305m = C0773c0.m389d(a, "x");
        this.f306n = C0773c0.m389d(a, "y");
        this.f307o = C0773c0.m389d(a, "width");
        this.f308p = C0773c0.m389d(a, "height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
            layoutParams2.width = getCurrentWidth();
            layoutParams2.height = getCurrentHeight();
            Unit unit = Unit.INSTANCE;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setInfo(C0832f1 f1Var) {
        this.f302j = f1Var;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMUrl(String str) {
        this.f298f = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f301i = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C0850h0 h0Var) {
        setVisibility(C0773c0.m382b(h0Var.mo10834a(), TJAdUnitConstants.String.VISIBLE) ? 0 : 4);
    }

    /* renamed from: b */
    public final void mo10567b(C0850h0 h0Var, int i, C0761c cVar) {
        mo10564a(h0Var, i, cVar);
        mo10568e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10564a(C0850h0 h0Var, int i, C0761c cVar) {
        this.f295c = i;
        this.f304l = cVar;
        C0832f1 a = h0Var.mo10834a();
        String i2 = C0773c0.m394i(a, "url");
        if (i2 == null) {
            i2 = C0773c0.m393h(a, "data");
        }
        this.f298f = i2;
        this.f299g = C0773c0.m393h(a, "base_url");
        this.f296d = C0773c0.m393h(a, "custom_js");
        this.f300h = C0773c0.m393h(a, "ad_session_id");
        this.f302j = C0773c0.m391f(a, TJAdUnitConstants.String.VIDEO_INFO);
        this.f301i = C0773c0.m393h(a, "mraid_filepath");
        this.f307o = C0773c0.m389d(a, "width");
        this.f308p = C0773c0.m389d(a, "height");
        this.f305m = C0773c0.m389d(a, "x");
        int d = C0773c0.m389d(a, "y");
        this.f306n = d;
        this.f311s = this.f307o;
        this.f312t = this.f308p;
        this.f309q = this.f305m;
        this.f310r = d;
        mo10597k();
        mo10569f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo10565a(String str) {
        if (this.f303k) {
            new C0826e0.C0827a().mo10746a("Ignoring call to execute_js as WebView has been destroyed.").mo10747a(C0826e0.f456c);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C0826e0.C0827a().mo10746a("Device reporting incorrect OS version, evaluateJavascript ").mo10746a("is not available. Disabling AdColony.").mo10747a(C0826e0.f461h);
                AdColony.disable();
            }
        } else {
            loadUrl(Intrinsics.stringPlus("javascript:", str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10566a(C0832f1 f1Var, String str) {
        Context a = C0723a.m186a();
        C0739b bVar = a instanceof C0739b ? (C0739b) a : null;
        if (bVar == null) {
            return false;
        }
        C0723a.m193b().mo10889c().mo10709a((Context) bVar, f1Var, str);
        return true;
    }

    /* renamed from: a */
    private final void m288a(Exception exc) {
        new C0826e0.C0827a().mo10746a(exc.getClass().toString()).mo10746a(" during metadata injection w/ metadata = ").mo10746a(C0773c0.m393h(this.f302j, "metadata")).mo10747a(C0826e0.f462i);
        C0761c cVar = this.f304l;
        if (cVar != null) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "id", getAdSessionId());
            new C0850h0("AdSession.on_error", cVar.mo10653k(), b).mo10838c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m283a(int i, String str, String str2) {
        C0761c cVar = this.f304l;
        if (cVar != null) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m383b(b, "id", this.f295c);
            C0773c0.m376a(b, "ad_session_id", getAdSessionId());
            C0773c0.m383b(b, "container_id", cVar.mo10634c());
            C0773c0.m383b(b, "code", i);
            C0773c0.m376a(b, "error", str);
            C0773c0.m376a(b, "url", str2);
            new C0850h0("WebView.on_error", cVar.mo10653k(), b).mo10838c();
        }
        C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        a.mo10746a(str).mo10747a(C0826e0.f462i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m287a(C0850h0 h0Var, Function0<Unit> function0) {
        C0832f1 a = h0Var.mo10834a();
        if (C0773c0.m389d(a, "id") == this.f295c) {
            int d = C0773c0.m389d(a, "container_id");
            C0761c cVar = this.f304l;
            if (cVar != null && d == cVar.mo10634c()) {
                String h = C0773c0.m393h(a, "ad_session_id");
                C0761c cVar2 = this.f304l;
                if (Intrinsics.areEqual((Object) h, (Object) cVar2 == null ? null : cVar2.mo10625a())) {
                    C1047z0.m1259b((Runnable) new C0758l(function0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10563a(C0850h0 h0Var) {
        setBounds(h0Var);
    }
}
