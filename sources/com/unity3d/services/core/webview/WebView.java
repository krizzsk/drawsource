package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.webview.bridge.C12152i;
import java.lang.reflect.Method;

public class WebView extends android.webkit.WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Method f29614a;

    /* renamed from: com.unity3d.services.core.webview.WebView$a */
    private class C12135a implements Runnable {

        /* renamed from: a */
        private String f29615a = null;

        /* renamed from: b */
        private android.webkit.WebView f29616b = null;

        public C12135a(String str, android.webkit.WebView webView) {
            this.f29615a = str;
            this.f29616b = webView;
        }

        public void run() {
            String str = this.f29615a;
            if (str != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        WebView.f29614a.invoke(this.f29616b, new Object[]{this.f29615a, null});
                        return;
                    }
                    WebView.this.loadUrl(str);
                } catch (Exception e) {
                    C12065a.m32842a("Error while processing JavaScriptString", e);
                }
            } else {
                C12065a.m32848c("Could not process JavaScript, the string is NULL");
            }
        }
    }

    public WebView(Context context) {
        super(context);
        WebSettings settings = getSettings();
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setAllowFileAccess(true);
        if (i >= 19) {
            try {
                f29614a = android.webkit.WebView.class.getMethod("evaluateJavascript", new Class[]{String.class, ValueCallback.class});
            } catch (NoSuchMethodException e) {
                C12065a.m32842a("Method evaluateJavascript not found", (Exception) e);
                f29614a = null;
            }
        }
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 11) {
            settings.setDisplayZoomControls(false);
        }
        settings.setDomStorageEnabled(false);
        if (i2 >= 11) {
            settings.setEnableSmoothTransition(false);
        }
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        if (i2 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i2 >= 21) {
            settings.setMixedContentMode(1);
        }
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        C12081k.m32886a((View) this, (Drawable) new ColorDrawable(0));
        setBackgroundResource(0);
        addJavascriptInterface(new C12152i(), "webviewbridge");
    }

    public void loadUrl(String str) {
        C12065a.m32845b("Loading url: " + str);
        super.loadUrl(str);
    }

    /* renamed from: a */
    public void mo71301a(String str) {
        C12080j.m32879a((Runnable) new C12135a(str, this));
    }
}
