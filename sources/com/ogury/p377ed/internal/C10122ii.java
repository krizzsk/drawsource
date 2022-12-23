package com.ogury.p377ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ii */
public final class C10122ii {

    /* renamed from: a */
    public static final C10123a f25425a = new C10123a((byte) 0);

    /* renamed from: b */
    private String f25426b = "";

    /* renamed from: c */
    private int f25427c = -1;

    /* renamed from: com.ogury.ed.internal.ii$a */
    public static final class C10123a {
        public /* synthetic */ C10123a(byte b) {
            this();
        }

        private C10123a() {
        }
    }

    /* renamed from: a */
    public final void mo64905a(WebView webView) {
        C10263mq.m29882b(webView, "webView");
        if (this.f25426b.length() == 0) {
            String userAgentString = webView.getSettings().getUserAgentString();
            C10263mq.m29879a((Object) userAgentString, "webView.settings.userAgentString");
            this.f25426b = userAgentString;
            m29496b();
        }
    }

    /* renamed from: b */
    private final void m29496b() {
        int a = C10312oc.m29956a((CharSequence) this.f25426b, "chrome/", 0, true);
        if (a != -1) {
            int i = a + 7;
            try {
                String str = this.f25426b;
                int i2 = i + 2;
                if (str != null) {
                    String substring = str.substring(i, i2);
                    C10263mq.m29879a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    this.f25427c = Integer.parseInt(substring);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                C10057gl.m29202a(th);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo64906a() {
        return this.f25427c <= 57;
    }
}
