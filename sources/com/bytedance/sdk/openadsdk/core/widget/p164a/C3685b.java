package com.bytedance.sdk.openadsdk.core.widget.p164a;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.b */
/* compiled from: SSWebSettings */
public class C3685b {

    /* renamed from: a */
    private WeakReference<Context> f9523a;

    /* renamed from: b */
    private boolean f9524b = true;

    /* renamed from: c */
    private boolean f9525c = true;

    /* renamed from: d */
    private boolean f9526d = true;

    /* renamed from: e */
    private boolean f9527e = true;

    /* renamed from: f */
    private boolean f9528f = false;

    /* renamed from: g */
    private boolean f9529g = true;

    /* renamed from: h */
    private boolean f9530h = true;

    /* renamed from: a */
    public static C3685b m12035a(Context context) {
        return new C3685b(context);
    }

    private C3685b(Context context) {
        this.f9523a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public C3685b mo20447a(boolean z) {
        this.f9530h = z;
        return this;
    }

    /* renamed from: b */
    public C3685b mo20449b(boolean z) {
        this.f9525c = z;
        return this;
    }

    /* renamed from: a */
    public void mo20448a(WebView webView) {
        if (webView != null && this.f9523a.get() != null) {
            m12037b(webView);
            WebSettings settings = webView.getSettings();
            m12036a(settings);
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (this.f9525c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f9526d);
                settings.setDomStorageEnabled(this.f9527e);
                settings.setAllowFileAccess(this.f9528f);
                settings.setBlockNetworkImage(true ^ this.f9529g);
                settings.setSavePassword(false);
                try {
                    if (Build.VERSION.SDK_INT >= 11 && !this.f9530h) {
                        webView.setLayerType(0, (Paint) null);
                    } else if (Build.VERSION.SDK_INT >= 16 && this.f9530h) {
                        webView.setLayerType(2, (Paint) null);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m12037b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C2905l.m8110b(th.toString());
        }
    }

    /* renamed from: a */
    private void m12036a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            C2905l.m8110b(th.toString());
        }
    }
}
