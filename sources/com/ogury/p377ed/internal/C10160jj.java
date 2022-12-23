package com.ogury.p377ed.internal;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.jj */
public final class C10160jj extends C10088hk {

    /* renamed from: b */
    private final C10158jh f25523b;

    /* renamed from: c */
    private C10159ji f25524c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10160jj(C10158jh jhVar) {
        super((byte) 0);
        C10263mq.m29882b(jhVar, "mraidWebView");
        this.f25523b = jhVar;
    }

    /* renamed from: a */
    public final void mo65005a(C10159ji jiVar) {
        this.f25524c = jiVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        C10159ji jiVar = this.f25524c;
        if (jiVar != null) {
            jiVar.mo64840a(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        C10159ji jiVar = this.f25524c;
        if (jiVar != null) {
            jiVar.mo64841b(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo64779a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onReceivedError ");
        sb.append(i);
        sb.append(" description ");
        sb.append(str);
        sb.append(" ulr ");
        sb.append(str2);
        C10159ji jiVar = this.f25524c;
        if (jiVar != null) {
            jiVar.mo64913b();
        }
    }

    /* renamed from: b */
    public final boolean mo64780b(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        this.f25523b.mo64969b(str);
        C10159ji jiVar = this.f25524c;
        Boolean valueOf = jiVar == null ? null : Boolean.valueOf(jiVar.mo64843d(webView, str));
        if (valueOf == null) {
            return super.mo64780b(webView, str);
        }
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public final void mo64825a(String str) {
        C10263mq.m29882b(str, "url");
        this.f25523b.mo64967a(str);
    }

    /* renamed from: a */
    public final WebResourceResponse mo64778a(WebView webView, String str) {
        C10263mq.m29882b(webView, "view");
        C10263mq.m29882b(str, "url");
        C10159ji jiVar = this.f25524c;
        if (jiVar != null) {
            jiVar.mo64842c(webView, str);
        }
        C10159ji jiVar2 = this.f25524c;
        boolean z = true;
        if (jiVar2 == null || !jiVar2.mo64904a(str)) {
            z = false;
        }
        if (z) {
            return m29706b();
        }
        return super.mo64778a(webView, str);
    }

    /* renamed from: a */
    public final void mo64823a() {
        C10159ji jiVar = this.f25524c;
        if (jiVar != null) {
            jiVar.mo64913b();
        }
    }

    /* renamed from: b */
    private static WebResourceResponse m29706b() {
        byte[] bytes = "".getBytes(C10302nz.f25622a);
        C10263mq.m29879a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }
}
