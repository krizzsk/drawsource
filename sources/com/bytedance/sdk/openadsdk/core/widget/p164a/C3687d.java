package com.bytedance.sdk.openadsdk.core.widget.p164a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.d */
/* compiled from: TTWebViewClient */
public class C3687d extends SSWebView.C2926a {

    /* renamed from: i */
    private static final HashSet<String> f9534i;

    /* renamed from: a */
    private boolean f9535a = false;

    /* renamed from: b */
    private AtomicBoolean f9536b = new AtomicBoolean(false);

    /* renamed from: c */
    protected final C3666w f9537c;

    /* renamed from: d */
    protected final Context f9538d;

    /* renamed from: e */
    protected final String f9539e;

    /* renamed from: f */
    protected C3104n f9540f;

    /* renamed from: g */
    protected boolean f9541g = true;

    /* renamed from: h */
    protected boolean f9542h = true;

    public C3687d(Context context, C3666w wVar, String str, C3104n nVar, boolean z) {
        this.f9538d = context;
        this.f9537c = wVar;
        this.f9539e = str;
        this.f9540f = nVar;
        this.f9535a = z;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C3104n nVar = this.f9540f;
        if (nVar != null) {
            nVar.mo18693a(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C2905l.m8111b("WebChromeClient", "shouldOverrideUrlLoading " + str);
        try {
            Uri parse = Uri.parse(str);
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                C3881j.m12667a(parse, this.f9537c);
                return true;
            } else if (mo20453a(str)) {
                return true;
            } else {
                if (!C2909o.m8134a(str)) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.f9538d.startActivity(intent);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        } catch (Throwable th) {
            C2905l.m8112b("WebChromeClient", "shouldOverrideUrlLoading", th);
            C3666w wVar = this.f9537c;
            if (wVar != null && wVar.mo20367d()) {
                return true;
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (C2905l.m8108a()) {
            C2905l.m8105a("WebChromeClient", "onPageFinished " + str);
        }
        C3104n nVar = this.f9540f;
        if (nVar != null) {
            nVar.mo18695a(webView, str, this.f9535a);
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C3104n nVar = this.f9540f;
        if (nVar != null) {
            nVar.mo18694a(webView, str, bitmap);
        }
        if (this.f9542h) {
            C3685b.m12035a(this.f9538d).mo20447a(Build.VERSION.SDK_INT >= 19).mo20449b(webView.getSettings().getBuiltInZoomControls()).mo20448a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C3104n nVar = this.f9540f;
        if (nVar != null) {
            nVar.mo18692a(webView, i, str, str2, m12042b(str2));
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f9540f != null && webResourceError != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f9540f.mo18692a(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f9540f != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f9540f.mo18692a(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f9540f != null) {
            int i = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i = sslError.getPrimaryError();
                    str = "SslError: " + String.valueOf(sslError);
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f9540f.mo18692a(webView, i, str, str3, m12042b(str3));
        }
    }

    /* renamed from: a */
    public boolean mo20453a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.f9538d.startActivity(intent);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f9534i = hashSet;
        hashSet.add("png");
        f9534i.add("ico");
        f9534i.add("jpg");
        f9534i.add("gif");
        f9534i.add("svg");
        f9534i.add("jpeg");
    }

    /* renamed from: b */
    protected static String m12042b(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !f9534i.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/" + substring;
    }
}
