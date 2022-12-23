package com.ogury.p377ed.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.hk */
public abstract class C10088hk extends C10063gq {

    /* renamed from: a */
    public static final C10089a f25321a = new C10089a((byte) 0);

    /* renamed from: e */
    private static final WebResourceResponse f25322e;

    /* renamed from: b */
    private C9991ek f25323b;

    /* renamed from: c */
    private final Handler f25324c;

    /* renamed from: d */
    private C10085hh f25325d;

    /* renamed from: a */
    public abstract void mo64823a();

    /* renamed from: a */
    public abstract void mo64825a(String str);

    /* renamed from: b */
    public boolean mo64780b(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        return true;
    }

    private C10088hk() {
        this.f25323b = null;
        this.f25324c = new Handler(Looper.getMainLooper());
        this.f25325d = C10085hh.f25318a;
    }

    public /* synthetic */ C10088hk(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo64824a(C9991ek ekVar) {
        this.f25323b = ekVar;
    }

    /* renamed from: com.ogury.ed.internal.hk$a */
    public static final class C10089a {
        public /* synthetic */ C10089a(byte b) {
            this();
        }

        private C10089a() {
        }
    }

    static {
        byte[] bytes = "".getBytes(C10302nz.f25622a);
        C10263mq.m29879a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f25322e = new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }

    /* renamed from: a */
    public WebResourceResponse mo64778a(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        if (C10090hl.m29328a(str)) {
            this.f25324c.post(new Runnable(str, this) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ C10088hk f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C10088hk.m29321a(this.f$0, this.f$1);
                }
            });
            return f25322e;
        } else if (m29322b(str)) {
            return m29319a(webView);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29321a(String str, C10088hk hkVar) {
        C10263mq.m29882b(str, "$url");
        C10263mq.m29882b(hkVar, "this$0");
        C10060gn.m29207a(str);
        hkVar.mo64825a(str);
    }

    /* renamed from: a */
    private final WebResourceResponse m29319a(WebView webView) {
        Context context = webView.getContext();
        C10263mq.m29879a((Object) context, "view.context");
        WebResourceResponse a = C10085hh.m29315a(context, this.f25323b);
        if (a != null) {
            return a;
        }
        this.f25324c.post(new Runnable() {
            public final void run() {
                C10088hk.m29320a(C10088hk.this);
            }
        });
        return f25322e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29320a(C10088hk hkVar) {
        C10263mq.m29882b(hkVar, "this$0");
        hkVar.mo64823a();
    }

    /* renamed from: b */
    private static boolean m29322b(String str) {
        return C10263mq.m29881a((Object) "mraid.js", (Object) Uri.parse(str).getLastPathSegment());
    }
}
