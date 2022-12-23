package com.ogury.p377ed.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ik */
public final class C10125ik implements C10133iq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10158jh f25429a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9981eb f25430b;

    /* renamed from: c */
    private final C10116id f25431c;

    /* renamed from: d */
    private final C10120ig f25432d;

    /* renamed from: e */
    private C10127il f25433e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f25434f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f25435g;

    public C10125ik(C10158jh jhVar, C9981eb ebVar, C10116id idVar, C10120ig igVar) {
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(ebVar, "ad");
        C10263mq.m29882b(idVar, "webViewCache");
        C10263mq.m29882b(igVar, "presageAdGateway");
        this.f25429a = jhVar;
        this.f25430b = ebVar;
        this.f25431c = idVar;
        this.f25432d = igVar;
        m29505c();
    }

    /* renamed from: com.ogury.ed.internal.ik$a */
    public static final class C10126a extends C10159ji {

        /* renamed from: a */
        final /* synthetic */ C10125ik f25436a;

        C10126a(C10125ik ikVar) {
            this.f25436a = ikVar;
        }

        /* renamed from: a */
        public final void mo64912a() {
            C10125ik.m29504b(this.f25436a.f25429a, this.f25436a.f25430b);
            this.f25436a.m29507d();
        }

        /* renamed from: b */
        public final void mo64841b(WebView webView, String str) {
            C10263mq.m29882b(webView, "webView");
            C10263mq.m29882b(str, "url");
            this.f25436a.f25434f = true;
            this.f25436a.m29513g();
        }

        /* renamed from: b */
        public final void mo64913b() {
            if (!this.f25436a.f25434f) {
                this.f25436a.m29509e();
            }
        }

        /* renamed from: a */
        public final void mo64360a(WebView webView) {
            C10263mq.m29882b(webView, "webView");
            this.f25436a.f25435g = true;
            this.f25436a.m29513g();
        }
    }

    /* renamed from: c */
    private final void m29505c() {
        this.f25429a.setClientAdapter(new C10126a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29507d() {
        C10127il ilVar = this.f25433e;
        if (ilVar != null) {
            ilVar.mo64915a(this.f25430b);
        }
        m29511f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m29509e() {
        C9943di diVar = C9943di.f25015a;
        C9943di.m28717a((C9942dh) new C9953dl("loaded_error", this.f25430b));
        C10127il ilVar = this.f25433e;
        if (ilVar != null) {
            ilVar.mo64916b();
        }
        m29511f();
    }

    /* renamed from: f */
    private final void m29511f() {
        this.f25429a.setWebViewClient((WebViewClient) null);
        this.f25429a.setClientAdapter((C10159ji) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m29513g() {
        if (this.f25435g && this.f25434f) {
            C9943di diVar = C9943di.f25015a;
            C9943di.m28717a((C9942dh) new C9953dl(TJAdUnitConstants.String.VIDEO_LOADED, this.f25430b));
            C10116id.m29474a(new C10115ic(new WeakReference(this.f25432d), this.f25429a, this.f25430b));
            C10127il ilVar = this.f25433e;
            if (ilVar != null) {
                ilVar.mo64914a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m29504b(WebView webView, C9981eb ebVar) {
        C10064gr.m29221f(webView);
        C9943di diVar = C9943di.f25015a;
        C9943di.m28717a((C9942dh) new C9953dl("loaded_error", ebVar));
    }

    /* renamed from: a */
    public final void mo64909a(C10127il ilVar) {
        C10263mq.m29882b(ilVar, "loadCallback");
        this.f25433e = ilVar;
        C10161jk.m29714a(this.f25429a, this.f25430b);
    }

    /* renamed from: a */
    public final boolean mo64910a() {
        return this.f25434f;
    }

    /* renamed from: b */
    public final void mo64911b() {
        this.f25433e = null;
        m29511f();
        C10064gr.m29221f(this.f25429a);
    }
}
