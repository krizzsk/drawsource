package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.click.p218b.C6782a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbbanner.common.p324b.C8733a;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.C8857b;
import com.mbridge.msdk.p078c.p080b.C2446a;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.view.a */
/* compiled from: BannerWebViewClient */
public final class C8778a extends C8857b {

    /* renamed from: a */
    String f21576a;

    /* renamed from: b */
    List<CampaignEx> f21577b;

    /* renamed from: c */
    C8733a f21578c;

    /* renamed from: d */
    private final String f21579d = "BannerWebViewClient";

    public C8778a(String str, List<CampaignEx> list, C8733a aVar) {
        this.f21576a = str;
        this.f21577b = list;
        this.f21578c = aVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append(C2446a.m6038a().mo16297b());
            if (Build.VERSION.SDK_INT <= 19) {
                webView.loadUrl(sb.toString());
            } else {
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                        String str = (String) obj;
                    }
                });
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerWebViewClient", "onPageStarted", th);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > ((long) C6782a.f17892c) && C6782a.m20651a(this.f21577b.get(0), baseWebView.getUrl(), C6782a.f17891b)) {
                return false;
            }
            if (this.f21577b.size() > 1) {
                C8388a.m23845e().mo56913g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f21578c != null) {
                this.f21578c.mo58369a(false, str);
            }
            return true;
        } catch (Throwable th) {
            C8672v.m24875a("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
