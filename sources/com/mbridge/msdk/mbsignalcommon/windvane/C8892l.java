package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p302c.C8480a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.mbsignalcommon.base.C8857b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.l */
/* compiled from: WindVaneWebViewClient */
public final class C8892l extends C8857b {

    /* renamed from: b */
    public static boolean f21924b = true;

    /* renamed from: a */
    protected String f21925a = null;

    /* renamed from: c */
    private int f21926c = 0;

    /* renamed from: d */
    private C8884d f21927d;

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f21925a = str;
        C8884d dVar = this.f21927d;
        if (dVar != null) {
            dVar.mo58280a(webView, str, bitmap);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = m25685a(str);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* renamed from: a */
    private WebResourceResponse m25685a(String str) {
        Bitmap a;
        try {
            if (TextUtils.isEmpty(str) || !C8890j.m25681d(str) || (a = C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57880a(str)) == null || a.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(C8890j.m25682e(str), "utf-8", C8480a.m24309a(a));
        } catch (Throwable unused) {
            return null;
        }
    }
}
