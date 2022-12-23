package com.ogury.p377ed.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.al */
public final class C9829al {

    /* renamed from: a */
    public static final C9830a f24798a = new C9830a((byte) 0);

    /* renamed from: b */
    private final C10116id f24799b;

    /* renamed from: c */
    private final C10087hj f24800c;

    /* renamed from: d */
    private final C10141iv f24801d;

    /* renamed from: e */
    private C10158jh f24802e;

    public /* synthetic */ C9829al(C10116id idVar, C10087hj hjVar, C10141iv ivVar, byte b) {
        this(idVar, hjVar, ivVar);
    }

    private C9829al(C10116id idVar, C10087hj hjVar, C10141iv ivVar) {
        this.f24799b = idVar;
        this.f24800c = hjVar;
        this.f24801d = ivVar;
    }

    /* renamed from: com.ogury.ed.internal.al$a */
    public static final class C9830a {
        public /* synthetic */ C9830a(byte b) {
            this();
        }

        private C9830a() {
        }

        /* renamed from: a */
        public static C9829al m28393a(C10093ho hoVar, C10141iv ivVar) {
            C10263mq.m29882b(hoVar, "multiWebViewBrowser");
            C10263mq.m29882b(ivVar, "foregroundHandlerFactory");
            return new C9829al(C10116id.f25410a, hoVar.mo64828a(), ivVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C10158jh mo64359a(C9981eb ebVar) {
        C10263mq.m29882b(ebVar, "ad");
        C10158jh b = m28390b(ebVar);
        if (b == null) {
            return null;
        }
        this.f24802e = b;
        m28387a();
        m28389a(this.f24802e);
        m28391b();
        return this.f24802e;
    }

    /* renamed from: b */
    private static C10158jh m28390b(C9981eb ebVar) {
        return C10116id.m29477b(ebVar.mo64495a());
    }

    /* renamed from: a */
    private final void m28387a() {
        C10158jh jhVar = this.f24802e;
        if (jhVar != null) {
            jhVar.setMraidUrlHandler(new C10139iu(new C10087hj[]{this.f24800c, this.f24801d.mo64937a(jhVar)}));
            WebSettings settings = jhVar.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView = jhVar;
            C10064gr.m29218c(webView);
            C10064gr.m29217b(webView);
        }
    }

    /* renamed from: com.ogury.ed.internal.al$b */
    public static final class C9831b extends C10159ji {

        /* renamed from: a */
        final /* synthetic */ C9829al f24803a;

        C9831b(C9829al alVar) {
            this.f24803a = alVar;
        }

        /* renamed from: a */
        public final void mo64360a(WebView webView) {
            C10263mq.m29882b(webView, "webView");
            this.f24803a.m28391b();
        }
    }

    /* renamed from: a */
    private final void m28389a(C10158jh jhVar) {
        if (jhVar != null) {
            jhVar.setClientAdapter(new C9831b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m28391b() {
        C10158jh jhVar = this.f24802e;
        if (jhVar != null) {
            jhVar.mo64971c();
        }
    }
}
