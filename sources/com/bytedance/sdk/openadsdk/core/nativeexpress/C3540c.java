package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.c */
/* compiled from: BrandBannerWebViewPool */
public class C3540c {

    /* renamed from: b */
    private static int f8921b;

    /* renamed from: c */
    private static volatile C3540c f8922c;

    /* renamed from: a */
    private final List<SSWebView> f8923a = new ArrayList();

    /* renamed from: a */
    public static C3540c m11115a() {
        if (f8922c == null) {
            synchronized (C3540c.class) {
                if (f8922c == null) {
                    f8922c = new C3540c();
                }
            }
        }
        return f8922c;
    }

    /* renamed from: b */
    public SSWebView mo20085b() {
        SSWebView remove;
        if (mo20087c() > 0 && (remove = this.f8923a.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    /* renamed from: a */
    public void mo20084a(SSWebView sSWebView) {
        if (sSWebView != null) {
            mo20086b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo20086b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.f8923a.size() >= f8921b) {
            sSWebView.mo17862l();
        } else if (!this.f8923a.contains(sSWebView)) {
            mo20088c(sSWebView);
            this.f8923a.add(sSWebView);
        }
    }

    /* renamed from: c */
    public int mo20087c() {
        return this.f8923a.size();
    }

    /* renamed from: c */
    public void mo20088c(SSWebView sSWebView) {
        if (sSWebView != null && sSWebView.getWebView() != null) {
            if (sSWebView.getParent() != null) {
                ((ViewGroup) sSWebView.getParent()).removeView(sSWebView);
            }
            try {
                sSWebView.removeAllViews();
                sSWebView.mo17842c();
                sSWebView.setWebChromeClient((WebChromeClient) null);
                sSWebView.setWebViewClient((WebViewClient) null);
                sSWebView.setDownloadListener((DownloadListener) null);
                sSWebView.setDefaultTextEncodingName("UTF-8");
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setSupportZoom(false);
                sSWebView.getWebView().setLayerType(0, (Paint) null);
                sSWebView.setBackgroundColor(0);
                sSWebView.getWebView().setHorizontalScrollBarEnabled(false);
                sSWebView.getWebView().setHorizontalScrollbarOverlay(false);
                sSWebView.getWebView().setVerticalScrollBarEnabled(false);
                sSWebView.getWebView().setVerticalScrollbarOverlay(false);
                sSWebView.mo17839a(true);
                sSWebView.mo17860j();
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
            } catch (Exception unused) {
            }
        }
    }
}
