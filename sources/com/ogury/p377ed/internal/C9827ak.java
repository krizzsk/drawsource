package com.ogury.p377ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ak */
public final class C9827ak {

    /* renamed from: a */
    public static final C9828a f24796a = new C9828a((byte) 0);

    /* renamed from: b */
    private final C10169js f24797b;

    public C9827ak(C10169js jsVar) {
        C10263mq.m29882b(jsVar, "omidTracker");
        this.f24797b = jsVar;
    }

    /* renamed from: com.ogury.ed.internal.ak$a */
    public static final class C9828a {
        public /* synthetic */ C9828a(byte b) {
            this();
        }

        private C9828a() {
        }

        /* renamed from: a */
        public static C9827ak m28386a() {
            return new C9827ak(new C10169js());
        }
    }

    /* renamed from: a */
    public final void mo64358a(C10028fm fmVar, C9981eb ebVar, WebView webView) {
        C10263mq.m29882b(fmVar, "profig");
        C10263mq.m29882b(ebVar, "ad");
        C10263mq.m29882b(webView, "webView");
        if (fmVar.mo64701c() && ebVar.mo64535o()) {
            this.f24797b.mo65015a(ebVar.mo64537p(), webView);
        }
    }

    /* renamed from: a */
    public final void mo64357a() {
        this.f24797b.mo65014a();
    }
}
