package com.ogury.p376cm;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.core.OguryError;
import com.ogury.p376cm.internal.abaac;
import com.ogury.p376cm.internal.abbbb;
import com.ogury.p376cm.internal.babca;
import com.ogury.p376cm.internal.bbabc;

/* renamed from: com.ogury.cm.aaaaa */
public final class aaaaa extends WebViewClient {

    /* renamed from: a */
    private abaac f24142a = new abaac();

    /* renamed from: b */
    private boolean f24143b;

    /* renamed from: c */
    private Context f24144c;

    /* renamed from: d */
    private final abbbb f24145d;

    public aaaaa(Context context, abbbb abbbb) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(abbbb, "consentCallback");
        this.f24144c = context;
        this.f24145d = abbbb;
    }

    /* renamed from: a */
    private final void m27637a(String str) {
        if (!this.f24143b) {
            this.f24143b = true;
            abbbb abbbb = this.f24145d;
            if (str == null) {
                str = "";
            }
            abbbb.mo63770a(new OguryError(1003, str));
            Context context = this.f24144c;
            if (!(context instanceof ConsentActivity)) {
                return;
            }
            if (context != null) {
                ((ConsentActivity) context).finish();
                return;
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.ConsentActivity");
        }
    }

    /* renamed from: a */
    private final boolean m27638a(String str, WebView webView) {
        if (this.f24143b) {
            return true;
        }
        this.f24142a.mo63831a(str, this.f24144c, this.f24145d, webView);
        return true;
    }

    /* renamed from: a */
    public final void mo63763a(Context context) {
        bbabc.m28052b(context, "context");
        this.f24144c = context;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m27637a(str);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        bbabc.m28052b(webView, "view");
        bbabc.m28052b(webResourceRequest, "request");
        bbabc.m28052b(webResourceError, "error");
        m27637a(webResourceError.getDescription().toString());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m28052b(webView, "view");
        bbabc.m28052b(webResourceRequest, "request");
        return null;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        bbabc.m28052b(webView, "view");
        bbabc.m28052b(str, "url");
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m28052b(webView, "view");
        bbabc.m28052b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        bbabc.m28049a((Object) uri, "request.url.toString()");
        return m27638a(uri, webView);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        bbabc.m28052b(webView, "view");
        bbabc.m28052b(str, "url");
        return m27638a(str, webView);
    }
}
