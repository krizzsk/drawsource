package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p094c.C2573c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p159a.C3529a;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import java.io.InputStream;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.g */
/* compiled from: ExpressClient */
public class C3547g extends C3687d {

    /* renamed from: a */
    private C3431n f8942a;

    public C3547g(Context context, C3666w wVar, C3431n nVar, C3104n nVar2) {
        super(context, wVar, nVar.mo19532Y(), nVar2, false);
        this.f8942a = nVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            C2905l.m8115c("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            WebResourceResponse a = m11158a(webView, str);
            m11160a(currentTimeMillis, System.currentTimeMillis(), str, a != null ? 1 : 2);
            if (a != null) {
                return a;
            }
        } catch (Throwable th) {
            C2905l.m8115c("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f9541g = false;
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f9542h = false;
        super.onPageStarted(webView, str, bitmap);
    }

    /* renamed from: a */
    private WebResourceResponse m11158a(WebView webView, String str) {
        C3417k kVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2573c.C2574a a = C2573c.m6630a(str);
        if (a != C2573c.C2574a.IMAGE) {
            Iterator<C3417k> it = this.f8942a.mo19523P().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3417k next = it.next();
                if (!TextUtils.isEmpty(next.mo19468a()) && !TextUtils.isEmpty(str)) {
                    String a2 = next.mo19468a();
                    if (a2.startsWith("https")) {
                        a2 = a2.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(a2)) {
                        kVar = next;
                        break;
                    }
                }
            }
        }
        if (a == C2573c.C2574a.IMAGE || kVar != null) {
            return m11159a(str, C3529a.m11071a(this.f8942a, str));
        }
        return C2533a.m6364a(str, a, "");
    }

    /* renamed from: a */
    private WebResourceResponse m11159a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream a = C3707a.m12125a(str, str2);
            if (a != null) {
                return new WebResourceResponse(C2573c.C2574a.IMAGE.mo16734a(), "utf-8", a);
            }
            return null;
        } catch (Throwable th) {
            C2905l.m8115c("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    /* renamed from: a */
    private void m11160a(long j, long j2, String str, int i) {
        if (this.f9540f != null && this.f9540f.mo18699b() != null) {
            C2573c.C2574a a = C2573c.m6630a(str);
            if (a == C2573c.C2574a.HTML) {
                this.f9540f.mo18699b().mo18722a(str, j, j2, i);
            } else if (a == C2573c.C2574a.JS) {
                this.f9540f.mo18699b().mo18729b(str, j, j2, i);
            }
        }
    }
}
