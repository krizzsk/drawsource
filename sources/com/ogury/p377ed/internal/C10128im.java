package com.ogury.p377ed.internal;

import android.webkit.WebView;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.im */
public final class C10128im implements C10133iq {

    /* renamed from: a */
    private final C10158jh f25437a;

    /* renamed from: b */
    private final C9981eb f25438b;

    /* renamed from: c */
    private C10127il f25439c;

    /* renamed from: d */
    private final Pattern f25440d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f25441e;

    public C10128im(C10158jh jhVar, C9981eb ebVar) {
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        this.f25437a = jhVar;
        this.f25438b = ebVar;
        this.f25440d = Pattern.compile(ebVar.mo64542t());
        m29528c();
    }

    /* renamed from: com.ogury.ed.internal.im$a */
    public static final class C10129a extends C10121ih {

        /* renamed from: a */
        final /* synthetic */ C10128im f25442a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10129a(C10128im imVar, Pattern pattern) {
            super(pattern);
            this.f25442a = imVar;
            C10263mq.m29879a((Object) pattern, "whitelistPattern");
        }

        /* renamed from: a */
        public final void mo64912a() {
            this.f25442a.m29529d();
        }

        /* renamed from: b */
        public final void mo64841b(WebView webView, String str) {
            C10263mq.m29882b(webView, "webView");
            C10263mq.m29882b(str, "url");
            this.f25442a.f25441e = true;
            this.f25442a.m29529d();
        }

        /* renamed from: b */
        public final void mo64913b() {
            this.f25442a.m29529d();
        }
    }

    /* renamed from: c */
    private final void m29528c() {
        this.f25437a.setClientAdapter(new C10129a(this, this.f25440d));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29529d() {
        C10127il ilVar = this.f25439c;
        if (ilVar != null) {
            ilVar.mo64914a();
        }
        m29530e();
        C10064gr.m29221f(this.f25437a);
    }

    /* renamed from: e */
    private final void m29530e() {
        C10158jh jhVar = this.f25437a;
        Pattern pattern = this.f25440d;
        C10263mq.m29879a((Object) pattern, "whitelistPattern");
        jhVar.setClientAdapter(new C10121ih(pattern));
    }

    /* renamed from: a */
    public final void mo64909a(C10127il ilVar) {
        C10263mq.m29882b(ilVar, "loadCallback");
        this.f25439c = ilVar;
        if (this.f25438b.mo64541s()) {
            this.f25437a.getSettings().setJavaScriptEnabled(false);
        }
        this.f25437a.loadUrl(this.f25438b.mo64540r());
    }

    /* renamed from: b */
    public final void mo64911b() {
        this.f25439c = null;
        m29530e();
        C10064gr.m29221f(this.f25437a);
    }

    /* renamed from: a */
    public final boolean mo64910a() {
        return this.f25441e;
    }
}
